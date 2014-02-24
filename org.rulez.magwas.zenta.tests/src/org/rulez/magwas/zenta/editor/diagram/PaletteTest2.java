package org.rulez.magwas.zenta.editor.diagram;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.jdt.annotation.NonNull;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullListIterator;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.TestModel;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class PaletteTest2 {

	@Test
	@HaveGUI(waitUser = false)
	public void All_bjectClasses_are_on_the_palette() {
		UITestWindow win = new UITestWindow();
		TestModel builder = new TestModel();
		builder.createFirstGeneration();
		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		builder.createThirdGenerationWithRelation();
		IEditorModelManager.INSTANCE.openModel(builder.getModel());
		
		ZentaDiagramEditor ed = (ZentaDiagramEditor) EditorManager.openDiagramEditor(builder.getTemplateDiagram());
		ZentaDiagramEditorPalette palette = ed.getPaletteRoot();
		PaletteContainer objectsgroup = palette._getObjectsGroup();
		assertNotNull(objectsgroup);
		@SuppressWarnings("unchecked")
		@NonNull
		List<PaletteEntry> children = Util.verifyNonNull(objectsgroup.getChildren());
		builder.assertMetaIsOK();
		IMetamodel mm = builder.getMetamodel();
		for (NonNullListIterator<IBasicObject> iterator = mm.getObjectClasses().iterator(); iterator
				.hasNext();) {
			@NonNull IBasicObject klass = iterator.next();
			assertTrue(ModelAndEditPartTestData.haveCreatorFor(klass, children));
		}
		win.showWindow();
	}

}
