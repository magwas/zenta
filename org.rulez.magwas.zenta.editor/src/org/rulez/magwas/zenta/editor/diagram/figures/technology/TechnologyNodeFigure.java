/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.technology;

import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.IFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.RectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;


/**
 * Figure for a Technology Node
 * 
 * @author Phillip Beauvoir
 */
public class TechnologyNodeFigure
extends AbstractTextFlowFigure {
    
    protected IFigureDelegate fFigureDelegate1;
    protected RectangleFigureDelegate fFigureDelegate2;
    
    public TechnologyNodeFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
        
        fFigureDelegate1 = new TechnologyNodeFigureDelegate(this);
        
        fFigureDelegate2 = new RectangleFigureDelegate(this);
        fFigureDelegate2.setImage(IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_NODE_16));
    }
    
    @Override
    public void refreshVisuals() {
        super.refreshVisuals();
        repaint(); // redraw delegate
    }
    
    @Override
    public IFigureDelegate getFigureDelegate() {
        int type = ((IDiagramModelZentamateObject)getDiagramModelObject()).getType();
        return type == 0 ? fFigureDelegate1 : fFigureDelegate2;
    }
}