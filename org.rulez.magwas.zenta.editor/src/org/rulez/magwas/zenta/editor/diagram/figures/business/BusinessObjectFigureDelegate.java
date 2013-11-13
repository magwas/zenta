package org.rulez.magwas.zenta.editor.diagram.figures.business;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.RectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;

public class BusinessObjectFigureDelegate extends RectangleFigureDelegate {
    public BusinessObjectFigureDelegate(IDiagramModelObjectFigure owner) {
		super(owner);
	}

	protected int flangeFactor = 14;

    @Override
    public void drawFigure(Graphics graphics) {
        graphics.pushState();
        
        Rectangle bounds = getBounds();
        
        if(isEnabled()) {
            // Shadow
            graphics.setAlpha(100);
            graphics.setBackgroundColor(ColorConstants.black);
            graphics.fillRectangle(new Rectangle(bounds.x + SHADOW_OFFSET, bounds.y + SHADOW_OFFSET, bounds.width - SHADOW_OFFSET, bounds.height - SHADOW_OFFSET));
            graphics.setAlpha(255);
        }
        else {
            setDisabledState(graphics);
        }
        
        bounds.width -= SHADOW_OFFSET;
        bounds.height -= SHADOW_OFFSET;
        
        // Top bit
        graphics.setBackgroundColor(ColorFactory.getDarkerColor(getFillColor()));
        graphics.fillRectangle(bounds.x, bounds.y, bounds.width, flangeFactor);
        
        // Main Fill
        graphics.setBackgroundColor(getFillColor());
        graphics.fillRectangle(bounds.x, bounds.y + flangeFactor - 1, bounds.width, bounds.height - flangeFactor + 1);
        
        // Outline
        bounds.width--;
        bounds.height--;
        graphics.drawLine(bounds.x, bounds.y + flangeFactor - 1, bounds.x + bounds.width, bounds.y + flangeFactor - 1);
        graphics.setForegroundColor(ColorConstants.black);
        graphics.drawRectangle(bounds);
        
        graphics.popState();
    }
    
    @Override
    public Rectangle calculateTextControlBounds() {
        Rectangle bounds = super.calculateTextControlBounds();
        bounds.y += flangeFactor - 4;
        bounds.height -= 10;
        return bounds;
    }

}
