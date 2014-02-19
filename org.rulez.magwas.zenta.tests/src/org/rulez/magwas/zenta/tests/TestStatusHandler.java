package org.rulez.magwas.zenta.tests;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.util.StatusHandler;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class TestStatusHandler extends StatusHandler {

	public IStatus status = null;
	
	@Override
	public void show(@Nullable IStatus status, @Nullable String title) {
		this.status = Util.verifyNonNull(status);
	}

}
