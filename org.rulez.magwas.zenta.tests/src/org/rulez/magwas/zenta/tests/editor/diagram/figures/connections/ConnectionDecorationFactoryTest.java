package org.rulez.magwas.zenta.tests.editor.diagram.figures.connections;

import static org.junit.Assert.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.figures.connections.ConnectionDecorationFactory;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class ConnectionDecorationFactoryTest {

	private ConnectionDecorationFactory factory;

	@Test
	public void testTheFactoryInstanceCanBeObtained() {
		assertNotNull(factory);
	}

	@Test(expected=ConnectionDecorationFactory.IllagalShapeName.class)
	public void testForInvalidDecorationNameAnExceptionIsThrownWhenGettingImagek() {
		factory.getImageForName("invalidName");
	}

	@Test(expected=ConnectionDecorationFactory.IllagalShapeName.class)
	public void testWhenDecorationNameIsNullAnExceptionIsThrownk() {
		factory.getImageForName(null);
	}

	@Test
	@HaveGUI(waitUser=false)
	public void testGetImageReturnsAnImageForTheDecoration() {
		UITestWindow win = new UITestWindow();
		Button but = new Button(win.getComposite(),SWT.PUSH);
		Image image = factory.getImageForName("DashedLineDecoration");
		but.setImage(image);
		but.pack();
		win.showWindow();
	}

	@Before
	public void setUp() {
		factory = ConnectionDecorationFactory.getInstance();
	}
}
