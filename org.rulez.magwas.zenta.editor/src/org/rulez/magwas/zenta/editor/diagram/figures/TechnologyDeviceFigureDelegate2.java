package org.rulez.magwas.zenta.editor.diagram.figures;


import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Technology Device Figure Delegate 2
 * 
 * @author Phillip Beauvoir
 */
public class TechnologyDeviceFigureDelegate2 extends TechnologyNodeFigureDelegate {

    public TechnologyDeviceFigureDelegate2(IDiagramModelObjectFigure owner) {
        super(owner);
    }
    
    @Override
    public Point calculateImageLocation() {
        Rectangle bounds = getBounds();
        return new Point(bounds.x + bounds.width - FOLD_HEIGHT * 2 - 5, bounds.y + FOLD_HEIGHT + 2);
    }

}
