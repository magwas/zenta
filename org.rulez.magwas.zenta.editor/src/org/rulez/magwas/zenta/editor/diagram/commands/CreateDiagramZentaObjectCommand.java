/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.preferences.ConnectionPreferences;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;



/**
 * Create New Diagram Zenta Object Command
 * 
 * @author Phillip Beauvoir
 */
public class CreateDiagramZentaObjectCommand extends CreateDiagramObjectCommand {
    
    /**
     * Create Nested Relation Command
     */
    protected CreateRelationCommand fCreateRelationSubCommand;
    
    public CreateDiagramZentaObjectCommand(EditPart parentEditPart, CreateRequest request, Rectangle bounds) {
        super(parentEditPart, request, bounds);
    }
    
    @Override
    public String getLabel() {
        String label = super.getLabel();
        if(fCreateRelationSubCommand != null) {
            label = NLS.bind(Messages.CreateDiagramZentaObjectCommand_0, label, fCreateRelationSubCommand.getRelationshipCreated().getName());
        }
        return label;
    }

    @Override
    public void execute() {
        addChild();
        
        // Create Nested Relation as well
        if(ConnectionPreferences.createRelationWhenAddingNewElement()) {
            // We need to have this on a thread.  There has been a case of the odd glitch causing a NPE.
            Display.getCurrent().asyncExec(new Runnable() {
                @Override
                public void run() {
                    if(fParent instanceof IDiagramModelZentaObject) {
                        IZentaElement childElement = ((IDiagramModelZentaObject)fChild).getZentaElement();
                        fCreateRelationSubCommand = 
                        		(CreateRelationCommand)DiagramCommandFactory.createNewNestedRelationCommandWithDialog(
                        				((IDiagramModelZentaObject)fParent),
                        				new IZentaElement[] {childElement});
                        if(fCreateRelationSubCommand != null) {
                            fCreateRelationSubCommand.execute();
                        }
                    }

                    // Edit name on this thread
                    editNameOfNewObject();
                }
            });
        }
        else {
            // Edit name on a new thread
            Display.getCurrent().asyncExec(new Runnable() {
                @Override
                public void run() {
                    editNameOfNewObject();
                }
            });
        }
    }
    
    @Override
    public void undo() {
        super.undo();
        
        // Remove the Zenta model object from its containing folder
        ((IDiagramModelZentaObject)fChild).removeZentaElementFromModel();
        
        if(fCreateRelationSubCommand != null) {
            fCreateRelationSubCommand.undo();
        }
    }

    @Override
    public void redo() {
        // This first
        super.redo();

        // Add the Zenta model object to a default folder
        ((IDiagramModelZentaObject)fChild).addZentaElementToModel(null);
        
        if(fCreateRelationSubCommand != null) {
            fCreateRelationSubCommand.redo();
        }
    }
    
    @Override
    public void dispose() {
        super.dispose();
        if(fCreateRelationSubCommand != null) {
            fCreateRelationSubCommand.dispose();
            fCreateRelationSubCommand = null;
        }
    }
}