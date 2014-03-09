/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.commands;

import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.UndoState;



/**
 * Delete Zenta Element Command
 * 
 * @author Phillip Beauvoir
 */
public class DeleteElementCommand extends Command {
    
	private UndoState save;

    public DeleteElementCommand(IZentaElement element) {
    	save = element.prepareDelete();
        setLabel(Messages.DeleteElementCommand_0 + " " + ZentaLabelProvider.INSTANCE.getLabel(save.getElement())); //$NON-NLS-1$
    }
    
    @Override
    public void execute() {
    	save.getElement().delete(save);
    }
    
    @Override
    public void undo() {
    	save.undelete();
    }
    
    @Override
    public void dispose() {
    	save = null;
    }
}
