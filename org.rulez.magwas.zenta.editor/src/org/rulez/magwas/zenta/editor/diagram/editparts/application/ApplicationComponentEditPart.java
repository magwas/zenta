/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.application;

import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractZentamateEditableTextFlowEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.application.ApplicationComponentFigure;


/**
 * Application Component Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class ApplicationComponentEditPart
extends AbstractZentamateEditableTextFlowEditPart {
    
    @Override
    protected IFigure createFigure() {
        return new ApplicationComponentFigure(getModel());
    }
    
}