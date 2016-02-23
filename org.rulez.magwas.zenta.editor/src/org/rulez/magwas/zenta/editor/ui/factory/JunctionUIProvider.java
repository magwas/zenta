package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.controller.info.JunctionInfoProvider;
import org.rulez.magwas.zenta.editor.diagram.editparts.junctions.JunctionEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;


public class JunctionUIProvider extends JunctionInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new JunctionEditPart();
    }

    @Override
    public Image getImage() {
        return IZentaUIImages.ImageFactory.getImage(getImageInfo());
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentaUIImages.ImageFactory.getImageDescriptor(getImageInfo());
    }

    @Override
    public Color getDefaultColor() {
        return ColorConstants.black;
    }
}
