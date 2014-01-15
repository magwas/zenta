package org.rulez.magwas.zenta.metamodel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;

public class MetamodelTest {
	protected IMetamodel fixture = null;

	protected void setFixture(IMetamodel fixture) {
		this.fixture = fixture;
	}
	protected IMetamodel getFixture() {
		return fixture;
	}

	@Before
	public void setUp() throws Exception {
		ModelTestData data = new ModelTestData();
		assertNotNull(data.model);
		this.fixture = IMetamodelFactory.eINSTANCE.createMetamodel(data.model);
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
