package org.rulez.magwas.zenta.export;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.browser.BrowserEditorInput;
import org.rulez.magwas.zenta.browser.IBrowserEditor;
import org.rulez.magwas.zenta.export.IEventLog;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.editor.ui.services.UIRequestManager;
import org.rulez.magwas.zenta.editor.views.tree.TreeSelectionRequest;

public class EventLog implements IEventLog {
    
    private IBrowserEditor editor;
    private final Browser  browser;
    private Document       messages;
    private Node           msg;
    
    public EventLog(String title) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db;
        try {
            db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("no document builder");
        }
        messages = db.newDocument();
        Node table = messages.createElement("table");
        messages.appendChild(table);
        msg = table;
        BrowserEditorInput br = new BrowserEditorInput(null, title);
        editor = (IBrowserEditor) EditorManager.openEditor(br,
                IBrowserEditor.ID);
        browser = editor.getBrowser();
        
        Display.getDefault().asyncExec(new Runnable() { // On a thread for when
                                                        // browser has been
                                                        // created
                    @Override
                    public void run() {
                        if (!browser.isDisposed()) {
                            browser.addProgressListener(new ProgressListener() {
                                @Override
                                public void completed(ProgressEvent event) {
                                }
                                
                                @Override
                                public void changed(ProgressEvent event) {
                                    
                                }
                            });
                            browser.addLocationListener(new LocationListener() {
                                public void changing(LocationEvent event) {
                                    String loc = event.location;
                                    if (loc.startsWith("zenta://")) {
                                        String[] ids = loc.split("//")[1]
                                                .split("/");
                                        focusElement(ids[0], ids[1]);
                                    }
                                    
                                    event.doit = false;
                                }
                                
                                public void changed(LocationEvent event) {
                                }
                                
                            });
                        }
                    }
                });
    }
    
    private void focusElement(String modelid, String elemid) {
    	List<IZentaModel> model_list = IEditorModelManager.INSTANCE.getModels();
        for (IZentaModel model : model_list) {
            String thismodelid = model.getId();
            if (thismodelid.equals(modelid)) {
                EObject theElementToSelect = ZentaModelUtils.getObjectByID(
                        model, elemid);
                UIRequestManager.INSTANCE
                        .fireRequest(new TreeSelectionRequest(this,
                                new StructuredSelection(theElementToSelect),
                                true));
                return;
            }
        }
    }
    
    private void issue(String qualifier, String modelid, Object node,
            String text, String detail) {
        System.out.println(qualifier+":"+ text+"\n"+detail);
        Node tr = messages.createElement("tr");
        msg.appendChild(tr);
        Node qtd = messages.createElement("td");
        qtd.setTextContent(qualifier);
        tr.appendChild(qtd);
        Node ttd = messages.createElement("td");
        ttd.setTextContent(text);
        tr.appendChild(ttd);
        Node ltd = messages.createElement("td");
        if ((null != node) && (null != modelid)) {
            String id = null;
            String name = null;
            if (node instanceof IIdentifier) {
                id = ((IIdentifier) node).getId();
            }
            if (node instanceof INameable) {
                name = ((INameable) node).getName();
            }
            if (node instanceof Element) {
                id = ((Element) node).getAttribute("id");
                name = ((Element) node).getAttribute("name");
            }
            Node location = messages.createElement("a");
            ((Element) location).setAttribute("href", "zenta://" + modelid
                    + "/" + id);
            location.setTextContent(" at " + name + "(" + node.getClass() + ")");
            ltd.appendChild(location);
            tr.appendChild(ltd);
            ltd = messages.createElement("td");
        } else {
            ((Element) ltd).setAttribute("colspan", "2");
        }
        ltd.setTextContent(detail);
        tr.appendChild(ltd);
        show();
        // bs.refresh();
    }
    
    public void show() {
        String repr = xmlToString(messages);
        
        browser.setText(repr);
    }
    
    public void issueInfo(String text, String detail) {
        issue("INFO", null, null, text, detail);
    }
    
    public void issueWarning(String text, String detail) {
        
        issue("WARNING", null, null, text, detail);
    }
    
    public void issueError(String text, String detail) {
        
        issue("ERROR", null, null, text, detail);
    }
    
    public void issueInfo(String modelid, Object node, String text,
            String detail) {
        issue("INFO", modelid, node, text, detail);
    }
    
    public void issueWarning(String modelid, Object node, String text,
            String detail) {
        issue("WARNING", modelid, node, text, detail);
    }
    
    public void issueError(String modelid, Object node, String text,
            String detail) {
        issue("ERROR", modelid, node, text, detail);
    }
    
    public void printStackTrace(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        e.printStackTrace();
        String msg = e.getMessage();
        String trace = sw.toString();
        issue("Stack trace", null, null, msg, trace);
    }
    
    private String xmlToString(Document doc) {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = factory.newTransformer();
            StringWriter writer = new StringWriter();
            Result result = new StreamResult(writer);
            Source source = new DOMSource(doc);
            transformer.transform(source, result);
            writer.close();
            String xml = writer.toString();
            return xml;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("cannot convert dom to string");
        }
    }
    
}
