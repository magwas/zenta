/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;

import org.junit.Before;
import org.junit.Test;


@SuppressWarnings("nls")
public class SketchModelStickyTests extends DiagramModelObjectTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(SketchModelStickyTests.class);
    }
    
    private ISketchModelSticky sticky;
    
    @Override
    protected IDiagramModelComponent getComponent() {
        ISketchModelSticky sticky = IZentaFactory.eINSTANCE.createSketchModelSticky();
        return sticky;
    }

    @Before
    public void runBeforeEachDiagramModelZentaObjectTest() {
        sticky = (ISketchModelSticky)getComponent();
    }


    @Override
    @Test
    public void default_text_alignment() {
        assertEquals(IFontAttribute.TEXT_ALIGNMENT_LEFT, sticky.getDefaultTextAlignment());
    }

    @Override
    @Test
    public void can_be_copied() {
        super.can_be_copied();
        
        sticky.setContent("hello");
        sticky.getProperties().add(IZentaFactory.eINSTANCE.createProperty());
        
        ISketchModelSticky copy = (ISketchModelSticky)sticky.getCopy();
        
        assertNotSame(sticky, copy);
        
        assertEquals(sticky.getContent(), copy.getContent());
        
        assertNotSame(sticky.getChildren(), copy.getChildren());
        assertTrue(copy.getChildren().isEmpty());
        
        assertNotSame(sticky.getProperties(), copy.getProperties());
        assertEquals(sticky.getProperties().size(), copy.getProperties().size());
    }

	@Test
    public void have_children() {
        CommonTests.testList(sticky.getChildren(), IZentaPackage.eINSTANCE.getSketchModelActor());
        CommonTests.testList(sticky.getChildren(), IZentaPackage.eINSTANCE.getSketchModelActor());
    }
    
    @Test
    public void have_content() {
        assertEquals("", sticky.getContent());
        sticky.setContent("doc");
        assertEquals("doc", sticky.getContent());
    }

    
	@Test
    public void can_have_properties() {
        CommonTests.testProperties(sticky);
    }

}
