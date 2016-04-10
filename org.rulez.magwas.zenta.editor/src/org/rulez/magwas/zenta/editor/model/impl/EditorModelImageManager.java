package org.rulez.magwas.zenta.editor.model.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.manager.BadPathForImage;
import org.rulez.magwas.zenta.model.manager.ByteArrayStorage;
import org.rulez.magwas.zenta.model.manager.IArchiveManager;
import org.rulez.magwas.zenta.model.manager.IModelImage;
import org.rulez.magwas.zenta.model.manager.IModelImageManager;
import org.rulez.magwas.zenta.model.manager.UnknownImageFormatException;

public class EditorModelImageManager implements IModelImageManager {

	private ByteArrayStorage storage;

	public EditorModelImageManager(IArchiveManager archiveManager) {
		storage = archiveManager.getStorage();
	}

	@Override
	public IModelImage createImage(String path) throws Exception {
        if(storage.hasEntry(path)) {
            Image swtImage = new Image(Display.getCurrent(), storage.getInputStream(path));
			return new EditorModelImage(swtImage);
        }
        throw new BadPathForImage();
	}

	@Override
	public IModelImage createImageFromData(byte[] bytes) throws UnknownImageFormatException {
		Image swtImage = new Image(Display.getCurrent(), new ByteArrayInputStream(bytes));
		return new EditorModelImage(swtImage);
	}

	@Override
	public IModelImage convertToModelImage(Object uiSpecificImage) throws UnknownImageFormatException {
		return new EditorModelImage(uiSpecificImage);
	}

	@Override
    public List<String> getUsedImagePaths() {
        // Gather all image paths that are in use in other models
        List<String> allPathsInUse = new ArrayList<String>();

        for(IZentaModel model : IEditorModelManager.INSTANCE.getModels()) {
            IArchiveManager archiveManager = (IArchiveManager)model.getAdapter(IArchiveManager.class);
            if(null != archiveManager)
                for(String imagePath : archiveManager.getLoadedImagePaths()) {
                    if(!allPathsInUse.contains(imagePath)) {
                        allPathsInUse.add(imagePath);
                    }
            }
        }
        
        return allPathsInUse;
    }

}
