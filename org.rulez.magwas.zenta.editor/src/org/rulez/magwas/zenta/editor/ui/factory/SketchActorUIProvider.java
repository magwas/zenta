package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.editor.diagram.sketch.editparts.SketchActorEditPart;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;
import org.rulez.magwas.zenta.model.info.SketchActorInfoProvider;

public class SketchActorUIProvider extends SketchActorInfoProvider implements IElementUIProvider {

    @Override
    public EditPart createEditPart() {
        return new SketchActorEditPart();
    }
}
