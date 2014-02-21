/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.model.IDiagramModel.DiagramModelObjectState;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;



/**
 * Command for deleting an Object from its parent container
 * It puts it back at the index position from where it was removed.
 * 
 * @author Phillip Beauvoir
 */
class DeleteDiagramObjectCommand extends Command {

    DiagramModelObjectState save = new DiagramModelObjectState();
    
    public DeleteDiagramObjectCommand(IDiagramModelObject object) {
        save.parent = (IDiagramModelContainer)object.eContainer();
        save.object = object;
    }

    @Override
    public boolean canExecute() {
        /*
         * Parent can be null when objects are selected (with marquee tool) and transferred from one container
         * to another and the Diagram Editor updates the enablement state of Actions.
         * Can also be null if already deleted as part of a Compound Command.
         */
        IDiagramModelContainer parent = (IDiagramModelContainer) save.parent;
		return parent != null && parent.getChildren().contains(save.object);
    }
    
    @Override
    public void execute() {
    	save.parent.getDiagramModel().deleteDiagramObject(save);
    }
    
    @Override
    public void undo() {
    	save.parent.getDiagramModel().undeleteDiagramObject(save);
    }
    @Override
    public void dispose() {
    	save.parent = null;
    	save.object = null;
    	save.sourceConnections = null;
    	save.targetConnections = null;
    }
}