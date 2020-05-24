package org.rulez.magwas.zenta.editor.propertysections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.INameable;

class ModelsViewerLabelProvider extends LabelProvider {
    @Override
    public String getText(Object element) {
        if(element instanceof INameable) {
            return ((INameable)element).getName();
        }
        return super.getText(element);
    }
    
    @Override
    public Image getImage(Object element) {
        return ZentaLabelProvider.INSTANCE.getImage((EObject) element);
    }
}