/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.help;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.rulez.magwas.zenta.model.util.LogUtil;

/**
 * The activator class controls the plug-in life cycle
 */
public class ZentaEditorHelpPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.rulez.magwas.zenta.help"; //$NON-NLS-1$

    /**
     * The shared instance
     */
    public static ZentaEditorHelpPlugin INSTANCE;

    /**
     * The File location of this plugin folder
     */
    private static File fPluginFolder;

    /**
     * The constructor.
     */
    public ZentaEditorHelpPlugin() {
        INSTANCE = this;
    }
	
    /**
     * @return The hints folder
     */
    public File getHintsFolder() {
        return new File(getPluginFolder(), "hints"); //$NON-NLS-1$
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
}
