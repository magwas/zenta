/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.compatibility;

import org.eclipse.core.runtime.Plugin;




/**
 * The activator class controls the plug-in life cycle
 */
public class CompatibilityPlugin extends Plugin {

    /**
     * The shared instance
     */
    public static CompatibilityPlugin INSTANCE;

    /**
     * The constructor.
     */
    public CompatibilityPlugin() {
        INSTANCE = this;
    }

    /**
     * @return The plugin id
     */
    public String getId(){
        return getBundle().getSymbolicName();
    }
}
