package org.rulez.magwas.zenta.editor.diagram;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullListIterator;
import org.rulez.magwas.zenta.integrationtests.HaveGUI;
import org.rulez.magwas.zenta.integrationtests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.integrationtests.UITestWindow;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class PaletteTest2 extends EditorTest {

	@Test
	@HaveGUI(waitUser = false)
	public void All_bjectClasses_are_on_the_palette() {
		ZentaDiagramEditor ed = openDiagramEditorWithFirstGeneration();

		UITestWindow win = new UITestWindow();

		builder.createSecondGenerationWithrelation(builder.getTemplateDiagram());
		builder.createThirdGenerationWithRelation();
		
		ZentaDiagramEditorPalette palette = ed.getPaletteRoot();
		PaletteContainer objectsgroup = palette._getObjectsGroup();
		assertNotNull(objectsgroup);
		@SuppressWarnings("unchecked")
		
		List<PaletteEntry> children = Util.verifyNonNull(objectsgroup.getChildren());
		builder.assertMetaIsOK();
		IMetamodel mm = builder.getMetamodel();
		for (NonNullListIterator<IBasicObject> iterator = mm.getObjectClasses().iterator(); iterator
				.hasNext();) {
			 IBasicObject klass = iterator.next();
			assertTrue(ModelAndEditPartTestData.haveCreatorFor(klass, children));
		}
		win.showWindow();
	}

}
