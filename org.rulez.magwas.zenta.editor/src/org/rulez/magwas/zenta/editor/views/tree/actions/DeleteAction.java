/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.actions;

import java.util.List;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.model.commands.DeleteCommand;
import org.rulez.magwas.zenta.editor.views.tree.TreeModelViewer;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.handmade.util.Util;

/**
 * Delete Action
 * 
 * @author Phillip Beauvoir
 */
public class DeleteAction extends ViewerAction {
    
    public DeleteAction(TreeModelViewer selectionProvider) {
        super(selectionProvider);
        setText(Messages.DeleteAction_0);
        
        ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
        setActionDefinitionId("org.eclipse.ui.edit.delete"); // Ensures key binding is displayed //$NON-NLS-1$
        setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
        setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
        setEnabled(false);
    }
    
    @Override
    public void run() {
        IStructuredSelection selection = getSelection();
        if(selection == null || selection.isEmpty()) {
            return;
        }
        
        boolean hasDiagramReferences = false;
		for(Object s : selection.toList()) {
	        INameable element = (INameable) s;
			hasDiagramReferences |= element.hasDiagramReferences();
        }

        /*
         * If the objects are referenced in a diagram warn user
         */
        if(hasDiagramReferences) {
            if(!doUserWantToRemoveObjectsEvenIfReferencedInDiagram())
            	return;
        }
        
		@SuppressWarnings("unchecked")
		List<? extends Object> l = selection.toList();
		for(Object e : l) {
	        if(e instanceof IZentaModelElement) {
	        	deleteUsingCommandStack((IZentaModelElement) e);
	        }
	        else
				throw new IllegalArgumentException();
        }
        
    }
		private void deleteUsingCommandStack(IZentaModelElement e) {
			CommandStack stack = Util.verifyNonNull((CommandStack)(e.getZentaModel()).getAdapter(CommandStack.class));
			DeleteCommand command = new DeleteCommand((INameable) e);
			stack.execute(command);
		}
		public boolean doUserWantToRemoveObjectsEvenIfReferencedInDiagram() {
			return MessageDialog.openQuestion(
			        Display.getDefault().getActiveShell(),
			        Messages.DeleteAction_1,
			        Messages.DeleteAction_2 +
			        "\n\n" + //$NON-NLS-1$
			        Messages.DeleteAction_3);
		}

    @Override
    public void update(IStructuredSelection selection) {
        setEnabled(false);
        if(selection.toList().size() > 0)
        	setEnabled(true);
    }

}
