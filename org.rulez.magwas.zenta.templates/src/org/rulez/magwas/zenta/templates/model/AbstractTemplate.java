/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates.model;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipOutputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.jdom.Document;
import org.jdom.Element;
import org.rulez.magwas.zenta.editor.model.impl.EditorModelImage;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.model.handmade.util.FileUtils;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.util.LogUtil;
import org.rulez.magwas.zenta.model.util.ZipUtils;

import uk.ac.bolton.jdom.JDOMUtils;



/**
 * Abstract Template
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractTemplate implements ITemplate, ITemplateXMLTags {
    
    private String fID;
    private String fName;
    private String fDescription;
    private File fFile;
    
    private boolean fManifestLoaded;
    
    private String fKeyThumbnailPath;
    private Image fKeyThumbnailImage;
    private Image[] fThumbnails;
    
    public AbstractTemplate() {
    }

    /**
     * @param id If this is null a new id will be generated
     */
    public AbstractTemplate(String id) {
        if(id == null) {
            id = UUID.randomUUID().toString().split("-")[0]; //$NON-NLS-1$
        }
        fID = id;
    }

    @Override
    public String getName() {
        if(!fManifestLoaded) {
            loadManifest();
        }
        return Util.verifyNonNull(fName);
    }
    
    @Override
    public void setName(String name) {
        fName = StringUtils.safeString(name);
    }

    @Override
    public String getDescription() {
        if(!fManifestLoaded) {
            loadManifest();
        }
        return Util.verifyNonNull(fDescription);
    }
    
    @Override
    public void setDescription(String description) {
        fDescription = StringUtils.safeString(description);
    }

    @Override
    public Image getKeyThumbnail() {
        if(!fManifestLoaded) {
            loadManifest();
        }
        String tnp = getThumbNailPath();
        if(fKeyThumbnailImage == null) {
            fKeyThumbnailImage = loadImage(tnp);
        }
        
        return imageByKyeOrDefault();
    }

	public Image imageByKyeOrDefault() {
		Image tni = fKeyThumbnailImage;
		if(tni == null) {
            return IZentaUIImages.ImageFactory.getImage(IZentaImages.DEFAULT_MODEL_THUMB);
        }
        else {
            return tni;
        }
	}

	public String getThumbNailPath() {
		return Util.verifyNonNull(fKeyThumbnailPath);
	}
    
    @Override
    public Image[] getThumbnails() {
    	Image[] thumbnails = fThumbnails;
        if(thumbnails == null) {
        	thumbnails = loadThumbnails();
        	fThumbnails = thumbnails;
        }
        return thumbnails;
    }

	public Image[] loadThumbnails() {
		List<Image> list = new ArrayList<Image>();
		Image image;
		int i = 1;
		do {
		    image = loadImage(TemplateManager.ZIP_ENTRY_THUMBNAILS + i++ + ".png"); //$NON-NLS-1$
		    list.add(image);
		} while(image != null);
		return  list.toArray(new Image[list.size()]);
	}

    @Override
    public File getFile() {
        return Util.verifyNonNull(fFile);
    }

    @Override
    public void setFile(File file) {
        fFile = file;
    }

    @Override
    public String getID() {
        return Util.verifyNonNull(fID);
    }

    @Override
    public void setID(String id) {
        fID = id;
    }
    
    @Override
    public void save() throws Exception {
        if(fFile == null || !fFile.exists()) {
            return;
        }
        
        // Manifest
        Document doc = new Document();
        Element root = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_MANIFEST);
        doc.setRootElement(root);
        
        Element elementName = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_NAME);
        elementName.setText(getName());
        root.addContent(elementName);
        
        Element elementDescription = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_DESCRIPTION);
        elementDescription.setText(getDescription());
        root.addContent(elementDescription);
        
        Element elementKeyThumb = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_KEY_THUMBNAIL);
        elementKeyThumb.setText(getThumbNailPath());
        root.addContent(elementKeyThumb);
        
        String manifest = JDOMUtils.write2XMLString(doc);
        
        // Model
        String model = ZipUtils.extractZipEntry(getFile(), TemplateManager.getZipEntryModel());
        if(null == model)
        	throw new AssertionError();
        
        // Start a zip stream
        File tmpFile = Util.verifyNonNull(File.createTempFile("architemplate", null)); //$NON-NLS-1$
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(tmpFile));
        ZipOutputStream zOut = new ZipOutputStream(out);
        
        ZipUtils.addStringToZip(manifest, TemplateManager.getZipEntryManifest(), zOut);
        ZipUtils.addStringToZip(model, TemplateManager.getZipEntryModel(), zOut);

        // Thumbnails
        Image[] images = getThumbnails();
        int i = 1;
        for(Image image : images) {
            ZipUtils.addImageToZip(new EditorModelImage(image), TemplateManager.ZIP_ENTRY_THUMBNAILS + i++ + ".png", zOut, SWT.IMAGE_PNG, null); //$NON-NLS-1$
        }
        
        zOut.flush();
        zOut.close();

        // Delete and copy
        fFile.delete();
        FileUtils.copyFile(tmpFile, getFile(), false);
        tmpFile.delete();
    }
    
    private void loadManifest() {
        // Default first
        fManifestLoaded = true;
        fName = ""; //$NON-NLS-1$
        fDescription = ""; //$NON-NLS-1$
        
        if(fFile != null && fFile.exists()) {
            try {
                // Manifest
                String manifest = ZipUtils.extractZipEntry(getFile(), TemplateManager.getZipEntryManifest());
                if(manifest != null) {
                    Document doc = JDOMUtils.readXMLString(manifest);
                    Element rootElement = doc.getRootElement();
                    
                    // Name
                    Element nameElement = rootElement.getChild(XML_TEMPLATE_ELEMENT_NAME);
                    if(nameElement != null) {
                        fName = nameElement.getText();
                    }
                    
                    // Description
                    Element descriptionElement = rootElement.getChild(XML_TEMPLATE_ELEMENT_DESCRIPTION);
                    if(nameElement != null) {
                        fDescription = descriptionElement.getText();
                    }
                    
                    // Key thumbnail
                    Element keyThumbnailElement = rootElement.getChild(XML_TEMPLATE_ELEMENT_KEY_THUMBNAIL);
                    if(keyThumbnailElement != null) {
                        fKeyThumbnailPath = keyThumbnailElement.getText();
                    }
                }
            }
            catch(Exception ex) {
                LogUtil.logException(ex);
            }
        }
    }
    
    private Image loadImage(String imgName) {
    	if (fFile == null || (!fFile.exists()))
    		return null;
        
        Image image = null;
        InputStream stream = null;
        try {
            stream = ZipUtils.getZipEntryStream(getFile(), imgName);
            if (stream == null)
            	return null;
            image = new Image(null, stream);
        }
        catch(IOException ex) {
        }
        finally {
            try {
                if(stream != null) {
                    stream.close();
                }
            }
            catch(IOException ex) {
            	throw new RuntimeException(ex);
            }
        }

        return image;
    }

    @Override
    public void dispose() {
        if(fKeyThumbnailImage != null && !fKeyThumbnailImage.isDisposed()) {
            fKeyThumbnailImage.dispose();
            fKeyThumbnailImage = null;
        }
        if(fThumbnails != null) {
            for(Image image : fThumbnails) {
                if(image != null && !image.isDisposed()) {
                    image.dispose();
                }
            }
            fThumbnails = null;
        }
    }
}
