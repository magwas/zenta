package org.rulez.magwas.zenta.export;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import org.rulez.magwas.zenta.export.IEventLog;
import org.rulez.magwas.zenta.export.NodeMassager;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

class CardinalityChecker implements NodeMassager {
    private XPath     xpath;
    private IEventLog log;
    private String    modelid;
    
    CardinalityChecker(XPath xpath, IEventLog log, String modelid) {
        this.xpath = xpath;
        this.log = log;
        this.modelid = modelid;
    }
    
    @Override
    public void function(Element node, Element property, String propname,
            String ancestor) {
        int len = node.getElementsByTagName(propname).getLength();
        String mo = property.getAttribute("minOccurs");
        int minOccurs;
        if ("".equals(mo)) {
            minOccurs = 1;
        } else {
            minOccurs = Integer.parseInt(mo);
        }
        if (len < minOccurs) {
            log.issueError(modelid, (Element) node.getParentNode(), "Too few ("
                    + len + "<" + minOccurs + ") occurence of " + propname
                    + " in " + node.getTagName(), helpForProperty(property));
        }
        String Mo = property.getAttribute("maxOccurs");
        if (!"".equals(Mo)) {
            int maxOccurs = Integer.parseInt(Mo);
            if (maxOccurs < len) {
                log.issueError(
                        modelid,
                        (Element) node.getParentNode(),
                        "Too much (" + len + ">" + maxOccurs
                                + ") occurence of " + propname + " in "
                                + node.getTagName(), helpForProperty(property));
            }
        }
        
    }
    
    private String helpForProperty(Element property) {
        try {
            String propdesc = xpath.evaluate("./description", property);
            NodeList defaults = (NodeList) xpath.evaluate(
                    "./default/description", property, XPathConstants.NODESET);
            int l = defaults.getLength();
            for (int i = 0; i < l; i++) {
                Element d = (Element) defaults.item(i);
                propdesc += "\n" + d.getTextContent() + " ("
                        + ((Element) d.getParentNode()).getAttribute("select")
                        + ")";
            }
            return propdesc;
        } catch (XPathExpressionException e) {
            log.printStackTrace(e);
            throw new RuntimeException("problem with xpath");
        }
    }
    
}