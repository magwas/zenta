/**
 */
package org.rulez.magwas.zenta.metamodel.tests;

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
}
