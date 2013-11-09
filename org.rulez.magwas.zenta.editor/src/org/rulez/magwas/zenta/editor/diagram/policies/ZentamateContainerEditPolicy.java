/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.GroupRequest;
import org.rulez.magwas.zenta.editor.model.DiagramModelUtils;
import org.rulez.magwas.zenta.editor.preferences.ConnectionPreferences;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamateFactory;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.util.ZentamateModelUtils;



/**
 * Zentamate Type Container EditPolicy
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateContainerEditPolicy extends BasicContainerEditPolicy {

    /*
     * Over-ride this to add an explicit connection when removing from an Zentamate container if nested
     */
	@Override
    public Command getOrphanChildrenCommand(GroupRequest request) {
	    CompoundCommand result = (CompoundCommand)super.getOrphanChildrenCommand(request);
	    
	    // If we use nested connections and the EditPart model is an Zentamate type object...
	    if(ConnectionPreferences.useNestedConnections() && getHost().getModel() instanceof IDiagramModelZentamateObject) {
	        IDiagramModelZentamateObject parentObject = (IDiagramModelZentamateObject)getHost().getModel();
	        IZentamateElement parentElement = parentObject.getZentamateElement();

	        // Iterate thru the child EditParts...
	        for(Object o : request.getEditParts()) {
	            IDiagramModelObject child = (IDiagramModelObject)((EditPart)o).getModel();

	            // If it's an Zentamate type child object...
	            if(child instanceof IDiagramModelZentamateObject) {
	                IDiagramModelZentamateObject childObject = (IDiagramModelZentamateObject)child;
	                IZentamateElement childElement = childObject.getZentamateElement();

	                // See if there are any (nested type) relationships between parent element and child element...
	                for(IRelationship relation : ZentamateModelUtils.getSourceRelationships(parentElement)) {
	                    if(relation.getTarget() == childElement && DiagramModelUtils.isNestedConnectionTypeRelationship(relation)) {
	                        // And there's not one already there...
	                        if(!DiagramModelUtils.hasDiagramModelZentamateConnection(parentObject, childObject, relation)) {
	                            result.add(new NewConnectionCommand(parentObject, childObject, relation));
	                        }
	                    }
	                }
	            }
	        }
	    }
	    
        return result;
    }
	
	/**
     * Create New Connection Command based on existing relation
     */
    static class NewConnectionCommand extends Command {
        IDiagramModelZentamateConnection fConnection;
        IDiagramModelZentamateObject fSource;
        IDiagramModelZentamateObject fTarget;
        IRelationship fRelation;
        
        NewConnectionCommand(IDiagramModelZentamateObject source, IDiagramModelZentamateObject target, IRelationship relation) {
            fSource = source;
            fTarget = target;
            fRelation = relation;
        }
        
        @Override
        public void execute() {
            fConnection = IZentamateFactory.eINSTANCE.createDiagramModelZentamateConnection();
            fConnection.setRelationship(fRelation);
            fConnection.connect(fSource, fTarget);
        }
        
        @Override
        public void redo() {
            fConnection.reconnect();
        }
        
        @Override
        public void undo() {
            fConnection.disconnect();
        }

        @Override
        public void dispose() {
            fConnection = null;
            fSource = null;
            fTarget = null;
            fRelation = null;
        }
    }

}