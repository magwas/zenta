package org.rulez.magwas.zenta.integrationtests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.ViewManager;
import org.rulez.magwas.zenta.editor.views.tree.ITreeModelView;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class UITestUtils {

	public static IZentaModel openTestModel(String modelName) {
		File file = new File("resources",modelName);
		IEditorModelManager.INSTANCE.openModel(file);
		return IEditorModelManager.INSTANCE.getModels().get(0);
	}

	public static void focusOnElement(EObject element) {
		List<Object> elements = new ArrayList<Object>();
		elements.add(element);
		ITreeModelView treeView = (ITreeModelView)ViewManager.showViewPart(ITreeModelView.ID, false);
		assertNotNull(treeView);
        treeView.getViewer().setSelection(new StructuredSelection(elements), true);
	}

	public static IViewPart openView(String viewId) throws WorkbenchException,
			PartInitException {
		IWorkbenchWindow wbw = prepareWorkBenchWindow();
		IViewPart view = wbw.getActivePage().showView(viewId);
		return Util.verifyNonNull(view);
	}

	private static IWorkbenchWindow prepareWorkBenchWindow()
			throws WorkbenchException {
		String perspectiveId = "org.rulez.magwas.zenta.editor.perspectiveMain";
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow wbw = Util.verifyNonNull(workbench.getActiveWorkbenchWindow());
		workbench.showPerspective(perspectiveId, wbw);
		return wbw;
	}

	public static IEditorPart openEditor(String editorId, IEditorInput input) throws WorkbenchException {
		IWorkbenchWindow wbw = prepareWorkBenchWindow();
		IEditorPart view = wbw.getActivePage().openEditor(input, editorId);
		return Util.verifyNonNull(view);
	}

	@SuppressWarnings("null")
	public static void closeAllModels()
			throws IOException {
		NonNullList<IZentaModel> models = new NonNullArrayList<IZentaModel>(IEditorModelManager.INSTANCE.getModels());
		for(IZentaModel model : models) {
			assertTrue(IEditorModelManager.INSTANCE.closeModel(model));
		}
	}

}
