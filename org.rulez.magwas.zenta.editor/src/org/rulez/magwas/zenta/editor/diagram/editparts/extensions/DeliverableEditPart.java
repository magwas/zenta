/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.extensions;

import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractArchimateEditableTextFlowEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.extensions.DeliverableFigure;


/**
 * Deliverable Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class DeliverableEditPart
extends AbstractArchimateEditableTextFlowEditPart {            
    
    @Override
    protected IFigure createFigure() {
        return new DeliverableFigure(getModel());
    }
 
}