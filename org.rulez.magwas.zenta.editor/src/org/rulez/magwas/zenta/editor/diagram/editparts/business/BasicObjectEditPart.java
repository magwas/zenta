/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.business;

import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractZentaEditableTextFlowEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.business.BasicObjectFigure;


/**
 * Business Object Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class BasicObjectEditPart
extends AbstractZentaEditableTextFlowEditPart {
    
    @Override
    protected IFigure createFigure() {
        return new BasicObjectFigure(getModel());
    }
    
    public void shapeShift(String shapename) {
    	((BasicObjectFigure)this.getFigure()).setFigureShape(shapename);
    }
 
}