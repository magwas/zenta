package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.controller.info.DiagramModelReferenceInfoProvider;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.DiagramModelReferenceEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;

public class DiagramModelReferenceUIProvider extends DiagramModelReferenceInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new DiagramModelReferenceEditPart();
    }
}
