package org.rulez.magwas.zenta.model;

public class UnTestedException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public static void raise() {
		throw new UnTestedException();
	}
}
