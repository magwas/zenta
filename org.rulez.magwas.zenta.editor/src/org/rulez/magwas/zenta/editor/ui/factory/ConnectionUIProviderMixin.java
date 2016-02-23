package org.rulez.magwas.zenta.editor.ui.factory;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;

public interface ConnectionUIProviderMixin extends IElementUIProvider {
    
    default Color getDefaultColor() {
        return ColorConstants.black;
    }
}
