package org.rulez.magwas.zenta.model;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BasicRelationTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private IBasicRelationship element;
	private IBasicRelationship uncheckedElement;
	private IZentaModel model;

	@Before
	public void setUp() throws Exception {
		model = IZentaFactory.eINSTANCE.createZentaModel();
		model.check();
		IBasicObject endpoint = IZentaFactory.eINSTANCE.createBasicObject();
		element=IZentaFactory.eINSTANCE.createBasicRelationship();
		element.setSource(endpoint);
		element.setTarget(endpoint);
		element.check();
		uncheckedElement=IZentaFactory.eINSTANCE.createBasicRelationship();
		uncheckedElement.setSource(endpoint);
		uncheckedElement.setTarget(endpoint);
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
	public void element_name_cannot_be_null() throws ModelConsistencyException {
		uncheckedElement.setName(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedElement.check();
	}
	@Test
	public void checked_element_name_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		element.setName(null);
	}

	@Test
	public void element_source_cannot_be_null() throws ModelConsistencyException {
		uncheckedElement.setSource(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedElement.check();
	}
	
	@Test
	public void checked_element_source_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		element.setSource(null);
	}

	@Test
	public void element_target_cannot_be_null() throws ModelConsistencyException {
		uncheckedElement.setTarget(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedElement.check();
	}
	
	@Test
	public void checked_element_target_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		element.setTarget(null);
	}
	
	@Test
	public void an_inconsistent_connection_cannot_be_associated_with_the_relationship() {
		IDiagramModelZentaConnection conn = IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
		conn.setDocumentation(null);
		exception.expect(ModelConsistencyException.class);
		element.getDiagConnections().add(conn);
	}
	

}
