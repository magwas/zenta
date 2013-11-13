/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.diagram;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.model.IDiagramModelObject;


/**
 * Empty Figure
 * 
 * @author Phillip Beauvoir
 */
public class EmptyFigure
extends AbstractTextFlowFigure {
    
    public EmptyFigure(IDiagramModelObject diagramModelObject) {
        super(diagramModelObject);
        
        // Use a Rectangle Figure Delegate to Draw
        setFigureShape("emptyShape");
    }

    @Override
    public Color getFillColor() {
        return ColorConstants.white;
    }
}