package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ModelTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIdOkay() throws IOException, ParserConfigurationException, SAXException, URISyntaxException, XPathExpressionException {
		ModelTestData testdata = new ModelTestData();
		IBasicObject bo = (IBasicObject) testdata.getById("f33bd0d2");
		assertEquals("Procedure",bo.getName());
		testdata.saveResource();
		String path = testdata.resource.getURI().devicePath();
		Document testDoc = Util.createXmlDocumentFromFileName(Util.assertNonNull(path));
        String xpathExpression = "//sourceConnection[@id='24e3c661']";
	    Element node = ModelTestUtils.getElementByXpath(testDoc, xpathExpression);
        assertEquals("b0e2bfd8",node.getAttribute("relationship"));
	}
	
	@Test
	public void The_objects_are_loaded_in_the_model() {
		ModelTestData testdata = new ModelTestData();
		IZentaModel model = testdata.getModel();
		IBasicObject element = (IBasicObject) ZentaModelUtils.getObjectByID(model, "c3d03626");
		assertEquals("ProcessStep",element.getName());
	}
	@Test
	public void The_model_can_be_saved() {
		ModelTestData testdata = new ModelAndMetaModelTestData();
		File file = new File("/tmp/foo.zenta");
		ZentaModelUtils.saveModelToXMLFile(testdata.getModel(), file);
	}

}
