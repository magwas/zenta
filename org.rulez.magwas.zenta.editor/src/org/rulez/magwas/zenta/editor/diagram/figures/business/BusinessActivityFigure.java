/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.business;

import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.RoundedRectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;




/**
 * Business Activity Figure
 * 
 * @author Phillip Beauvoir
 */
public class BusinessActivityFigure
extends AbstractTextFlowFigure {
    
    public BusinessActivityFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
        
        // Use a Rounded Rectangle Figure Delegate to Draw
        RoundedRectangleFigureDelegate figureDelegate = new RoundedRectangleFigureDelegate(this);
        figureDelegate.setImage(IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_ACTIVITY_16));
        setFigureDelegate(figureDelegate);
    }
}