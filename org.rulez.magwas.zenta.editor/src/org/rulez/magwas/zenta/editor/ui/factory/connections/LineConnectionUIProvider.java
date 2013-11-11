/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.connections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.LineConnectionEditPart;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaPackage;



/**
 * Line Connection UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class LineConnectionUIProvider extends AbstractConnectionUIProvider {

    public EClass providerFor() {
        return IZentaPackage.eINSTANCE.getDiagramModelConnection();
    }
    
    @Override
    public EditPart createEditPart() {
        return new LineConnectionEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.LineConnectionUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IZentaImages.ImageFactory.getImage(IZentaImages.ICON_CONNECTION_PLAIN_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_CONNECTION_PLAIN_16);
    }
}
