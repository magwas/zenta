package org.rulez.magwas.zenta.model;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DiagramModelReferenceTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private IDiagramModelReference element;
	private IDiagramModelReference uncheckedElement;
	private IZentaModel model;

	@Before
	public void setUp() throws Exception {
		model = IZentaFactory.eINSTANCE.createZentaModel();
		model.check();
		IZentaDiagramModel diagram = IZentaFactory.eINSTANCE.createZentaDiagramModel();
		element=IZentaFactory.eINSTANCE.createDiagramModelReference();
		element.setReferencedModel(diagram);
		element.check();
		uncheckedElement=IZentaFactory.eINSTANCE.createDiagramModelReference();
		uncheckedElement.setReferencedModel(diagram);
	}


	@Test
	public void id_cannot_be_null() throws ModelConsistencyException {
		uncheckedElement.setId(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedElement.check();
	}

	@Test
	public void checked_element_id_cannot_be_set_to_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		element.setId(null);
	}


	@Test
	public void name_cannot_be_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		uncheckedElement.setName(null);
	}

	@Test
	public void checked_element_name_cannot_be_set_to_anything() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		element.setName("a name");
	}

	@Test
	public void referenced_model_cannot_be_null() throws ModelConsistencyException {
		uncheckedElement.setReferencedModel(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedElement.check();
	}

	@Test
	public void checked_element_referenced_model_cannot_be_set_to_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		element.setReferencedModel(null);
	}


}
