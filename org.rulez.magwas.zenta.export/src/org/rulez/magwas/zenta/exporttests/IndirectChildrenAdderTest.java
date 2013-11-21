/**
 * 
 */
package org.rulez.magwas.zenta.exporttests;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.export.EventLog;
import org.rulez.magwas.zenta.export.IndirectChildrenAdder;
import org.rulez.magwas.zenta.model.util.Util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * @author mag
 * 
 */
public class IndirectChildrenAdderTest {
    
    static XPath    xpath = XPathFactory.newInstance().newXPath();
    static EventLog log   = null;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        
    }
    
    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }
    
    /**
     * Test method for
     * {@link org.rulez.magwas.zenta.export.IndirectChildrenAdder#function(org.w3c.dom.Element, org.w3c.dom.Element, java.lang.String, java.lang.String)}
     * .
     * 
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     * @throws URISyntaxException
     * @throws XPathExpressionException
     */
    @Test
    public void testFunction() throws ParserConfigurationException,
            SAXException, IOException, URISyntaxException,
            XPathExpressionException {
        Document testDoc = Util.createXmlDocumentFromResource(this,
                "IndirectChildrenAdderTest1_orig.xml");
        Document policyDoc = Util.createXmlDocumentFromResource(this,
                "IndirectChildrenAdderTest1_policy.xml");
        Document resultDoc = Util.createXmlDocumentFromResource(this,
                "IndirectChildrenAdderTest1_out.xml");
        Element node = (Element) xpath.evaluate("//element", testDoc,
                XPathConstants.NODE);
        Element property = (Element) xpath.evaluate("//property", policyDoc,
                XPathConstants.NODE);
        String propname = property.getAttribute("name");
        new IndirectChildrenAdder(xpath, log).function(node, property,
                propname, null);
        assertXMLEquals(testDoc, resultDoc);
    }
    
    public static void assertXMLEquals(Document expectedXML, Document actualXML) {
        expectedXML.normalizeDocument();
        actualXML.normalizeDocument();
        System.out.println(Util.xml2String(actualXML.getDocumentElement()));
        Assert.assertTrue((expectedXML.isEqualNode(actualXML)));
    }
    
}
