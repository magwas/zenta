package org.rulez.magwas.zenta.model.manager;

import java.util.List;

public interface IModelImageManager {
	public IModelImage createImage(String path) throws Exception;
    public IModelImage createImageFromData(byte[] bytes) throws UnknownImageFormatException;
    public IModelImage convertToModelImage(Object uiSpecificImage) throws UnknownImageFormatException;
	public List<String> getUsedImagePaths();
}
