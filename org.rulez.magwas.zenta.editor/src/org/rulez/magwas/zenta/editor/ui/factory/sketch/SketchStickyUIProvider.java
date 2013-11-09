/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.sketch;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.sketch.editparts.StickyEditPart;
import org.rulez.magwas.zenta.editor.ui.IArchimateImages;
import org.rulez.magwas.zenta.editor.ui.factory.AbstractElementUIProvider;
import org.rulez.magwas.zenta.model.IArchimatePackage;



/**
 * Sketch Sticky UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class SketchStickyUIProvider extends AbstractElementUIProvider {

    public EClass providerFor() {
        return IArchimatePackage.eINSTANCE.getSketchModelSticky();
    }
    
    @Override
    public EditPart createEditPart() {
        return new StickyEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.SketchStickyUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IArchimateImages.ImageFactory.getImage(IArchimateImages.ICON_STICKY_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IArchimateImages.ImageFactory.getImageDescriptor(IArchimateImages.ICON_STICKY_16);
    }
}
