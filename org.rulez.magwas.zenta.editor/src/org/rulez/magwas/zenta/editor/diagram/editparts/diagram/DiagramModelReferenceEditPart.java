/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.diagram;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractConnectedEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.IColoredEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.ITextAlignedEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.diagram.DiagramModelReferenceFigure;
import org.rulez.magwas.zenta.editor.diagram.policies.ZentamateDiagramConnectionPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.PartComponentEditPolicy;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelReference;



/**
 * Diagram Model Reference Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class DiagramModelReferenceEditPart extends AbstractConnectedEditPart
implements IColoredEditPart, ITextAlignedEditPart {

    @Override
    protected void addECoreAdapter() {
        super.addECoreAdapter();
        
        // Listen to referenced model
        IDiagramModel ref = ((IDiagramModelReference)getModel()).getReferencedModel();
        if(ref != null) {
            ref.eAdapters().add(getECoreAdapter());
        }
    }
    
    @Override
    protected void removeECoreAdapter() {
        super.removeECoreAdapter();
        
        // Unlisten to referenced model
        IDiagramModel ref = ((IDiagramModelReference)getModel()).getReferencedModel();
        if(ref != null) {
            ref.eAdapters().remove(getECoreAdapter());
        }
    }

    @Override
    protected void createEditPolicies() {
        // Allow parts to be connected
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ZentamateDiagramConnectionPolicy());

        // Add a policy to handle editing the Parts (for example, deleting a part)
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new PartComponentEditPolicy());
    }

    @Override
    protected IFigure createFigure() {
        DiagramModelReferenceFigure figure = new DiagramModelReferenceFigure(getModel());
        return figure;
    }

    @Override
    protected void refreshFigure() {
        ((IDiagramModelObjectFigure)figure).refreshVisuals();
    }

    @Override
    public void performRequest(Request req) {
        if(req.getType() == RequestConstants.REQ_OPEN) {
            // Open Diagram if not in Full Screen Mode
            if(!isInFullScreenMode()) {
                EditorManager.openDiagramEditor(((IDiagramModelReference)getModel()).getReferencedModel());
            }
        }
    }
}
