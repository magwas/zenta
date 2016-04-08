package org.rulez.magwas.zenta.editor.diagram.figures;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Figure for a Motiviation Element
 * 
 * @author Phillip Beauvoir
 */
public class AbstractMotivationFigure
extends AbstractFigureDelegate {
    
	public AbstractMotivationFigure(IDiagramModelObjectFigure owner) {
		super(owner);
	}

	protected int SHADOW_OFFSET = 3;
    protected int FLANGE = 10;
    protected int TEXT_INDENT = 20;
        
    @Override
    public void drawFigure(Graphics graphics) {
        graphics.pushState();
        
        Rectangle bounds = getBounds();
        
        PointList points = new PointList();
 
        int x = bounds.x;
        int y = bounds.y;
        int width = bounds.width - SHADOW_OFFSET;
        int height = bounds.height - SHADOW_OFFSET;
        
        points.addPoint(x + FLANGE, y);
        points.addPoint(x + width - FLANGE, y);
        points.addPoint(x + width, y + FLANGE);
        points.addPoint(x + width, y + height - FLANGE);
        points.addPoint(x + width - FLANGE, y + height);
        points.addPoint(x + FLANGE, y + height);
        points.addPoint(x, y + height - FLANGE);
        points.addPoint(x, y + FLANGE);

        if(isEnabled()) {
            // Shadow
            graphics.setAlpha(100);
            graphics.setBackgroundColor(ColorConstants.black);
            points.translate(SHADOW_OFFSET, SHADOW_OFFSET);
            graphics.fillPolygon(points);
            points.translate(-SHADOW_OFFSET, -SHADOW_OFFSET);
            graphics.setAlpha(255);
        }
        else {
            setDisabledState(graphics);
        }
        
        // Fill
        graphics.setBackgroundColor(getFillColor());
        graphics.fillPolygon(points);
        
        // Line
        graphics.setBackgroundColor(ColorConstants.black);
        graphics.drawPolygon(points);
                
        graphics.popState();
    }
    
    @Override
    public Rectangle calculateTextControlBounds() {
        Rectangle bounds = getBounds().getCopy();
        bounds.x += TEXT_INDENT - SHADOW_OFFSET;
        bounds.y += 5;
        bounds.width = bounds.width - (TEXT_INDENT * 2);
        bounds.height -= 10;
        return bounds;
    }

}