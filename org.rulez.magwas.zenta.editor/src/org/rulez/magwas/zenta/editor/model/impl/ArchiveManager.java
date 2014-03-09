/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.impl;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.model.IArchiveManager;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.utils.ZipUtils;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelImageProvider;
import org.rulez.magwas.zenta.model.handmade.util.FileUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;



/**
 * Archive Manager
 * 
 * @author Phillip Beauvoir
 */
public class ArchiveManager implements IArchiveManager {
    
    public class BadPathForImage extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	/**
     * Raw image bytes loaded for all images in use in this model
     */
    static ByteArrayStorage BYTE_ARRAY_STORAGE = new ByteArrayStorage();
    
    /**
     * The Zenta model
     */
    private IZentaModel fModel;
    
    /**
     * Images are loaded
     */
    private boolean fImagesLoaded = false;
    
    /**
     * Paths of images loaded
     */
    private List<String> fLoadedImagePaths = new ArrayList<String>();
    
    /**
     * Adapter monitors added image components added by user (copy & paste, DND, image set, etc)
     * since images were loaded from archive file.
     */
    private EContentAdapter fModelAdapter = new EContentAdapter() {
        @Override
        public void notifyChanged(@Nullable Notification msgo) {
        	Notification msg = Util.verifyNonNull(msgo);
            super.notifyChanged(msg);

            // IDiagramModelImageProvider added
            if(msg.getEventType() == Notification.ADD) {
                if(msg.getNewValue() instanceof IDiagramModelImageProvider) {
                    IDiagramModelImageProvider imageProvider = (IDiagramModelImageProvider)msg.getNewValue();
                    String imagePath = imageProvider.getImagePathOrNull();
                    if(imagePath != null && !fLoadedImagePaths.contains(imagePath)) {
                        fLoadedImagePaths.add(imagePath);
                    }
                }
            }
            // Image path set
            else if(msg.getEventType() == Notification.SET) {
                if(msg.getFeature() == IZentaPackage.Literals.DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH) {
                    String imagePath = (String)msg.getNewValue();
                    if(imagePath != null && !fLoadedImagePaths.contains(imagePath)) {
                        fLoadedImagePaths.add(imagePath);
                    }
                }
            }
        }
    };
    
    /**
     * @param model The owning model
     */
    public ArchiveManager(IZentaModel model) {
        setfModel(model);
        getfModel().eAdapters().add(fModelAdapter);
    }

    public IZentaModel getfModel() {
		return Util.verifyNonNull(fModel);
	}

	public void setfModel(IZentaModel fModel) {
		this.fModel = fModel;
	}

	@Override
    public String addImageFromFile(File file) throws IOException {
        // Get bytes
        byte[] bytes = BYTE_ARRAY_STORAGE.getBytesFromFile(file);
        
        // Is this already in the cache?
        String entryName = BYTE_ARRAY_STORAGE.getKey(bytes);
        // No, so create a new one
        if(entryName == null) {
            // Is this actually a valid Image file? Test it...
            try {
                new Image(Display.getCurrent(), new ByteArrayInputStream(bytes));
            }
            catch(Throwable ex) {
                throw new IOException("Not a supported image file", ex); //$NON-NLS-1$
            }
            
            // OK, add the bytes
            entryName = createArchiveImagePathname(file);
            BYTE_ARRAY_STORAGE.addByteContentEntry(entryName, bytes);
        }
        
        // (The image path will be added in the Model Adapter...)
        
        return entryName;
    }
    
    @Override
    public Image createImage(String path) throws Exception {
        if(BYTE_ARRAY_STORAGE.hasEntry(path)) {
            return new Image(Display.getCurrent(), BYTE_ARRAY_STORAGE.getInputStream(path));
        }
        throw new BadPathForImage();
    }
    
    @Override
    public List<String> getImagePaths() {
        List<String> list = new ArrayList<String>();
        
        for(Iterator<EObject> iter = getfModel().eAllContents(); iter.hasNext();) {
            EObject element = iter.next();
            if(element instanceof IDiagramModelImageProvider) {
                String imagePath = ((IDiagramModelImageProvider)element).getImagePathOrNull();
                if(null != imagePath && !list.contains(imagePath)) {
                    list.add(imagePath);
                }
            }
        }
        
        return list;
    }
    
    /**
     * Load images from model's archive file
     */
    @Override
    public void loadImages() throws IOException {
        File file = getfModel().getFile();
		if(!fImagesLoaded && loadImagesFromModelFile(file)) {
            fImagesLoaded = true;
        }
    }
    
