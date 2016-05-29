package org.rulez.magwas.zenta.model.handmade;

import org.rulez.magwas.zenta.model.IAndJunction;
import org.rulez.magwas.zenta.model.IOrJunction;
import org.rulez.magwas.zenta.model.impl.AndJunctionBase;
import org.rulez.magwas.zenta.model.impl.OrJunctionBase;

public class OrJunction extends OrJunctionBase implements IOrJunction {

	@Override
	public void setName(String value) {
		if (isChecked())
			checkName(value);
		super.setName(value);
	}
}
