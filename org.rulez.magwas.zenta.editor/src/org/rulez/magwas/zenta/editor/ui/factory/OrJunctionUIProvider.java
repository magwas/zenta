package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.junctions.OrJunctionEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;
import org.rulez.magwas.zenta.model.info.OrJunctionInfoProvider;

public class OrJunctionUIProvider extends OrJunctionInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new OrJunctionEditPart();
    }
}
