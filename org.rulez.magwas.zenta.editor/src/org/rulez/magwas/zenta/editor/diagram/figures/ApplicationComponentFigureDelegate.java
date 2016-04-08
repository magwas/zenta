package org.rulez.magwas.zenta.editor.diagram.figures;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;

/**
 * Figure for an Application Component
 * 
 * @author Phillip Beauvoir
 */
public class ApplicationComponentFigureDelegate extends AbstractFigureDelegate {
    
    protected int SHADOW_OFFSET = 2;
    protected int INDENT = 10;
    protected int TEXT_INDENT = 25;
    
    public ApplicationComponentFigureDelegate(IDiagramModelObjectFigure owner) {
        super(owner);
    }

    @Override
    public void drawFigure(Graphics graphics) {
        graphics.pushState();
        
        Rectangle bounds = getBounds();
        
        if(isEnabled()) {
            graphics.setAlpha(100);
            graphics.setBackgroundColor(ColorConstants.black);
            
            // Main Shadow
            graphics.fillRectangle(bounds.x + INDENT + SHADOW_OFFSET, bounds.y + SHADOW_OFFSET, bounds.width - SHADOW_OFFSET - INDENT, bounds.height - SHADOW_OFFSET);

            // Nubs Shadow
            graphics.fillRectangle(bounds.x + SHADOW_OFFSET, bounds.y + 10 + SHADOW_OFFSET, INDENT, 12);
            graphics.fillRectangle(bounds.x + SHADOW_OFFSET, bounds.y + 30 + SHADOW_OFFSET, INDENT, 12);
            
            graphics.setAlpha(255);
        }
        else {
            setDisabledState(graphics);
        }
        
        // Main Fill
        graphics.setBackgroundColor(getFillColor());
        graphics.fillRectangle(bounds.x + INDENT, bounds.y, bounds.width - SHADOW_OFFSET - INDENT, bounds.height - SHADOW_OFFSET);
        
        // Outline
        graphics.setForegroundColor(ColorConstants.black);
        PointList points = new PointList();
        Point pt1 = new Point(bounds.x + INDENT, bounds.y + 10);
        points.addPoint(pt1);
        Point pt2 = new Point(pt1.x, bounds.y);
        points.addPoint(pt2);
        Point pt3 = new Point(bounds.x + bounds.width - SHADOW_OFFSET - 1, bounds.y);
        points.addPoint(pt3);
        Point pt4 = new Point(pt3.x, bounds.y + bounds.height - SHADOW_OFFSET - 1);
        points.addPoint(pt4);
        Point pt5 = new Point(pt1.x, pt4.y);
        points.addPoint(pt5);
        Point pt6 = new Point(pt1.x, bounds.y + 42);
        points.addPoint(pt6);
        graphics.drawPolyline(points);
        graphics.drawLine(bounds.x + INDENT, bounds.y + 22, bounds.x + INDENT, bounds.y + 30);
        
        // Nubs Fill
        graphics.setBackgroundColor(ColorFactory.getDarkerColor(getFillColor()));
        graphics.fillRectangle(bounds.x, bounds.y + 10, INDENT * 2 + 1, 13);
        graphics.fillRectangle(bounds.x, bounds.y + 30, INDENT * 2 + 1, 13);
        
        // Nubs Outline
        graphics.setForegroundColor(ColorConstants.black);
        graphics.drawRectangle(bounds.x, bounds.y + 10, INDENT * 2, 12);
        graphics.drawRectangle(bounds.x, bounds.y + 30, INDENT * 2, 12);
        
        graphics.popState();
    }
    
    @Override
    public Rectangle calculateTextControlBounds() {
        Rectangle bounds = getBounds();
        bounds.x += TEXT_INDENT;
        bounds.y += 5;
        bounds.width -= 35;
        bounds.height -= 10;
        return bounds;
    }
}