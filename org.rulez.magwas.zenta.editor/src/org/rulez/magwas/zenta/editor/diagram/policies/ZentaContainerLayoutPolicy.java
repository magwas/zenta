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
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;



/**
 * Policy for Zenta Figure Container
 * 
 * @author Phillip Beauvoir
 */
public class ZentaContainerLayoutPolicy
extends ZentaDiagramLayoutPolicy {
    
    /*
     * Substitute Command for hooking our own sub-commands
     */
    private static class SubstituteCommand extends CompoundCommand {
        private Command fSubCommand = null;
        private IZentaElement fParentElement;
        
        SubstituteCommand(IZentaElement parentElement) {
            fParentElement = parentElement;
        }
        
        @Override
        public void execute() {
            super.execute();
            
            List<IZentaElement> children = new ArrayList<IZentaElement>();
            
            for(Object o : getCommands()) {
                if(o instanceof AddObjectCommand) {
                    IDiagramModelObject child = ((AddObjectCommand)o).fChild;
                    if(child instanceof IDiagramModelZentaObject) {
                        IZentaElement childElement = ((IDiagramModelZentaObject)child).getZentaElement();
                        children.add(childElement);
                    }
                }
            }
            
            fSubCommand = DiagramCommandFactory.createNewNestedRelationCommandWithDialog(fParentElement, 
                    children.toArray(new IZentaElement[children.size()]));
            
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
        if(!(parent instanceof IDiagramModelZentaObject)) {
            return originalCommand;
        }
        
        IZentaElement parentElement = ((IDiagramModelZentaObject)parent).getZentaElement();

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


