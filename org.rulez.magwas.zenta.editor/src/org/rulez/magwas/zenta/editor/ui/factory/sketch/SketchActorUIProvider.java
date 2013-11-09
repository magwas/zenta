/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.sketch;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.sketch.editparts.SketchActorEditPart;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.editor.ui.factory.AbstractElementUIProvider;
import org.rulez.magwas.zenta.model.IZentamatePackage;



/**
 * Sketch Actor UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class SketchActorUIProvider extends AbstractElementUIProvider {

    public EClass providerFor() {
        return IZentamatePackage.eINSTANCE.getSketchModelActor();
    }
    
    @Override
    public EditPart createEditPart() {
        return new SketchActorEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.SketchActorUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_ACTOR_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_ACTOR_16);
    }

    @Override
    public Color getDefaultColor() {
        return ColorConstants.black;
    }
}
