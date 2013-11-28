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
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.editor.preferences.ConnectionPreferences;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;



/**
 * Zenta Type Container EditPolicy
 * 
 * @author Phillip Beauvoir
 */
public class ZentaContainerEditPolicy extends BasicContainerEditPolicy {

    /*
     * Over-ride this to add an explicit connection when removing from an Zenta container if nested
     */
	@Override
    public Command getOrphanChildrenCommand(GroupRequest request) {
	    CompoundCommand result = (CompoundCommand)super.getOrphanChildrenCommand(request);
	    
	    // If we use nested connections and the EditPart model is an Zenta type object...
	    if(ConnectionPreferences.useNestedConnections() && getHost().getModel() instanceof IDiagramModelZentaObject) {
	        IDiagramModelZentaObject parentObject = (IDiagramModelZentaObject)getHost().getModel();
	        IZentaElement parentElement = parentObject.getZentaElement();

	        // Iterate thru the child EditParts...
	        for(Object o : request.getEditParts()) {
	            IDiagramModelObject child = (IDiagramModelObject)((EditPart)o).getModel();

	            // If it's an Zenta type child object...
	            if(child instanceof IDiagramModelZentaObject) {
	                IDiagramModelZentaObject childObject = (IDiagramModelZentaObject)child;
	                IZentaElement childElement = childObject.getZentaElement();
	                IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(parentObject);

	                // See if there are any (nested type) relationships between parent element and child element...
	                for(IRelationship relation : ZentaModelUtils.getSourceRelationships(parentElement)) {
	                    if(relation.getTarget() == childElement && vp.isNestedConnectionTypeRelationship(relation)) {
	                        // And there's not one already there...
	                        if(!DiagramModelUtils.hasDiagramModelZentaConnection(parentObject, childObject, relation)) {
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
        IDiagramModelZentaConnection fConnection;
        IDiagramModelZentaObject fSource;
        IDiagramModelZentaObject fTarget;
        IRelationship fRelation;
        
        NewConnectionCommand(IDiagramModelZentaObject source, IDiagramModelZentaObject target, IRelationship relation) {
            fSource = source;
            fTarget = target;
            fRelation = relation;
        }
        
        @Override
        public void execute() {
            fConnection = IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
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