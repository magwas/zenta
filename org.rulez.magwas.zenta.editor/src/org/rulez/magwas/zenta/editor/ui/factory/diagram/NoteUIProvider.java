/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.NoteEditPart;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.editor.ui.factory.AbstractElementUIProvider;
import org.rulez.magwas.zenta.model.IZentamatePackage;



/**
 * Note UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class NoteUIProvider extends AbstractElementUIProvider {

    public EClass providerFor() {
        return IZentamatePackage.eINSTANCE.getDiagramModelNote();
    }
    
    @Override
    public EditPart createEditPart() {
        return new NoteEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.NoteUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_NOTE_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_NOTE_16);
    }
}
