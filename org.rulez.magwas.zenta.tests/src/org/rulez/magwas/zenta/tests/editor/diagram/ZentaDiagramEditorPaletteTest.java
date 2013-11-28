package org.rulez.magwas.zenta.tests.editor.diagram;


import static org.junit.Assert.*;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.junit.Ignore;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditorPalette;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class ZentaDiagramEditorPaletteTest {

	private ModelAndEditPartTestData testdata;

	@Ignore
	@Test
	@HaveGUI(waitUser = true)
	public void havePalette() throws PartInitException, WorkbenchException {
		UITestWindow win = new UITestWindow();
		testdata = new ModelAndEditPartTestData();
		EObject element = testdata.getById("2ea99535");
		assertNotNull(element);
		
		ZentaDiagramEditorPalette palette = testdata.editor.getPaletteRoot();
		
		PaletteContainer objectsgroup = palette._getObjectsGroup();
		assertNotNull(objectsgroup);
		
		List children = objectsgroup.getChildren();
		for ( Object kid : children)
			System.out.printf("\nkid=%s\n", kid);
		
		//FIXME: for now all objectclasses are available through the objects group
		//TODO: total viewpoint contains all objectclasses, and diagram focus change des a setViewPoint to the palette.

		//UITestUtils.focusOnElement(element);
		win.resize(100, 100);
		//view.createPartControl(win.getComposite());
		win.showWindow();		
		fail();
	}
}
