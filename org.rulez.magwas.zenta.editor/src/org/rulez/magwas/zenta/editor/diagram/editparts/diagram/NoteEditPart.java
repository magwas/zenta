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
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.tools.DirectEditManager;
import org.rulez.magwas.zenta.editor.diagram.directedit.MultiLineTextDirectEditManager;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractConnectedEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.IColoredEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.ITextAlignedEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.diagram.NoteFigure;
import org.rulez.magwas.zenta.editor.diagram.policies.ZentamateDiagramConnectionPolicy;
import org.rulez.magwas.zenta.editor.diagram.policies.PartComponentEditPolicy;
import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModelNote;



/**
 * Note Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class NoteEditPart extends AbstractConnectedEditPart
implements IColoredEditPart, ITextAlignedEditPart {
    
    @Override
    protected void createEditPolicies() {
        // Allow parts to be connected
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ZentamateDiagramConnectionPolicy());
        
        // Add a policy to handle editing the Parts (for example, deleting a part)
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new PartComponentEditPolicy());
        
        installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new NoteDirectEditPolicy());
    }

    @Override
    protected IFigure createFigure() {
        NoteFigure figure = new NoteFigure((IDiagramModelNote)getModel());
        return figure;
    }

    @Override
    protected void refreshFigure() {
        ((IDiagramModelObjectFigure)figure).refreshVisuals();
    }

    @Override
    public void performRequest(Request req) {
        if(req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
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
    private class NoteDirectEditPolicy extends DirectEditPolicy {

        @Override
        protected Command getDirectEditCommand(DirectEditRequest request) {
            String content = (String)request.getCellEditor().getValue();
            return new EObjectFeatureCommand(Messages.NoteEditPart_0, getModel(),
                    IZentamatePackage.Literals.TEXT_CONTENT__CONTENT, content);
        }

        @Override
        protected void showCurrentEditValue(DirectEditRequest request) {
        }
    }
}
