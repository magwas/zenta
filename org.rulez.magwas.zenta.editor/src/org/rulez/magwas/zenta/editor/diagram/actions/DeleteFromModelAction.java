/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.rulez.magwas.zenta.editor.diagram.commands.DiagramCommandFactory;
import org.rulez.magwas.zenta.editor.model.DiagramModelUtils;
import org.rulez.magwas.zenta.editor.model.commands.DeleteElementCommand;
import org.rulez.magwas.zenta.editor.model.commands.NonNotifyingCompoundCommand;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.util.ZentamateModelUtils;



/**
 * Delete from Model Action
 * 
 * @author Phillip Beauvoir
 */
public class DeleteFromModelAction extends SelectionAction {
    
    public static final String ID = "DeleteFromModelAction"; //$NON-NLS-1$
    public static final String TEXT = Messages.DeleteFromModelAction_0;
    
    public DeleteFromModelAction(IWorkbenchPart part) {
        super(part);
        setText(TEXT);
        setId(ID);
    }

    @Override
    protected boolean calculateEnabled() {
        List<?> list = getSelectedObjects();
        
        if(list.isEmpty()) {
            return false;
        }
        
        for(Object object : list) {
            if(object instanceof EditPart) {
                Object model = ((EditPart)object).getModel();
                if(model instanceof IDiagramModelZentamateObject || model instanceof IDiagramModelZentamateConnection) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    @Override
    public void run() {
        List<?> selection = getSelectedObjects();
        List<IZentamateElement> elements = new ArrayList<IZentamateElement>();
        List<IDiagramModelComponent> diagramObjects = new ArrayList<IDiagramModelComponent>();
        
        // Gather Model elements, relations
        for(Object object : selection) {
            if(object instanceof EditPart) {
                Object model = ((EditPart)object).getModel();
                if(model instanceof IDiagramModelZentamateObject) {
                    IZentamateElement element = ((IDiagramModelZentamateObject)model).getZentamateElement();
                    if(!elements.contains(element)) {
                        elements.add(element);
                    }
                    // Element's relationships
                    for(IRelationship relation :  ZentamateModelUtils.getRelationships(element)) {
                        if(!elements.contains(relation)) {
                            elements.add(relation);
                        }
                    }
                }
                else if(model instanceof IDiagramModelZentamateConnection) {
                    IRelationship relation = ((IDiagramModelZentamateConnection)model).getRelationship();
                    if(!elements.contains(relation)) {
                        elements.add(relation);
                    }
                }
            }
        }
        
        // Gather referenced diagram objects
        for(IZentamateElement element : elements) {
            for(IDiagramModel diagramModel : element.getZentamateModel().getDiagramModels()) {
                for(IDiagramModelComponent dc : DiagramModelUtils.findDiagramModelComponentsForElement(diagramModel, element)) {
                    diagramObjects.add(dc);
                }
            }
        }
        
        // Create commands
        
        CompoundCommand compoundCommand = new NonNotifyingCompoundCommand(TEXT);
        
        for(IZentamateElement element : elements) {
            Command cmd = new DeleteElementCommand(element);
            compoundCommand.add(cmd);
        }
        
        for(IDiagramModelComponent dc : diagramObjects) {
            if(dc instanceof IDiagramModelObject) {
                Command cmd = DiagramCommandFactory.createDeleteDiagramObjectCommand((IDiagramModelObject)dc);
                compoundCommand.add(cmd);
            }
            else if(dc instanceof IDiagramModelConnection) {
                Command cmd = DiagramCommandFactory.createDeleteDiagramConnectionCommand((IDiagramModelConnection)dc);
                compoundCommand.add(cmd);
            }
        }
        
        execute(compoundCommand);
    }
    
}