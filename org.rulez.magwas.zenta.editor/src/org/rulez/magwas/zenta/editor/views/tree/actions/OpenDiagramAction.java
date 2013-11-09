/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.actions;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IDiagramModel;



/**
 * Open Diagram Action
 * 
 * @author Phillip Beauvoir
 */
public class OpenDiagramAction extends ViewerAction {
    
    public OpenDiagramAction(ISelectionProvider selectionProvider) {
        super(selectionProvider);
        setText(Messages.OpenDiagramAction_0);
        setEnabled(false);
    }
    
    @Override
    public void run() {
        for(Object selected : getSelection().toArray()) {
            // Diagram - open diagram
            if(selected instanceof IDiagramModel) {
                EditorManager.openDiagramEditor((IDiagramModel)selected);
            }
        }
    }

    @Override
    public void update(IStructuredSelection selection) {
        Object selected = selection.getFirstElement();
        setEnabled(selected instanceof IDiagramModel);
    }

}
