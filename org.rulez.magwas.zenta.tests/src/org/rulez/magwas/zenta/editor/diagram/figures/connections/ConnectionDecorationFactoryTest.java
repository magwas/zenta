package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import static org.junit.Assert.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.figures.connections.ConnectionDecorationFactory;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class ConnectionDecorationFactoryTest {

	private ConnectionDecorationFactory factory;
	private ModelAndEditPartTestData testdata;


	@Before
	public void setUp() {
		factory = ConnectionDecorationFactory.getInstance();
		testdata = new ModelAndEditPartTestData();
	}

	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
	}

	@Test
	public void The_factory_instance_can_be_obtained() {
		assertNotNull(factory);
	}

	@Test(expected=ConnectionDecorationFactory.IllagalShapeName.class)
	public void For_invalid_decoration_name_an_exception_is_thrown_when_getting_image() {
		factory.getImageForName("invalidName");
	}

	@Test(expected=ConnectionDecorationFactory.IllagalShapeName.class)
	public void When_decoration_name_is_null_an_exception_is_thrown() {
		factory.getImageForName(null);
	}

	@Test
	@HaveGUI(waitUser=false)
	public void The_getImage_method_returns_an_image_for_the_decoration() {
		UITestWindow win = new UITestWindow();
		Button but = new Button(win.getComposite(),SWT.PUSH);
		Image image = factory.getImageForName("DashedLineDecoration");
		but.setImage(image);
		but.pack();
		win.showWindow();
	}
}
