package org.rulez.magwas.zenta.tests.editor.diagram.figures.connections;

import static org.junit.Assert.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.figures.connections.ConnectionDecorationFactory;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.UITestUtils;

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
		Shell shell = new Shell();
		shell.setLayout(new FillLayout());
		UITestUtils.addTestControls(shell);
		Button but = new Button(shell,SWT.PUSH);
		Image image = factory.getImageForName("DashedLineDecoration");
		but.setImage(image);
		run(shell);
	}

	private void run(Shell shell) {
		shell.pack();
		shell.open();
		UITestUtils.waitUserIfNeeded(shell);
	}

	@Before
	public void setUp() {
		factory = ConnectionDecorationFactory.getInstance();
	}
}
