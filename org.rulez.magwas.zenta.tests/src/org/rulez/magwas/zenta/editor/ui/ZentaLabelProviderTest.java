package org.rulez.magwas.zenta.editor.ui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;

public class ZentaLabelProviderTest {

	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() {
		testdata = new ModelAndEditPartTestData();
	}

	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
	}

	@Test
	public void We_get_a_relationship_sentence_even_when_there_is_no_ObjectClass() {
		String id = "77d87cf5";
		IBasicRelationship rel = testdata.getRelationByID(id);
		String sentence = ZentaLabelProvider.INSTANCE.getRelationshipSentence(rel);
		assertNotNull(sentence);
	}

}
