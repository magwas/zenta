package org.rulez.magwas.zenta.export;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

import org.rulez.magwas.zenta.export.Enricher;
import org.rulez.magwas.zenta.export.NodeMassager;
import org.rulez.magwas.zenta.export.RichElement;
import org.rulez.magwas.zenta.export.Widgets;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RichElement {
    private Element  e;
    private Enricher enricher;
    
    public RichElement(Element e, Enricher enricher) {
        this.e = e;
        this.enricher = enricher;
    }
    
    public RichElement(Element e, RichElement element) {
        this.e = e;
        this.enricher = element.enricher;
    }
    
    public void enrich() {
        // copies element node to an identical node which have nodename of the
        // xsi:type attribute
        String typename = e.getAttribute("xsi:type");
        if (e.getNodeName() == "folder") {
            typename = "archimate:Folder";
        }
        if ("" != typename) {
            this.enricher.xml.renameNode(e, namespaceForType(typename),
                    typename);
            e.removeAttribute("xsi:type");
        }
        
        List<Element> props = getChildElementsByTagName(e, "property");
        int l = props.size();
        for (int i = 0; i < l; i++) {
            Element p = (Element) props.get(i);
            if (e != p.getParentNode()) {
                continue;
            }
            String key = p.getAttribute("key");
            String value = p.getAttribute("value");
            if (key.equals("objectClass")) {
                getorCreateObjectClass(value);
            }
            if (key.contains(":")) {
                String[] k = key.split(":", 2);
                createSubElement(k[0], k[1], value);
            }
            if (key.equals("associatedObjectClass")) {
                this.enricher.associations.put(e, value);
            }
        }
    }
    
    public Element getorCreateObjectClass(String ocname) {
        /*
         * m: the archi object we are at value: the name of the objectClass
         */
        Element f = getOrCreateElement(e, ocname);
        if ("".equals(f.getAttribute("parentid"))) {
            // we are creating it
            f.setAttribute("parentid", e.getAttribute("id"));
            /*
             * check in the policy whether the element type of m is accepted as
             * ancestor of ocname
             */
            String elementtype = e.getNodeName();
            if ((!checkAncestry(ocname, elementtype))
                    && (null != this.enricher.policy)) {
                this.enricher.log
                        .issueError(this.enricher.modelid, e, "objectClass "
                                + ocname + " should not be related to "
                                + elementtype,
                                "No such ancestor defined in policy for the objectClass");
            }
        }
        return f;
    }
    
    private List<Element> getChildElementsByTagName(Element e, String name) {
        NodeList nl = e.getChildNodes();
        int l = nl.getLength();
        List<Element> out = new ArrayList<Element>();
        for (int i = 0; i < l; i++) {
            Node c = nl.item(i);
            if (Node.ELEMENT_NODE == c.getNodeType()) {
                if (c.getNodeName().equals(name)) {
                    out.add((Element) c);
                }
            }
        }
        return out;
    }
    
    private static String namespaceForType(String tname) {
        // FIXME use the policy to figure this out
        String xmlns = tname.split(":")[0];
        if (xmlns.equals("archimate")) {
            return "http://www.bolton.ac.uk/archimate";
        }
        return "http://namespaces.local/" + xmlns;
    }
    
    private void createSubElement(String el, String propname, String value) {
        Element obj = getorCreateObjectClass(el);
        Element prop = getOrCreateElement(obj, propname);
        prop.setTextContent(value);
    }
    
    private Element getOrCreateElement(Element m, String value) {
        List<Element> nl = getChildElementsByTagName(e, value);
        if (0 == nl.size()) {
            Element e = this.enricher.xml.createElement(value);
            m.appendChild(e);
            return e;
        }
        if (1 == nl.size()) {
            return nl.get(0);
        }
        Widgets.tellProblem("property problem", "objectClass name '" + value
                + "' is reserved");
        return null;
    }
    
    private boolean checkAncestry(String ocname, String elementtype) {
        /*
         * See whether elementtype is an ancestor of ocname
         */
        Element policy = this.getPolicyFor(ocname);
        if (null == policy) {
            return false;
        }
        List<Element> el = getChildElementsByTagName(policy, "ancestor");
        for (Element e : el) {
            String ancestorname = e.getAttribute("class");
            if (ancestorname.equals(elementtype)) {
                return true;
            }
            if (checkAncestry(ancestorname, elementtype)) {
                return true;
            }
        }
        return false;
    }
    
    private Element getPolicyFor(String classname) {
        NodeList nl;
        if (null == this.enricher.policy) {
            return null;
        }
        try {
            nl = (NodeList) this.enricher.xpath.evaluate("//objectClass",
                    this.enricher.policy, XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            this.enricher.log.printStackTrace(e);
            throw new RuntimeException("problem evaluating xpath");
        }
        
        int l = nl.getLength();
        for (int i = 0; i < l; i++) {
            Element c = (Element) nl.item(i);
            String ocname = c.getAttribute("name");
            if (ocname.equals(classname)) {
                return c;
            }
        }
        return null;
    }
    
    void applyPolicyForElement(Element objectclass, NodeMassager massager) {
        applyPolicyForElement(objectclass, null, massager);
    }
    
    private void applyPolicyForElement(Element objectclass, String ancestor,
            NodeMassager massager) {
        /*
         * applyPolicyForElement(node,objectclass) - for all ancestors for the
         * objectclass recursively add all properties of the ancestor: - for all
         * ancestors of the objectclass if ancestor is not an archi class
         * (starts with 'archimate:') applyPolicyForElement(node,ancestor) - for
         * all properties in policy - if the property does not exist in node
         * addPropertyToElement(node,property) if no defaults have given back
         * anything and minOccurs != 0 issue a warning
         */
        NodeList ancestors = objectclass.getElementsByTagName("ancestor");
        int k = ancestors.getLength();
        for (int j = 0; j < k; j++) {
            String ancestorname = ((Element) ancestors.item(j))
                    .getAttribute("class");
            if (!ancestorname.startsWith("archimate:")) {
                Element occ = getPolicyFor(ancestorname);
                if (null == occ) {
                    this.enricher.log.issueError(
                            "no policy for ancestor " + ancestorname,
                            "for objectClass"
                                    + objectclass.getAttribute("name"));
                    return;
                }
                applyPolicyForElement(occ, ancestorname, massager);
            }
        }
        NodeList pl = objectclass.getElementsByTagName("property");
        int l = pl.getLength();
        for (int i = 0; i < l; i++) {
            Element property = (Element) pl.item(i);
            String propname = property.getAttribute("name");
            massager.function(e, property, propname, ancestor);
        }
    }
    
}
