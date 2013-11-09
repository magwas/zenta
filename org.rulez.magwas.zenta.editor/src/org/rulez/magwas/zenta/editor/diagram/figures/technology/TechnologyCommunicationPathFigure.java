/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.technology;

import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.RectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;




/**
 * Technology Communication Path Figure
 * 
 * @author Phillip Beauvoir
 */
public class TechnologyCommunicationPathFigure
extends AbstractTextFlowFigure {

    public TechnologyCommunicationPathFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
        
        // Use a Rectangle Figure Delegate to Draw
        RectangleFigureDelegate figureDelegate = new RectangleFigureDelegate(this);
        figureDelegate.setImage(IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_COMMUNICATION_PATH_16));
        setFigureDelegate(figureDelegate);
    }
}
