/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.extensions;

import org.rulez.magwas.zenta.editor.diagram.figures.AbstractTextFlowFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.technology.TechnologyDeviceFigureDelegate2;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;




/**
 * Plateau Figure
 * 
 * @author Phillip Beauvoir
 */
public class PlateauFigure
extends AbstractTextFlowFigure {
    
    public PlateauFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
        
        TechnologyDeviceFigureDelegate2 figureDelegate = new TechnologyDeviceFigureDelegate2(this);
        figureDelegate.setImage(IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_PLATEAU_16));
        setFigureDelegate(figureDelegate);
    }
}
