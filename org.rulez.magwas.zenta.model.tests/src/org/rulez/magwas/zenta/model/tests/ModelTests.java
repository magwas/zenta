package org.rulez.magwas.zenta.model.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.util.Util;
import org.rulez.magwas.zenta.model.IBusinessObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestUtils;
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
		Resource resource = ModelTestUtils.getTestZentaModelResource();	
		IZentaModel model = ModelTestUtils.getModelFromResource(resource);
		IFolder folder = model.getFolders().get(0);
		assertEquals("Business",folder.getName());
		IBusinessObject bo = (IBusinessObject) folder.getElements().get(1);
		assertEquals("Business Object1",bo.getName());
		System.out.println("contents="+resource.getContents());
		ModelTestUtils.saveResource(resource);
		String respath = ModelTestUtils.convertNameToResourcePath("test.zenta.bak");
		Document testDoc = Util.createXmlDocumentFromFileName(respath);
        String xpathExpression = "//sourceConnection[@id='24e3c661']";
	    Element node = ModelTestUtils.getElementByXpath(testDoc, xpathExpression);
        assertEquals("b0e2bfd8",node.getAttribute("relationship"));
	}


}
