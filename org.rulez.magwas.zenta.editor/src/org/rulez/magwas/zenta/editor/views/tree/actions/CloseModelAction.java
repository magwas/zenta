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
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.util.LogUtil;



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
            if(selected instanceof IZentaModel) {
                try {
                    boolean result = IEditorModelManager.INSTANCE.closeModel((IZentaModel)selected);
                    if(!result) {
                        break;
                    }
                }
                catch(IOException ex) {
                    LogUtil.logException(ex);
                }
            }
        }
    }

    @Override
    public void update(IStructuredSelection selection) {
        Object selected = selection.getFirstElement();
        setEnabled(selected instanceof IZentaModel);
    }

}
