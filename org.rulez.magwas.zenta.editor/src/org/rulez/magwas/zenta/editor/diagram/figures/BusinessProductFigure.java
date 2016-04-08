package org.rulez.magwas.zenta.editor.diagram.figures;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;


/**
 * Business Product Figure
 * 
 * @author Phillip Beauvoir
 */
public class BusinessProductFigure
extends AbstractFigureDelegate {
    
    protected int flangeFactor = 14;
    protected int SHADOW_OFFSET = 2;
    
    public BusinessProductFigure(IDiagramModelObjectFigure owner) {
        super(owner);
    }
    
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
        int middle = bounds.width / 2;
        graphics.setBackgroundColor(ColorFactory.getDarkerColor(getFillColor()));
        graphics.fillRectangle(bounds.x, bounds.y, middle + 1, flangeFactor);
        graphics.setBackgroundColor(getFillColor());
        graphics.fillRectangle(bounds.x + middle, bounds.y, middle, flangeFactor);
        
        // Main Fill
        graphics.fillRectangle(bounds.x, bounds.y + flangeFactor - 1, bounds.width, bounds.height - flangeFactor + 1);
        
        // Outline
        graphics.drawLine(bounds.x, bounds.y + flangeFactor - 1, bounds.x + middle, bounds.y + flangeFactor - 1);
        graphics.drawLine(bounds.x + middle, bounds.y + flangeFactor - 1, bounds.x + middle, bounds.y);
                
        bounds.width--;
        bounds.height--;
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