    @Override
    public boolean loadImagesFromModelFile(@Nullable File file) throws IOException {
        if(null == file || !file.exists() || !FACTORY.isArchiveFile(file)) {
            return false;
        }
        
        ZipFile zipFile = new ZipFile(file);
        
        for(Enumeration<? extends ZipEntry> enm = zipFile.entries(); enm.hasMoreElements();) {
            ZipEntry zipEntry = enm.nextElement();
            String entryName = zipEntry.getName();
            if(entryName.startsWith("images/")) { //$NON-NLS-1$
                // Add to ByteArrayStorage
                if(!BYTE_ARRAY_STORAGE.hasEntry(entryName)) {
                    InputStream in = zipFile.getInputStream(zipEntry);
                    BYTE_ARRAY_STORAGE.addStreamEntry(entryName, Util.verifyNonNull(in));
                }
                
                // Add to list
                if(!fLoadedImagePaths.contains(entryName)) {
                    fLoadedImagePaths.add(entryName);
                }
            }
        }
        
        zipFile.close();
        
        return true;
    }
    
    @Override
    public boolean hasImages() {
        for(Iterator<EObject> iter = getfModel().eAllContents(); iter.hasNext();) {
            EObject element = iter.next();
            if(element instanceof IDiagramModelImageProvider) {
            	IDiagramModelImageProvider e = (IDiagramModelImageProvider) element;
            	return null != e.getImagePathOrNull();
            }
        }
        return false;
    }
    
    @Override
    public void saveModel() throws IOException {
        File file = getfModel().getFile();
        
        if(file == null) {
            return;
        }
        
        if(hasImages()) {
            saveModelToArchiveFile(file);
        }
        else {
            ZentaModelUtils.saveModelToXMLFile(getfModel(), file);
        }
    }
    
    /**
     * Save the model to Archive File format
     */
    private void saveModelToArchiveFile(File file) throws IOException {
        // Temp file for xml model file
        File tmpFile = File.createTempFile("zenta", null); //$NON-NLS-1$
        tmpFile.deleteOnExit();
        ZentaModelUtils.saveModelToXMLFile(getfModel(), tmpFile);
        
        // Create Zip File output stream to model's file
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
        ZipOutputStream zOut = new ZipOutputStream(out);
        
        try {
            // Add the model xml file
            ZipUtils.addFileToZip(tmpFile, "model.xml", zOut); //$NON-NLS-1$
            
            // Add any images
            saveImages(zOut);
        }
        finally {
            tmpFile.delete();
            zOut.close();
        }
    }
    
    private void saveImages(ZipOutputStream zOut) throws IOException {
        List<String> added = new ArrayList<String>();
        
        for(Iterator<EObject> iter = getfModel().eAllContents(); iter.hasNext();) {
            EObject eObject = iter.next();
            if(eObject instanceof IDiagramModelImageProvider) {
                IDiagramModelImageProvider imageProvider = (IDiagramModelImageProvider)eObject;
                String imagePath = imageProvider.getImagePathOrNull();
                if(null != imagePath && !added.contains(imagePath)) {
                    byte[] bytes = BYTE_ARRAY_STORAGE.getEntry(imagePath);
                    ZipEntry zipEntry = new ZipEntry(imagePath);
                    zOut.putNextEntry(zipEntry);
                    zOut.write(bytes);
                    zOut.closeEntry();
                    added.add(imagePath);
                }
            }
        }
    }
    
    private String createArchiveImagePathname(File file) {
        String ext = FileUtils.getFileExtension(file);
        
        String unique = EcoreUtil.generateUUID();
        
        String path = "images/" + unique; //$NON-NLS-1$
        if(ext.length() != 0) {
            path += ext;
        }
        
        return path;
    }
    
    @Override
    public void dispose() {
        getfModel().eAdapters().remove(fModelAdapter);
        
        if(!fLoadedImagePaths.isEmpty()) {
            unloadUnusedImages();
        }
        
        fLoadedImagePaths = null;
    }
    
    /**
     * Unload any images not in use in other models
     */
    private void unloadUnusedImages() {
        // Gather all image paths that are in use in other models
        List<String> allPathsInUse = new ArrayList<String>();

        for(IZentaModel model : IEditorModelManager.INSTANCE.getModels()) {
            if(model != getfModel()) { // don't bother with this model as we no longer use any images
                ArchiveManager archiveManager = (ArchiveManager)model.getAdapter(IArchiveManager.class);
                if(null != archiveManager)
	                for(String imagePath : archiveManager.fLoadedImagePaths) {
	                    if(!allPathsInUse.contains(imagePath)) {
	                        allPathsInUse.add(imagePath);
	                    }
	                }
            }
        }

        // Release all unused image data and cached images that are not in image paths
        for(String imagePatho : fLoadedImagePaths) {
        	String imagePath = Util.verifyNonNull(imagePatho);
            if(!allPathsInUse.contains(imagePath)) {
                BYTE_ARRAY_STORAGE.removeEntry(imagePath);
            }
        }
    }

	@SuppressWarnings("null")
	public List<String> getLoadedImagePaths() {
		if(null == fLoadedImagePaths)
			fLoadedImagePaths = new ArrayList<String>();
		return fLoadedImagePaths;
	}
}
