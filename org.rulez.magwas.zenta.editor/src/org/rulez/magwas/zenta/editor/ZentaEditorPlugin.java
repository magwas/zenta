/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.EventObject;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.rulez.magwas.zenta.editor.diagram.util.AnimationUtil;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.model.impl.EditorModelImageManager;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.manager.IArchiveManager;
import org.rulez.magwas.zenta.model.manager.IEditorModelInterface;
import org.rulez.magwas.zenta.model.manager.IEditorModelManagerNoGUI;
import org.rulez.magwas.zenta.model.manager.IModelImageManager;
import org.rulez.magwas.zenta.model.manager.ModelImage;
import org.rulez.magwas.zenta.model.util.LogUtil;


/**
 * The activator class controls the plug-in life cycle
 */
public class ZentaEditorPlugin extends AbstractUIPlugin implements IEditorModelInterface {

    /**
     * ID of the plug-in
     */
    public static final String PLUGIN_ID = "org.rulez.magwas.zenta.editor"; //$NON-NLS-1$

    /**
     * The File location of this plugin folder
     */
    private static File fPluginFolder;

    /**
     * The shared instance
     */
    public static ZentaEditorPlugin INSTANCE;

    /**
     * The constructor.
     */
    public ZentaEditorPlugin() {
        INSTANCE = this;
    }

    /**
     * This method is called upon plug-in activation
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        IZentaFactory.eINSTANCE.setEditorInterface(this);
    }

    /**
     * This method is called when the plug-in is stopped
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        // super must be *last*
        super.stop(context);
    }
    
    /**
     * @return The Platform specific launcher, if any, to launch application from file in OS
     */
    public IPlatformLauncher getPlatformLauncher() {
        Bundle bundle = getBundle();
        try {
            Class<?> clazz = bundle.loadClass("org.rulez.magwas.zenta.editor.PlatformLauncher"); //$NON-NLS-1$
            if(IPlatformLauncher.class.isAssignableFrom(clazz)) {
                return ((IPlatformLauncher) clazz.newInstance());
            }
        } catch(Exception e) {
        }
        
        return null;
    }
    
    /**
     * @return The User data folder
     */ 
    public File getUserDataFolder() {
        String path = Preferences.getUserDataFolder();
        return new File(path);
    }
    
    /**
     * @return The assets folder
     */
    public File getAssetsFolder() {
        return new File(getPluginFolder(), "assets"); //$NON-NLS-1$
    }
    
    /**
     * @return The Workspace folder
     */
    public File getWorkspaceFolder() {
        /*
         * Get Data Folder.  Try for one set by a user system property first, otherwise
         * use the workbench instance data location
         */
        String strFolder = System.getProperty("org.rulez.magwas.zenta.editor.workspaceFolder"); //$NON-NLS-1$
        if(strFolder != null) {
            return new File(strFolder);
        }
        
        Location instanceLoc = Platform.getInstanceLocation();
        if(instanceLoc == null) {
            LogUtil.logWarning("Instance Location is null. Using user.home"); //$NON-NLS-1$
            return new File(System.getProperty("user.home")); //$NON-NLS-1$
        }
        else {
            URL url = instanceLoc.getURL();
            if(url != null) {
                return new File(url.getPath());
            }
            else {
                return new File(System.getProperty("user.home")); //$NON-NLS-1$
            }
        }
    }
    
    /**
     * @return The File Location of this plugin
     */
    public File getPluginFolder() {
        if(fPluginFolder == null) {
            URL url = getBundle().getEntry("/"); //$NON-NLS-1$
            try {
                url = FileLocator.resolve(url);
            }
            catch(IOException ex) {
                LogUtil.logException(ex);
            }
            fPluginFolder = new File(url.getPath());
        }
        
        return fPluginFolder;
    }
    
    /**
     * @param key A string key beginning with "%"
     * @return A Resource String from the plugin.properties file
     */
    public String getResourceString(String key) {
        return Platform.getResourceString(Platform.getBundle(PLUGIN_ID), key);
    }
    
    /**
     * @return The plugin id
     */
    public String getId(){
        return getBundle().getSymbolicName();
    }
    
	public void bailOut() {
		PlatformUI.getWorkbench().close();
	}

	@Override
	public void removeModel(IZentaModel model) {
		getModelManager().removeModelWithoutDirtyCheck(model);
	}

	@Override
	public boolean askSaveModel(IZentaModel model, IEditorModelManagerNoGUI manager) throws IOException {
	    int result = manager.saveModelDialog(model);
	    
	    // Yes
	    if(result == 0) {
	        return manager.saveModel(model);
	    }
	    // No
	    if(result == 1) {
	        return true;
	    }
	    // Cancel
	    return false;
	}

	@Override
	public void createNewCommandStack(final IZentaModel model, IEditorModelManagerNoGUI manager) {
	    CommandStack cmdStack = new CommandStack();
	    
	    // Forward on CommandStack Event to Tree
	    cmdStack.addCommandStackListener(new CommandStackListener() {
	        public void commandStackChanged(EventObject event) {
	            // Send notification to Tree
	            manager.firePropertyChange(model, IEditorModelManager.COMMAND_STACK_CHANGED, false, true);
	        }
	    });
	    
	    // Animate Commands
	    AnimationUtil.registerCommandStack(cmdStack);
	    
	    model.setAdapter(CommandStack.class, cmdStack);
	}

	@Override
	public void setCommandStackSavePoint(IZentaModel model) {
	    CommandStack stack = (CommandStack)model.getAdapter(CommandStack.class);
	    Util.verifyNonNull(stack).markSaveLocation();
	}

	@Override
	public void saveImageToStream(ModelImage image, OutputStream zOut, int format) throws Exception {
		ImageLoader loader = new ImageLoader();
        loader.data = new ImageData[] { (ImageData) image.getImageData() };
        loader.save(zOut, format);
	}

	@Override
	public IModelImageManager getImageManagerForArchiveManager(IArchiveManager archiveManager) {
		return new EditorModelImageManager(archiveManager);
	}

	@Override
	public IEditorModelManagerNoGUI getModelManager() {
        return IEditorModelManager.INSTANCE;
	}

	@Override
	public void openDiagramEditor(IDiagramModel dm) {
		EditorManager.openDiagramEditor(dm);
	}

	@Override
	public boolean shouldBackupOnSave() {
			return Preferences.STORE.getBoolean(IPreferenceConstants.BACKUP_ON_SAVE);
	}

	@Override
	public boolean doOpenDiagramsOnLoad() {
		return Preferences.doOpenDiagramsOnLoad();
	}

	@Override
	public void closeDiagramEditors(IZentaModel model) {
		EditorManager.closeDiagramEditors(model);
	}

	@Override
	public String askSavePath(IZentaModel model) {
		return getModelManager().askSavePath(model);
	}

	@Override
	public boolean sureToOverwriteDialog(File file) {
		return getModelManager().sureToOverwriteDialog(file);
	}

}
