/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.extensions;

import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;


/**
 * Figure for a Driver
 * 
 * @author Phillip Beauvoir
 */
public class DriverFigure extends AbstractMotivationFigure {
    
    public DriverFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
    }

    @Override
    protected Image getImage() {
        return IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_DRIVER_16);
    }
}