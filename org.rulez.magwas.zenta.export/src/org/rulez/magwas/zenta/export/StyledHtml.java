/*******************************************************************************
 * Copyright (c) 2010 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 *******************************************************************************/
package org.rulez.magwas.zenta.export;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.rulez.magwas.zenta.export.EventLog;
import org.rulez.magwas.zenta.export.IPreferenceConstants;
import org.rulez.magwas.zenta.export.StyledHtmlPlugin;
import org.rulez.magwas.zenta.export.Util;
import org.rulez.magwas.zenta.export.Widgets;
import org.rulez.magwas.zenta.export.steps.StepFactory;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import org.rulez.magwas.zenta.editor.model.IModelExporter;

/**
 * Styled HTML Exporter of Zentamate model
 * <p>
 * Input is the style file, describing the steps of the transformation. Output
 * is the report directory, where the output file(s) are placed.
 * 
 * @author Árpád Magosányi
 */
public class StyledHtml implements IModelExporter {
    
    /** The logger instance. */
    private EventLog log;
    
    /**
     * Instantiates a new styledhtml exporter.
     */
    public StyledHtml() {
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * org.rulez.magwas.zenta.editor.model.IModelExporter#export(uk.ac.bolton
     * .zenta.model.IZentamateModel)
     */
    public void export(IZentamateModel model) {
        log = new EventLog("Styled export");
        log.issueInfo("starting styled export", Util.now());
        String stylepath = StyledHtmlPlugin.INSTANCE.getPreferenceStore()
                .getString(IPreferenceConstants.STYLE_PATH);
        export(model, stylepath, log);
    }
    
    /**
     * Export a model using the given style. The target directory is based on
     * the preferences and may be asked (according to the preferences also)
     * 
     * @param model
     *            the model
     * @param stylepath
     *            the path to the style file
     * @param log
     *            the logger instance
     */
    public static void export(IZentamateModel model, String stylepath,
            EventLog log) {
        Boolean ask = StyledHtmlPlugin.INSTANCE.getPreferenceStore()
                .getBoolean(IPreferenceConstants.OUT_ASK);
        String opath = StyledHtmlPlugin.INSTANCE.getPreferenceStore()
                .getString(IPreferenceConstants.OUT_PATH);
        File targetdir;
        if ((!ask) || (opath == null)) {
            String lastpath = StyledHtmlPlugin.INSTANCE.getPreferenceStore()
                    .getString(IPreferenceConstants.LAST_STYLED_PATH);
            if (null == lastpath) {
                StyledHtmlPlugin.INSTANCE.getPreferenceStore().setValue(
                        IPreferenceConstants.LAST_STYLED_PATH, opath);
            }
            targetdir = Widgets
                    .askSaveDir(IPreferenceConstants.LAST_STYLED_PATH);
        } else {
            targetdir = new File(opath);
        }
        export(model, stylepath, log, targetdir);
    }
    
    /**
     * Export the model based on the given style to the given target directory
     * 
     * @param model
     *            the model
     * @param stylepath
     *            path to the style file
     * @param log
     *            the logger instance
     * @param targetdir
     *            the target directory
     */
    public static void export(IZentamateModel model, String stylepath,
            EventLog log, File targetdir) {
        try {
            File stylefile = new File(stylepath);
            Document style;
            if ((null != stylefile) && stylefile.exists()) {
                DocumentBuilderFactory dbf = DocumentBuilderFactory
                        .newInstance();
                DocumentBuilder db;
                try {
                    db = dbf.newDocumentBuilder();
                    style = db.parse(stylefile);
                } catch (Exception e) {
                    Widgets.tellProblem("Problem loading style file",
                            e.toString());
                    log.printStackTrace(e);
                    return;
                }
            } else {
                Widgets.tellProblem("Not exporting", "nonexistent style");
                return;
            }
            
            if (targetdir == null) {
                log.issueInfo("no target directory", Util.now());
                return;
            }
            if (!targetdir.exists()) {
                targetdir.mkdirs();
            }
            log.issueInfo("target dir=" + targetdir.getAbsolutePath(),
                    Util.now());
            File styledir = new File(stylefile.getParent());
            StepFactory sf = new StepFactory(log, model, styledir, targetdir);
            NodeList styles = style.getElementsByTagName("style");
            for (int i = 0; i < styles.getLength(); i++) {
                Element s = (Element) styles.item(i);
                sf.get("style").doit(s, targetdir);
            }
            sf.cleanUp();
            log.issueInfo("done export", Util.now());
            
        } catch (Exception e) {
            log.issueError("Export problem", e.getMessage());
            e.printStackTrace();
        }
        log.show();
    }
}
