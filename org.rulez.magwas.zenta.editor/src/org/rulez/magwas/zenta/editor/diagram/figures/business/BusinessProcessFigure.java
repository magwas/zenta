/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.business;

import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.IFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.RoundedRectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;




/**
 * Business Process Figure
 * 
 * @author Phillip Beauvoir
 */
public class BusinessProcessFigure
extends AbstractTextFlowFigure {
    
    protected RoundedRectangleFigureDelegate fFigureDelegate1;
    protected BusinessProcessFigureDelegate fFigureDelegate2;

    public BusinessProcessFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
        
        fFigureDelegate1 = new RoundedRectangleFigureDelegate(this);
        fFigureDelegate1.setImage(IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_PROCESS_16));
        
        fFigureDelegate2 = new BusinessProcessFigureDelegate(this);
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
