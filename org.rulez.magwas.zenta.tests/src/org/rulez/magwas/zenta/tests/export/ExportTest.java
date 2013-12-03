package org.rulez.magwas.zenta.tests.export;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

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
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.NSResolver;
import org.rulez.magwas.zenta.export.StyledHtml;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.util.Util;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ExportTest {
    XPath          xpath = XPathFactory.newInstance().newXPath();

	@Before
	public void setUp() throws Exception {
        NSResolver nss = new NSResolver();
        nss.put("zenta", "http://magwas.rulez.org/zenta");
        xpath.setNamespaceContext(nss);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExport() throws IOException, ParserConfigurationException, SAXException, URISyntaxException, XPathExpressionException {
		File file = new File(this.getClass().getResource("test.zenta").getFile());
		IZentaPackage.eINSTANCE.eClass();
        ResourceSet resourceSet = ZentaResourceFactory.createResourceSet();
        Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
		System.out.println(resource.toString());
		 
		resource.load(null);
		 
		IZentaModel model = (IZentaModel)resource.getContents().get(0);

		File stylefile = file;
		for(int i=0;i<7;i++) {
			stylefile=stylefile.getParentFile();
		}
		stylefile=new File(stylefile,"styles");
		stylefile=new File(stylefile,"newpolicy.style");
		System.out.println(stylefile.getAbsolutePath());
		File targetdir = file.getParentFile();
		StyledHtml.export(model, stylefile.getAbsolutePath(), new EventLogMockup(),targetdir);
		Document testDoc = Util.createXmlDocumentFromResource(this, "policy.xml");
        Element node = (Element) xpath.evaluate("//objectClass[@name='Procedure']",
                testDoc, XPathConstants.NODE);
        assertNotNull(node);
	}

}
