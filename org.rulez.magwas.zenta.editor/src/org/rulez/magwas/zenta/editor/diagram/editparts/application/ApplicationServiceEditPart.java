/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.application;

import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractZentamateEditableTextFlowEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.application.ApplicationServiceFigure;


/**
 * Application Service Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class ApplicationServiceEditPart
extends AbstractZentamateEditableTextFlowEditPart {            
    
    @Override
    protected IFigure createFigure() {
        return new ApplicationServiceFigure(getModel());
    }
 
}