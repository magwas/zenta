package org.rulez.magwas.zenta.editor.diagram.figures;

import java.util.Set;

import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.ui.FigureFactory;
import org.rulez.magwas.zenta.integrationtests.ModelAndEditPartTestData;

public class FigureShapeTest {

	private IFigure figure;
	private Set<String> names;
	private ModelAndEditPartTestData testData;

	@Before
	public void setUp() {
		testData = new ModelAndEditPartTestData();
		figure = testData.getAFigure();
		names = FigureFactory.getFigureNames();
	}

	@Test
	public void testGetImageForName() {
		for (String name : names) {
			Image img = FigureFactory.getImageForName(name);
			saveImage(img,name);
		}
	}

	@Test(expected=RuntimeException.class)
	public void getImageForName_throws_exception_for_illegal_name(){
		FigureFactory.getImageForName("foo");
	}

	private Image saveImage(Image image,String name) {
		ImageLoader loader = new ImageLoader();
	    loader.data = new ImageData[] {image.getImageData()};
		loader.save("generated-images/"+name+".png", SWT.IMAGE_PNG);
		return image;
	}

	@Test
	public void testCheckShapeValue() {
		for (String name : names) {
			FigureFactory.checkShapeValue(name);
		}
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCheckShapeValue_throws_exception_for_bad_name() {
		FigureFactory.checkShapeValue("foo");
	}

	@Test
	public void testGetDelegate() {
		for (String name : names) {
			FigureFactory.getDelegate(name, (AbstractDiagramModelObjectFigure) figure);
		}
	}

	@Test(expected=RuntimeException.class)
	public void getDelegate_throws_exception_for_illegal_name(){
		FigureFactory.getDelegate("foo", (AbstractDiagramModelObjectFigure) figure);
	}

}

