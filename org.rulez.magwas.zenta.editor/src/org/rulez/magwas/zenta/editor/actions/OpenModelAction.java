/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.actions;

import java.io.File;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.controller.IZentaImages;


/**
 * Open Model Action
 * 
 * @author Phillip Beauvoir
 */
public class OpenModelAction
extends Action
implements IWorkbenchAction
{
    
    public OpenModelAction(IWorkbenchWindow window) {
        setText(Messages.OpenModelAction_0);
        setToolTipText(Messages.OpenModelAction_1);
        setId("org.rulez.magwas.zenta.editor.action.openModel"); //$NON-NLS-1$
        setActionDefinitionId(getId()); // register key binding
    }
    
    @Override
    public void run() {
        FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
        dialog.setFilterExtensions(new String[] { IEditorModelManager.ZENTA_FILE_WILDCARD, "*.xml", "*.*" } ); //$NON-NLS-1$ //$NON-NLS-2$
        String path = dialog.open();
        if(path != null) {
            final File file = new File(path);
            
            // Check it's not already open
            IZentaModel model = getModel(file);
            if(model != null) {
                MessageDialog.openInformation(Display.getCurrent().getActiveShell(),
                                                Messages.OpenModelAction_2,
                                                NLS.bind(Messages.OpenModelAction_3,
                                                        file.getName(), model.getName()));
                return;
            }
            
            BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
                public void run() {
                    IEditorModelManager.INSTANCE.openModel(file);
                }
            });
        }
    }
    
    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_OPEN_16);
    }
    
    /**
     * Get model if it is already open
     */
    private IZentaModel getModel(File file) {
        if(file != null) {
            for(IZentaModel model : IEditorModelManager.INSTANCE.getModels()) {
                if(file.equals(model.getFile())) {
                    return model;
                }
            }
        }
        
        return null;
    }

    public void dispose() {
    } 
}