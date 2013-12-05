package org.rulez.magwas.zenta.export;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.rulez.magwas.zenta.export.CardinalityChecker;
import org.rulez.magwas.zenta.export.DocField;
import org.rulez.magwas.zenta.export.IEventLog;
import org.rulez.magwas.zenta.export.IndirectChildrenAdder;
import org.rulez.magwas.zenta.model.NSResolver;
import org.rulez.magwas.zenta.model.util.Util;
import org.rulez.magwas.zenta.export.NodeMassager;
import org.rulez.magwas.zenta.export.PropertyAdder;
import org.rulez.magwas.zenta.export.RichElement;
import org.rulez.magwas.zenta.export.VarResolver;
import org.rulez.magwas.zenta.export.Widgets;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Enricher {
    
    Document                        policy       = null;
    Document                        xml          = null;
    XPath                           xpath;
    VarResolver                     vars;
    NSResolver                      nss;
    public HashMap<Element, String> associations = new HashMap<Element, String>();
    IEventLog                       log;
    String                          modelid;
    
    public Enricher(String modelid, Document infile, Document policy,
            IEventLog elog) {
        this.modelid = modelid;
        log = elog;
        log.issueInfo("starting enricher", Util.now());
        xml = infile;
        xpath = XPathFactory.newInstance().newXPath();
        vars = new VarResolver();
        nss = new NSResolver();
        xpath.setXPathVariableResolver(vars);
        nss.put("zenta", "http://magwas.rulez.org/zenta");
        xpath.setNamespaceContext(nss);
        this.policy = policy;
        log.issueInfo("enricher done reading", Util.now());
    }
    
    public void enrichXML() {
        enrichDocs();
        enrichXML(xml);
        associateObjects();
        addDefaultSubelements();
    }
    
    private void associateObjects() {
        for (Entry<Element, String> e : associations.entrySet()) {
            associateObjectClass(e.getKey(), e.getValue());
        }
    }
    
    private void associateObjectClass(Element grouporfolder, String objectclass) {
        
        String ocpath = "//*[@id=//zenta:Group[@id=$thisid]//zenta:DiagramObject/@zentaElement]";
        String thisid = grouporfolder.getAttribute("id");
        this.vars.put("thisid", thisid);
        NodeList nl = null;
        try {
            nl = (NodeList) xpath.evaluate(ocpath, grouporfolder,
                    XPathConstants.NODESET);
        } catch (XPathExpressionException e) {
            throw new RuntimeException(e);
        }
        int l = nl.getLength();
        for (int i = 0; i < l; i++) {
            RichElement r = new RichElement((Element) nl.item(i), this);
            r.getorCreateObjectClass(objectclass);
        }
    }
    
    private void enrichDocs() {
        // enrich the documentation-like parts in the xml
        NodeList nl = xml.getElementsByTagName("documentation");
        parse(nl);
        NodeList pl = xml.getElementsByTagName("purpose");
        parse(pl);
    }
    
    private void parse(NodeList nl) {
        for (int i = 0; i < nl.getLength(); i++) {
            DocField e = new DocField((Element) nl.item(i));
            e.parseCharsAndLinks();
        }
    }
    
    private void enrichXML(Node n) {
        NodeList nl = n.getChildNodes();
        int ll = nl.getLength();
        for (int i = 0; i < ll; i++) {
            Node m = nl.item(i);
            if (Node.ELEMENT_NODE == m.getNodeType()) {
                Element e = (Element) m;
                enrichXML(e);
                (new RichElement(e, this)).enrich();
            }
        }
    }
    
    private void applyPolicyForElements(NodeList ol, NodeMassager massager) {
        /*
         * For each added subelement of the model (@parentid) calls the massager
         */
        int l = ol.getLength();
        for (int i = 0; i < l; i++) {
            Element objectclass = (Element) ol.item(i);
            NodeList nl;
            String ocName = objectclass.getAttribute("name");
            if("".equals(ocName))//FIXME: when we will have error handling, unnamed ObjectClasses should be an error
            	continue;
			String expr = "//" + ocName
			        + "[@parentid]";
            try {
				nl = (NodeList) xpath
                        .evaluate(expr, xml, XPathConstants.NODESET);
            } catch (XPathExpressionException e) {
            	throw new RuntimeException(e);
            }
            
            int k = nl.getLength();
            for (int j = 0; j < k; j++) {
                RichElement node = new RichElement((Element) nl.item(j), this);
                node.applyPolicyForElement(objectclass, massager);
            }
        }
    }
    
    private void addDefaultSubelements() {
        /*
         * This is how we add default sub elements
         * 
         * for all objectclasses in policy - for all nodes belonging to that
         * objectclass applyPolicyForElement(node,objectclass) - for all
         * ancestors for the objectclass recursively add all properties of the
         * ancestor: - for all ancestors of the objectclass if ancestor is not
         * an archi class (starts with 'zenta:')
         * applyPolicyForElement(node,ancestor) - for all properties in policy -
         * if the property does not exist in node
         * addPropertyToElement(node,property) - for the defaults in order
         * tryDefaultForProperty(node,propertyname,default) - use the xpath in
         * the 'select' attribute - if the xpath gives back something then we
         * add a subelement for the property and go for the next property if no
         * defaults have given back anything and minOccurs != 0 issue a warning
         */
        
        if (null == policy) {
            log.issueWarning("no policy", null);
            return;
        }
        NodeList ol = policy.getElementsByTagName("objectClass");
        if (null == ol) {
            Widgets.tellProblem("policy problem", "no objectClass");
            return;
        }
        applyPolicyForElements(ol, new PropertyAdder(xpath, vars, log));
        applyPolicyForElements(ol, new IndirectChildrenAdder(xpath, log));
        applyPolicyForElements(ol, new CardinalityChecker(xpath, log, modelid));
    }
    
}
