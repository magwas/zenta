/*******************************************************************************
 * Copyright (c) 2011 Árpád Magosányi.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 *******************************************************************************/
package org.rulez.magwas.zenta.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.rulez.magwas.zenta.editor.model.IModelExporter;
import org.rulez.magwas.zenta.export.Enricher;
import org.rulez.magwas.zenta.export.EventLog;
import org.rulez.magwas.zenta.export.IPreferenceConstants;
import org.rulez.magwas.zenta.export.Widgets;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.util.ZentaResourceBase;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.Document;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;


/**
 * Rich Exporter of Zenta model
 * <p>
 * Input is the style directory, containing:
 * <ul>
 * <li>a file called style.xslt: the xml stylesheet to be applied to the
 * "rich model file"</li>
 * <li>any other files needed for the presentation of resulting html</li>
 * </ul>
 * 
 * <p>
 * In the future (If I still think it is a good idea), the style directory may
 * contain a file containing the name of scripts to be run on archirich.xml and
 * index.html.
 * <p>
 * Output is the report directory, containing:
 * <ul>
 * <li>copy of contents of the style directory</li>
 * <li>archirich.xml : it is the model file, but each document tags are enriched
 * with HTMLReportExporter's paqrseCharsAndLinks.</li>
 * <li>diagrams in png: all diagrams are saved to ID.png, where ID is the id of
 * the diagram</li>
 * <li>index.html: the result of applying style.xslt to archirich.xml</li>
 * 
 * @author Árpád Magosányi
 */
public class RichExport implements IModelExporter {
    
    public RichExport() {
        
    }
    
	@Override
	public void export( IZentaModel model) throws IOException {
        File target = Widgets.askSaveFile(IPreferenceConstants.LAST_RICH_PATH,
                new String[] { "*.xml" });
        if (null == target) {
            return;
        }
        EventLog log = new EventLog("Rich export");
        export(model, target, log);
		
	}

    public static void export(IZentaModel model, File target, IEventLog log) {
        export(model, target, null, log);
    }
    
    public static void export(IZentaModel model, File target,
            File policyfile, IEventLog log) {
        try {
            ZentaResourceBase resource = (ZentaResourceBase) ZentaResourceFactoryBase
                    .createResource(target);
            resource.getContents().add(model);
            // we get it in xml
            Map<Object, Object> saveoptions = resource.getDefaultSaveOptions();
            Document xml = resource.save(null, saveoptions, null);
            resource.getContents().remove(model);
            
            Document policy = null;
            // FIXME we use the same xpath for both the policy and the archi
            // file:
            // if namespace clashing occurs, they should be separated
            if ((null != policyfile) && policyfile.exists()) {
                DocumentBuilderFactory dbf = DocumentBuilderFactory
                        .newInstance();
                DocumentBuilder db;
                try {
                    db = dbf.newDocumentBuilder();
                    policy = db.parse(policyfile);
                } catch (Exception e) {
                    Widgets.tellProblem("Problem loading policy file",
                            e.toString());
                    log.printStackTrace(e);
                }
            }
            
            Enricher enricher = new Enricher(model.getId(), xml, policy, log);
            enricher.enrichXML();
            
            // save the xml
            DOMConfiguration docConfig = xml.getDomConfig();
            docConfig.setParameter("well-formed", true);
            xml.normalizeDocument();
            DOMImplementationRegistry registry = DOMImplementationRegistry
                    .newInstance();
            DOMImplementationLS impl = (DOMImplementationLS) registry
                    .getDOMImplementation("LS");
            LSSerializer writer = impl.createLSSerializer();
            String str = writer.writeToString(xml);
            String enc = xml.getXmlEncoding();
            if (enc == null) {
                enc = "utf-16";
            }
            Charset cs = Charset.forName(enc);
            OutputStream os = new FileOutputStream(target);
            OutputStreamWriter fw = new OutputStreamWriter(os, cs);
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            Widgets.tellProblem("Problem Exporting Model", e.toString());
            log.printStackTrace(e);
        }
    }

}
