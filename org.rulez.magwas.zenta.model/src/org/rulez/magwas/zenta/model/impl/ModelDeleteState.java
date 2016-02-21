package org.rulez.magwas.zenta.model.impl;

import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.UndoState;

public class ModelDeleteState implements UndoState {

	private IZentaModel model;

	ModelDeleteState(IZentaModel model) {
		this.model = model;
	}
	@Override
	public void undelete() {
		throw new UnsupportedOperationException();

	}

	@Override
	public INameable getElement() {
		return model;
	}

}
