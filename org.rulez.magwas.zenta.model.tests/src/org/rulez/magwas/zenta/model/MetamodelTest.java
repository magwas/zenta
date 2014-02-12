package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;

public class MetamodelTest {
	protected IMetamodel fixture = null;

	protected IMetamodel getFixture() {
		return Util.assertNonNull(fixture);
	}

	@Before
	public void setUp() throws Exception {
		ModelTestData data = new ModelTestData();
		IZentaModel m = Util.assertNonNull(data.model);
		this.fixture = IZentaFactory.eINSTANCE.getMetamodelFor(m);
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
		assertEquals("Basic Object",fixture.getTemplates().get(0).getClasses().get(0).getName());
	}
	
	@Test
	public void Metamodel_objectclasses_always_contain_BasicObject() {
		HashSet<String> objectList = ModelTestUtils.definingNames(fixture.getObjectClasses());
		HashSet<String> expectedTargets = new HashSet<String>(Arrays.asList(
				"Basic Object",
				"Data",
				"ProcessStep",
				"NotActuallyDocumentation",
				"Procedure",
				"User",
				"Title"));
		ModelTestUtils.assertEqualsAsSet(expectedTargets,objectList);
	}
	@Test
	public void Metamodel_relationclassesclasses_always_contain_BasicRelation() {
		HashSet<String> objectList = ModelTestUtils.definingNames(fixture.getRelationClasses());
		HashSet<String> expectedTargets = new HashSet<String>(Arrays.asList(
				"Basic Relation",
				"describes",
				"uses",
				"contains",
				"TriesToDo"));
		ModelTestUtils.assertEqualsAsSet(expectedTargets,objectList);
	}
}
