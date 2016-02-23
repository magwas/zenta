package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.LineConnectionEditPart;
import org.rulez.magwas.zenta.model.info.LineConnectionInfoProvider;

public class LineConnectionUIProvider extends LineConnectionInfoProvider implements ConnectionUIProviderMixin {

    @Override
    public EditPart createEditPart() {
        return new LineConnectionEditPart();
    }
}
