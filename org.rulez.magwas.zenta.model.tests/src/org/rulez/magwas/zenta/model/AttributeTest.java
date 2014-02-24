/**
 */
package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.annotation.NonNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;

public class AttributeTest {

	protected IAttribute fixture = null;
	private ModelAndMetaModelTestData testdata;

	@Before
	public void setUp() throws Exception {
		this.fixture = IZentaFactory.eINSTANCE.createAttribute();
		testdata = new ModelAndMetaModelTestData();
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
		IBasicRelationship rel = testdata.createNewRelationClass("test relation");
		IBasicObject source = (IBasicObject) rel.getSource();
		IBasicObject target = (IBasicObject) rel.getTarget();
		IBasicObject sc = source.getDefiningElement();
		IBasicObject tc = target.getDefiningElement();
		assertTrue(0 < sc.getAttributes().size());
		assertTrue(0 < tc.getAttributes().size());
	}
	
	@Test
	public void The_ObjectClass_have_attributes_for_each_of_its_relationships() {
		IBasicObject user = (IBasicObject) testdata.getElementById("ea94cf6c");//User
		@NonNull
		EList<IAttribute> atts = user.getAttributes();
		assertHaveItemFor("does", atts);
		assertEquals(2,atts.size());
	}

	private void assertHaveItemFor(String name, EList<IAttribute> atts) {
		for(IAttribute att: atts)
			if(att.getRelation().getName().equals(name))
				return;
		fail(String.format("could not found %s in %s\n", name, atts));
	}
}
