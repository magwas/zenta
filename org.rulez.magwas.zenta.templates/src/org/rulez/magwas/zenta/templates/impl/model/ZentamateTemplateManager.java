/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates.impl.model;

import java.io.File;
import java.io.IOException;

import org.eclipse.swt.graphics.Image;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.rulez.magwas.zenta.editor.ZentamateEditorPlugin;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.editor.utils.ZipUtils;
import org.rulez.magwas.zenta.templates.ZentamateEditorTemplatesPlugin;
import org.rulez.magwas.zenta.templates.model.ITemplate;
import org.rulez.magwas.zenta.templates.model.ITemplateGroup;
import org.rulez.magwas.zenta.templates.model.ITemplateXMLTags;
import org.rulez.magwas.zenta.templates.model.TemplateGroup;
import org.rulez.magwas.zenta.templates.model.TemplateManager;

import uk.ac.bolton.jdom.JDOMUtils;


/**
 * Zentamate Template Manager.
 * Users must call dispose() when finished with it if the images in Templates are loaded
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateTemplateManager extends TemplateManager {
    
    public static final String ARCHIMATE_TEMPLATE_FILE_EXTENSION = ".architemplate"; //$NON-NLS-1$
    
    private File fUserTemplatesFile = new File(ZentamateEditorPlugin.INSTANCE.getUserDataFolder(), "templates.xml"); //$NON-NLS-1$
    
    public ZentamateTemplateManager() {
    }
    
    @Override
    protected ITemplateGroup loadInbuiltTemplates() {
        ITemplateGroup group = new TemplateGroup(Messages.ZentamateTemplateManager_2);
        File folder = ZentamateEditorTemplatesPlugin.INSTANCE.getTemplatesFolder();
        if(folder.exists()) {
            for(File file : folder.listFiles()) {
                if(file.getName().toLowerCase().endsWith(ARCHIMATE_TEMPLATE_FILE_EXTENSION)) {
                    ITemplate template = new ZentamateModelTemplate();
                    template.setFile(file);
                    group.addTemplate(template);
                }
            }
        }
        return group;
    }

    @Override
    public File getUserTemplatesManifestFile() {
        return fUserTemplatesFile;
    }

    @Override
    public String getTemplateFileExtension() {
        return ARCHIMATE_TEMPLATE_FILE_EXTENSION;
    }

    @Override
    public ITemplate createTemplate(File file) throws IOException {
        if(isValidTemplateFile(file)) {
            return new ZentamateModelTemplate(null);
        }
        else {
            throw new IOException(Messages.ZentamateTemplateManager_0);
        }
    }

    @Override
    protected ITemplate createTemplate(String type) {
        if(ZentamateModelTemplate.XML_TEMPLATE_ATTRIBUTE_TYPE_MODEL.equals(type)) {
            return new ZentamateModelTemplate();
        }
        return null;
    }
    
    @Override
    public Image getMainImage() {
        return IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_MODELS_16);
    }
    
    @Override
    protected boolean isValidTemplateFile(File file) throws IOException {
        if(file == null || !file.exists()) {
            return false;
        }
        
        // Ensure the template is of the right kind
        String xmlString = ZipUtils.extractZipEntry(file, ZIP_ENTRY_MANIFEST);
        if(xmlString == null) {
            return false;
        }

        // If the attribute "type" exists then return true if its value is "model".
        // If the attribute doesn't exist it was from an older version (before 2.1)
        try {
            Document doc = JDOMUtils.readXMLString(xmlString);
            Element root = doc.getRootElement();
            Attribute attType = root.getAttribute(ITemplateXMLTags.XML_TEMPLATE_ATTRIBUTE_TYPE);
            if(attType != null) {
                return ZentamateModelTemplate.XML_TEMPLATE_ATTRIBUTE_TYPE_MODEL.equals(attType.getValue());
            }
        }
        catch(JDOMException ex) {
            return false;
        }
         
        return true;
    }
}
