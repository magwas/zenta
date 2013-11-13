package org.rulez.magwas.zenta.editor.diagram.figures.connections;

public abstract class AbstractConnectionDecoration {

	/*
	 * constructor signature:
	 * 
	 * public IConnectionDelegate(AbstractZentaConnectionFigure connection);
	 */
	
	protected AbstractZentaConnectionFigure owner;


	AbstractConnectionDecoration() {
		throw new IllegalArgumentException("should not implicitly constructed");
	}
	
	public AbstractConnectionDecoration(AbstractZentaConnectionFigure connection) {
    	owner = connection;		
	}
	
    public abstract void setFigureProperties();

}