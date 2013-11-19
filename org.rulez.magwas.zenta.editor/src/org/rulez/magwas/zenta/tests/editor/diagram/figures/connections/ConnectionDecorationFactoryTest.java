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
	public void testFactoryExistence() {
		assertNotNull(factory);
	}

	@Test(expected=ConnectionDecorationFactory.IllagalShapeName.class)
	public void testNameCheck() {
		factory.getImageForName("invalidName");
	}

	@Test(expected=ConnectionDecorationFactory.IllagalShapeName.class)
	public void testNullNameCheck() {
		factory.getImageForName(null);
	}

	@Test
	@HaveGUI(waitUser=true)
	public void testImage() {
		Shell shell = new Shell();
		shell.setLayout(new FillLayout());
		UITestUtils.addTestControls(shell);
		Button but = new Button(shell,SWT.PUSH);
		Image image = factory.getImageForName("FlowConnectionDecoration");
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
