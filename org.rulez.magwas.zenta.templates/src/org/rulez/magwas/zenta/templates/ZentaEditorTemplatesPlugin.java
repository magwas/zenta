/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Activator
 * Implement IStartup so that Action Delegates are initialised
 * 
 * @author Phillip Beauvoir
 */
public class ZentaEditorTemplatesPlugin extends AbstractUIPlugin implements IStartup {
    
    public static final String PLUGIN_ID = "org.rulez.magwas.zenta.templates"; //$NON-NLS-1$

    /**
     * The shared instance
     */
    public static ZentaEditorTemplatesPlugin INSTANCE;
    
    /**
     * The File location of this plugin folder
     */
    private static File fPluginFolder;

    public ZentaEditorTemplatesPlugin() {
        INSTANCE = this;
    }

    @Override
    public void earlyStartup() {
        // Do nothing - this will initialise the "Save As Template..." menu item
    }
    
    /**
     * @return The templates folder
     */
    public File getTemplatesFolder() {
        URL url = FileLocator.find(getBundle(), new Path("$nl$/templates"), null); //$NON-NLS-1$
        try {
            url = FileLocator.resolve(url);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        return new File(url.getPath()); 
    }
    
    /**
     * @return The File Location of this plugin
     */
    public File getPluginFolder() {
    	File pf = fPluginFolder;
        if(pf == null) {
            URL url = getBundle().getEntry("/"); //$NON-NLS-1$
            try {
                url = FileLocator.resolve(url);
            }
            catch(IOException ex) {
                ex.printStackTrace();
            }
            pf = new File(url.getPath());
        }
        fPluginFolder = pf;
        return pf;
    }

}
