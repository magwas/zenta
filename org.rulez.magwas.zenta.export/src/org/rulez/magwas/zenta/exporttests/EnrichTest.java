/**
 * 
 */
package org.rulez.magwas.zenta.exporttests;

import static org.junit.Assert.assertEquals;

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
import org.rulez.magwas.zenta.export.Enricher;
import org.rulez.magwas.zenta.export.IEventLog;
import org.rulez.magwas.zenta.model.NSResolver;
import org.rulez.magwas.zenta.export.RichElement;
import org.rulez.magwas.zenta.export.VarResolver;
import org.rulez.magwas.zenta.exporttests.EventLogMockup;
import org.rulez.magwas.zenta.exporttests.XmlTestCase;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * @author mag
 * 
 */
public class EnrichTest {
    
    static XPath          xpath = XPathFactory.newInstance().newXPath();
    VarResolver           vars  = new VarResolver();
    static EventLogMockup log;
    Enricher              enricher;
    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        xpath.setXPathVariableResolver(vars);
        NSResolver nss = new NSResolver();
        nss.put("zenta", "http://magwas.rulez.org/zenta");
        xpath.setNamespaceContext(nss);
        log = new EventLogMockup();
        
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
    public void testNodeNameChange() throws ParserConfigurationException,
            SAXException, IOException, URISyntaxException,
            XPathExpressionException {
        XmlTestCase tc = new XmlTestCase("EnrichTest1");
        testEnrich(tc);
        assertEquals(0, log.called);
    }
    
    @Test
    public void testObjectClassProperty() throws ParserConfigurationException,
            SAXException, IOException, URISyntaxException,
            XPathExpressionException {
        XmlTestCase tc = new XmlTestCase("EnrichTest2");
        testEnrich(tc);
        assertEquals(0, log.called);
    }
    
    @Test
    public void testObjectClassPropertyWithPolicyWarning()
            throws ParserConfigurationException, SAXException, IOException,
            URISyntaxException, XPathExpressionException {
        XmlTestCase tc = new XmlTestCase("EnrichTest3");
        testEnrich(tc);
        assertEquals(1, log.called);
    }
    
    @Test
    public void testObjectClassPropertyWithPolicyWithoutWarning()
            throws ParserConfigurationException, SAXException, IOException,
            URISyntaxException, XPathExpressionException {
        XmlTestCase tc = new XmlTestCase("EnrichTest4");
        testEnrich(tc);
        assertEquals(0, log.called);
    }
    
    @Test
    public void testCompositeProperty() throws ParserConfigurationException,
            SAXException, IOException, URISyntaxException,
            XPathExpressionException {
        XmlTestCase tc = new XmlTestCase("EnrichTest5");
        testEnrich(tc);
        assertEquals(0, log.called);
    }
    
    @Test
    public void testAssociationOnGroup() throws ParserConfigurationException,
            SAXException, IOException, URISyntaxException,
            XPathExpressionException {
        XmlTestCase tc = new XmlTestCase("EnrichTest6");
        testEnrich(tc);
        assertEquals(0, log.called);
        assertEquals(1, enricher.associations.size());
        assertEquals("Function", enricher.associations.entrySet().iterator()
                .next().getValue());
        assertEquals("thenode", enricher.associations.entrySet().iterator()
                .next().getKey().getAttribute("id"));
    }
    
    @Test
    public void testAssociationOnFolder() throws ParserConfigurationException,
            SAXException, IOException, URISyntaxException,
            XPathExpressionException {
        XmlTestCase tc = new XmlTestCase("EnrichTest7");
        testEnrich(tc);
        assertEquals(0, log.called);
        assertEquals(1, enricher.associations.size());
        assertEquals("Function", enricher.associations.entrySet().iterator()
                .next().getValue());
        assertEquals("thenode", enricher.associations.entrySet().iterator()
                .next().getKey().getAttribute("id"));
    }
    
    @Test
    public void testGetOrCreateObjectClass()
            throws ParserConfigurationException, SAXException, IOException,
            URISyntaxException, XPathExpressionException {
        XmlTestCase tc = new XmlTestCase("EnrichTest8");
        Element node = (Element) xpath.evaluate("//*[@id='thenode']",
                tc.testDoc, XPathConstants.NODE);
        String propname;
        if (null != tc.policyDoc) {
            Element property = (Element) xpath.evaluate("//property",
                    tc.policyDoc, XPathConstants.NODE);
            propname = property.getAttribute("name");
        }
        propname = null;
        enricher = new Enricher(propname, tc.testDoc, tc.policyDoc, (IEventLog) log);
        assertEquals(0, enricher.associations.size());
        RichElement e = new RichElement(node, enricher);
        log.called = 0;
        e.getorCreateObjectClass("testclass");
        e.getorCreateObjectClass("testclass2");
        e.getorCreateObjectClass("testclass");
        tc.assertOK();
        assertEquals(1, log.called);
        assertEquals(0, enricher.associations.size());
    }
    
    private void testEnrich(XmlTestCase tc) throws XPathExpressionException {
        Element node = (Element) xpath.evaluate("//*[@id='thenode']",
                tc.testDoc, XPathConstants.NODE);
        String propname;
        if (null != tc.policyDoc) {
            Element property = (Element) xpath.evaluate("//property",
                    tc.policyDoc, XPathConstants.NODE);
            propname = property.getAttribute("name");
        }
        propname = null;
        enricher = new Enricher(propname, tc.testDoc, tc.policyDoc, (IEventLog) log);
        assertEquals(0, enricher.associations.size());
        RichElement e = new RichElement(node, enricher);
        log.called = 0;
        e.enrich();
        tc.assertOK();
    }
}
