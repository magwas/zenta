/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.templates.model;

import java.io.File;
import java.io.IOException;

import org.eclipse.swt.graphics.Image;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.rulez.magwas.zenta.canvas.CanvasEditorPlugin;
import org.rulez.magwas.zenta.canvas.ICanvasImages;
import org.rulez.magwas.zenta.editor.ZentaEditorPlugin;
import org.rulez.magwas.zenta.editor.utils.ZipUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.templates.model.ITemplate;
import org.rulez.magwas.zenta.templates.model.ITemplateGroup;
import org.rulez.magwas.zenta.templates.model.ITemplateXMLTags;
import org.rulez.magwas.zenta.templates.model.TemplateGroup;
import org.rulez.magwas.zenta.templates.model.TemplateManager;

import uk.ac.bolton.jdom.JDOMUtils;



/**
 * Template Manager.
 * Users must call dispose() when finished with it if the images in Templates are loaded
 * @author Phillip Beauvoir
 */
public class CanvasTemplateManager extends TemplateManager {

	public static final String CANVAS_TEMPLATE_FILE_EXTENSION = ".archicanvas"; //$NON-NLS-1$
    private File fUserTemplatesFile = new File(ZentaEditorPlugin.INSTANCE.getUserDataFolder(), "canvasses.xml"); //$NON-NLS-1$

    @Override
    protected ITemplateGroup loadInbuiltTemplates() {
        ITemplateGroup group = newBuiltinTemplateGroup();
        File folder = CanvasEditorPlugin.INSTANCE.getTemplatesFolder();
        if(folder.exists()) {
            for(File file : folder.listFiles()) {
                if(file.getName().toLowerCase().endsWith(CANVAS_TEMPLATE_FILE_EXTENSION)) {
                    ITemplate template = new CanvasModelTemplate();
                    template.setFile(file);
                    group.addTemplate(template);
                }
            }
        }
        return group;
    }

	
	private TemplateGroup newBuiltinTemplateGroup() {
		return new TemplateGroup(Messages.CanvasTemplateManager_0);
	}

    @Override
    public File getUserTemplatesManifestFile() {
        return Util.verifyNonNull(fUserTemplatesFile);
    }

    @Override
    public String getTemplateFileExtension() {
        return CANVAS_TEMPLATE_FILE_EXTENSION;
    }

    @Override
    public ITemplate createTemplate(File file) throws IOException {
        if(isValidTemplateFile(file)) {
            return new CanvasModelTemplate(null);
        }
        else {
            throw new IOException("Wrong template format."); //$NON-NLS-1$
        }
    }

    @Override
    protected ITemplate createTemplate(String type) {
        if(!CanvasModelTemplate.XML_CANVAS_TEMPLATE_ATTRIBUTE_TYPE_MODEL.equals(type))
        	throw new IllegalTemplateTypeException();
        return new CanvasModelTemplate();
    }
    
	@Override
    public Image getMainImage() {
        return ICanvasImages.ImageFactory.getImage(ICanvasImages.ICON_CANVAS_MODEL_16);
    }
    
    @Override
    protected boolean isValidTemplateFile(File file) throws IOException {
        if(!file.exists()) {
            return false;
        }
        
        // Ensure the template is of the right kind
        String xmlString = ZipUtils.extractZipEntry(file, getZipEntryManifest());
        if(xmlString == null) {
            return false;
        }

        // If the attribute "type" exists then return true if its value is "canvas".
        // If the attribute doesn't exist it was from an older version (before 2.1)
        try {
            Document doc = JDOMUtils.readXMLString(xmlString);
            Element root = doc.getRootElement();
            Attribute attType = root.getAttribute(ITemplateXMLTags.XML_TEMPLATE_ATTRIBUTE_TYPE);
            if(attType != null) {
                return CanvasModelTemplate.XML_CANVAS_TEMPLATE_ATTRIBUTE_TYPE_MODEL.equals(attType.getValue());
            }
        }
        catch(JDOMException ex) {
            return false;
        }
         
        return true;
    }
}
