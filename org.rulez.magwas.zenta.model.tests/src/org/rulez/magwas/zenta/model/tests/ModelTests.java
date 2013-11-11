package org.rulez.magwas.zenta.model.tests;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.export.NSResolver;
import org.rulez.magwas.zenta.export.Util;
import org.rulez.magwas.zenta.model.IBusinessObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.impl.ZentaPackage;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ModelTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIdOkay() throws IOException, ParserConfigurationException, SAXException, URISyntaxException, XPathExpressionException {
		File file = new File(this.getClass().getResource("test.zenta").getFile());
        
		ZentaPackage.init();
        ResourceSet resourceSet = ZentaResourceFactory.createResourceSet();
        Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
		System.out.println(resource.toString());
		 
		resource.load(null);
		 
		IZentaModel model = (IZentaModel)resource.getContents().get(0);
		IFolder folder = model.getFolders().get(0);
		assertEquals("Business",folder.getName());
		IBusinessObject bo = (IBusinessObject) folder.getElements().get(1);
		assertEquals("Business Object1",bo.getName());
		
		URI backup_uri = resource.getURI().appendFileExtension("bak");
		resource.setURI(backup_uri);
        Map<String, Object> options = new HashMap<String,Object>();
		resource.save(options);
		System.out.println(resource.getURI());
		Document testDoc = Util.createXmlDocumentFromResource(this, "test.zenta.bak");
	    XPath          xpath = XPathFactory.newInstance().newXPath();
        NSResolver nss = new NSResolver();
        nss.put("zenta", "http://magwas.rulez.org/zenta");
        xpath.setNamespaceContext(nss);
        Element node = (Element) xpath.evaluate("//sourceConnection[@id='24e3c661']",
                testDoc, XPathConstants.NODE);
        assertEquals("b0e2bfd8",node.getAttribute("relationship"));
	}

}
