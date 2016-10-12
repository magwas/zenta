package org.rulez.magwas.zenta.model;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DiagramModelCheckTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private IZentaModel model;
	private IZentaDiagramModel diagram;
	private IZentaDiagramModel uncheckedDiagram;

	@Before
	public void setUp() throws Exception {
		model = IZentaFactory.eINSTANCE.createZentaModel();
		model.check();
		diagram = IZentaFactory.eINSTANCE.createZentaDiagramModel();
		diagram.check();
		uncheckedDiagram = IZentaFactory.eINSTANCE.createZentaDiagramModel();
	}


	@Test
	public void id_cannot_be_null() throws ModelConsistencyException {
		uncheckedDiagram.setId(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedDiagram.check();
	}

	@Test
	public void checked_diagram_id_cannot_be_set_to_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		diagram.setId(null);
	}

	@Test
	public void diagram_documentation_cannot_be_null() throws ModelConsistencyException {
		uncheckedDiagram.setDocumentation(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedDiagram.check();
	}

	@Test
	public void checked_diagram_documentation_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		diagram.setDocumentation(null);
	}

	@Test
	public void an_inconsistent_diagram_cannot_be_added_to_diagrams_in_the_model() {
		uncheckedDiagram.setDocumentation(null);
		exception.expect(ModelConsistencyException.class);
		model.getElements().add(uncheckedDiagram);
	}

	@Test
	public void an_inconsistent_diagram_cannot_be_added_to_diagrams_in_a_folder_in_the_model() {
		uncheckedDiagram.setDocumentation(null);
		IFolder folder = IZentaFactory.eINSTANCE.createFolder();
		folder.check();
		model.getFolders().add(folder);
		exception.expect(ModelConsistencyException.class);
		folder.getElements().add(uncheckedDiagram);
	}

}
