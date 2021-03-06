/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor;

import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.rulez.magwas.zenta.editor.actions.ZentaEditorActionBarAdvisor;


/**
 * Workbench Window Advisor
 * 
 * @author Phillip Beauvoir
 */
public class ZentaEditorWorkbenchWindowAdvisor
extends WorkbenchWindowAdvisor {
    
    /**
     * Constructor
     * @param configurer
     */
    public ZentaEditorWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
        
        // Don't want wasted space in status bar
        configurer.setShowStatusLine(false);
    }

    /* (non-Javadoc)
     * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#createActionBarAdvisor(org.eclipse.ui.application.IActionBarConfigurer)
     */
    @Override
    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ZentaEditorActionBarAdvisor(configurer);
    }
    
    @Override
    public void postWindowOpen() {
        // Application specific launcher actions
        final IPlatformLauncher launcher = ZentaEditorPlugin.INSTANCE.getPlatformLauncher();
        if(launcher != null) {
            launcher.postWindowOpen(getWindowConfigurer().getWindow());
        }
    }
}
