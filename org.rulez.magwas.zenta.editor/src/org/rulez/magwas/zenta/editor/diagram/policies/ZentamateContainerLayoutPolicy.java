/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.rulez.magwas.zenta.editor.diagram.commands.DiagramCommandFactory;
import org.rulez.magwas.zenta.editor.preferences.ConnectionPreferences;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;



/**
 * Policy for Zentamate Figure Container
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateContainerLayoutPolicy
extends ZentamateDiagramLayoutPolicy {
    
    /*
     * Substitute Command for hooking our own sub-commands
     */
    private static class SubstituteCommand extends CompoundCommand {
        private Command fSubCommand = null;
        private IZentamateElement fParentElement;
        
        SubstituteCommand(IZentamateElement parentElement) {
            fParentElement = parentElement;
        }
        
        @Override
        public void execute() {
            super.execute();
            
            List<IZentamateElement> children = new ArrayList<IZentamateElement>();
            
            for(Object o : getCommands()) {
                if(o instanceof AddObjectCommand) {
                    IDiagramModelObject child = ((AddObjectCommand)o).fChild;
                    if(child instanceof IDiagramModelZentamateObject) {
                        IZentamateElement childElement = ((IDiagramModelZentamateObject)child).getZentamateElement();
                        children.add(childElement);
                    }
                }
            }
            
            fSubCommand = DiagramCommandFactory.createNewNestedRelationCommandWithDialog(fParentElement, 
                    children.toArray(new IZentamateElement[children.size()]));
            
            if(fSubCommand != null) {
                fSubCommand.execute();
            }
        }
        
        @Override
        public void undo() {
            super.undo();
            if(fSubCommand != null) {
                fSubCommand.undo();
            }
        }
        
        @Override
        public void redo() {
            super.redo();
            if(fSubCommand != null) {
                fSubCommand.redo();
            }
        }

    }
    
    /* 
     * Hook into the Command and substitute our own Command so we can hook a sub-Command for adding relations
     */
    @Override
    protected Command getAddCommand(Request generic) {
        Command originalCommand = super.getAddCommand(generic);
        
        if(!ConnectionPreferences.createRelationWhenMovingElement()) {
            return originalCommand;
        }
        
        Object parent = getHost().getModel();
        if(!(parent instanceof IDiagramModelZentamateObject)) {
            return originalCommand;
        }
        
        IZentamateElement parentElement = ((IDiagramModelZentamateObject)parent).getZentamateElement();

        CompoundCommand newCommmand = new SubstituteCommand(parentElement);
        
        if(originalCommand instanceof CompoundCommand) {
            for(Object o : ((CompoundCommand)originalCommand).getCommands()) {
                newCommmand.add((Command)o);
            }
        }
        else {
            newCommmand.add(originalCommand);
        }
        
        return newCommmand;
    }
}


