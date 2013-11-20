package org.rulez.magwas.zenta.tests.help.hints;

import static org.junit.Assert.*;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.junit.Test;
import org.rulez.magwas.zenta.help.hints.HintsView;
public class HintsViewTest {

	@Test
	public void testCreateFileMap() throws WorkbenchException {
		String viewId = "org.rulez.magwas.zenta.help.hintsView";
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow wbw = workbench.getActiveWorkbenchWindow();
		Shell shell = wbw.getShell();
		IViewPart view = wbw.getActivePage().showView(viewId);
		assertTrue(view instanceof HintsView);
		shell = new Shell();
		view.createPartControl(shell);
		//UITestUtils.waitUserIfNeeded(shell);
	}

}
