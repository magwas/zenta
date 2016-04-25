package org.rulez.magwas.zenta.model.handmade;

import org.rulez.magwas.zenta.model.IAndJunction;
import org.rulez.magwas.zenta.model.impl.AndJunctionBase;

public class AndJunction extends AndJunctionBase implements IAndJunction {

	@Override
	public void setName(String value) {
		if (isChecked())
			checkName(value);
		super.setName(value);
	}
}
