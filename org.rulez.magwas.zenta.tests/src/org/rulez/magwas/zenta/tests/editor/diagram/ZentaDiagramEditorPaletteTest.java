package org.rulez.magwas.zenta.tests.editor.diagram;


import static org.junit.Assert.*;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.junit.Ignore;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditorPalette;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class ZentaDiagramEditorPaletteTest {

	private File file;
	private ModelTestData testdata;

	@Ignore
	@Test
	@HaveGUI(waitUser = true)
	public void havePalette() throws PartInitException, WorkbenchException {
		UITestWindow win = new UITestWindow();
		testdata = new ModelTestData();
		file = new File(testdata.resource.getURI().toFileString());
		//file = testdata.getModel().getFile();
		System.out.printf("opening from file %s\n",file);
        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {

			public void run() {
                testdata.model = IEditorModelManager.INSTANCE.openModel(file);
            }
        });
        
		EObject element = testdata.getById("2ea99535");
		assertNotNull(element);
		ZentaDiagramEditor editor = (ZentaDiagramEditor) EditorManager.openDiagramEditor((IDiagramModel)element);
		ZentaDiagramEditorPalette palette = editor.getPaletteRoot();
		
		PaletteContainer objectsgroup = palette._getObjectsGroup();
		assertNotNull(objectsgroup);
		
		//FIXME: for now all objectclasses are available through the objects group
		//TODO: total viewpoint contains all objectclasses, and diagram focus change des a setViewPoint to the palette.

		//UITestUtils.focusOnElement(element);
		win.resize(100, 100);
		//view.createPartControl(win.getComposite());
		win.showWindow();		
	}
}
