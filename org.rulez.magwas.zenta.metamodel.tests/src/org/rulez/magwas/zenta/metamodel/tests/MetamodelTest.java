package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;

public class MetamodelTest {
	protected Metamodel fixture = null;

	protected void setFixture(Metamodel fixture) {
		this.fixture = fixture;
	}
	protected Metamodel getFixture() {
		return fixture;
	}

	@Before
	public void setUp() throws Exception {
		ModelTestData data = new ModelTestData();
		assertNotNull(data.model);
		this.fixture = MetamodelFactory.eINSTANCE.createMetamodel(data.model);
	}

	@After
	public void tearDown() throws Exception {
		this.fixture = null;
	}
	
	@Test
	public void testHave_builtin_template() {
		assertEquals("Builtins",fixture.getTemplates().get(0).getName());
	}

	@Test
	public void testHave_builtin_ObjectClass() {
		assertEquals("Basic Object",fixture.getTemplates().get(0).getObjectClasses().get(0).getName());
	}
}
