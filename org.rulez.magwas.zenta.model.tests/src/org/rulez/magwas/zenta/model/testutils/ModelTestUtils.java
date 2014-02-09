package org.rulez.magwas.zenta.model.testutils;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.NSResolver;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ModelTestUtils {

	public static Element getElementByXpath(Document xmlDoc, String xpathExpression)
			throws XPathExpressionException {
		XPath          xpath = XPathFactory.newInstance().newXPath();
        NSResolver nss = new NSResolver();
        nss.put("zenta", "http://magwas.rulez.org/zenta");
        xpath.setNamespaceContext(nss);
		Element node = (Element) xpath.evaluate(xpathExpression,
                xmlDoc, XPathConstants.NODE);
		return Util.assertNonNull(node);
	}

	public static Resource getZentaModelResource(String filename) {
		InputStream streamo = ModelTestData.class.getResourceAsStream(filename);
		InputStream stream = Util.assertNonNull(streamo);
		File temp;
		Resource resource;
		try {
			temp = File.createTempFile("test", ".zenta");
			temp.delete();
			Util.copyStreamToFile(stream, temp);
			IZentaPackage.eINSTANCE.eClass();
	        ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	        resource = resourceSet.createResource(URI.createFileURI(temp.getAbsolutePath()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		try {
			resource.load(null);
			//temp.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource;			
	}

	@SuppressWarnings("null")
	public static String convertNameToResourcePath(String filename) {
		String resourcePath = ModelTestData.class.getResource(filename).getFile();
		File file = new File(resourcePath);
        String path = file.getAbsolutePath();
		return path;
	}

	public static <T> void assertEqualsAsSet(Collection<T> expectedList ,
			Collection<T> actualList) {
		List<T> remains = new ArrayList<T>(actualList);
		for(T item : expectedList)
			if(remains.contains(item)) {
				remains.remove(item);
			}
			else
				fail(String.format("no %s in %s", item, actualList));
		if(remains.size() != 0)
			fail(String.format("%s is remaining in %s", remains, actualList));
	}

	public static HashSet<String> definingNames(Collection<? extends IBasicObject> targets) {
		List<String> ret = new ArrayList<String>();
		for(IBasicObject obj : targets)
			ret.add(obj.getDefiningName());
		return new HashSet<String>(ret);
	}
}
