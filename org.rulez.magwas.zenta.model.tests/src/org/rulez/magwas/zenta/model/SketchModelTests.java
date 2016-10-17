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

public class SketchModelTests extends DiagramModelTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(SketchModelTests.class);
    }
    
    private ISketchModel sm;
    
    @Override
    protected IDiagramModel getDiagramModel() {
        return IZentaFactory.eINSTANCE.createSketchModel();
    }
    
    @Before
    public void runBeforeEachTest() {
        sm = (ISketchModel)getDiagramModel();
    }
    
    // ---------------------------------------------------------------------------------------------
    // Tests
    // ---------------------------------------------------------------------------------------------
    
    @Test
    public void SketchModel_can_have_one_of_the_predefined_backgrounds() {
        assertEquals(1, sm.getBackground());
        sm.setBackground(2);
        assertEquals(2, sm.getBackground());
    }

	@Test
    public void SketchModel_have_children() {
        CommonTests.testList(sm.getChildren(), IZentaPackage.eINSTANCE.getSketchModelActor());
        CommonTests.testList(sm.getChildren(), IZentaPackage.eINSTANCE.getSketchModelSticky());
    }

}
