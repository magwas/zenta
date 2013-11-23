/**
 */
package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.fail;

import org.rulez.magwas.zenta.metamodel.referencesModelObject;

public abstract class referencesModelObjectTest {

	protected referencesModelObject fixture = null;

	public referencesModelObjectTest(String name) {
	}
	protected void setFixture(referencesModelObject fixture) {
		this.fixture = fixture;
	}
	protected referencesModelObject getFixture() {
		return fixture;
	}

	public void testGetName() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //referencesModelObjectTest
