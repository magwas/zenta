package org.rulez.magwas.zenta.model;

public class ModelConsistencyException extends Error {

	private ZentaObject element;

	public ModelConsistencyException(String message, ZentaObject element) {
		super(message);
		this.element=element;
	}
	
	public ZentaObject getElement() {
		return element;
	}

	private static final long serialVersionUID = 1L;

}
