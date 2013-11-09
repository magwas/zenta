/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.extensions;

import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;




/**
 * Gap Figure
 * 
 * @author Phillip Beauvoir
 */
public class GapFigure
extends DeliverableFigure {
    
    protected int SHADOW_OFFSET = 3;

    public GapFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
    }
    
    @Override
    public void drawFigure(Graphics graphics) {
        super.drawFigure(graphics);
        
    }

    @Override
    protected Image getImage() {
        return IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_GAP_16);
    }
    
}
