package org.rulez.magwas.zenta.model.manager;

public interface IModelImage {
	Object getImageData();
	<T> T adapt(Class<T> klass);
}
