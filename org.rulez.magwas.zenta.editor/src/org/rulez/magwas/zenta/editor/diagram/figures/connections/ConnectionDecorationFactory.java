package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;

public class ConnectionDecorationFactory {

	private static ConnectionDecorationFactory INSTANCE;
	
	private static HashMap<String,Class<?>> decorClassMap = new HashMap<String,Class<?>>();
	private static final String defaultDecorName = "";
	
	ConnectionDecorationFactory() {
		decorClassMap.put(defaultDecorName, AssociationConnectionDecoration.class);
		decorClassMap.put("sggregationDecor", AggregationConnectionDecoration.class);
		decorClassMap.put("assignmentDecor", AssignmentConnectionDecoration.class);
		decorClassMap.put("compositionDecor", CompositionDecoration.class);
		decorClassMap.put("flowDecor", FlowConnectionDecoration.class);
		decorClassMap.put("influenceDecor", InfluenceConnectionDecoration.class);
		decorClassMap.put("realisationDecor", RealisationConnectionDecoration.class);
		decorClassMap.put("triggeringDecor", TriggeringConnectionDecoration.class);
		decorClassMap.put("flowDecor", FlowConnectionDecoration.class);
		//FIXME: more decor types here, have some structure
	}

	
	public static ConnectionDecorationFactory getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new ConnectionDecorationFactory();
		}
		return INSTANCE;
	}
	
	public static  Set<String> getFigureNames() {
		return decorClassMap.keySet();
	}


	public static String getDefaultFigureName() {
		return defaultDecorName;
	}
	private static Class<?> convertStringToFigure(String shapeValue) {
		if("".equals(shapeValue)) {
			shapeValue = getDefaultFigureName();
		}
		return decorClassMap.get(shapeValue);
	}

	public static Image getImageForName(String name) {
		checkShapeValue(name);
		return IZentaImages.ImageFactory.getImage(IZentaImages.IMGPATH+name+".png");
	}

	public static void checkShapeValue(String shapeName) throws IllegalArgumentException{
		if (null == shapeName) {
			return;
		}
		for(String i : decorClassMap.keySet()) {
			if(i.equals(shapeName)){
				return;
			}
		}
		System.out.println("shape name = "+shapeName);
		throw new IllegalArgumentException("illagal shape name");
	}
    public static AbstractConnectionDecoration getByName(String shape, AbstractZentaConnectionFigure parent) {
       @SuppressWarnings("unchecked")
       Class<AbstractConnectionDecoration> figureClass = (Class<AbstractConnectionDecoration>) convertStringToFigure(shape);
       Constructor<AbstractConnectionDecoration> constructor;
       AbstractConnectionDecoration obj;
                       try {
						constructor = figureClass.getConstructor(AbstractZentaConnectionFigure.class);
						obj = constructor.newInstance(parent);
					} catch (NoSuchMethodException | SecurityException|InstantiationException | IllegalAccessException
							| IllegalArgumentException
							| InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
	                       throw new IllegalArgumentException("Problem with creating the figure");
					}
        return obj;
    }

}
