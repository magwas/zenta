/**
 */
package org.rulez.magwas.zenta.metamodel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;

public class AttributeTest {

	protected Attribute fixture = null;
	private ModelAndMetaModelTestData testdata;

	@Before
	public void setUp() throws Exception {
		this.fixture = MetamodelFactory.eINSTANCE.createAttribute();
	}
	
	@After
	public void tearDown() throws Exception {
		this.fixture = null;
	}
	
	@Test
	public void test_Default_For_maxOccurs_Is_1() {
		int max = fixture.getMaxOccurs();
		assertEquals(1,max);
	}

	@Test
	public void When_a_RelationClass_is_created__the_corresponding_attributes_also_created_in_the_ObjectClasses() {
		testdata = new ModelAndMetaModelTestData();
		IRelationship rel = testdata.createNewRelationClass("test relation");
		IZentaElement source = rel.getSource();
		IZentaElement target = rel.getTarget();
		ObjectClass sc = (ObjectClass) testdata.metamodel.getClassFor(source);
		ObjectClass tc = (ObjectClass) testdata.metamodel.getClassFor(target);
		assertTrue(0 < sc.getAttributes().size());
		assertTrue(0 < tc.getAttributes().size());
	}

}