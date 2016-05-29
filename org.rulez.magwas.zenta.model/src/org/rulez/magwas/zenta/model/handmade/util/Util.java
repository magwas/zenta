package org.rulez.magwas.zenta.model.handmade.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.rulez.magwas.zenta.model.ModelConsistencyException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Util {
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
    
    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        String now = sdf.format(cal.getTime());
		return verifyNonNull(now);
        
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
            return verifyNonNull(xmlString);
        } catch (Exception e) {
        	throw new RuntimeException(e);
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
        InputStream stream = instance.getClass().getResourceAsStream(filename);
        if(null == stream)
        	throw new IOException(String.format("no such file: %s", filename));
        String xml = convertStreamToString(stream);
        stream.close();
        return xml;
    }
	    static String convertStreamToString(InputStream is) {
	    	//http://stackoverflow.com/a/5445161/1664273
	        java.util.Scanner scanner = new Scanner(is);
			java.util.Scanner s = scanner.useDelimiter("\\A");
	        String ret = s.hasNext() ? s.next() : "";
			scanner.close();
			return verifyNonNull(ret);
	    }

	public static Document createXmlDocumentFromFileName(String respath) {
        String xml;
		try {
			xml = readFile(respath);
	        return createXmlDocumentFromString(xml);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
    
	public static String readFile(String respath) throws IOException {
		String everything;
	    BufferedReader br = new BufferedReader(new FileReader(respath));
	    String lineSeparator = System.getProperty("line.separator");
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append(lineSeparator);
	            line = br.readLine();
	        }
	        everything = sb.toString();
	    } finally {
	        br.close();
	    }
	    return verifyNonNull(everything);
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
        return verifyNonNull(document);
    }
    
    public static void copyFile(File source, File dest) throws IOException {
        InputStream is = null;
        try {
            is = new FileInputStream(source);
            copyStreamToFile(is, dest);
        } finally {
        	if(is != null)
        		is.close();
        }
    }

	public static void copyStreamToFile( InputStream is, File dest)
			throws FileNotFoundException, IOException {
		OutputStream os = null;
		try {
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
			    os.write(buffer, 0, length);
			}
		} finally {
			if (os!= null)
				os.close();
		}
	}

	public static <T> T verifyNonNull( T r) {
		if(null == r) {
			throw new ModelConsistencyException("null encountered", null);
		}
		return r;
	}
}
