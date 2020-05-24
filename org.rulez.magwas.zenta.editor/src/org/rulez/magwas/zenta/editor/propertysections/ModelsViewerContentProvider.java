package org.rulez.magwas.zenta.editor.propertysections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.manager.IArchiveManager;

class ModelsViewerContentProvider implements IStructuredContentProvider {
    @Override
    public void dispose() {
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

    @Override
    public Object[] getElements(Object inputElement) {
        List<Object> list = new ArrayList<Object>();
        
        for(IZentaModel model : IEditorModelManager.INSTANCE.getModels()) {
            IArchiveManager archiveManager = IEditorModelManager.INSTANCE.obtainArchiveManager(model);
            if(archiveManager.hasImages()) {
                list.add(model);
            }
        }
        
        list.add(ImageManagerDialog.OPEN);

        return list.toArray();
    }
}