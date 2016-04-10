/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.manager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipFile;

import org.eclipse.emf.common.util.URI;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.manager.impl.ArchiveManager;


/**
 * IArchiveManager
 * 
 * @author Phillip Beauvoir
 */
public interface IArchiveManager {
    
    static class FACTORY {
        
        /**
         * Return a new IArchiveManager instance
         * @param model The owning model
         * @return The IArchiveManager instance
         */
        public static IArchiveManager createArchiveManager(IZentaModel model) {
        	IArchiveManager manager = new ArchiveManager(model);
        	IEditorModelInterface editorInterface = IZentaFactory.eINSTANCE.getEditorInterface();
			IModelImageManager imageManager = editorInterface.getImageManagerForArchiveManager(manager);
        	manager.setImageManager(imageManager);
            return manager ;
        }
        
        /**
         * @param file The file to test
         * @return True if file is a zip archive file
         */
        public static boolean isArchiveFile(File file) {
            ZipFile zipFile = null;
            
            try {
                zipFile = new ZipFile(file);
                return zipFile.getEntry("model.xml") != null; //$NON-NLS-1$
            }
            catch(Exception ex) {
            }
            finally {
                try {
                    if(zipFile != null) {
                        zipFile.close();
                    }
                }
                catch(IOException ex) {
                }
            }
            
            return false;
        }
        
        /**
         * Create a URI for the model xml file in the archive file
         * @param file The zenta archive file
         * @return The URI
         */
        public static URI createArchiveModelURI(File file) {
            return Util.verifyNonNull(URI.createURI(getArchiveFilePath(file) + "!/model.xml")); //$NON-NLS-1$
        }
        
        /**
         * Get the Archive File Path for the archive file
         * @param file The zenta archive file
         * @return The path
         */
        public static String getArchiveFilePath(File file) {
            return "archive:file:///" + file.getPath(); //$NON-NLS-1$
        }
    }

    /**
     * Add an image from an image file to this Archive Manager's storage cache.
     * If the image already exists the existing image path is returned.
     * @param file The image file
     * @return The newly created path name, or an existing path name if the image already exists
     * @throws IOException
     */
    String addImageFromFile(File file) throws IOException;

    /**
     * Create a new Image for this path entry
     * @param path The image path
     * @return the Image object or null
     * @throws Exception
     */
    IModelImage createImage(String path) throws Exception;
    
    /**
     * Get a list of Image entry paths as used in the current state of the model.<br>
     * This will not include duplicates.
     * @return the list of image path entries as used in the current state of the model
     */
    List<String> getImagePaths();

    /**
     * Save the Model and any images to an archive file
     * @throws IOException
     */
    void saveModel() throws IOException;
    
    /**
     * Load all images for this model
     * @throws IOException
     */
    void loadImages() throws IOException;

    /**
     * Load all images from another Zenta Model archive file and add to this one
     * @param file The model file
     * @return if the images could be loaded
     * @throws IOException
     */
    boolean loadImagesFromModelFile(File file) throws IOException;
    
    /**
     * @return True if the model has references to images in its current state
     */
    boolean hasImages();
    
    /**
     * Dispose and unload any assets no longer referenced
     */
    void dispose();

	ByteArrayStorage getStorage();

	void setImageManager(IModelImageManager imageManager);

	List<String> getLoadedImagePaths();
}
