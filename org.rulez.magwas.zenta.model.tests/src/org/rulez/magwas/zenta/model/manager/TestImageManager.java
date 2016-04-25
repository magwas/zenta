package org.rulez.magwas.zenta.model.manager;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

class TestImageManager implements IModelImageManager {

	List<String> usedImagePaths = new ArrayList<String>();
	private ByteArrayStorage storage;
	
	public TestImageManager(IArchiveManager archiveManager) {
		storage = archiveManager.getStorage();
	}

	@Override
	public IModelImage createImage(String path) throws Exception {
		BufferedImage img = null;
		if (storage.hasEntry(path)) {
			return createImageFromData(storage.getEntry(path));
		}
		usedImagePaths.add(path);
		img = ImageIO.read(new File(path));
		return new TestModelImage(img);
	}

	@Override
	public IModelImage createImageFromData(byte[] bytes) throws UnknownImageFormatException {
		InputStream is = new ByteArrayInputStream(bytes);
		BufferedImage img;
		try {
			img = ImageIO.read(is);
		} catch (Exception e) {
			throw new UnknownImageFormatException();
		}
		if (null == img) {
			throw new UnknownImageFormatException();
		}
		return new TestModelImage(img);
	}

	@Override
	public IModelImage convertToModelImage(Object uiSpecificImage) throws UnknownImageFormatException {
		throw new UnknownImageFormatException();
	}

	@Override
	public List<String> getUsedImagePaths() {
		return usedImagePaths;
	}
	
}