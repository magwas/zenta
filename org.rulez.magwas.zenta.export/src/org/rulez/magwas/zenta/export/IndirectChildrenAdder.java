package org.rulez.magwas.zenta.export;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import org.rulez.magwas.zenta.export.IEventLog;
import org.rulez.magwas.zenta.export.NodeMassager;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class IndirectChildrenAdder implements NodeMassager {
    private XPath     xpath;
    private IEventLog log;
    
    public IndirectChildrenAdder(XPath xpath, IEventLog log) {
        this.xpath = xpath;
        this.log = log;
    }
    
    @Override
    public void function(Element node, Element property, String propname,
            String ancestor) {
        NodeList pl = property.getElementsByTagName("default");
        int l = pl.getLength();
        for (int i = 0; i < l; i++) {
            Element d = (Element) pl.item(i);
            String indirectatt = d.getAttribute("indirect");
            if (!indirectatt.isEmpty()) {
                List<String> parts = Arrays.asList(indirectatt.split("/"));
                List<Element> nl = followPath(node, parts);
                for (Element e : nl) {
                    Element prop = node.getOwnerDocument().createElement(
                            propname);
                    node.appendChild(prop);
                    String val = e.getTextContent();
                    prop.setTextContent(val);
                    String id;
                    id = e.getAttribute("originid");
                    if (null != id) {
                        prop.setAttribute("originid", id);
                    }
                }
            }
        }
    }
    
    private List<Element> followPath(Element node, List<String> parts) {
        List<Element> thisfar = new ArrayList<Element>();
        if (parts.isEmpty()) {
            return thisfar;
        }
        String thispart = parts.get(0);
        NodeList children = node.getElementsByTagName(thispart);
        thisfar = nodeListToList(children);
        List<Element> l = followPathFurther(parts.subList(1, parts.size()),
                thisfar);
        return l;
    }
    
    private List<Element> nodeListToList(NodeList list) {
        int length = list.getLength();
        List<Element> copy = new ArrayList<Element>();
        
        for (int n = 0; n < length; ++n) {
            copy.add((Element) list.item(n));
        }
        return copy;
    }
    
    private List<Element> followPathFurther(List<String> parts,
            List<Element> thisfar) {
        if (parts.isEmpty()) {
            return thisfar;
        }
        String thispart = parts.get(0);
        List<Element> newones = new ArrayList<Element>();
        for (Element currchild : thisfar) {
            String originid = currchild.getAttribute("originid");
            String expression = "//*[@parentid='" + originid + "']/" + thispart;
            NodeList result;
            try {
                result = (NodeList) xpath.evaluate(expression,
                        currchild.getOwnerDocument(), XPathConstants.NODESET);
            } catch (XPathExpressionException e) {
                log.printStackTrace(e);
                throw new RuntimeException("bad path" + expression);
            }
            
            int length = result.getLength();
            
            for (int n = 0; n < length; ++n) {
                Element e = ((Element) result.item(n));
                newones.add(e);
            }
        }
        return newones;
    }
    
}
