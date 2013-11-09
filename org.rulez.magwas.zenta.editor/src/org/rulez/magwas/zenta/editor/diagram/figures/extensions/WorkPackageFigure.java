/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.extensions;

import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.RoundedRectangleFigureDelegate;
import org.rulez.magwas.zenta.model.IDiagramModelArchimateObject;




/**
 * Work Package Figure
 * 
 * @author Phillip Beauvoir
 */
public class WorkPackageFigure
extends AbstractTextFlowFigure {

    public WorkPackageFigure(IDiagramModelArchimateObject diagramModelObject) {
        super(diagramModelObject);
        
        // Use a Rounded Rectangle Figure Delegate to Draw
        RoundedRectangleFigureDelegate figureDelegate = new RoundedRectangleFigureDelegate(this);
        figureDelegate.setArc(10);
        setFigureDelegate(figureDelegate);
    }
}
