/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.policies;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.diagram.commands.CreateDiagramConnectionCommand;
import org.rulez.magwas.zenta.editor.diagram.commands.DiagramCommandFactory;
import org.rulez.magwas.zenta.editor.diagram.commands.ReconnectDiagramConnectionCommand;
import org.rulez.magwas.zenta.editor.model.DiagramModelUtils;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.util.ZentamateModelUtils;


/**
 * Zentamate Diagram Connection Policy
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateDiagramConnectionPolicy extends GraphicalNodeEditPolicy {
    
    @Override
    protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
        CreateDiagramConnectionCommand cmd = null;
        
        EClass classType = (EClass)request.getNewObjectType();
        IDiagramModelObject source = (IDiagramModelObject)getHost().getModel();
        
        // Plain Connection
        if(classType == IZentamatePackage.eINSTANCE.getDiagramModelConnection()) {
            cmd = new CreateLineConnectionCommand(request);
        }
        
        // Zentamate Model Object Source
        else if(source instanceof IDiagramModelZentamateObject) {
            if(isValidConnectionSource((IDiagramModelZentamateObject)source, classType)) {
                cmd = new CreateZentamateConnectionCommand(request);
            }
        }
        
        if(cmd != null) {
            cmd.setSource(source);
            request.setStartCommand(cmd);
        }

        return cmd;
    }

    @Override
    protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
        // Pick up the command that was created in getConnectionCreateCommand(CreateConnectionRequest request)
        CreateDiagramConnectionCommand cmd = (CreateDiagramConnectionCommand)request.getStartCommand();
        IDiagramModelObject target = (IDiagramModelObject)getHost().getModel();
        cmd.setTarget(target);
        return cmd;
    }

    @Override
    protected Command getReconnectSourceCommand(ReconnectRequest request) {
        IDiagramModelConnection connection = (IDiagramModelConnection)request.getConnectionEditPart().getModel();
        IDiagramModelObject newSource = (IDiagramModelObject)getHost().getModel();
        
        // Re-connect ZentaMate Connection Source to Zentamate Element
        if(connection instanceof IDiagramModelZentamateConnection && newSource instanceof IDiagramModelZentamateObject) {
            // Compound Command
            CompoundCommand result = new CompoundCommand();
            
            // Check for matching connections in this and other diagrams
            IRelationship relationship = ((IDiagramModelZentamateConnection)connection).getRelationship();
            IZentamateElement newSourceElement = ((IDiagramModelZentamateObject)newSource).getZentamateElement();

            for(IDiagramModel diagramModel : newSourceElement.getZentamateModel().getDiagramModels()) {
                for(IDiagramModelZentamateConnection matchingConnection : DiagramModelUtils.findDiagramModelConnectionsForRelation(diagramModel, relationship)) {
                    IDiagramModelZentamateObject matchingSource = null;

                    // Same Diagram so use the new source
                    if(newSource.getDiagramModel() == diagramModel) {
                        matchingSource = (IDiagramModelZentamateObject)newSource;
                    }
                    // Different Diagram so find a match
                    else {
                        List<IDiagramModelZentamateObject> list = DiagramModelUtils.findDiagramModelObjectsForElement(diagramModel, newSourceElement);
                        if(!list.isEmpty()) {
                            matchingSource = list.get(0);
                        }                            
                    }

                    // Does the new source exist on the diagram? Yes, reconnect
                    if(matchingSource != null) {
                        ReconnectConnectionCommand cmd2 = new ReconnectConnectionCommand(matchingConnection);
                        cmd2.setNewSource(matchingSource);
                        result.add(cmd2);
                    }
                    // No, so delete the matching connection
                    else {
                        result.add(DiagramCommandFactory.createDeleteDiagramConnectionCommand(matchingConnection));
                    }
                }
            }
            
            return result.unwrap();
        }
        
        // Re-connect Line Connection Source
        else {
            ReconnectConnectionCommand cmd = new ReconnectConnectionCommand(connection);
            cmd.setNewSource(newSource);
            return cmd;
        }
    }

    @Override
    protected Command getReconnectTargetCommand(ReconnectRequest request) {
        IDiagramModelConnection connection = (IDiagramModelConnection)request.getConnectionEditPart().getModel();
        IDiagramModelObject newTarget = (IDiagramModelObject)getHost().getModel();

        // Re-connect ZentaMate Connection Target to Zentamate Element
        if(connection instanceof IDiagramModelZentamateConnection && newTarget instanceof IDiagramModelZentamateObject) {
            // Compound Command
            CompoundCommand result = new CompoundCommand();

            // Check for matching connections in this and other diagrams
            IRelationship relationship = ((IDiagramModelZentamateConnection)connection).getRelationship();
            IZentamateElement newTargetElement = ((IDiagramModelZentamateObject)newTarget).getZentamateElement();

            for(IDiagramModel diagramModel : newTargetElement.getZentamateModel().getDiagramModels()) {
                for(IDiagramModelZentamateConnection matchingConnection : DiagramModelUtils.findDiagramModelConnectionsForRelation(diagramModel, relationship)) {
                    IDiagramModelZentamateObject matchingTarget = null;
                    
                    // Same Diagram so use the new target
                    if(newTarget.getDiagramModel() == diagramModel) {
                        matchingTarget = (IDiagramModelZentamateObject)newTarget;
                    }
                    // Different Diagram so find a match
                    else {
                        List<IDiagramModelZentamateObject> list = DiagramModelUtils.findDiagramModelObjectsForElement(diagramModel, newTargetElement);
                        if(!list.isEmpty()) {
                            matchingTarget = list.get(0);
                        }                            
                    }
                    
                    // Does the new target exist on the diagram? Yes, reconnect
                    if(matchingTarget != null) {
                        ReconnectConnectionCommand cmd2 = new ReconnectConnectionCommand(matchingConnection);
                        cmd2.setNewTarget(matchingTarget);
                        result.add(cmd2);
                    }
                    // No, so delete the matching connection
                    else {
                        result.add(DiagramCommandFactory.createDeleteDiagramConnectionCommand(matchingConnection));
                    }
                }
            }
            
            return result.unwrap();
        }
        
        // Re-connect Line Connection Target
        else {
            ReconnectConnectionCommand cmd = new ReconnectConnectionCommand(connection);
            cmd.setNewTarget(newTarget);
            return cmd;
        }
    }

    
    // ==================================================================================================
    // ============================================= Commands ===========================================
    // ==================================================================================================
    
    /*
     * Command to create a line connection for notes
     */
    private class CreateLineConnectionCommand extends CreateDiagramConnectionCommand {
        public CreateLineConnectionCommand(CreateConnectionRequest request) {
            super(request);
        }
        
        @Override
        public boolean canExecute() {
            if(super.canExecute()) {
                EClass classType = (EClass)fRequest.getNewObjectType();
                return isValidConnection(fSource, fTarget, classType);
            }
            return false;
        }  
    }
    
    /*
     * Command to create an Zentamate type connection.
     * Will also add and remove the associated Zentamate Relationship to the model
     */
    private class CreateZentamateConnectionCommand extends CreateLineConnectionCommand {
        // Flag to mark whether a new relationship was created or whether we re-used an existing one
        private boolean useExistingRelation;
        
        public CreateZentamateConnectionCommand(CreateConnectionRequest request) {
            super(request);
        }
        
        @Override
        public void execute() {
            EClass classType = (EClass)fRequest.getNewObjectType();
            IDiagramModelZentamateObject source = (IDiagramModelZentamateObject)fSource;
            IDiagramModelZentamateObject target = (IDiagramModelZentamateObject)fTarget;
            
            // If there is already a relation of this type in the model...
            IRelationship relation = getExistingRelationshipOfType(classType, source, target);
            if(relation != null) {
                // ...then ask the user if they want to re-use it
                useExistingRelation = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(),
                        Messages.ZentamateDiagramConnectionPolicy_0,
                        NLS.bind(Messages.ZentamateDiagramConnectionPolicy_1,
                                source.getName(), target.getName()));
                // Yes...
                if(useExistingRelation) {
                     // ...set connection's relationship to the existing relation
                    fConnection = createNewConnection();
                    ((IDiagramModelZentamateConnection)fConnection).setRelationship(relation);
                }
            }

            super.execute();
            
            // Now add the relationship to the model
            if(!useExistingRelation) {
                ((IDiagramModelZentamateConnection)fConnection).addRelationshipToModel(null);
            }
        }

        @Override
        public void redo() {
            super.redo();
            
            // Now add the relationship to the model
            if(!useExistingRelation) {
                ((IDiagramModelZentamateConnection)fConnection).addRelationshipToModel(null);
            }
        }
        
        @Override
        public void undo() {
            super.undo();
            
            // Now remove the relationship from its folder
            if(!useExistingRelation) {
                ((IDiagramModelZentamateConnection)fConnection).removeRelationshipFromModel();
            }
        }
    }
    
    /*
     * Command to reconnect a connection
     */
    private class ReconnectConnectionCommand extends ReconnectDiagramConnectionCommand {
        public ReconnectConnectionCommand(IDiagramModelConnection connection) {
            super(connection);
        }
        
        @Override
        protected boolean checkSourceConnection() {
            if(super.checkSourceConnection()) {
                if(fConnection instanceof IDiagramModelZentamateConnection) {
                    return isValidConnection(fNewSource, fOldTarget, ((IDiagramModelZentamateConnection)fConnection).getRelationship().eClass());
                }
                else {
                    return isValidConnection(fNewSource, fOldTarget, fConnection.eClass());
                }
            }
            
            return false;
        }
        
        @Override
        protected boolean checkTargetConnection() {
            if(super.checkTargetConnection()) {
                if(fConnection instanceof IDiagramModelZentamateConnection) {
                    return isValidConnection(fOldSource, fNewTarget, ((IDiagramModelZentamateConnection)fConnection).getRelationship().eClass());
                }
                else {
                    return isValidConnection(fOldSource, fNewTarget, fConnection.eClass());
                }
            }
            
            return false;
        }
    }

    
    // ==================================================================================================
    // ========================================= Connection Rules =======================================
    // ==================================================================================================
    
    /**
     * @return True if valid connection source for connection type
     */
    private boolean isValidConnectionSource(IDiagramModelZentamateObject source, EClass relationshipType) {
        // Special case if relationshipType == null. Means that the Magic connector is being used
        if(relationshipType == null) {
            return true;
        }

        return ZentamateModelUtils.isValidRelationshipStart(source.getZentamateElement(), relationshipType);
    }
    
    /**
     * @param source
     * @param target
     * @param relationshipType
     * @return True if valid connection source/target for connection type
     */
    private boolean isValidConnection(IDiagramModelObject source, IDiagramModelObject target, EClass relationshipType) {
        // Diagram Connection from/to notes/groups/diagram refs
        if(relationshipType == IZentamatePackage.eINSTANCE.getDiagramModelConnection()) {
            if(source == target) {
                return false;
            }
            if(source instanceof IDiagramModelZentamateObject && target instanceof IDiagramModelZentamateObject) {
                return false;
            }
            if(source instanceof IDiagramModelGroup || source instanceof IDiagramModelReference) {
                return !(target instanceof IDiagramModelZentamateObject);
            }
            if(source instanceof IDiagramModelZentamateObject) {
                return target instanceof IDiagramModelNote;
            }
            
            return true;
        }

        // Connection from Zentamate object to Zentamate object 
        if(source instanceof IDiagramModelZentamateObject && target instanceof IDiagramModelZentamateObject) {
            
            // Special case if relationshipType == null. Means that the Magic connector is being used
            if(relationshipType == null) {
                return true;
            }
            
            IZentamateElement sourceElement = ((IDiagramModelZentamateObject)source).getZentamateElement();
            IZentamateElement targetElement = ((IDiagramModelZentamateObject)target).getZentamateElement();
            return ZentamateModelUtils.isValidRelationship(sourceElement, targetElement, relationshipType);
        }
        
        return false;
    }
    
    /**
     * See if there is an existing relationship of the proposed type between source and target diagram objects.
     * If there is, we can offer to re-use it instead of creating a new one.
     * @return an existing relationship or null
     */
    private IRelationship getExistingRelationshipOfType(EClass classType, IDiagramModelZentamateObject source, IDiagramModelZentamateObject target) {
        for(IRelationship relation : ZentamateModelUtils.getSourceRelationships(source.getZentamateElement())) {
            if(relation.eClass().equals(classType) && relation.getTarget() == target.getZentamateElement()) {
                return relation;
            }
        }
        return null;
    }
}
