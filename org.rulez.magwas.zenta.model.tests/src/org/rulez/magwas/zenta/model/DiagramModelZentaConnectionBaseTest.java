package org.rulez.magwas.zenta.model;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnectionBase;

public class DiagramModelZentaConnectionBaseTest {

	private DiagramModelZentaConnectionBase connection;

	@Before
	public void getComponent() {
		connection = (DiagramModelZentaConnectionBase) IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
	}

	@Test(expected=AssertionError.class)
    public void relationship_should_not_be_null() {
        connection.basicSetRelationship(null, null);
    }

}
