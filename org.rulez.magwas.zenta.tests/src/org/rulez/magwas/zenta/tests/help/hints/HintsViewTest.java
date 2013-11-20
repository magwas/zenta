package org.rulez.magwas.zenta.tests.help.hints;

import static org.junit.Assert.*;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.junit.Test;
import org.rulez.magwas.zenta.help.hints.HintsView;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.UITestWindow;
public class HintsViewTest {

	@Test
	@HaveGUI(waitUser = false)
	public void testCreateFileMap() throws WorkbenchException {
		String viewId = "org.rulez.magwas.zenta.help.hintsView";
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow wbw = workbench.getActiveWorkbenchWindow();
		IViewPart view = wbw.getActivePage().showView(viewId);
		assertTrue(view instanceof HintsView);
		UITestWindow win = new UITestWindow();
		view.createPartControl(win.getComposite());
		win.showWindow();
	}

}
