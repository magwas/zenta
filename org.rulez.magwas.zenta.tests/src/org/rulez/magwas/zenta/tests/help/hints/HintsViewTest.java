package org.rulez.magwas.zenta.tests.help.hints;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.ViewManager;
import org.rulez.magwas.zenta.editor.views.tree.ITreeModelView;
import org.rulez.magwas.zenta.help.hints.HintsView;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.UITestWindow;
public class HintsViewTest {

	@Test
	@HaveGUI(waitUser = true)
	public void The_Hints_view_contains_useful_information_about_the_selected_object() throws WorkbenchException {
		UITestWindow win = new UITestWindow();
		String viewId = "org.rulez.magwas.zenta.help.hintsView";
		IViewPart view = openView(viewId);
		assertTrue(view instanceof HintsView);
		IZentaModel model = openTestModel("test.zenta");
		IFolder element = model.getFolders().get(0);
		focusOnElement(element);
        
		win.resize(100, 100);
		view.createPartControl(win.getComposite());
		win.showWindow();
	}

	private IZentaModel openTestModel(String modelName) {
		File file = new File("resources",modelName);
		IEditorModelManager.INSTANCE.openModel(file);
		return IEditorModelManager.INSTANCE.getModels().get(0);
	}

	private void focusOnElement(IFolder element) {
		List<Object> elements = new ArrayList<Object>();
		elements.add(element);
		ITreeModelView treeView = (ITreeModelView)ViewManager.showViewPart(ITreeModelView.ID, false);
        if(treeView != null) {
            treeView.getViewer().setSelection(new StructuredSelection(elements), true);
        }
	}

	private IViewPart openView(String viewId) throws WorkbenchException,
			PartInitException {
		String perspectiveId = "org.rulez.magwas.zenta.editor.perspectiveMain";
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow wbw = workbench.getActiveWorkbenchWindow();
		workbench.showPerspective(perspectiveId, wbw);
		IViewPart view = wbw.getActivePage().showView(viewId);
		return view;
	}

}
