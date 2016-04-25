package org.rulez.magwas.zenta.model.handmade;

import org.rulez.magwas.zenta.model.impl.ZentaDiagramModelBase;

public class ZentaDiagramModel extends ZentaDiagramModelBase {
	
	@Override
	public void setId(String value) {
		if (isChecked())
			checkId(value);
		super.setId(value);
	}

	@Override
	public void setDocumentation(String value) {
		if (isChecked())
			checkDocumentation(value);
		super.setDocumentation(value);
	}

}
