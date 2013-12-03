package org.rulez.magwas.zenta.tests.export;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Assert;
import org.rulez.magwas.zenta.model.util.Util;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XmlTestCase {
    
    public Document testDoc;
    public Document policyDoc;
    public Document resultDoc;
    
    public XmlTestCase(String casename) throws ParserConfigurationException,
            SAXException, URISyntaxException, XPathExpressionException,
            IOException {
        testDoc = Util.createXmlDocumentFromResource(this, casename
                + "_orig.xml");
        
        try {
            policyDoc = Util.createXmlDocumentFromResource(this, casename
                    + "_policy.xml");
        } catch (IOException e) {
            policyDoc = null;
        }
        
        resultDoc = Util.createXmlDocumentFromResource(this, casename
                + "_out.xml");
    }
    
    public void assertOK() {
        resultDoc.normalizeDocument();
        testDoc.normalizeDocument();
        String resultString = Util.xml2String(resultDoc.getDocumentElement());
        String docString = Util.xml2String(testDoc.getDocumentElement());
        System.out.println("policy=" + policyDoc);
        if (!resultString.equals(docString)) {
            System.out.println(resultString);
            System.out.println("-----------------\n" + docString);
        }
        Assert.assertEquals(resultString, docString);
    }
    
}
