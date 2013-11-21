package org.rulez.magwas.zenta.model.tests.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.NSResolver;
import org.rulez.magwas.zenta.model.impl.ZentaPackage;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactory;
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
		return node;
	}

	public static Resource getTestZentaModelResource(){
		return getZentaModelResource("test.zenta");
	}

	public static Resource getZentaModelResource(String filename){
		String path = convertNameToResourcePath(filename);
		ZentaPackage.init();
        ResourceSet resourceSet = ZentaResourceFactory.createResourceSet();
		Resource resource = resourceSet.createResource(URI.createFileURI(path));
        System.out.println("path="+path);
		try {
			System.out.println(resource.getURI());
			resource.load(null);
		} catch (IOException e) {
			throw new CannotLoadTheResource();
		}
		return resource;
	}
	public static class CannotLoadTheResource extends RuntimeException {
		private static final long serialVersionUID = 1L;

	}

	public static String convertNameToResourcePath(String filename) {
		String resourcePath = ModelTestUtils.class.getResource(filename).getFile();
		File file = new File(resourcePath);
        String path = file.getAbsolutePath();
		return path;
	}

	public static IZentaModel getModelFromResource(Resource resource) {
		return (IZentaModel)resource.getContents().get(0);
	}
	public static void saveResource(Resource resource) throws IOException {
		URI backup_uri = resource.getURI().appendFileExtension("bak");
		resource.setURI(backup_uri);
		Map<String, Object> options = new HashMap<String,Object>();
		resource.save(options);
	}

}
