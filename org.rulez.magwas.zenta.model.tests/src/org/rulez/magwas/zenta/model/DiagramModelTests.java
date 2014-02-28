/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;


@SuppressWarnings("nls")
public abstract class DiagramModelTests {
    
    protected abstract IDiagramModel getDiagramModel();
    
    private IZentaModel model;
    private IDiagramModel dm;
    
    @Before
    public void runBeforeEachDiagramModelTest() {
        dm = getDiagramModel();
        model = IZentaFactory.eINSTANCE.createZentaModel();
    }

    @SuppressWarnings("null")
	@Test
    public void DiagramModel_have_name() {
        CommonTests.testGetName(dm);
    }

    @Test
    public void DiagramModel_have_itself_associated_as_its_DiagramModel() {
        assertSame(dm, dm.getDiagramModel());
    }

    @Test(expected=NullPointerException.class)
    public void getZentaModel_throws_exception_when_diagram_is_not_in_model() {
    	dm.getZentaModel();
    }
    
    @Test
    public void DiagramModel_have_Zenta_model_associated() {
        model.getElements().add(dm);
        assertSame(model, dm.getZentaModel());
    }

    @Test
    public void DiagramModel_have_ID() {
        assertNull(dm.getId());
        
        model.getElements().add(dm);
        assertNotNull(dm.getId());
    }

    @Test
    public void DiagramModel_have_connection_router_type_associated() {
        assertEquals(IDiagramModel.CONNECTION_ROUTER_BENDPOINT, dm.getConnectionRouterType());
        dm.setConnectionRouterType(IDiagramModel.CONNECTION_ROUTER_MANHATTAN);
        assertEquals(IDiagramModel.CONNECTION_ROUTER_MANHATTAN, dm.getConnectionRouterType());
    }
    
    @SuppressWarnings("null")
	@Test
    public void DiagramModel_have_documentation() {
        CommonTests.testGetDocumentation(dm);
    }

    @SuppressWarnings("null")
	@Test
    public void DiagramModel_can_have_properties() {
        CommonTests.testProperties(dm);
    }

    @SuppressWarnings("null")
	@Test
    public void DiagramModel_have_adapter() {
        CommonTests.testGetAdapter(dm);
    }

    @Test
    public void A_DiagramModel_can_be_copied() {
        dm.setName("name");
        dm.setDocumentation("doc");
        
        dm.getProperties().add(IZentaFactory.eINSTANCE.createProperty());
        
        IDiagramModel copy = (IDiagramModel)dm.getCopy();
        
        assertNotSame(dm, copy);
        assertNull(copy.getId());
        assertEquals(dm.getName(), copy.getName());
        assertEquals(dm.getDocumentation(), copy.getDocumentation());
        assertNotSame(dm.getProperties(), copy.getProperties());
        assertEquals(dm.getProperties().size(), copy.getProperties().size());
        assertNotSame(dm.getChildren(), copy.getChildren());
    }

}
