/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.business;

import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractZentaEditableTextFlowEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.business.BusinessObjectFigure;


/**
 * Business Object Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class BusinessObjectEditPart
extends AbstractZentaEditableTextFlowEditPart {            
    
    @Override
    protected IFigure createFigure() {
        return new BusinessObjectFigure(getModel());
    }
 
}