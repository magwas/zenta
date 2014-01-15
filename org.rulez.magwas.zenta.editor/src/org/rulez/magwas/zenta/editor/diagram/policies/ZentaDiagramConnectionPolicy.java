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
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;


/**
 * Zenta Diagram Connection Policy
 * 
 * @author Phillip Beauvoir
 */
public class ZentaDiagramConnectionPolicy extends GraphicalNodeEditPolicy {
    
    @Override
    protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
        CreateDiagramConnectionCommand cmd = null;
        
        IRelationClass classType = (IRelationClass)request.getNewObjectType();
        IDiagramModelObject source = (IDiagramModelObject)getHost().getModel();
        
        // Plain Connection
        if(classType == IZentaPackage.eINSTANCE.getDiagramModelConnection()) {
            cmd = new CreateLineConnectionCommand(request);
        }
        
        // Zenta Model Object Source
        else if(source instanceof IDiagramModelZentaObject) {
            if(isValidConnectionSource((IDiagramModelZentaObject)source, classType)) {
                cmd = new CreateZentaConnectionCommand(request);
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
        
        // Re-connect Zenta Connection Source to Zenta Element
        if(connection instanceof IDiagramModelZentaConnection && newSource instanceof IDiagramModelZentaObject) {
            // Compound Command
            CompoundCommand result = new CompoundCommand();
            
            // Check for matching connections in this and other diagrams
            IRelationship relationship = ((IDiagramModelZentaConnection)connection).getRelationship();
            IZentaElement newSourceElement = ((IDiagramModelZentaObject)newSource).getZentaElement();

            for(IDiagramModel diagramModel : newSourceElement.getZentaModel().getDiagramModels()) {
                for(IDiagramModelZentaConnection matchingConnection : DiagramModelUtils.findDiagramModelConnectionsForRelation(diagramModel, relationship)) {
                    IDiagramModelZentaObject matchingSource = null;

                    // Same Diagram so use the new source
                    if(newSource.getDiagramModel() == diagramModel) {
                        matchingSource = (IDiagramModelZentaObject)newSource;
                    }
                    // Different Diagram so find a match
                    else {
                        List<IDiagramModelZentaObject> list = DiagramModelUtils.findDiagramModelObjectsForElement(diagramModel, newSourceElement);
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

        // Re-connect Zenta Connection Target to Zenta Element
        if(connection instanceof IDiagramModelZentaConnection && newTarget instanceof IDiagramModelZentaObject) {
            // Compound Command
            CompoundCommand result = new CompoundCommand();

            // Check for matching connections in this and other diagrams
            IRelationship relationship = ((IDiagramModelZentaConnection)connection).getRelationship();
            IZentaElement newTargetElement = ((IDiagramModelZentaObject)newTarget).getZentaElement();

            for(IDiagramModel diagramModel : newTargetElement.getZentaModel().getDiagramModels()) {
                for(IDiagramModelZentaConnection matchingConnection : DiagramModelUtils.findDiagramModelConnectionsForRelation(diagramModel, relationship)) {
                    IDiagramModelZentaObject matchingTarget = null;
                    
                    // Same Diagram so use the new target
                    if(newTarget.getDiagramModel() == diagramModel) {
                        matchingTarget = (IDiagramModelZentaObject)newTarget;
                    }
                    // Different Diagram so find a match
                    else {
                        List<IDiagramModelZentaObject> list = DiagramModelUtils.findDiagramModelObjectsForElement(diagramModel, newTargetElement);
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
            	IRelationClass classType = (IRelationClass)fRequest.getNewObjectType();
                return isValidConnection(fSource, fTarget, classType);
            }
            return false;
        }  
    }
    
    /*
     * Command to create an Zenta type connection.
     * Will also add and remove the associated Zenta Relationship to the model
     */
    private class CreateZentaConnectionCommand extends CreateLineConnectionCommand {
        // Flag to mark whether a new relationship was created or whether we re-used an existing one
        private boolean useExistingRelation;
        
        public CreateZentaConnectionCommand(CreateConnectionRequest request) {
            super(request);
        }
        
        @Override
        public void execute() {
        	Object classType =  fRequest.getNewObjectType();
            IDiagramModelZentaObject source = (IDiagramModelZentaObject)fSource;
            IDiagramModelZentaObject target = (IDiagramModelZentaObject)fTarget;
            ifExistingRelationShouldBeUsedThenSetToUseIt(classType, source, target);

            super.execute();
            
            if(!useExistingRelation) {
                ((IDiagramModelZentaConnection)fConnection).addRelationshipToModel(null);
            }
        }
			private void ifExistingRelationShouldBeUsedThenSetToUseIt(
					Object classType, IDiagramModelZentaObject source,
					IDiagramModelZentaObject target) {
				if(classType instanceof EClass) {
		            IRelationship relation = getExistingRelationshipOfType((EClass) classType, source, target);
		            if(relation != null) {
		                useExistingRelation = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(),
		                        Messages.ZentaDiagramConnectionPolicy_0,
		                        NLS.bind(Messages.ZentaDiagramConnectionPolicy_1,
		                                source.getName(), target.getName()));
		                if(useExistingRelation) {
		                    fConnection = createNewConnection();
		                    ((IDiagramModelZentaConnection)fConnection).setRelationship(relation);
		                }
		            }
	            }
			}

        @Override
        public void redo() {
            super.redo();
            
            // Now add the relationship to the model
            if(!useExistingRelation) {
                ((IDiagramModelZentaConnection)fConnection).addRelationshipToModel(null);
            }
        }
        
        @Override
        public void undo() {
            super.undo();
            
            // Now remove the relationship from its folder
            if(!useExistingRelation) {
                ((IDiagramModelZentaConnection)fConnection).removeRelationshipFromModel();
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
            if(super.checkSourceConnection())
                if(fConnection instanceof IDiagramModelZentaConnection)
                    return isValidConnection(fNewSource, fOldTarget, ((IDiagramModelZentaConnection)fConnection).getRelationship());
                else
                	throw new UnTestedException();
                    //return isValidConnection(fNewSource, fOldTarget, fConnection);
            
            return false;
        }
        
        @Override
        protected boolean checkTargetConnection() {
            if(super.checkTargetConnection())
                if(fConnection instanceof IDiagramModelZentaConnection)
                    return isValidConnection(fOldSource, fNewTarget, ((IDiagramModelZentaConnection)fConnection).getRelationship());
                else
                	throw new UnTestedException();
                    //return isValidConnection(fOldSource, fNewTarget, fConnection.eClass());
            return false;
        }
    }

    
    // ==================================================================================================
    // ========================================= Connection Rules =======================================
    // ==================================================================================================
    
    /**
     * @return True if valid connection source for connection type
     */
    private boolean isValidConnectionSource(IDiagramModelZentaObject source, IRelationClass relationshipType) {
        // Special case if relationshipType == null. Means that the Magic connector is being used
        if(relationshipType == null) {
            return true;
        }

        IDiagramModel dm = source.getDiagramModel();
        IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(dm);
        return vp.isValidRelationshipStart(source.getZentaElement(), relationshipType);
    }
    
    /**
     * @param source
     * @param target
     * @param relationshipType
     * @return True if valid connection source/target for connection type
     */
    private boolean isValidConnection(IDiagramModelObject source, IDiagramModelObject target, IRelationship rel) {
        // Connection from Zenta object to Zenta object 
        if(source instanceof IDiagramModelZentaObject && target instanceof IDiagramModelZentaObject) {
            IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(source);
            IZentaElement sourceElement = ((IDiagramModelZentaObject)source).getZentaElement();
            IZentaElement targetElement = ((IDiagramModelZentaObject)target).getZentaElement();
            return vp.isValidRelationship(sourceElement, targetElement, rel);
        }
        return true;
    }
    private boolean isValidConnection(IDiagramModelObject source, IDiagramModelObject target, IRelationClass rel) {
        if(source instanceof IDiagramModelZentaObject && target instanceof IDiagramModelZentaObject) {
            IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(source);
            IZentaElement sourceElement = ((IDiagramModelZentaObject)source).getZentaElement();
            IZentaElement targetElement = ((IDiagramModelZentaObject)target).getZentaElement();
            return vp.isValidRelationship(sourceElement, targetElement, rel);
        }
        return true;
    }
    
    /**
     * See if there is an existing relationship of the proposed type between source and target diagram objects.
     * If there is, we can offer to re-use it instead of creating a new one.
     * @return an existing relationship or null
     */
    private IRelationship getExistingRelationshipOfType(EClass classType, IDiagramModelZentaObject source, IDiagramModelZentaObject target) {
        for(IRelationship relation : ZentaModelUtils.getSourceRelationships(source.getZentaElement())) {
            if(relation.eClass().equals(classType) && relation.getTarget() == target.getZentaElement()) {
                return relation;
            }
        }
        return null;
    }
}
