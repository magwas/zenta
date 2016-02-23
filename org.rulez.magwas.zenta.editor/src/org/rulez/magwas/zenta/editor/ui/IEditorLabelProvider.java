package org.rulez.magwas.zenta.editor.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.model.info.IInfoProvider;

public interface IEditorLabelProvider extends IInfoProvider {

    Image getImage(EObject element);
}
