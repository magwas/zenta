package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.controller.info.SketchStickyInfoProvider;
import org.rulez.magwas.zenta.editor.diagram.sketch.editparts.StickyEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;

public class SketchStickyUIProvider extends SketchStickyInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new StickyEditPart();
    }
}
