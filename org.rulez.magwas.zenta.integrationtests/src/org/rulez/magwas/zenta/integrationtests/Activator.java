package org.rulez.magwas.zenta.integrationtests;

import org.eclipse.jdt.annotation.Nullable;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private static boolean started = false;

	@SuppressWarnings("null")
	static BundleContext getContext() {
		if(!started)
			throw new AssertionError();
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(@Nullable BundleContext bundleContext) throws Exception {
		context = bundleContext;
		started = true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(@Nullable BundleContext bundleContext) throws Exception {
		started = false;
	}

}
