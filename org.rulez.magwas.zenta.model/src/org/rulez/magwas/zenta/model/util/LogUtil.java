package org.rulez.magwas.zenta.model.util;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class LogUtil {
	public static void logException(Throwable exception) {
		EcorePlugin.INSTANCE.log(exception);
		StringWriter sw = new StringWriter();
		exception.printStackTrace(new PrintWriter(sw));
		String stacktrace = sw.toString();
		EcorePlugin.INSTANCE.log(stacktrace);
	}

}