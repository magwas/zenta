package org.rulez.magwas.zenta.model.handmade;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.rulez.magwas.zenta.model.ZentaObject;

public class ZentaObjectImpl extends EObjectImpl implements ZentaObject {
	protected boolean checked = false;

	@Override
	public boolean isChecked() {
		return checked;
	}

	@Override
	public void setChecked(boolean value) {
		checked = value;
	}

}
