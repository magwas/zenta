package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.controller.info.BasicConnectionInfoProvider;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;

public class BasicConnectionUIProvider extends BasicConnectionInfoProvider implements ConnectionUIProviderMixin {

    @Override
    public EditPart createEditPart() {
        return new BasicConnectionEditPart();
    }
}
