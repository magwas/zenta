package org.rulez.magwas.zenta.export;

import java.util.regex.Matcher;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import org.rulez.magwas.zenta.editor.utils.HTMLUtils;

public class DocField {
    
    private Element e;
    
    DocField(Element e) {
        this.e = e;
    }
    
    private void parseLinks(String s) {
        Matcher matcher = HTMLUtils.HTML_LINK_PATTERN.matcher(s);
        Document d = e.getOwnerDocument();
        
        int lastend = 0;
        while (matcher.find(lastend)) {
            String group = matcher.group();
            String text = s.substring(lastend, matcher.start());
            
            Node txt = d.createTextNode(text);
            lastend = matcher.end();
            e.appendChild(txt);
            Element a = d.createElement("a");
            a.setAttribute("href", group);
            Node sub = d.createTextNode(group);
            a.appendChild(sub);
            e.appendChild(a);
        }
        if (lastend < s.length()) {
            Node txt = d.createTextNode(s.substring(lastend));
            e.appendChild(txt);
        }
    }
    
    public void parseCharsAndLinks() {
        // Escape chars
        Document d = e.getOwnerDocument();
        String s = e.getTextContent();
        e.setTextContent("");
        
        String[] ss = s.split("(\r\n|\r|\n)");
        
        for (String sss : ss) {
            parseLinks(sss);
            e.appendChild(d.createElement("br"));
        }
        
    }
    
}
