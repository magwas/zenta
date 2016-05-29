package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;

public class AttributeTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	protected IAttribute fixture;
	private ModelAndMetaModelTestData testdata;
	private IAttribute uncheckedAtt;

	@Before
	public void setUp() throws Exception {
		testdata = new ModelAndMetaModelTestData();
		fixture = testdata.createTestAttribute();
		fixture.check();
		uncheckedAtt = testdata.createTestAttribute();
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
	
	@Test
	public void direction_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		fixture.setDirection(null);
	}

	@Test
	public void direction_cannot_be_null() throws Exception {
		ModelTestUtils.setPrivateField(uncheckedAtt, "direction", null);
		exception.expect(ModelConsistencyException.class);
		uncheckedAtt.check();
	}

	@Test
	public void relation_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		fixture.setRelation(null);
	}
	
	@Test()
	public void relation_cannot_be_null() throws Exception {
		ModelTestUtils.setPrivateField(uncheckedAtt, "relation", null);
		exception.expect(ModelConsistencyException.class);
		uncheckedAtt.check();
	}
	
	@Test
	public void connected_object_cannot_be_set_null() {
		exception.expect(ModelConsistencyException.class);
		uncheckedAtt.setConnectedObject(null);
	}
}
