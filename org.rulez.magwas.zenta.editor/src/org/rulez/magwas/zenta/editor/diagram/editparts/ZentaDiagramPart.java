/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.ZentaDNDEditPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.ZentaDiagramLayoutPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.BasicContainerEditPolicy;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaPackage;



/**
 * Zenta Diagram Part
 * 
 * @author Phillip Beauvoir
 */
public class ZentaDiagramPart extends AbstractDiagramPart {

    @Override
    public IZentaDiagramModel getModel() {
        return (IZentaDiagramModel)super.getModel();
    }

    @Override
    protected void eCoreChanged(Notification msg) {
        Object feature = msg.getFeature();
        
        // Viewpoint changed
        if(feature == IZentaPackage.Literals.ZENTA_DIAGRAM_MODEL__VIEWPOINT) {
            refreshChildrenFigures();
        }
        else {
            super.eCoreChanged(msg);
        }
    }
    
    @Override
    protected void createEditPolicies() {
        // Install a custom layout policy that handles dragging things around
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new ZentaDiagramLayoutPolicy());
        
        // Install a policy for DND support
        installEditPolicy("DND", new ZentaDNDEditPolicy()); //$NON-NLS-1$
        
        // Install a Container Policy for orphaning child parts
        installEditPolicy(EditPolicy.CONTAINER_ROLE, new BasicContainerEditPolicy());
        
        // Snap to Geometry feedback
        installEditPolicy("Snap Feedback", new SnapFeedbackPolicy()); //$NON-NLS-1$
    }

}
