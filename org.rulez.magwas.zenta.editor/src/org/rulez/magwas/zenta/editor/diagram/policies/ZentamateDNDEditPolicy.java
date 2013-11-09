/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.rulez.magwas.zenta.editor.diagram.ZentamateDiagramModelFactory;
import org.rulez.magwas.zenta.editor.diagram.commands.AddDiagramZentamateConnectionCommand;
import org.rulez.magwas.zenta.editor.diagram.commands.AddDiagramModelReferenceCommand;
import org.rulez.magwas.zenta.editor.diagram.commands.AddDiagramObjectCommand;
import org.rulez.magwas.zenta.editor.diagram.commands.DiagramCommandFactory;
import org.rulez.magwas.zenta.editor.diagram.dnd.AbstractDNDEditPolicy;
import org.rulez.magwas.zenta.editor.diagram.dnd.ZentamateDiagramTransferDropTargetListener;
import org.rulez.magwas.zenta.editor.diagram.dnd.DiagramDropRequest;
import org.rulez.magwas.zenta.editor.model.DiagramModelUtils;
import org.rulez.magwas.zenta.editor.model.commands.NonNotifyingCompoundCommand;
import org.rulez.magwas.zenta.editor.preferences.ConnectionPreferences;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.IZentamateModelElement;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.util.ZentamateModelUtils;



