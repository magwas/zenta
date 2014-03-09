/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.commands;

import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.UndoState;



/**
 * Delete Folder Command.
 * 
 * @author Phillip Beauvoir
 */
public class DeleteCommand extends Command {
    
	private UndoState state;

    public DeleteCommand(INameable obj) {
    	state = obj.prepareDelete();
        setLabel(Messages.DeleteElementCommand_0 + " " + ZentaLabelProvider.INSTANCE.getLabel(state.getElement())); //$NON-NLS-1$

    }
    
    @Override
    public void execute() {
    	state.getElement().delete(state);
    }
    
    @Override
    public void undo() {
    	state.undelete();
    }
    
    @Override
    public void dispose() {
    	state = null;
    }
}
