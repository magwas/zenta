package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.controller.info.DiagramImageInfoProvider;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.DiagramImageEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;

public class DiagramImageUIProvider extends DiagramImageInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new DiagramImageEditPart();
    }
}
