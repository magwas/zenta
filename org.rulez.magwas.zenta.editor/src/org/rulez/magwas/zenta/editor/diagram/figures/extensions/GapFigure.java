/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.extensions;

import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.IArchimateImages;
import org.rulez.magwas.zenta.model.IDiagramModelArchimateObject;




/**
 * Gap Figure
 * 
 * @author Phillip Beauvoir
 */
public class GapFigure
extends DeliverableFigure {
    
    protected int SHADOW_OFFSET = 3;

    public GapFigure(IDiagramModelArchimateObject diagramModelObject) {
        super(diagramModelObject);
    }
    
    @Override
    public void drawFigure(Graphics graphics) {
        super.drawFigure(graphics);
        
    }

    @Override
    protected Image getImage() {
        return IArchimateImages.ImageFactory.getImage(IArchimateImages.ICON_GAP_16);
    }
    
}
