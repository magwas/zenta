/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.rulez.magwas.zenta.editor.ui.services.UIRequestManager;
import org.rulez.magwas.zenta.editor.views.tree.TreeEditElementRequest;
import org.rulez.magwas.zenta.editor.views.tree.TreeSelectionRequest;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IFolder;



/**
 * Add Zentamate Element Command
 * 
 * @author Phillip Beauvoir
 */
public class NewElementCommand extends Command {
    
    private IFolder fFolder;
    private IZentamateElement fElement;

    public NewElementCommand(IFolder folder, IZentamateElement element) {
        fFolder = folder;
        fElement = element;
        setLabel(Messages.NewElementCommand_0 + " " + element.getName()); //$NON-NLS-1$
    }
    
    @Override
    public void execute() {
        redo();
        
        // Edit in-place
        UIRequestManager.INSTANCE.fireRequest(new TreeEditElementRequest(this, fElement));
    }
    
    @Override
    public void undo() {
        fFolder.getElements().remove(fElement);
        
        // Select the parent node if no node is selected (this happens when the node is deleted)
        TreeSelectionRequest request = new TreeSelectionRequest(this, new StructuredSelection(fFolder), true) {
            @Override
            public boolean shouldSelect(Viewer viewer) {
                return viewer.getSelection().isEmpty();
            }
        };
        UIRequestManager.INSTANCE.fireRequest(request);
    }
    
    @Override
    public void redo() {
        fFolder.getElements().add(fElement);
        
        // Select
        UIRequestManager.INSTANCE.fireRequest(new TreeSelectionRequest(this, new StructuredSelection(fElement), true));
    }
}
