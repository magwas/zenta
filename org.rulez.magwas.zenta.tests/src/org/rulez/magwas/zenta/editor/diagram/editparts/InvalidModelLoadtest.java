package org.rulez.magwas.zenta.editor.diagram.editparts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
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

	@Test
	public void Model_with_invalid_diagram_object_can_be_loaded() {
		testdata = new ModelAndEditPartTestData("invalid.zenta");
		ZentaDiagramEditor editor = testdata.focusOnDiagram("ced9cad1");
		assertNotNull(editor);
	}

}
