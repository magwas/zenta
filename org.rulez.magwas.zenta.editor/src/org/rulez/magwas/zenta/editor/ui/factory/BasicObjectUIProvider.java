
package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.business.BasicObjectEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;
import org.rulez.magwas.zenta.model.info.BasicObjectInfoProvider;

public class BasicObjectUIProvider extends  BasicObjectInfoProvider implements IElementUIProvider{

    @Override
    public EditPart createEditPart() {
        return new BasicObjectEditPart();
    }

}
