package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.testutils.TestModel;

public class ZentaElementTests {

	private TestModel builder;

	@Before
	public void setUp() {
		builder = new TestModel();
		builder.createFirstGeneration();
	}

	@Test
	public void getRelationShips_returns_the_relationships() {
		IBasicObject source = builder.getFirstgenSource();
		NonNullList<IBasicRelationship> relationships = source.getRelationships();
		assertTrue(relationships.contains(builder.getFirstgenRelation()));
	}

}
