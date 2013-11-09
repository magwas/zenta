/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.business;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractArchimateEditableTextFlowEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.business.BusinessInterfaceFigure;
import org.rulez.magwas.zenta.model.IArchimatePackage;


/**
 * Business Interface Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class BusinessInterfaceEditPart
extends AbstractArchimateEditableTextFlowEditPart {
    
    @Override
    protected IFigure createFigure() {
        return new BusinessInterfaceFigure(getModel());
    }
    
    @Override
    protected ConnectionAnchor getDefaultConnectionAnchor() {
        switch(getModel().getType()) {
            case 1:
                return new EllipseAnchor(getFigure());

            default:
                return new ChopboxAnchor(getFigure());
        }
    }

    @Override
    protected void eCoreChanged(Notification msg) {
        super.eCoreChanged(msg);
        
        // Update Connection Anchors
        if(msg.getFeature() == IArchimatePackage.Literals.DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE) {
            refreshConnectionAnchors();
        }
    }

}