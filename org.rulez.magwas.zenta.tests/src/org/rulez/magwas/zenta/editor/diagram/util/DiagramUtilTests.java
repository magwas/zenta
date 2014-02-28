/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import junit.framework.JUnit4TestAdapter;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.GraphicalViewerImpl;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.junit.BeforeClass;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.editparts.ZentaDiagramEditPartFactory;
import org.rulez.magwas.zenta.editor.diagram.sketch.editparts.SketchEditPartFactory;
import org.rulez.magwas.zenta.editor.diagram.util.DiagramUtils;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelBendpoint;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.impl.BoundsBase;
import org.rulez.magwas.zenta.model.testutils.TestModel;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.UITestWindow;


public class DiagramUtilTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(DiagramUtilTests.class);
    }
    
	private static TestModel builder;
    
    @BeforeClass
    public static void runOnceBeforeAllTests() throws IOException {
		builder = new TestModel();
		builder.createFullModel();
		builder.sketchModel = builder.factory.createSketchModel();
		builder.getModel().getElements().add(builder.sketchModel);
		builder.setEmptyDiagramModel(builder.factory.createZentaDiagramModel());
		builder.getModel().getElements().add(builder.getEmptyDiagramModel());
    }

    @Test
    public void a_Zenta_diagram_can_be_viewed() {
        IDiagramModel dm = builder.getTemplateDiagram();
        assertTrue(dm instanceof IZentaDiagramModel);
        
        Shell shell = new Shell();
        GraphicalViewerImpl viewer = DiagramUtils.createViewer(dm, shell);
        
        assertNotNull(viewer);
        assertTrue(viewer.getEditPartFactory() instanceof ZentaDiagramEditPartFactory);
        assertTrue(viewer.getRootEditPart() instanceof FreeformGraphicalRootEditPart);
        assertSame(dm, viewer.getContents().getModel());
        
        assertSame(shell, viewer.getControl().getShell());
        
        shell.dispose();
    }

    @Test
    public void a_Sketch_model_can_be_viewed() {
        IDiagramModel dm = builder.sketchModel;
        assertTrue(dm instanceof ISketchModel);
        
        Shell shell = new Shell();
        GraphicalViewerImpl viewer = DiagramUtils.createViewer(dm, shell);
        
        assertNotNull(viewer);
        assertTrue(viewer.getEditPartFactory() instanceof SketchEditPartFactory);
        assertTrue(viewer.getRootEditPart() instanceof FreeformGraphicalRootEditPart);
        assertSame(dm, viewer.getContents().getModel());
        
        assertSame(shell, viewer.getControl().getShell());
        
        shell.dispose();
    }
    
    @Test
    public void an_empty_diagram_can_be_viewed() {
        // This is the blank View
        IDiagramModel dm = builder.getEmptyDiagramModel();
        Image img = DiagramUtils.createImage(dm, 1, 0);
        
        // Blank View is minimum 100 x 100
        assertEquals(new Rectangle(0, 0, 100, 100), img.getBounds());
        img.dispose();
        
        // Margin will not be used for Blank View
        img = DiagramUtils.createImage(dm, 1, 20);
        assertEquals(new Rectangle(0, 0, 100, 100), img.getBounds());
        img.dispose();

        // Margin & Ratio
        img = DiagramUtils.createImage(dm, 0.2, 0);
        assertEquals(new Rectangle(0, 0, 20, 20), img.getBounds());
        img.dispose();
        
        img = DiagramUtils.createImage(dm, 0.5, 10);
        assertEquals(new Rectangle(0, 0, 50, 50), img.getBounds());
        img.dispose();
    }
   
    @Test
    public void scaled_image_can_be_created_from_an_empty_diagram() {
        IDiagramModel dm = builder.getEmptyDiagramModel();
        
        // Blank View is minimum 100 x 100
        Image img = DiagramUtils.createImage(dm, 1, 0);
        assertEquals(new Rectangle(0, 0, 100, 100), img.getBounds());
        img.dispose();
        
        img = DiagramUtils.createImage(dm, 2, 0);
        assertEquals(new Rectangle(0, 0, 200, 200), img.getBounds());
        img.dispose();
    }
    
    @Test
    @HaveGUI(waitUser = false)
    public void scaled_image_can_be_created_from_a_diagram() {
    	UITestWindow win = new UITestWindow();
        IDiagramModel dm = builder.getTemplateDiagram();
        IEditorModelManager.INSTANCE.openModel(builder.getModel());
        
        int width = 221 - 11 + BoundsBase.WIDTH_EDEFAULT; 
        int height = 250 + 21 + BoundsBase.HEIGHT_EDEFAULT;
        
        Image img = DiagramUtils.createImage(dm, 1, 0);
        Composite composite = win.getComposite();
        Rectangle bounds = img.getBounds();
		composite.setBounds(bounds);
		composite.setBackgroundImage(img);
		win.resize(bounds.width+100, bounds.height+100);
        win.showWindow();
        assertEquals(new Rectangle(0, 0, width, height), img.getBounds());
        img.dispose();
        
        img = DiagramUtils.createImage(dm, 0.5, 0);
        assertEquals(new Rectangle(0, 0, width / 2, height / 2), img.getBounds());
        img.dispose();
    }

    @Test
    public void image_can_be_created_using_a_viewer() {
        IDiagramModel dm = builder.getTemplateDiagram();
        
        Shell shell = new Shell();
        GraphicalViewerImpl viewer = DiagramUtils.createViewer(dm, shell);
        shell.dispose();
        
        Image img = DiagramUtils.createImage(viewer, 1, 0);
        assertNotNull(img);
        img.dispose();
    }
    
    @Test
    public void image_can_be_created_using_a_figure() {
        IFigure rootFigure = new FreeformLayer();
        org.eclipse.draw2d.geometry.Rectangle rect1 = new org.eclipse.draw2d.geometry.Rectangle(0, 0, 1000, 1000);
        rootFigure.setBounds(rect1);
        
        // Blank View is minimum 100 x 100
        Image img = DiagramUtils.createImage(rootFigure, 1, 0);
        assertEquals(new Rectangle(0, 0, 100, 100), img.getBounds());
        img.dispose();
        
        IFigure childFigure1 = new Figure();
        org.eclipse.draw2d.geometry.Rectangle rect2 = new org.eclipse.draw2d.geometry.Rectangle(90, 90, 230, 190);
        childFigure1.setBounds(rect2);
        rootFigure.add(childFigure1);
        
        IFigure childFigure2 = new Figure();
        org.eclipse.draw2d.geometry.Rectangle rect3 = new org.eclipse.draw2d.geometry.Rectangle(120, 150, 230, 190);
        childFigure2.setBounds(rect3);
        rootFigure.add(childFigure2);
        
        img = DiagramUtils.createImage(rootFigure, 1, 0);
        assertEquals(new Rectangle(0, 0, 260, 250), img.getBounds());
        img.dispose();
    }

    @Test
    public void there_is_a_minimum_diagram_size() {
        IDiagramModel dm = builder.getEmptyDiagramModel();
        
        Shell shell = new Shell();
        GraphicalViewerImpl viewer = DiagramUtils.createViewer(dm, shell);
        shell.dispose();
        
        org.eclipse.draw2d.geometry.Rectangle rect = DiagramUtils.getMinimumBounds(viewer);
        assertEquals(new org.eclipse.draw2d.geometry.Rectangle(0, 0, 100, 100), rect);
    }

    @Test
    public void testGetDiagramExtents() {
        IDiagramModel dm = builder.getTemplateDiagram();
        
        int x0 = 11;
        int y0 = - 21;
		int width = 221 - x0 + BoundsBase.WIDTH_EDEFAULT; 
		int height = 250 - y0 + BoundsBase.HEIGHT_EDEFAULT;
        
        Shell shell = new Shell();
        GraphicalViewerImpl viewer = DiagramUtils.createViewer(dm, shell);
        shell.dispose();
        
        org.eclipse.draw2d.geometry.Rectangle rect = DiagramUtils.getMinimumBounds(viewer);
        assertEquals(new org.eclipse.draw2d.geometry.Rectangle(x0, y0, width, height), rect);
    }
    
    @Test
    public void testGetDiagramExtents_WithConnections() {
        IDiagramModel dm = builder.getTemplateDiagram();
        IDiagramModelObject dmc = builder.getFirstgenSource().getDiagObjects().get(0);
        IDiagramModelConnection sc = dmc.getSourceConnections().get(0);
        IDiagramModelBendpoint bp = builder.factory.createDiagramModelBendpoint();
        bp.setStartX(331);
        bp.setStartY(59);
        bp.setEndX(210);
        bp.setEndY(121);
        sc.getBendpoints().add(bp);
        Shell shell = new Shell();
        GraphicalViewerImpl viewer = DiagramUtils.createViewer(dm, shell);
        shell.dispose();
        int x0 = 11;
        int y0 = - 21;
        
        org.eclipse.draw2d.geometry.Rectangle rect = DiagramUtils.getMinimumBounds(viewer);
        assertEquals(new org.eclipse.draw2d.geometry.Rectangle(x0, y0, 524, 364), rect);
    }

    @Test
    public void testGetMinimumBounds() {
        IFigure rootFigure = new FreeformLayer();
        org.eclipse.draw2d.geometry.Rectangle rect1 = new org.eclipse.draw2d.geometry.Rectangle(0, 0, 1000, 1000);
        rootFigure.setBounds(rect1);
        assertNull(DiagramUtils.getMinimumBounds(rootFigure));
        
        IFigure childFigure = new Figure();
        org.eclipse.draw2d.geometry.Rectangle rect2 = new org.eclipse.draw2d.geometry.Rectangle(10, 10, 50, 50);
        childFigure.setBounds(rect2);
        rootFigure.add(childFigure);
        
        childFigure = new Figure();
        org.eclipse.draw2d.geometry.Rectangle rect3 = new org.eclipse.draw2d.geometry.Rectangle(200, 220, 100, 100);
        childFigure.setBounds(rect3);
        rootFigure.add(childFigure);
        
        assertEquals(new org.eclipse.draw2d.geometry.Rectangle(10, 10, 290, 310), DiagramUtils.getMinimumBounds(rootFigure));
    }
}