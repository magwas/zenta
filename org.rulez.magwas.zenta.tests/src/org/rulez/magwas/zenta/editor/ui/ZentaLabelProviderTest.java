package org.rulez.magwas.zenta.editor.ui;

import static org.junit.Assert.*;

import org.junit.Test;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;

public class ZentaLabelProviderTest {

	@Test
	public void We_get_a_relationship_sentence_even_when_there_is_no_ObjectClass() {
		ModelAndEditPartTestData data = new ModelAndEditPartTestData();
		String id = "77d87cf5";
		IRelationship rel = data.getRelationByID(id);
		String sentence = ZentaLabelProvider.INSTANCE.getRelationshipSentence(rel);
		assertNotNull(sentence);
	}

}
