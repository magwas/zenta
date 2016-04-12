package org.rulez.magwas.zenta.model.manager;

public abstract class ModelImage implements IModelImage {

	private Object backingImage;
	
	public ModelImage(Object image) {
		backingImage = image;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T adapt(Class<T> klass) throws IncompatibleClassException {
		if (! klass.isInstance(backingImage)) {
			throw new IncompatibleClassException();
		}
		return (T) backingImage;
	}
}
