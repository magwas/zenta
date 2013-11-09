package org.rulez.magwas.zenta.exporttests;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.exporttests.EventLogMockup;
import org.rulez.magwas.zenta.exporttests.XmlTestCase;
import org.rulez.magwas.zenta.export.Enricher;
import org.xml.sax.SAXException;

public class EnricherTest {
    
    private EventLogMockup log;
    
    @Before
    public void setUp() throws Exception {
        log = new EventLogMockup();
        
    }
    
    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testEnricherIndirectProperty() throws XPathExpressionException,
            ParserConfigurationException, SAXException, URISyntaxException,
            IOException {
        XmlTestCase tc = new XmlTestCase("EnricherTest1");
        Enricher enricher = new Enricher("testmodel", tc.testDoc, tc.policyDoc,
                log);
        enricher.enrichXML();
        tc.assertOK();
    }
    
}
