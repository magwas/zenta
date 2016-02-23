package org.rulez.magwas.zenta.controller;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static boolean running = false;

	static BundleContext getContext() {
		if(! running)
			throw new AssertionError();
		return context;
	}

	public void start( BundleContext bundleContext) throws Exception {
		Util.verifyNonNull(bundleContext);
		Activator.context = bundleContext;
		running = true;
	}

	public void stop( BundleContext bundleContext) throws Exception {
		running = false;
	}

}
