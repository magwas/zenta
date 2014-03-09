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
public abstract class DiagramModelComponentTests {
    
    protected abstract IDiagramModelComponent getComponent();
    
    private IDiagramModelComponent component;
    private IZentaDiagramModel dm;
    
    @Before
    public void runBeforeEachDiagramModelComponentTest() {
        component = getComponent();
        dm = IZentaFactory.eINSTANCE.createZentaDiagramModel();
    }
    
	@Test
    public void testGetID() {
        assertNull(component.getId());
        
        IZentaModel model = IZentaFactory.eINSTANCE.createZentaModel();
        model.getDefaultFolderForElement(dm).getElements().add(dm);
        dm.getChildren().add((IDiagramModelObject)component);
        
        assertNotNull(component.getId());
    }
        
    @SuppressWarnings("null")
	@Test
    public void have_name() {
        CommonTests.testGetName(component);
    }
 
    @Test
    public void have_DiagramModel_associated() {
        assertNull(component.findDiagramModel());
        
        dm.getChildren().add((IDiagramModelObject)component);
        assertSame(dm, component.findDiagramModel());
    }
    
    @SuppressWarnings("null")
	@Test
    public void have_adapter() {
        CommonTests.testGetAdapter(component);
    }
    
    @Test
    public void can_be_copied() {
        component.setName("name");
        IDiagramModelComponent copy = (IDiagramModelComponent)component.getCopy();
        assertNotSame(component, copy);
        assertNull(copy.getId());
        assertEquals(component.getName(), copy.getName());
    }

}
