/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.business;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.editparts.business.BasicObjectEditPart;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;



/**
 * Business Object UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class BasicObjectUIProvider extends AbstractBusinessUIProvider {

    public EClass providerFor() {
        return IZentaPackage.eINSTANCE.getBasicObject();
    }
    
    @Override
    public EditPart createEditPart() {
        return new BasicObjectEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.BasicObjectUIProvider_0;
    }

    @Override
    public String getDefaultShortName() {
        return Messages.BasicObjectUIProvider_1;
    }

    @Override
    public Image getImage() {
        return IZentaImages.ImageFactory.getImage(IZentaImages.ICON_BUSINESS_OBJECT_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_BUSINESS_OBJECT_16);
    }
}
