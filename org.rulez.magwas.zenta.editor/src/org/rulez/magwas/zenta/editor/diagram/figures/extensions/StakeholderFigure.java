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
 * Figure for a Stakeholder
 * 
 * @author Phillip Beauvoir
 */
public class StakeholderFigure extends AbstractMotivationFigure {
    
    public StakeholderFigure(IDiagramModelZentamateObject diagramModelObject) {
        super(diagramModelObject);
    }

    @Override
    protected Image getImage() {
        return IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_ROLE_16);
    }
}