package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.NoteEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;
import org.rulez.magwas.zenta.model.info.NoteInfoProvider;

public class NoteUIProvider extends NoteInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new NoteEditPart();
    }

}
