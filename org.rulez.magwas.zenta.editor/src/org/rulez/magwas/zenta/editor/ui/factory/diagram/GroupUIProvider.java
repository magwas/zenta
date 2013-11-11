/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.GroupEditPart;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.editor.ui.factory.AbstractElementUIProvider;
import org.rulez.magwas.zenta.model.IZentaPackage;



/**
 * Group UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class GroupUIProvider extends AbstractElementUIProvider {

    public EClass providerFor() {
        return IZentaPackage.eINSTANCE.getDiagramModelGroup();
    }
    
    @Override
    public EditPart createEditPart() {
        return new GroupEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.GroupUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IZentaImages.ImageFactory.getImage(IZentaImages.ICON_GROUP_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_GROUP_16);
    }

    @Override
    public Color getDefaultColor() {
        return ColorFactory.get(210, 215, 215);
    }
}
