/**
 */
package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;

public class AttributeTest {

	protected Attribute fixture = null;

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


}
