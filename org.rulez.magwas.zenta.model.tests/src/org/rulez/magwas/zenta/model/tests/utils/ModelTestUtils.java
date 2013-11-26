package org.rulez.magwas.zenta.model.tests.utils;

import java.io.File;
import java.io.IOException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.NSResolver;
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

	public static Resource getZentaModelResource(String filename){
		String path = convertNameToResourcePath(filename);
		IZentaPackage.eINSTANCE.eClass();
        ResourceSet resourceSet = ZentaResourceFactory.createResourceSet();
        Resource resource = resourceSet.createResource(URI.createFileURI(path));
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
			throw new CannotLoadTheResource();
		}
		return resource;
	}
		public static class CannotLoadTheResource extends RuntimeException {
			private static final long serialVersionUID = 1L;
	
		}

	public static String convertNameToResourcePath(String filename) {
		String resourcePath = ModelTestData.class.getResource(filename).getFile();
		File file = new File(resourcePath);
        String path = file.getAbsolutePath();
		return path;
	}
}
