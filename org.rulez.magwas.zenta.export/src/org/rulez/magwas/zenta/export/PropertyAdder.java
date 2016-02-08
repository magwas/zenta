package org.rulez.magwas.zenta.export;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import org.rulez.magwas.zenta.export.IEventLog;
import org.rulez.magwas.zenta.export.NodeMassager;
import org.rulez.magwas.zenta.export.VarResolver;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class PropertyAdder implements NodeMassager {
    
    private XPath       xpath;
    private VarResolver vars;
    private IEventLog   log;
    
    public PropertyAdder(XPath xpath, VarResolver vars, IEventLog log) {
        this.xpath = xpath;
        this.vars = vars;
        this.log = log;
    }
    
    @Override
    public void function(Element node, Element property, String propname,
            String ancestor) {
        if (null != ancestor) {
            copyAncestorProperty(node, propname, ancestor);
        }
        NodeList pl = property.getElementsByTagName("default");
        int l = pl.getLength();
        for (int j = 0; j < l; j++) {
            Element d = (Element) pl.item(j);
            tryDefaultForProperty(node, propname, d);
        }
    }
    
    private boolean tryDefaultForProperty(Element node, String propname,
            Element defitem) {
        int definedproperties = node.getElementsByTagName(propname).getLength();
        if ((definedproperties > 0)
                && (!"true".equals(defitem.getAttribute("always")))) {
            return true;
        }
        String path = defitem.getAttribute("select");
        boolean multi = false;
        if ("true".equals(defitem.getAttribute("multi"))) {
            multi = true;
        }
        if (!defitem.getAttribute("indirect").isEmpty()) {
            return false;
        }
        vars.put("id", node.getAttribute("parentid"));
        
        try {
            if (multi) {
                NodeList result = (NodeList) xpath.evaluate(path, node,
                        XPathConstants.NODESET);
                int l = result.getLength();
                if (l == 0) {
                    return false;
                }
                for (int i = 0; i < l; i++) {
                    Element n = (Element) result.item(i);
                    String val = n.getAttribute("name");
                    if (null == val) {
                        return false;
                    }
                    Element prop = node.getOwnerDocument().createElement(
                            propname);
                    node.appendChild(prop);
                    prop.setTextContent(val);
                    String id;
                    id = n.getAttribute("id");
                    if (null != id) {
                        prop.setAttribute("originid", id);
                    }
                }
                return true;
            } else {
                String result = (String) xpath.evaluate(path, node,
                        XPathConstants.STRING);
                if ("".equals(result)) {
                    return false;
                }
                Element prop = node.getOwnerDocument().createElement(propname);
                node.appendChild(prop);
                prop.setTextContent(result);
                return true;
            }
        } catch (XPathExpressionException e) {
            // TODO: issue warning, with error message compiled from policy
            log.printStackTrace(e);
        }
        return false;
    }
    
    private void copyAncestorProperty(Element node, String propname,
            String ancestor) {
        /*
         * try to copy ../[ancestor]/[propname] here
         */
        String path = "../" + ancestor + "/" + propname;
        NodeList defaults;
        try {
            defaults = (NodeList) xpath.evaluate(path, node,
                    XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            log.printStackTrace(e);
            throw new RuntimeException("bad path" + path);
        }
        int k = defaults.getLength();
        for (int j = 0; j < k; j++) {
            String v = ((Element) defaults.item(j)).getTextContent();
            Element e = node.getOwnerDocument().createElement(propname);
            e.setTextContent(v);
            node.appendChild(e);
        }
        // return;
    }
    
}
