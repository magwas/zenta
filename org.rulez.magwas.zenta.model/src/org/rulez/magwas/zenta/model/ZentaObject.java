package org.rulez.magwas.zenta.model;

import org.eclipse.emf.ecore.EObject;

public interface ZentaObject extends EObject, DummyChecker {

	void setChecked(boolean value);
	boolean isChecked();
	//uncomment for consistency checks void check();

}
