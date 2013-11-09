/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.editor.views.tree.actions;

import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchCommandConstants;

import uk.ac.bolton.archimate.editor.ui.services.ViewManager;


/**
 * Properties Action
 * 
 * @author Phillip Beauvoir
 */
public class PropertiesAction extends ViewerAction {
    
    public PropertiesAction(ISelectionProvider selectionProvider) {
        super(selectionProvider);
        setText(Messages.PropertiesAction_0);
        
        // Ensures key binding is displayed
        setActionDefinitionId(IWorkbenchCommandConstants.FILE_PROPERTIES);
        setEnabled(false);
    }
    
    @Override
    public void run() {
        ViewManager.showViewPart(ViewManager.PROPERTIES_VIEW, true);
    }

    @Override
    public void update(IStructuredSelection selection) {
        setEnabled(!selection.isEmpty());
    }

}
