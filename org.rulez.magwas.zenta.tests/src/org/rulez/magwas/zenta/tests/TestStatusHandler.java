package org.rulez.magwas.zenta.tests;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.util.StatusHandler;

public class TestStatusHandler extends StatusHandler {

	public IStatus status = null;
	
	@Override
	public void show(IStatus status, String title) {
		this.status = status;
		System.out.printf("status=%s\ntitle=%s\n", status, title);
	}

}
