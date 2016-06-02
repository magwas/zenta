package org.rulez.magwas.zenta.editor.diagram.tools;

import static org.junit.Assert.*;

import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ConnectionAndFolder;
import org.rulez.magwas.zenta.model.testutils.TestModel;

public class MagicConnectionModelFactoryTest {

	@Test
	public void clear_clears_the_template() {
		TestModel builder = new TestModel();
		builder.createFirstGeneration();
		MagicConnectionModelFactory factory = new MagicConnectionModelFactory(builder.folder);
		factory.setRelationshipType(builder.firstgenRelation);
		factory.setElementType(builder.firstgenSource);
		ConnectionAndFolder newObj = (ConnectionAndFolder) factory.getNewObject();
		assertEquals(newObj.getFolder(), builder.folder);
		assertEquals(builder.firstgenRelation, factory.getRelationshipType());
		assertEquals(builder.firstgenSource, factory.getElementType());
		factory.clear();
		assertEquals(null, factory.getRelationshipType());
		assertEquals(null, factory.getElementType());
		
	}

}
