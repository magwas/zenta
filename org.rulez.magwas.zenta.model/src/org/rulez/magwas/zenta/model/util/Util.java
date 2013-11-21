package org.rulez.magwas.zenta.model.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Util {
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    
    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
        
    }
    
    public static String xml2String(Element node) {
        Transformer transformer;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(node);
            transformer.transform(source, result);
            
            String xmlString = result.getWriter().toString();
            return xmlString;
        } catch (Exception e) {
            e.printStackTrace();
            return "<exception>";
        }
    }
    
    public static Document createXmlDocumentFromResource(Object instance,
            String name) throws ParserConfigurationException, SAXException,
            IOException, URISyntaxException {
        String content = readFile(instance, name);
        return createXmlDocumentFromString(content);
    }
    
    public static String readFile(Object instance, String filename)
            throws UnsupportedEncodingException, IOException,
            URISyntaxException {
        java.net.URL url = instance.getClass().getResource(filename);
        System.out.println("uri="+url);
        if (url == null) {
            throw new IOException();
        }
        Path resPath = Paths.get(url.toURI());
        
        String xml = new String(java.nio.file.Files.readAllBytes(resPath),
                "UTF8");
        return xml;
    }

	public static Document createXmlDocumentFromFileName(String respath) {
        String xml;
		try {
			xml = new String(Files.readAllBytes(Paths.get(respath)),
			        "UTF8");
	        return createXmlDocumentFromString(xml);
		} catch (Exception e) {
			throw new CannotLoadXmlDocumentException();
		}
	}
    public static class CannotLoadXmlDocumentException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}


    
    public static Document createXmlDocumentFromString(String xmlString)
            throws ParserConfigurationException, SAXException, IOException {
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        factory.setNamespaceAware(true);
        factory.setCoalescing(true);
        factory.setIgnoringElementContentWhitespace(true);
        factory.setIgnoringComments(true);
        builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(
                xmlString)));
        return document;
    }
    
}
