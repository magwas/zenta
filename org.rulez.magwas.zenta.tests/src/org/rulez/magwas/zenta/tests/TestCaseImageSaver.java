package org.rulez.magwas.zenta.tests;

import java.io.File;
import java.lang.reflect.Method;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;

public class TestCaseImageSaver {

	public static void save(Method method,Composite composite) {
		Image image = createImageFromWidget(composite);
		saveWidgetToFile(method, image);
	    image.dispose();
	}
		private static Image createImageFromWidget(Composite composite) {
			Rectangle compoRectangle=composite.getBounds();
			Image image = new Image(composite.getDisplay(),compoRectangle);
			GC imageGC = new GC(image);
			composite.print(imageGC);
			return image;
		}
		private static void saveWidgetToFile(Method method, Image image) {
			String name = method.getName();
			ImageLoader loader = new ImageLoader();
		    loader.data = new ImageData[] {image.getImageData()};
			String fileName = constructImageFileName(name);
			loader.save(fileName, SWT.IMAGE_PNG);
		}
			private static String constructImageFileName(String name) {
				File dir = new File("generated-images");
				if (!dir.exists())
					throw new TestsShouldRunWithSourceRootAsCWD();
			    String filename = String.format("%s.png",name);
			    return new File(dir,filename).getPath();
			}
				public static class TestsShouldRunWithSourceRootAsCWD extends RuntimeException {
					private static final long serialVersionUID = 1L;
				}

}
