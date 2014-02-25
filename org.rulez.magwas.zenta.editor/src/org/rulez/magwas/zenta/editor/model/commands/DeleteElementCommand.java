/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.commands;

import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaElement;



/**
 * Delete Zenta Element Command
 * 
 * @author Phillip Beauvoir
 */
public class DeleteElementCommand extends Command {
    
	private IZentaElement.ElementState save = new IZentaElement.ElementState();

    public DeleteElementCommand(IZentaElement element) {
    	save.folder = (IFolder)element.eContainer();
    	save.element = element;
        setLabel(Messages.DeleteElementCommand_0 + " " + ZentaLabelProvider.INSTANCE.getLabel(save.element)); //$NON-NLS-1$
    }
    
    @Override
    public void execute() {
    	save.element.delete(save);
    }
    
    @Override
    public void undo() {
        if(save.index != -1) { 
        	save.undelete();
        }
    }
    
    @Override
    public void dispose() {
    	save.element = null;
    	save.folder = null;
    }
}
