package org.rulez.magwas.zenta.editor.diagram.figures.connections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class ConnectionDecorationFactory {

	private static ConnectionDecorationFactory INSTANCE;
	private static HashMap<String,IConnectionDecoration> decorClassMap = new HashMap<String,IConnectionDecoration>();
	private static final int WIDTH = 60;
	private static final int HEIGHT = 20;
	
	private ConnectionDecorationFactory() {
		String[] decors = {
				"SmallEndArrowDecoration",
				"SmallStartArrowDecoration",
				"DiamondSourceDecoration",
				"DiamondTargetDecoration",
				"DotSourceDecoration",
				"DotTargetDecoration",
				"BigArrowTargetDecoration",
				"SparseDashedLineDecoration",
				"BigArrowSourceDecoration",
				"DottedLineDecoration",
				"DashedLineDecoration"};
		for(String decorName : Arrays.asList(decors))
			addDecorForName(decorName);
	}
		private void addDecorForName(String decorName) {
			try {
				Class<?> klass = Class.forName("org.rulez.magwas.zenta.editor.diagram.figures.connections."+ decorName);
				IConnectionDecoration flowDecor = (IConnectionDecoration) klass.newInstance();
				String name = flowDecor.getClass().getSimpleName();
				decorClassMap.put(name,flowDecor);				
			} catch (Exception e) {
				throw new IllegalDecorName();
			}
		}
			public class IllegalDecorName extends RuntimeException {
				private static final long serialVersionUID = 1L;
			}
	
	public static ConnectionDecorationFactory getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new ConnectionDecorationFactory();
		}
		return INSTANCE;
	}
	
	public Set<String> getFigureNames() {
		return decorClassMap.keySet();
	}

	public IConnectionDecoration getByName(String decorName) {
		return decorClassMap.get(decorName);
	}

	public Image getImageForName(String name) {
		checkShapeValue(name);
		IFigure panel = new Figure();
        Image image = new Image(Display.getDefault(), WIDTH, HEIGHT);
        Color white = new Color(image.getDevice(), 255, 255, 255);
        image.setBackground(white);
        panel.setBackgroundColor(white);
		drawConnectionOnPanel(name, panel);
		paintPanel(panel, image);
		return image;
	}

		private void drawConnectionOnPanel(String name, IFigure panel) {
			IConnectionDecoration decorator = getByName(name);
			PolylineConnection conn = new PolylineConnection();
			conn.setStart(new Point(10,HEIGHT/2));
			conn.setEnd(new Point(WIDTH- 10,HEIGHT/2));
			decorator.setFigureProperties(conn);
			panel.add(conn);
			conn.layout();
		}

		private void paintPanel(IFigure panel, Drawable image) {
			GC gc = new GC(image);
			SWTGraphics graphics = new SWTGraphics(gc);
			panel.paint(graphics);
		}

		private void checkShapeValue(String shapeName) throws IllegalArgumentException{
			for(String i : decorClassMap.keySet())
				if(i.equals(shapeName))
					return;
			throw new IllagalShapeName();
		}
			public class IllagalShapeName extends RuntimeException {
				private static final long serialVersionUID = 1L;
			}
		
}
