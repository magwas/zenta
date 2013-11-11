/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.editparts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.rulez.magwas.zenta.canvas.figures.CanvasBlockFigure;
import org.rulez.magwas.zenta.canvas.model.ICanvasModelBlock;
import org.rulez.magwas.zenta.canvas.model.ICanvasPackage;
import org.rulez.magwas.zenta.canvas.policies.CanvasBlockLayoutPolicy;
import org.rulez.magwas.zenta.canvas.policies.CanvasConnectionPolicy;
import org.rulez.magwas.zenta.canvas.policies.CanvasDNDEditPolicy;
import org.rulez.magwas.zenta.editor.diagram.directedit.MultiLineTextDirectEditManager;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractConnectedEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.IColoredEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.ITextAlignedEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.ITextPositionedEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.SnapEditPartAdapter;
import org.rulez.magwas.zenta.editor.diagram.figures.IContainerFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.policies.BasicContainerEditPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.ContainerHighlightEditPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.PartComponentEditPolicy;
import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentaPackage;



/**
 * Canvas Block Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class CanvasBlockEditPart extends AbstractConnectedEditPart
implements IColoredEditPart, ITextAlignedEditPart, ITextPositionedEditPart {
    
    @Override
    protected void eCoreChanged(Notification msg) {
        Object feature = msg.getFeature();
        
        switch(msg.getEventType()) {
            case Notification.SET:
                // Refresh Icon
                if(feature == IZentaPackage.Literals.DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH
                            || feature == ICanvasPackage.Literals.ICONIC__IMAGE_POSITION) {
                    ((CanvasBlockFigure)getFigure()).updateImage();
                }
                else {
                    super.eCoreChanged(msg);
                }
                
                break;

            default:
                super.eCoreChanged(msg);
        }
    }

    @Override
    protected List<?> getModelChildren() {
        return getModel().getChildren();
    }

    @Override
    protected IFigure createFigure() {
        return new CanvasBlockFigure(getModel());
    }

    @Override
    public ICanvasModelBlock getModel() {
        return (ICanvasModelBlock)super.getModel();
    }
    
    @Override
    protected void createEditPolicies() {
        // Allow parts to be joined together
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new CanvasConnectionPolicy());

        // Add a policy to handle deletion and orphaning
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new PartComponentEditPolicy());
        
        // Install a policy for DND support
        installEditPolicy("DND", new CanvasDNDEditPolicy()); //$NON-NLS-1$

        // Add these
        updateEditPolicies();
        
        // Orphaning
        installEditPolicy(EditPolicy.CONTAINER_ROLE, new BasicContainerEditPolicy());
        
        // Snap to Geometry feedback
        installEditPolicy("Snap Feedback", new SnapFeedbackPolicy()); //$NON-NLS-1$

        // Selection Feedback
        installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new ContainerHighlightEditPolicy());
    }
    
    @Override
    public void updateEditPolicies() {
        // Add a policy to handle directly editing the Part
        installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, isLocked() ? null : new CanvasBlockDirectEditTitlePolicy());

        // Install a custom layout policy that handles dragging things around and creating new objects
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new CanvasBlockLayoutPolicy());
    }

    @Override
    public IFigure getContentPane() {
        return ((IContainerFigure)getFigure()).getContentPane();
    }
    
    @Override
    protected void refreshFigure() {
        // Refresh the figure if necessary
        ((IDiagramModelObjectFigure)getFigure()).refreshVisuals();
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Class adapter) {
        if(adapter == SnapToHelper.class) {
            return new SnapEditPartAdapter(this).getSnapToHelper();
        }
        
        return super.getAdapter(adapter);
    }
    
    @Override
    public void performRequest(Request req) {
        if(req.getType() == RequestConstants.REQ_DIRECT_EDIT && !getModel().isLocked()) {
            createDirectEditManager().show();
        }
        else if(req.getType() == RequestConstants.REQ_OPEN) {
            // Show Properties view
            showPropertiesView();
        }
    }

    protected DirectEditManager createDirectEditManager() {
        return new MultiLineTextDirectEditManager(this);
    }
    
    /**
     * DirectEditPolicy
     */
    private class CanvasBlockDirectEditTitlePolicy extends DirectEditPolicy {
        @Override
        protected Command getDirectEditCommand(DirectEditRequest request) {
            String content = (String)request.getCellEditor().getValue();
            return new EObjectFeatureCommand(Messages.CanvasBlockEditPart_0, getModel(),
                        IZentaPackage.Literals.TEXT_CONTENT__CONTENT, content);
        }

        @Override
        protected void showCurrentEditValue(DirectEditRequest request) {
        }
    }
}
