package org.rulez.magwas.zenta.model;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BasicObjectTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private IBasicObject element;
	private IBasicObject uncheckedElement;
	private IZentaModel model;

	@Before
	public void setUp() throws Exception {
		model = IZentaFactory.eINSTANCE.createZentaModel();
		model.check();
		element=IZentaFactory.eINSTANCE.createBasicObject();
		element.check();
		uncheckedElement=IZentaFactory.eINSTANCE.createBasicObject();
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
	public void element_documentation_cannot_be_null() throws ModelConsistencyException {
		uncheckedElement.setDocumentation(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedElement.check();
	}

	@Test
	public void checked_element_documentation_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		element.setDocumentation(null);
	}

	@Test
	public void an_inconsistent_element_cannot_be_added_to_the_model() {
		uncheckedElement.setDocumentation(null);
		exception.expect(ModelConsistencyException.class);
		model.getElements().add(uncheckedElement);
	}

	@Test
	public void an_inconsistent_diagram_object_cannot_be_associated_with_the_element() {
		IDiagramModelZentaObject obj = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		obj.setBounds(null);
		exception.expect(ModelConsistencyException.class);
		element.getDiagObjects().add(obj);
	}

}
