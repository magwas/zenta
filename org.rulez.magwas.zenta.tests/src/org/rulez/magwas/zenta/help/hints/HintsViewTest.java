package org.rulez.magwas.zenta.help.hints;

import static org.junit.Assert.*;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.junit.Test;
import org.rulez.magwas.zenta.help.hints.HintsView;
import org.rulez.magwas.zenta.metamodel.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.UITestUtils;
import org.rulez.magwas.zenta.tests.UITestWindow;
public class HintsViewTest {

	@Test
	@HaveGUI(waitUser = false)
	public void The_Hints_view_contains_useful_information_about_the_selected_object() throws PartInitException, WorkbenchException {
		ModelAndMetaModelTestData data = new ModelAndMetaModelTestData();
		UITestWindow win = new UITestWindow();
		String viewId = "org.rulez.magwas.zenta.help.hintsView";
		IViewPart view = UITestUtils.openView(viewId);
		assertTrue(view instanceof HintsView);
		IFolder element = data.model.getFolders().get(0);
		UITestUtils.focusOnElement(element);
        
		win.resize(100, 100);
		view.createPartControl(win.getComposite());
		win.showWindow();
	}


}
