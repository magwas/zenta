package org.rulez.magwas.zenta.model;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnectionBase;

public class DiagramModelZentaConnectionBaseTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();
	private DiagramModelZentaConnectionBase connection;

	@Before
	public void getComponent() {
		connection = (DiagramModelZentaConnectionBase) IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
	}

	@Test
    public void relationship_should_not_be_null() {
		exception.expect(ModelConsistencyException.class);
        connection.basicSetRelationship(null, null);
    }

}
