/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.extensions;

import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractZentamateEditableTextFlowEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.extensions.AssessmentFigure;


/**
 * Assessment Edit Part
 * 
 * @author Phillip Beauvoir
 */
public class AssessmentEditPart
extends AbstractZentamateEditableTextFlowEditPart {            
    
    @Override
    protected IFigure createFigure() {
        return new AssessmentFigure(getModel());
    }
 
}