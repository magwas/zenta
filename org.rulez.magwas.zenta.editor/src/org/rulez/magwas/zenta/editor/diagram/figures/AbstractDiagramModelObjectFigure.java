/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.FontFactory;
import org.rulez.magwas.zenta.editor.utils.PlatformUtils;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.util.StringUtils;



/**
 * Abstract Figure for containing a IDiagramModelObject
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractDiagramModelObjectFigure extends Figure
implements IDiagramModelObjectFigure {
    
    private IDiagramModelObject fDiagramModelObject;
    
    private Color fFillColor;
    private Color fFontColor;
    
    
    public AbstractDiagramModelObjectFigure(IDiagramModelObject diagramModelObject){
        fDiagramModelObject = diagramModelObject;
        setUI();
    }
    
    public IDiagramModelObject getDiagramModelObject() {
        return fDiagramModelObject;
    }
    
    private IFigureDelegate delegate;
    public IFigureDelegate getFigureDelegate() {
		return delegate;
    }
    
    public void setFigureShape(String shape) {
    	boolean isenabled = true;
    	if(delegate != null) {
        	isenabled = delegate.isEnabled();
    	}
        delegate = org.rulez.magwas.zenta.editor.ui.FigureFactory.getDelegate(shape, this);
        delegate.setEnabled(isenabled);
    }
    
    /**
     * Draw the figure.
     * The default behaviour is to delegate to the Figure Delegate if one is set.
     * @param graphics
     */
    protected void drawFigure(Graphics graphics) {
        if(getFigureDelegate() != null) {
            getFigureDelegate().drawFigure(graphics);
        }
    }
    
    /**
     * Set the drawing state when disabled
     * @param graphics
     */
    protected void setDisabledState(Graphics graphics) {
        graphics.setAlpha(100);
        graphics.setLineStyle(SWT.LINE_DOT);
    }

    /**
     * Set the UI
     */
    abstract protected void setUI();
    
    /**
     * Set the font to that in the model, or failing that, as per user's default
     */
    protected void setFont() {
        String fontName = fDiagramModelObject.getFinalFont();
        setFont(FontFactory.get(fontName));
        
        // Need to do this after font change
        if(getTextControl() != null) {
            getTextControl().revalidate();
        }
    }
    
    @Override
    public void setFont(Font f) {
        if(PlatformUtils.isWindows()) {
            f = FontFactory.getAdjustedWindowsFont(f);
        }
        
        super.setFont(f);
    }
    
    /**
     * Set the fill color to that in the model, or failing that, as per default
     */
    protected void setFillColor() {
        String val = fDiagramModelObject.getFinalFillColor();
        Color c = ColorFactory.get(val);
        if(c != fFillColor) {
            fFillColor = c;
            repaint();
        }
    }
    
    /**
     * @return The Fill Color to use
     */
    public Color getFillColor() {
        if(fFillColor == null) {
            return ColorFactory.getDefaultFillColor(fDiagramModelObject);
        }
        return fFillColor;
    }
    
    /**
     * Set the font color to that in the model, or failing that, as per default
     */
    protected void setFontColor() {
        String val = fDiagramModelObject.getFinalFontColor();
        Color c = ColorFactory.get(val);
        if(c != fFontColor) {
            fFontColor = c;
            if(getTextControl() != null) {
                getTextControl().setForegroundColor(c);
            }
        }
    }
    
    @Override
    public IFigure getToolTip() {
        ToolTipFigure toolTipFigure = (ToolTipFigure)super.getToolTip();
        if(toolTipFigure == null && Preferences.doShowViewTooltips()) {
            setToolTip(new ToolTipFigure());
            toolTipFigure = (ToolTipFigure) super.getToolTip();
        }
        
        if(toolTipFigure == null || !Preferences.doShowViewTooltips()) {
            return null;
        }

        String text = ZentaLabelProvider.INSTANCE.getLabel(getDiagramModelObject());
        toolTipFigure.setText(text);
        
        if(fDiagramModelObject instanceof IDiagramModelZentaObject) {
        	IBasicObject element = (IBasicObject) ((IDiagramModelZentaObject) fDiagramModelObject).getZentaElement();
            String name = ZentaLabelProvider.INSTANCE.getDefaultName(element.eClass());
            if(!StringUtils.isSet(text)) { // Name was blank
                toolTipFigure.setText(name);
            }
            String typeName = element.getName();
            toolTipFigure.setType(Messages.AbstractDiagramModelObjectFigure_0 + " " + typeName); //$NON-NLS-1$
        }

        return toolTipFigure;
    }

    public boolean didClickTextControl(Point requestLoc) {
        IFigure figure = getTextControl();
        if(figure != null) {
            figure.translateToRelative(requestLoc);
            return figure.containsPoint(requestLoc);
        }
        return false;
    }
    
    public void dispose() {
    }
}