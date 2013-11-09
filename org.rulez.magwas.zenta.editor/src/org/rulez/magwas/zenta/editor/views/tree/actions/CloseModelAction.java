/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.actions;

import java.io.IOException;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.model.IZentamateModel;



/**
 * Close Model Action
 * 
 * @author Phillip Beauvoir
 */
public class CloseModelAction extends ViewerAction {
    
    public CloseModelAction(ISelectionProvider selectionProvider) {
        super(selectionProvider);
        setText(Messages.CloseModelAction_0);
        setEnabled(false);
    }
    
    @Override
    public void run() {
        for(Object selected : getSelection().toArray()) {
            if(selected instanceof IZentamateModel) {
                try {
                    boolean result = IEditorModelManager.INSTANCE.closeModel((IZentamateModel)selected);
                    if(!result) {
                        break;
                    }
                }
                catch(IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void update(IStructuredSelection selection) {
        Object selected = selection.getFirstElement();
        setEnabled(selected instanceof IZentamateModel);
    }

}
