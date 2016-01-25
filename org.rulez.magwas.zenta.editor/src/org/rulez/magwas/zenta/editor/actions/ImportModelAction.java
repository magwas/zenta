/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.actions;

import java.io.IOException;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.rulez.magwas.zenta.editor.model.IModelImporter;
import org.rulez.magwas.zenta.model.util.LogUtil;


/**
 * Import Model Action used by extension plugins
 * 
 * @author Phillip Beauvoir
 */
public class ImportModelAction extends Action
implements IWorkbenchAction {
    
    private IModelImporter fImporter;
    private IWorkbenchWindow workbenchWindow;

    public ImportModelAction(IWorkbenchWindow window, String id, String label, IModelImporter importer) {
        super(label);
        setId(id);
        workbenchWindow = window;
        fImporter = importer;
    }
    
    @Override
    public void run() {
        if(fImporter != null) {
            try {
                fImporter.doImport();
            }
            catch(IOException ex) {
                MessageDialog.openError(workbenchWindow.getShell(), Messages.ImportModelAction_0, ex.getMessage());
                LogUtil.logException(ex);
            }
        }
    }
    
    @Override
    public void dispose() {
        workbenchWindow = null;
    }
}