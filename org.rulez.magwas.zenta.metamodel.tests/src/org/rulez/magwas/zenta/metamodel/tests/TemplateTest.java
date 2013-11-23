package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;
import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;

public class TemplateTest {

	protected Template fixture = null;

	@Before
	public void setUp() throws Exception {
		this.fixture = MetamodelFactory.eINSTANCE.getBuiltinTemplate();
	}

	@After
	public void tearDown() throws Exception {
		this.fixture = null;
	}
	
	@Test
	public void testGetName() {
		assertEquals("Builtins",fixture.getName());
	}
	
	@Test
	public void testGetChildren() {
		EList<ObjectClass> objects = fixture.getObjectClasses();
		assertEquals(1,objects.size());
		EList<RelationClass> relations = fixture.getRelationClasses();
		assertEquals(1,relations.size());
	}


}
