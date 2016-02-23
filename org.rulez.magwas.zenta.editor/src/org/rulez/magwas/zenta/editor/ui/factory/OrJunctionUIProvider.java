package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.controller.info.OrJunctionInfoProvider;
import org.rulez.magwas.zenta.editor.diagram.editparts.junctions.OrJunctionEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;

public class OrJunctionUIProvider extends OrJunctionInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new OrJunctionEditPart();
    }
}
