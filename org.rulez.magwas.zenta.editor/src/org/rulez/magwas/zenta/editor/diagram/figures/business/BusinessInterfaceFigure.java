/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.business;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.EllipseFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.IFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.RectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IInterfaceElement;


/**
 * Figure for a Business Interface
 * 
 * @author Phillip Beauvoir
 */
public class BusinessInterfaceFigure
extends AbstractTextFlowFigure {
    
    protected IFigureDelegate fRectangleDelegate, fEllipseDelegate;
    
    public BusinessInterfaceFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
        
        fRectangleDelegate = new RectangleFigureDelegate(this) {
            @Override
            public Image getImage() {
                IInterfaceElement element = (IInterfaceElement)((IDiagramModelZentamateObject)getDiagramModelObject()).getZentamateElement();
                return element.getInterfaceType() == IInterfaceElement.PROVIDED ? IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_INTERFACE_16)
                        : IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_INTERFACE_REQUIRED_16);
            }
        };
        
        fEllipseDelegate = new EllipseFigureDelegate(this);
    }
    
    @Override
    public void refreshVisuals() {
        super.refreshVisuals();
        repaint(); // redraw icon and delegate
    }
    
    @Override
    public IFigureDelegate getFigureDelegate() {
        int type = ((IDiagramModelZentamateObject)getDiagramModelObject()).getType();
        return type == 0 ? fRectangleDelegate : fEllipseDelegate;
    }
    
    @Override
    public Dimension getDefaultSize() {
        int type = ((IDiagramModelZentamateObject)getDiagramModelObject()).getType();
        return type == 0 ? super.getDefaultSize() : new Dimension(60, 60);
    }
}