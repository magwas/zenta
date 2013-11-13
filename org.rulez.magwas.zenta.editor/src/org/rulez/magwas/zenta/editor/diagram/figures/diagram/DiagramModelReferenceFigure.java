/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.diagram;

import org.eclipse.draw2d.IFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.ToolTipFigure;
import org.rulez.magwas.zenta.model.IDiagramModelObject;


/**
 * Figure for a Diagram Model Reference Figure
 * 
 * @author Phillip Beauvoir
 */
public class DiagramModelReferenceFigure
extends AbstractTextFlowFigure {
    
    public DiagramModelReferenceFigure(IDiagramModelObject diagramModelObject) {
        super(diagramModelObject);
                
        setFigureShape("diagramReferenceShape");
    }
    
    @Override
    public IFigure getToolTip() {
        ToolTipFigure tooltip = (ToolTipFigure)super.getToolTip();
        
        if(tooltip == null) {
            return null;
        }
        
        tooltip.setType(Messages.DiagramModelReferenceFigure_0);
        
        return tooltip;
    }
}