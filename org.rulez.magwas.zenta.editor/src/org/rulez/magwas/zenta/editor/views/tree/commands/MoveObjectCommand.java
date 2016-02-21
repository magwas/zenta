/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.commands;

import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.INameable;


/**
 * Move Object Command
 * 
 * @author Phillip Beauvoir
 */
public class MoveObjectCommand extends Command {
    private IFolder fOldParent;
    private IFolder fNewParent;
    private INameable fElement;
    
    public MoveObjectCommand(IFolder newParent, INameable element) {
        super(Messages.MoveObjectCommand_0 + " " + element.getName()); //$NON-NLS-1$
        fOldParent = (IFolder)element.eContainer();
        fNewParent = newParent;
        fElement = element;
    }
    
    @Override
    public void execute() {
        redo();
    }
    
    @Override
    public void undo() {
    	fElement.move(fNewParent,fOldParent);
//    	fNewParent.getElements().remove(fElement);
//    	fOldParent.getElements().add(fElement);
    }
    
    @Override
    public void redo() {
    	fElement.move(fOldParent,fNewParent);
//    	fOldParent.getElements().remove(fElement);
//    	fNewParent.getElements().add(fElement);
    }
    
    @Override
    public void dispose() {
        fOldParent = null;
        fNewParent = null;
        fElement = null;
    }
}