/**
 * A policy to handle an Zentamate Diagram's and Diagram's Container object's Native DND commands
 * Create a Command for dropping and dragging elements from Tree to diagram/container
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateDNDEditPolicy extends AbstractDNDEditPolicy {

    protected List<IZentamateElement> fElementsToAdd;
    protected List<IRelationship> fRelationsToAdd;
    protected List<IDiagramModel> fDiagramRefsToAdd;
    
    @Override
    protected Command getDropCommand(DiagramDropRequest request) {
        if(!(request.getData() instanceof IStructuredSelection)) {
            return null;
        }
        
        // XY drop point
        Point pt = getDropLocation(request);

        int origin = pt.x;
        int x = pt.x;
        int y = pt.y;

        fElementsToAdd = new ArrayList<IZentamateElement>();
        fRelationsToAdd = new ArrayList<IRelationship>();
        fDiagramRefsToAdd = new ArrayList<IDiagramModel>();
        
        // Gather an actual list of elements dragged onto the container, omitting duplicates and anything already on the diagram
        Object[] objects = ((IStructuredSelection)request.getData()).toArray();
        getElementsToAdd(objects);
        
        // Store the Diagram Model Components that will be added
        List<IDiagramModelZentamateObject> diagramObjects = new ArrayList<IDiagramModelZentamateObject>();

        // Compound Command - it has to be Non-Notifying or it's way too slow (tested with Bill's UoB model!)
        CompoundCommand result = new NonNotifyingCompoundCommand(Messages.ZentamateDNDEditPolicy_0);

        // Add the Commands adding the Elements first
        for(IZentamateElement element : fElementsToAdd) {
            // Add Diagram object
            IDiagramModelZentamateObject dmo = ZentamateDiagramModelFactory.createDiagramModelZentamateObject(element);
            dmo.setBounds(x, y, -1, -1);
            
            // Store it
            diagramObjects.add(dmo);
            
            // Add Command
            result.add(new AddDiagramObjectCommand(getTargetContainer(), dmo));

            // Increase x,y
            x += 150;
            if(x > origin + 400) {
                x = origin;
                y += 100;
            }
        }

        // Then any Diagram Model Ref Commands
        for(IDiagramModel diagramModel : fDiagramRefsToAdd) {
            result.add(new AddDiagramModelReferenceCommand(getTargetContainer(), diagramModel, x, y));
            
            x += 150;
            if(x > origin + 400) {
                x = origin;
                y += 100;
            }
        }

        // Add selected Relations to create connections for those elements on the diagram that don't already have them
        for(IRelationship relation : fRelationsToAdd) {
            // Existing
            List<IDiagramModelZentamateObject> sources = DiagramModelUtils.findDiagramModelObjectsForElement(getTargetDiagramModel(), relation.getSource());
            List<IDiagramModelZentamateObject> targets = DiagramModelUtils.findDiagramModelObjectsForElement(getTargetDiagramModel(), relation.getTarget());

            for(IDiagramModelZentamateObject dcSource : sources) {
                for(IDiagramModelZentamateObject dcTarget : targets) {
                    if(dcTarget != dcSource && !DiagramModelUtils.hasDiagramModelZentamateConnection(dcSource, dcTarget, relation)) {
                        result.add(new AddDiagramZentamateConnectionCommand(dcSource, dcTarget, relation));
                    }
                }
            }
        }
        
        // Whether to add connections to elements
        Boolean value = (Boolean)request.getExtendedData().get(ZentamateDiagramTransferDropTargetListener.ADD_ELEMENT_CONNECTIONS);
        boolean addConnectionsToElements = value != null && value.booleanValue();
        
        // Newly added objects will need new connections to existing elements and newly added elements
        for(IDiagramModelZentamateObject dmo : diagramObjects) {
            IZentamateElement element = dmo.getZentamateElement();

            for(IRelationship relation : ZentamateModelUtils.getRelationships(element)) {
                /*
                 * If the user holds down the Copy key (Ctrl on win/lnx, Alt on Mac) then linked connections
                 * are not added on drag and drop. However, any selected relations' linked objects are added.
                 */
                if(!addConnectionsToElements && !fRelationsToAdd.contains(relation)) {
                    continue;
                }

                // Find existing objects
                List<IDiagramModelZentamateObject> sources = DiagramModelUtils.findDiagramModelObjectsForElement(getTargetDiagramModel(), relation.getSource());
                List<IDiagramModelZentamateObject> targets = DiagramModelUtils.findDiagramModelObjectsForElement(getTargetDiagramModel(), relation.getTarget());

                // Add new ones too
                for(IDiagramModelZentamateObject dmo2 : diagramObjects) {
                    if(dmo != dmo2) {
                        IZentamateElement element2 = dmo2.getZentamateElement();
                        if(element2 == relation.getSource()) { // Only need to add sources, not targets
                            sources.add(dmo2);
                        }
                    }
                }

                // Make the Commands...
                for(IDiagramModelZentamateObject dcSource : sources) {
                    if(element == relation.getTarget()) {
                        result.add(new AddDiagramZentamateConnectionCommand(dcSource, dmo, relation));
                    }
                }

                for(IDiagramModelZentamateObject dcTarget : targets) {
                    if(element == relation.getSource()) {
                        result.add(new AddDiagramZentamateConnectionCommand(dmo, dcTarget, relation));
                    }
                }
            }
        }
        
        // Then, if adding to a container type, ask whether to add new relations...
        Command subCommand = createAddRelationsCommand();
        if(subCommand != null) {
            result.add(subCommand);
        }

        return result; // return the full compound command
    }
    
    /**
     * If adding to a container type, ask whether to add new relations...
     * We'll add this as a sub-command to be executed when the main Command executes so that the user
     * Can see the objects added to the view before answering the relations dialog.
     */
    protected Command createAddRelationsCommand() {
        Command command = null;
        
        if(ConnectionPreferences.createRelationWhenAddingModelTreeElement()) {
            if(getTargetContainer() instanceof IDiagramModelZentamateObject) {
                command = new Command() {
                    private Command fSubCommand;

                    @Override
                    public void execute() {
                        IZentamateElement parentElement = ((IDiagramModelZentamateObject)getTargetContainer()).getZentamateElement();
                        fSubCommand = DiagramCommandFactory.createNewNestedRelationCommandWithDialog(parentElement,
                                fElementsToAdd.toArray(new IZentamateElement[fElementsToAdd.size()]));
                        if(fSubCommand != null) {
                            fSubCommand.execute();
                        }
                    }

                    @Override
                    public void undo() {
                        if(fSubCommand != null) {
                            fSubCommand.undo();
                        }
                    }

                    @Override
                    public void redo() {
                        if(fSubCommand != null) {
                            fSubCommand.redo();
                        }
                    }
                };
            }
        }
        
        return command;
    }
    
    /**
     * Gather the elements and relationships that will be added to the diagram
     */
    protected void getElementsToAdd(Object[] objects) {
        IZentamateModel targetZentamateModel = getTargetDiagramModel().getZentamateModel();
        
        for(Object object : objects) {
            // Check
            if(!canDropElement(object)) {
                continue;
            }
            
            // Can only add to the same model
            if(object instanceof IZentamateModelElement) {
                IZentamateModel sourceZentamateModel = ((IZentamateModelElement)object).getZentamateModel();
                if(sourceZentamateModel != targetZentamateModel) {
                    continue;
                }
            }
            
            // Selected Zentamate Elements *first*
            if(object instanceof IZentamateElement && !(object instanceof IRelationship)) {
                if(!fElementsToAdd.contains(object)) {
                    fElementsToAdd.add((IZentamateElement)object);
                }
            }
        
            // Then Selected Relationships (and any connected Elements)
            else if(object instanceof IRelationship) {
                IRelationship relationship = (IRelationship)object;
                if(!fRelationsToAdd.contains(relationship)) {
                    fRelationsToAdd.add(relationship);
                }
                
                // Add relationship's connected elements
                addRelationshipElements(relationship);
            }

            // Selected Diagram Models (References)
            else if(object instanceof IDiagramModel && object != getTargetDiagramModel()) { // not the same diagram
                if(!fDiagramRefsToAdd.contains(object)) {
                    fDiagramRefsToAdd.add((IDiagramModel)object);
                }
            }
        }
    }
    
    /**
     * Add connected elements
     * @param relationship
     */
    protected void addRelationshipElements(IRelationship relationship) {
        // Connected Source Element if not on Diagram
        if(DiagramModelUtils.findDiagramModelObjectsForElement(getTargetDiagramModel(), relationship.getSource()).isEmpty()) {
            addElement(relationship.getSource());
        }

        // Connected Target Element if not on Diagram
        if(DiagramModelUtils.findDiagramModelObjectsForElement(getTargetDiagramModel(), relationship.getTarget()).isEmpty()) {
            addElement(relationship.getTarget());
        }
        
        // Recursive case - ensure at least 2 connecting elements
        if(relationship.getSource() == relationship.getTarget()) {
            int size = DiagramModelUtils.findDiagramModelObjectsForElement(getTargetDiagramModel(), relationship.getSource()).size();
            for(IZentamateElement e : fElementsToAdd) {
                if(e == relationship.getSource()) {
                    size++;
                }
            }
            if(size < 2) {
                fElementsToAdd.add(relationship.getSource());
            }
        }
    }
    
    /**
     * Add an element and any of its relationships
     */
    protected void addElement(IZentamateElement element) {
        // Not already added
        if(!fElementsToAdd.contains(element)) {  
            fElementsToAdd.add(element);
            
            // And its relationships
            for(IRelationship relationship : ZentamateModelUtils.getRelationships(element)) {
                if(!fRelationsToAdd.contains(relationship)) {
                    fRelationsToAdd.add(relationship);
                }
            }
        }
    }
    
    /**
     * @param element
     * @return Whether we can DND an element onto the Container
     */
    protected boolean canDropElement(Object element) {
        return (element instanceof IZentamateElement) || (element instanceof IDiagramModel);
    }
}
