/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


@SuppressWarnings("nls")
public abstract class DiagramModelObjectTests extends DiagramModelComponentTests {
    
    private IDiagramModelObject object;
    
    @Before
    public void runBeforeEachDiagramModelObjectTest() {
        setObject((IDiagramModelObject)getComponent());
    }

    @Test
    public void have_bounds() {
        IBounds bounds = IZentaFactory.eINSTANCE.createBounds();
        getObject().setBounds(bounds);
        assertSame(bounds, getObject().getBounds());
    }
    
    @Test
    public void can_have_connections_associated_for_which_it_is_the_source() {
        assertTrue(getObject().getSourceConnections().isEmpty());
        
        IDiagramModelConnection conn = IZentaFactory.eINSTANCE.createDiagramModelConnection();
        getObject().getSourceConnections().add(conn);
        assertSame(conn, getObject().getSourceConnections().get(0));
    }
    
    @Test
    public void can_have_connections_associated_for_which_it_is_the_target() {
        assertTrue(getObject().getTargetConnections().isEmpty());
        
        IDiagramModelConnection conn = IZentaFactory.eINSTANCE.createDiagramModelConnection();
        getObject().getTargetConnections().add(conn);
        assertSame(conn, getObject().getTargetConnections().get(0));
    }
    
    @Test
    public void have_fill_color() {
        assertNull(getObject().getFillColor());
        getObject().setFillColor("#ffffff");
        assertEquals("#ffffff", getObject().getFillColor());
    }

    @Test
    public void have_font() {
        assertNull(getObject().getFont());
        getObject().setFont("Arial");
        assertEquals("Arial", getObject().getFont());
    }
    
    @Test
    public void have_font_color() {
        assertNull(getObject().getFontColor());
        getObject().setFontColor("#ffffff");
        assertEquals("#ffffff", getObject().getFontColor());
    }
    
    @Test
    public void have_text_alignment() {
        assertEquals(getObject().getDefaultTextAlignment(), getObject().getTextAlignment());
        getObject().setTextAlignment(2);
        assertEquals(2, getObject().getTextAlignment());
    }
    
    @Test
    public void have_text_position() {
        assertEquals(IFontAttribute.TEXT_POSITION_TOP_LEFT, getObject().getTextPosition());
        getObject().setTextPosition(2);
        assertEquals(2, getObject().getTextPosition());
    }
    
    @Test
    public void have_line_width() {
        assertEquals(1, getObject().getLineWidth());
        getObject().setLineWidth(2);
        assertEquals(2, getObject().getLineWidth());
    }
    
    @Test
    public void have_line_color() {
        assertNull(getObject().getLineColor());
        getObject().setLineColor("#ffffff");
        assertEquals("#ffffff", getObject().getLineColor());
    }
    
    @Test(expected=AssertionError.class)
    public void a_connection_without_connections_cannot_be_added_to_diagram() {
        IDiagramModelConnection conn = IZentaFactory.eINSTANCE.createDiagramModelConnection();
        getObject().addConnection(conn);
    }    
    @Test
    public void a_connection_can_be_added_to_it() {
        IDiagramModelConnection conn = IZentaFactory.eINSTANCE.createDiagramModelConnection();
                
        // Now should be OK
        conn.setSource(getObject());
        conn.setTarget(getObject());
        getObject().addConnection(conn);
        
        assertTrue(getObject().getSourceConnections().contains(conn));
        assertTrue(getObject().getTargetConnections().contains(conn));
    }
    
    @Test
    public void a_connection_can_be_removed_from_it() {
        IDiagramModelConnection conn = IZentaFactory.eINSTANCE.createDiagramModelConnection();
        conn.setSource(getObject());
        conn.setTarget(getObject());

        getObject().addConnection(conn);
        assertTrue(getObject().getSourceConnections().contains(conn));
        assertTrue(getObject().getTargetConnections().contains(conn));
        
        // Try to remove bogus connection
        IDiagramModelConnection conn2 = IZentaFactory.eINSTANCE.createDiagramModelConnection();
        conn2.setSource(IZentaFactory.eINSTANCE.createDiagramModelNote());
        conn2.setTarget(IZentaFactory.eINSTANCE.createDiagramModelNote());
        getObject().removeConnection(conn2);
        assertTrue(getObject().getSourceConnections().contains(conn));
        assertTrue(getObject().getTargetConnections().contains(conn));

        // Now do it properly
        getObject().removeConnection(conn);
        assertTrue(getObject().getSourceConnections().isEmpty());
        assertTrue(getObject().getTargetConnections().isEmpty());
    }

    @Test
    public void default_text_alignment() {
        assertEquals(IFontAttribute.TEXT_ALIGNMENT_CENTER, getObject().getDefaultTextAlignment());
    }
    
    @Override
    @Test
    public void can_be_copied() {
        super.can_be_copied();
        
        IDiagramModelConnection conn = IZentaFactory.eINSTANCE.createDiagramModelConnection();
        conn.setSource(getObject());
        conn.setTarget(getObject());
        getObject().addConnection(conn);
        assertTrue(getObject().getSourceConnections().contains(conn));
        assertTrue(getObject().getTargetConnections().contains(conn));
        
        IBounds bounds = IZentaFactory.eINSTANCE.createBounds(2, 4, 6, 8);
        getObject().setBounds(bounds);
        
        IDiagramModelObject copy = (IDiagramModelObject)getObject().getCopy();
        
        assertNotSame(getObject(), copy);
        assertTrue(copy.getSourceConnections().isEmpty());
        assertTrue(copy.getTargetConnections().isEmpty());
        assertNotSame(bounds, copy.getBounds());
        assertEquals(bounds.getX(), copy.getBounds().getX());
        assertEquals(bounds.getY(), copy.getBounds().getY());
    }

	@SuppressWarnings("null")
	public IDiagramModelObject getObject() {
		return object;
	}

	public void setObject(IDiagramModelObject object) {
		this.object = object;
	}

}
