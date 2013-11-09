/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.junctions;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.editparts.junctions.JunctionEditPart;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.editor.ui.factory.AbstractElementUIProvider;
import org.rulez.magwas.zenta.model.IZentamatePackage;



/**
 * Junction UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class JunctionUIProvider extends AbstractElementUIProvider {

    public EClass providerFor() {
        return IZentamatePackage.eINSTANCE.getJunction();
    }
    
    @Override
    public EditPart createEditPart() {
        return new JunctionEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.JunctionUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_JUNCTION_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_JUNCTION_16);
    }

    @Override
    public Color getDefaultColor() {
        return ColorConstants.black;
    }
}
