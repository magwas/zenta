/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.util;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.ScaledGraphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.gef.ui.parts.GraphicalViewerImpl;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.rulez.magwas.zenta.editor.diagram.DiagramEditorFactoryExtensionHandler;
import org.rulez.magwas.zenta.editor.diagram.IDiagramEditorFactory;
import org.rulez.magwas.zenta.editor.diagram.editparts.ZentaDiagramEditPartFactory;
import org.rulez.magwas.zenta.editor.diagram.sketch.editparts.SketchEditPartFactory;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.ISketchModel;




/**
 * Diagram Utils
 * 
 * @author Phillip Beauvoir
 */
public final class DiagramUtils {
    
    /**
     * Create a GraphicalViewerImpl to show the model. The Viewer has no Scroll Bars
     * @param model
     * @return A Graphical Viewer
     */
    public static GraphicalViewerImpl createViewer(IDiagramModel model, Composite parent) {
        EditPartFactory editPartFactory = null;
        
        if(model instanceof IZentaDiagramModel) {
            editPartFactory = new ZentaDiagramEditPartFactory();
        }
        else if(model instanceof ISketchModel) {
            editPartFactory = new SketchEditPartFactory();
        }
        else {
            // Extensions
            IDiagramEditorFactory factory = DiagramEditorFactoryExtensionHandler.INSTANCE.getFactory(model);
            if(factory != null) {
                editPartFactory = factory.createEditPartFactory();
            }
        }
        
        if(editPartFactory == null) {
            throw new RuntimeException("Unsupported model type"); //$NON-NLS-1$
        }
        
        GraphicalViewerImpl viewer = new GraphicalViewerImpl();
        viewer.createControl(parent);
        
        viewer.setEditPartFactory(editPartFactory);
        
        RootEditPart rootPart = new FreeformGraphicalRootEditPart();
        viewer.setRootEditPart(rootPart);
        
        viewer.setContents(model);
        viewer.flush();
        
        return viewer;
    }
    
    /**
     * @param model
     * @return An Image from the given Diagram Model
     *         Clients must dispose of the Image when done.
     */
    public static Image createImage(IDiagramModel model) {
        return createImage(model, 1);
    }
    
    /**
     * @param model
     * @return A Scaled Image from the given Diagram Model
     *         Clients must dispose of the Image when done.
     */
    public static Image createImage(IDiagramModel model, double scale) {
    	return createImage(model, scale, 0);
    }
    public static Image createImage(IDiagramModel model, double scale, int margin) {
        Shell shell = new Shell();
        shell.setLayout(new FillLayout());
        
        GraphicalViewer viewer = createViewer(model, shell);
        Image image = createImage(viewer, scale, margin);
        shell.dispose();
        
        return image;
    }

    public static Image createImage(IFigure figure, double scale, int margin) {
        Rectangle rectangle = getMinimumBounds(figure);
        return createImageFromFigureWithBounds(scale, margin, figure, rectangle);
    }
    public static Image createImage(GraphicalViewer diagramViewer, double scale, int margin) {
        IFigure rootFigure = getFigureFromViewer(diagramViewer);
        return createImage(rootFigure, scale, margin);
    }

	private static IFigure getFigureFromViewer(GraphicalViewer diagramViewer) {
		LayerManager layerManager = (LayerManager)diagramViewer.getEditPartRegistry().get(LayerManager.ID);
        IFigure rootFigure = layerManager.getLayer(LayerConstants.PRINTABLE_LAYERS);
		return rootFigure;
	}

	private static Image createImageFromFigureWithBounds(double scale,
			int margin, IFigure figure, Rectangle rectangle) {
		scale = normalizeScale(scale);
        rectangle = normalizeRectangle(rectangle, scale, margin);
        
        Image image = new Image(Display.getDefault(), (int)(rectangle.width * scale), (int)(rectangle.height * scale) );
        GC gc = new GC(image);
        SWTGraphics swtGraphics = new SWTGraphics(gc);
        Graphics graphics = swtGraphics;
        
        
        graphics = isScaleThenScaleNow(scale, swtGraphics, graphics);
        
        // Compensate for negative co-ordinates
        graphics.translate(rectangle.x * -1, rectangle.y * -1);

        // Paint onto graphics
        figure.paint(graphics);
        
        disposeGraphicsUsed(gc, swtGraphics, graphics);
        
        return image;
	}

	private static Graphics isScaleThenScaleNow(double scale,
			SWTGraphics swtGraphics, Graphics graphics) {
		if(scale != 1) {
            graphics = new ScaledGraphics(swtGraphics);
            graphics.scale(scale);
        }
		return graphics;
	}

	private static void disposeGraphicsUsed(GC gc, SWTGraphics swtGraphics,
			Graphics graphics) {
		gc.dispose();
        graphics.dispose();
        if(swtGraphics != graphics) {
            swtGraphics.dispose();
        }
	}

	private static Rectangle normalizeRectangle(Rectangle rectangle, double scale,
			int margin) {
		if(rectangle == null) {
            rectangle = new Rectangle(0, 0, 100, 100); // At least a minimum
        }
        else {
            rectangle.expand(margin / scale, margin / scale);
        }
		return rectangle;
	}


	private static double normalizeScale(double scale) {
		if(scale <= 0) {
            scale = 1;
        }
        if(scale > 4) {
            scale = 4;
        }
		return scale;
	}
    /**
     * @param diagramViewer
     * @return An Image from the given GraphicalViewer trimming off whitespace
     *         Clients must dispose of the Image when done.
     */
    public static Image createImage(GraphicalViewer diagramViewer) {
        return createImage(diagramViewer, 1, 0);
    }
    
    
    public static Rectangle getMinimumBounds(GraphicalViewer diagramViewer) {
	    IFigure rootFigure = getFigureFromViewer(diagramViewer);
	    Rectangle mb = getMinimumBounds(rootFigure);
		return normalizeRectangle(mb,1,0);
    }
    public static Rectangle getMinimumBounds(IFigure figure) {
        Rectangle minimumBounds = null;
        
        for(Object child : figure.getChildren()) {
            Rectangle bounds;
            if(child instanceof FreeformLayer) {
                bounds = getMinimumBounds((IFigure)child);
            }
            else {
                bounds = ((IFigure)child).getBounds();
            }
            
            if(bounds != null) {
                if(minimumBounds == null) {
                    minimumBounds = new Rectangle(bounds);
                }
                else {
                    minimumBounds.union(bounds);
                }
            }
        }
        return minimumBounds;
    }
    
}
