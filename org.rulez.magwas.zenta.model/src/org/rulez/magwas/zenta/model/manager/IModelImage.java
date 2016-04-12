package org.rulez.magwas.zenta.model.manager;

public interface IModelImage {
	Object getImageData() throws Exception;
	<T> T adapt(Class<T> klass) throws IncompatibleClassException;
}
