package org.rulez.magwas.zenta.model.handmade;


import org.rulez.magwas.zenta.model.impl.ZentaModelBase;

public class ZentaModel extends ZentaModelBase {

	@Override
	public void setId(String value) {
		if (checked)
			checkId(value);
		super.setId(value);
	}

	@Override
	public void setName(String value) {
		checkName(value);
		super.setName(value);
	}

	@Override
	public void setDocumentation(String value) {
		if (checked)
			checkDocumentation(value);
		super.setDocumentation(value);
	}

	@Override
	public void setVersion(String value) {
		if (checked)
			checkVersion(value);
		super.setVersion(value);
	}

}
