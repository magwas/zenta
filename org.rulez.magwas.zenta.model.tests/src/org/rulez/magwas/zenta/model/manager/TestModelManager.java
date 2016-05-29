package org.rulez.magwas.zenta.model.manager;

import org.rulez.magwas.zenta.model.IZentaModel;

public class TestModelManager extends AbstractEditorModelManager {

	private IModelManagerTest test;
	public TestModelManager(IModelManagerTest test) {
		this.test=test;
	}
	@Override
	public boolean isModelDirty(IZentaModel model) {
		return test.isDirty();
	}

}
