package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OrJunctionTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	IOrJunction uncheckedElement;
	IOrJunction element;

	private IZentaModel model;
	
	@Before
	public void setUp() throws Exception {
		model = IZentaFactory.eINSTANCE.createZentaModel();
		model.check();
		element=IZentaFactory.eINSTANCE.createOrJunction();
		element.check();
		uncheckedElement=IZentaFactory.eINSTANCE.createOrJunction();
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
		uncheckedElement.setName(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedElement.check();
	}

	@Test
	public void checked_element_name_cannot_be_set_to_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		element.setName(null);
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

}
