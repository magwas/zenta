/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor;

import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.rulez.magwas.zenta.editor.perspectives.MainPerspective;
import org.rulez.magwas.zenta.model.util.LogUtil;


/**
 * The workbench advisor for standalone RCP.
 * Configures the workbench as needed, including specifying the default perspective id.
 * Configures each new workbench window as it is being opened.
 * 
 * @author Phillip Beauvoir
 */
public class ZentaEditorWorkbenchAdvisor
extends WorkbenchAdvisor
{
	/**
	 * Constructor
	 */
	public ZentaEditorWorkbenchAdvisor() {
	}
	
    @Override
    public void initialize(IWorkbenchConfigurer configurer) {
        super.initialize(configurer);
        
        // Save and restore stuff
        configurer.setSaveAndRestore(true);
        
        // Rounded tabs are set on by default
        PlatformUI.getPreferenceStore().setDefault(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS, false);
        
        // Progress
        // PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_PROGRESS_ON_STARTUP, true);

        // Show Help Button by default on Dialogs
        TrayDialog.setDialogHelpAvailable(true);
    }
    
    @Override
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ZentaEditorWorkbenchWindowAdvisor(configurer);
    }

	@Override
    public String getInitialWindowPerspectiveId() {
	    // If null then we could use WorkbenchWindowAdvisor.createEmptyWindowContents(Composite parent)
	    //return null; 
		return MainPerspective.ID;
	}
	public void eventLoopException(Throwable exception) {
		LogUtil.logException(exception);
	}
}
