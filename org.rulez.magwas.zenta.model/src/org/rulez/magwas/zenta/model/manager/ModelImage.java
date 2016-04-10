package org.rulez.magwas.zenta.model.manager;

public abstract class ModelImage implements IModelImage {

	private Object backedImage;
	
	public ModelImage(Object image) {
		backedImage = image;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T adapt(Class<T> klass) {
		return (T) backedImage;
	}
}
