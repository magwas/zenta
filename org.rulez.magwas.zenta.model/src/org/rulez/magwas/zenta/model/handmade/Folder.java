package org.rulez.magwas.zenta.model.handmade;

import org.rulez.magwas.zenta.model.impl.FolderBase;

public class Folder extends FolderBase {

	Folder() {
		super();
		this.eAdapters().add(new FolderChangeAdapter());
	}
	@Override
	public void setId(String value) {
		if(isChecked())
			checkId(value);
		super.setId(value);
	}

	@Override
	public void setDocumentation(String value) {
		if(isChecked())
			checkDocumentation(value);
		super.setDocumentation(value);
	}

	@Override
	public void setName(String value) {
		if(isChecked())
			checkName(value);
		super.setName(value);
	}
	
}
