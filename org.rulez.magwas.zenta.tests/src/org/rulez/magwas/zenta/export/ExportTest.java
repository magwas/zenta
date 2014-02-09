package org.rulez.magwas.zenta.export;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.NSResolver;
import org.rulez.magwas.zenta.export.PackageManager;
import org.rulez.magwas.zenta.export.StyledHtml;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class ExportTest {
    XPath          xpath = XPathFactory.newInstance().newXPath();
	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() throws Exception {
        NSResolver nss = new NSResolver();
        nss.put("zenta", "http://magwas.rulez.org/zenta");
        xpath.setNamespaceContext(nss);
        testdata = new ModelAndEditPartTestData();
	}
	
	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
	}

	@Test
	public void The_policy_can_be_generated_with_the_exporter() throws IOException, ParserConfigurationException, SAXException, URISyntaxException, XPathExpressionException {
		IZentaPackage.eINSTANCE.eClass();
		ModelTestData data = new ModelTestData();
		File temp = File.createTempFile("test", ".styles");
		String policy = "newpolicy.style";
		runDefaultStyleInDir(policy, data.model, temp);
		File policyfile = new File(temp,"policy.xml");
		Document testDoc = Util.createXmlDocumentFromFileName(policyfile.getAbsolutePath());
        Element node = (Element) xpath.evaluate("//objectClass[@name='Procedure']",
                testDoc, XPathConstants.NODE);
        assertNotNull(node);
        //FIXME: check objectlist.html as well
	}
		private void runDefaultStyleInDir(String policy, IZentaModel model,
				File dirname) {
			dirname.delete();
			dirname.mkdir();
			PackageManager.bringPackagedStyles(dirname);
			File stylefile = new File(dirname,policy);
			StyledHtml.export(model, stylefile.getAbsolutePath(), new EventLogMockup(),dirname);
		}

}
