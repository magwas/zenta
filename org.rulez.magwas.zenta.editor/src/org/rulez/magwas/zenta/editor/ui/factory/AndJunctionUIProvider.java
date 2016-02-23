package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.junctions.AndJunctionEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;
import org.rulez.magwas.zenta.model.info.AndJunctionInfoProvider;

public class AndJunctionUIProvider extends AndJunctionInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new AndJunctionEditPart();
    }
}
