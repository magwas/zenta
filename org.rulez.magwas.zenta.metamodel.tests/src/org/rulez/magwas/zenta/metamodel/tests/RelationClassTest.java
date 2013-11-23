package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.RelationClass;

public class RelationClassTest {

	protected RelationClass fixture = null;

	@Before
	public void setUp() throws Exception {
		this.fixture = MetamodelFactory.eINSTANCE.getBuiltinRelationClass();
	}


	@After
	public void tearDown() throws Exception {
		this.fixture = null;
	}

	@Test
	public void testGetChildren() {
		EList<RelationClass> kids = fixture.getChildren();
		assertEquals(0,kids.size());
	}

	@Test
	public void testGetName() {
		assertEquals("Basic Relation",fixture.getName());
	}

} //RelationClassTest
