package org.rulez.magwas.zenta.editor.model.impl;

import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.model.manager.IModelImage;
import org.rulez.magwas.zenta.model.manager.ModelImage;

public class EditorModelImage extends ModelImage implements IModelImage {

	public EditorModelImage(Object image) {
		super(image);
	}

	@Override
	public Object getImageData() {
		return adapt(Image.class).getImageData();
	}


}
