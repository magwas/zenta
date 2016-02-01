/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.actions;

import java.io.IOException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.rulez.magwas.zenta.editor.model.IModelExporter;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.util.LogUtil;


/**
 * Export Model Action used by extension plugins
 * 
 * @author Phillip Beauvoir
 */
public class ExportModelAction extends AbstractModelSelectionAction {
    
    private IModelExporter fExporter;

    public ExportModelAction(IWorkbenchWindow window, String id, String label, IModelExporter exporter) {
        super(label, window);
        setId(id);
        fExporter = exporter;
    }
    
    @Override
    public void run() {
        IZentaModel model = getActiveZentaModel();
        if(model != null && fExporter != null) {
            try {
                fExporter.export(model);
            }
            catch(IOException ex) {
                MessageDialog.openError(workbenchWindow.getShell(), Messages.ExportModelAction_0, ex.getMessage());
                LogUtil.logException(ex);
            }
        }
    }
    
    @Override
    protected void updateState() {
        setEnabled(getActiveZentaModel() != null);
    }
}