package org.rulez.magwas.zenta.model.handmade;

import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.impl.JunctionBase;

public class Junction extends JunctionBase {
    protected Junction() {
		super();
		setId(IZentaFactory.eINSTANCE.getNewID());
	}

    @Override
    public void setName(String value) {
    	if (isChecked())
    		checkName(value);
    	super.setName(value);
    }
}
