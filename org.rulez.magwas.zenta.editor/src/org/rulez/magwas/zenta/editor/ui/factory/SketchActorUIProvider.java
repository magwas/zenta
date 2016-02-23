package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.controller.info.SketchActorInfoProvider;
import org.rulez.magwas.zenta.editor.diagram.sketch.editparts.SketchActorEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;

public class SketchActorUIProvider extends SketchActorInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new SketchActorEditPart();
    }
}
