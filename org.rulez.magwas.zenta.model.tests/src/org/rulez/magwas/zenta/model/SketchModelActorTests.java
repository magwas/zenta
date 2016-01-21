/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import junit.framework.JUnit4TestAdapter;

import org.junit.Before;
import org.junit.Test;


public class SketchModelActorTests extends DiagramModelObjectTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(SketchModelActorTests.class);
    }
    
    private ISketchModelActor actor;
    
    @Override
    protected IDiagramModelComponent getComponent() {
        ISketchModelActor actor = IZentaFactory.eINSTANCE.createSketchModelActor();
        return actor;
    }

    @Before
    public void runBeforeEachDiagramModelZentaObjectTest() {
        actor = (ISketchModelActor)getComponent();
    }


    @Override
    @Test
    public void can_be_copied() {
        super.can_be_copied();
        
        actor.getProperties().add(IZentaFactory.eINSTANCE.createProperty());
        
        ISketchModelActor copy = (ISketchModelActor)actor.getCopy();
        
        assertNotSame(actor, copy);
        
        assertNotSame(actor.getProperties(), copy.getProperties());
        assertEquals(actor.getProperties().size(), copy.getProperties().size());
    }

    
	@Test
    public void SketchModelActor_have_documentation() {
        CommonTests.testGetDocumentation(actor);
    }

    
	@Test
    public void SketchModelActor_have_Properties() {
        CommonTests.testProperties(actor);
    }

}
