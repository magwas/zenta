package org.rulez.magwas.zenta.editor.ui;


import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractMotivationFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.ApplicationComponentFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.BusinessContractFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.BusinessEventFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.BusinessMeaningFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.BusinessProcessFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.BusinessProductFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.BusinessRepresentationFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.BusinessServiceFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.DeliverableFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.EllipseFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.EtalonFigureMock;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.IFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.RectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.RoundedRectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.TechnologyArtifactFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.TechnologyDeviceFigureDelegate1;
import org.rulez.magwas.zenta.editor.diagram.figures.TechnologyDeviceFigureDelegate2;
import org.rulez.magwas.zenta.editor.diagram.figures.TechnologyNodeFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.business.BasicObjectFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.business.BusinessValueFigureDelegate;
public class FigureFactory {

	public static final String RECTANGLE_ELEMENT_SHAPE = "rectangleElementShape";

	private static Map<String,Class<?>> figureClassMap = new HashMap<String,Class<?>>();

	private static final String defaultFigureName = RECTANGLE_ELEMENT_SHAPE;
	private static FigureFactory INSTANCE;
	
	FigureFactory() {
		figureClassMap.put(defaultFigureName, BasicObjectFigureDelegate.class);
		figureClassMap.put("emptyShape", RectangleFigureDelegate.class);
		figureClassMap.put("roundedRectangleShape", RoundedRectangleFigureDelegate.class);
		figureClassMap.put("ellipseShape", BusinessValueFigureDelegate.class);
		figureClassMap.put("ellipseShape2", EllipseFigureDelegate.class);
		figureClassMap.put("deviceShape", TechnologyDeviceFigureDelegate1.class);
		figureClassMap.put("deviceShape2", TechnologyDeviceFigureDelegate2.class);
		figureClassMap.put("applicationShape", ApplicationComponentFigureDelegate.class);
		figureClassMap.put("nodeShape", TechnologyNodeFigureDelegate.class);
		figureClassMap.put("artifactShape", TechnologyArtifactFigure.class);
		figureClassMap.put("serviceShape", BusinessServiceFigure.class);
		figureClassMap.put("representationShape", BusinessRepresentationFigure.class);
		figureClassMap.put("processShape", BusinessProcessFigureDelegate.class);
		figureClassMap.put("productShape", BusinessProductFigure.class);
		figureClassMap.put("contractShape", BusinessContractFigure.class);
		figureClassMap.put("eventShape", BusinessEventFigure.class);
		figureClassMap.put("meaningShape", BusinessMeaningFigure.class);
		figureClassMap.put("deliverableShape", DeliverableFigure.class);
		figureClassMap.put("motivationShape", AbstractMotivationFigure.class);
	}
	
	public static FigureFactory getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new FigureFactory();
		}
		return INSTANCE;
	}
	
	public static  Set<String> getFigureNames() {
		return figureClassMap.keySet();
	}
	
	public static String getDefaultFigureName() {
		return defaultFigureName;
	}
	private static Class<?> convertStringToFigure(String shapeValue) {
		if(null == shapeValue || "".equals(shapeValue)) {
			shapeValue = defaultFigureName;
		}
		Class<?> klass = figureClassMap.get(shapeValue);
		return klass;
	}

	public static Image getImageForName(String name) {
		checkShapeValue(name);
		AbstractDiagramModelObjectFigure mockFigure = new EtalonFigureMock();
		IFigureDelegate delegate = FigureFactory.getDelegate(name, (AbstractDiagramModelObjectFigure) mockFigure);
		Image image = getImageFromDelegate(delegate);

		return image;
	}

	private static Image getImageFromDelegate(IFigureDelegate delegate) {
		Image image = new Image(Display.getDefault(), 140, 75);
		GC gc = new GC(image);
		Graphics graphics = new SWTGraphics(gc);
		delegate.drawFigure(graphics);
	    graphics.dispose();
		gc.dispose();
		return image;
	}

	public static void checkShapeValue(String shapeName) throws IllegalArgumentException{
		if (null == shapeName) {
			return;
		}
		for(String i : figureClassMap.keySet()) {
			if(i.equals(shapeName)){
				return;
			}
		}
		throw new IllegalArgumentException("illagal shape name: "+ shapeName);
	}

    public static IFigureDelegate getDelegate(String shape, AbstractDiagramModelObjectFigure parent) {
       @SuppressWarnings("unchecked")
       Class<IFigureDelegate> figureClass = (Class<IFigureDelegate>) convertStringToFigure(shape);
       Constructor<IFigureDelegate> constructor;
       IFigureDelegate obj;
               try {
						constructor = figureClass.getConstructor(IDiagramModelObjectFigure.class);
						obj = constructor.newInstance(parent);
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
        return obj;
    }

}
