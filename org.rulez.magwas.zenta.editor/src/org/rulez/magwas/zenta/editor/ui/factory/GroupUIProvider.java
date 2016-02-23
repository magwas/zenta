/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.controller.info.GroupInfoProvider;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.GroupEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;

public class GroupUIProvider extends GroupInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new GroupEditPart();
    }
}
