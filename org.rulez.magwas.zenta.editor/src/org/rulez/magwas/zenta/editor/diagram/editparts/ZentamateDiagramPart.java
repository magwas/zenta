/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.ZentamateDNDEditPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.ZentamateDiagramLayoutPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.BasicContainerEditPolicy;
import org.rulez.magwas.zenta.model.IZentamateDiagramModel;
import org.rulez.magwas.zenta.model.IZentamatePackage;



/**
 * Zentamate Diagram Part
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateDiagramPart extends AbstractDiagramPart {

    @Override
    public IZentamateDiagramModel getModel() {
        return (IZentamateDiagramModel)super.getModel();
    }

    @Override
    protected void eCoreChanged(Notification msg) {
        Object feature = msg.getFeature();
        
        // Viewpoint changed
        if(feature == IZentamatePackage.Literals.ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT) {
            refreshChildrenFigures();
        }
        else {
            super.eCoreChanged(msg);
        }
    }
    
    @Override
    protected void createEditPolicies() {
        // Install a custom layout policy that handles dragging things around
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new ZentamateDiagramLayoutPolicy());
        
        // Install a policy for DND support
        installEditPolicy("DND", new ZentamateDNDEditPolicy()); //$NON-NLS-1$
        
        // Install a Container Policy for orphaning child parts
        installEditPolicy(EditPolicy.CONTAINER_ROLE, new BasicContainerEditPolicy());
        
        // Snap to Geometry feedback
        installEditPolicy("Snap Feedback", new SnapFeedbackPolicy()); //$NON-NLS-1$
    }

}
