package org.rulez.magwas.zenta.editor.diagram.editparts;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;

public class InvalidModelLoadtest {

	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
	}

	@SuppressWarnings("null")
	@Test
	public void Model_with_invalid_diagram_object_can_be_loaded() throws IOException {
		int n = IEditorModelManager.INSTANCE.getModels().size();
		testdata = new ModelAndEditPartTestData("invalid.zenta");
		assertNotNull(testdata.model);
		ZentaDiagramEditor editor = testdata.focusOnDiagram("ced9cad1");
		assertNotNull(editor);
		IEditorModelManager.INSTANCE.closeModel(testdata.model);
		assertEquals(n, IEditorModelManager.INSTANCE.getModels().size());
	}

}
