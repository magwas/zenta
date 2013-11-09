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
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.DiagramModelReferenceEditPart;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.editor.ui.factory.AbstractElementUIProvider;
import org.rulez.magwas.zenta.model.IZentamatePackage;



/**
 * Diagram Model Reference UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class DiagramModelReferenceUIProvider extends AbstractElementUIProvider {

    public EClass providerFor() {
        return IZentamatePackage.eINSTANCE.getDiagramModelReference();
    }
    
    @Override
    public EditPart createEditPart() {
        return new DiagramModelReferenceEditPart();
    }

    @Override
    public String getDefaultName() {
        return Messages.DiagramModelReferenceUIProvider_0;
    }

    @Override
    public Image getImage() {
        return IZentamateImages.ImageFactory.getImage(IZentamateImages.ICON_DIAGRAM_16);
    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_DIAGRAM_16);
    }

    @Override
    public Color getDefaultColor() {
        return ColorFactory.get(220, 235, 235);
    }
}
