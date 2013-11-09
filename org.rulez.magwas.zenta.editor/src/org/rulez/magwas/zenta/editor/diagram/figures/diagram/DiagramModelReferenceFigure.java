/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.diagram;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.RectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.ToolTipFigure;
import org.rulez.magwas.zenta.editor.ui.ZentamateLabelProvider;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelReference;


/**
 * Figure for a Diagram Model Reference Figure
 * 
 * @author Phillip Beauvoir
 */
public class DiagramModelReferenceFigure
extends AbstractTextFlowFigure {
    
    public DiagramModelReferenceFigure(IDiagramModelObject diagramModelObject) {
        super(diagramModelObject);
        
        // Use a Rectangle Figure Delegate to Draw
        RectangleFigureDelegate figureDelegate = new RectangleFigureDelegate(this) {
            @Override
            public Image getImage() {
                IDiagramModel dm = ((IDiagramModelReference)getDiagramModelObject()).getReferencedModel();
                return dm == null ? IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_DIAGRAM_16) : ZentamateLabelProvider.INSTANCE.getImage(dm.eClass());
            }
        };
        
        setFigureDelegate(figureDelegate);
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