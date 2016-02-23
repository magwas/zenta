package org.rulez.magwas.zenta.editor.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.controller.IElementInfoProvider;

public interface IElementUIProvider extends IElementInfoProvider, IEditorLabelProvider {
    
    EditPart createEditPart();
    
    default Image getImage(EObject instance) {
        return getImage();
    }
    
    default Color getDefaultColor() {
        return ColorFactory.get(getDefaultColorString());
    }
    
    default Image getImage() {
        return IZentaUIImages.ImageFactory.getImage(getImageInfo());
    }

    default ImageDescriptor getImageDescriptor() {
        return IZentaUIImages.ImageFactory.getImageDescriptor(getImageInfo());
    }

}
