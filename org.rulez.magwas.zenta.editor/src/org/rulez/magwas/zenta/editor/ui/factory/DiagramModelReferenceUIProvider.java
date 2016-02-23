package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.DiagramModelReferenceEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;
import org.rulez.magwas.zenta.model.info.DiagramModelReferenceInfoProvider;

public class DiagramModelReferenceUIProvider extends DiagramModelReferenceInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new DiagramModelReferenceEditPart();
    }
}
