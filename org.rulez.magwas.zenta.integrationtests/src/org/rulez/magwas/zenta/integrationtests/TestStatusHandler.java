package org.rulez.magwas.zenta.integrationtests;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.util.StatusHandler;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class TestStatusHandler extends StatusHandler {

	public IStatus status = null;
	
	@Override
	public void show( IStatus status,  String title) {
		this.status = Util.verifyNonNull(status);
	}

}
