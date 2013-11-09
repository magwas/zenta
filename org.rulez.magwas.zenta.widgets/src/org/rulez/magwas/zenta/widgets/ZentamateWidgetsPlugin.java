/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.widgets;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Activator
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateWidgetsPlugin extends AbstractUIPlugin {
    
    public static final String PLUGIN_ID = "org.rulez.magwas.zenta.widgets"; //$NON-NLS-1$

    /**
     * The shared instance
     */
    public static ZentamateWidgetsPlugin INSTANCE;
    

    public ZentamateWidgetsPlugin() {
        INSTANCE = this;
    }
}
