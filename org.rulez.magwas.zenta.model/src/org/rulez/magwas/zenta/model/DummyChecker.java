package org.rulez.magwas.zenta.model;

public interface DummyChecker {
	default void check() {
		throw new ModelConsistencyException("No override for check in superclass", null);
	}


}
