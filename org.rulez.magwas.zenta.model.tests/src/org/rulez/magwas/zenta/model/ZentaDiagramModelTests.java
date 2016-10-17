/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;

import org.junit.Before;
import org.junit.Test;


public class ZentaDiagramModelTests extends DiagramModelTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(ZentaDiagramModelTests.class);
    }
    
    private IZentaDiagramModel dm;
    
    @Override
    protected IDiagramModel getDiagramModel() {
        return IZentaFactory.eINSTANCE.createZentaDiagramModel();
    }
    
    @Before
    public void runBeforeEachTest() {
        dm = (IZentaDiagramModel)getDiagramModel();
    }
    
    // ---------------------------------------------------------------------------------------------
    // Tests
    // ---------------------------------------------------------------------------------------------
    
    @Test
    public void DiagramModel_have_a_ViewPoint_associated() {
        assertEquals(0, dm.getViewpoint());
        dm.setViewpoint(1);
        assertEquals(1, dm.getViewpoint());
    }

	@Test
    public void DiagramModel_have_children() {
        CommonTests.testList(dm.getChildren(), IZentaPackage.eINSTANCE.getDiagramModelZentaObject());
    }

}
