package org.rulez.magwas.zenta.editor.ui;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.IDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.diagram.figures.IFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.RectangleFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.business.BasicObjectFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.business.BusinessValueFigureDelegate;
import org.rulez.magwas.zenta.editor.diagram.figures.business.DiagramModelReferenceFigureDelegate;


public class FigureFactory {

	public static final String RECTANGLE_ELEMENT_SHAPE = "rectangleElementShape";

	private static Map<String,Class<?>> figureClassMap = new HashMap<String,Class<?>>();

	private static final String defaultFigureName = RECTANGLE_ELEMENT_SHAPE;
	private static FigureFactory INSTANCE;
	
	FigureFactory() {
		figureClassMap.put(defaultFigureName, BasicObjectFigureDelegate.class);
		figureClassMap.put("diagramReferenceShape", DiagramModelReferenceFigureDelegate.class);
		figureClassMap.put("emptyShape", RectangleFigureDelegate.class);
		figureClassMap.put("ellipseShape", BusinessValueFigureDelegate.class);
		//FIXME: more figure types here
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
		if("".equals(shapeValue)) {
			shapeValue = defaultFigureName;
		}
		return figureClassMap.get(shapeValue);
	}

	public static Image getImageForName(String name) {
		checkShapeValue(name);
		return IZentaImages.ImageFactory.getImage(IZentaImages.IMGPATH+name+".png");
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
		System.out.println("shape name = "+shapeName);
		throw new IllegalArgumentException("illagal shape name");
	}
    public static IFigureDelegate getDelegate(String shape, AbstractDiagramModelObjectFigure parent) {
       @SuppressWarnings("unchecked")
       Class<IFigureDelegate> figureClass = (Class<IFigureDelegate>) convertStringToFigure(shape);
       Constructor<IFigureDelegate> constructor;
       IFigureDelegate obj;
                       try {
						constructor = figureClass.getConstructor(IDiagramModelObjectFigure.class);
						obj = constructor.newInstance(parent);
					} catch (NoSuchMethodException | SecurityException|InstantiationException | IllegalAccessException
							| IllegalArgumentException
							| InvocationTargetException e) {
						throw new RuntimeException(e);
					}
        return obj;
    }

}
