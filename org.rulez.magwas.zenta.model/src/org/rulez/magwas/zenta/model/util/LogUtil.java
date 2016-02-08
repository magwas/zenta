package org.rulez.magwas.zenta.model.util;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rulez.magwas.zenta.model.IZentaFactory;

public class LogUtil {

    /**
     * Convenience method to log an OK event
     * 
     * @param message Message to print
     * @param t Exception that is thrown
     */
    public static void logOK(String message, Throwable t) {
        log(IStatus.OK, message, t);
    }

    /**
     * Convenience method to log an OK event
     * 
     * @param message Message to print
     */
    public static void logOK(String message) {
        log(IStatus.OK, message, null);
    }

    /**
     * Convenience method to log an error
     * 
     * @param message Message to print
     * @param t Exception that is thrown
     */
    public static void logError(String message, Throwable t) {
        log(IStatus.ERROR, message, t);
    }

    /**
     * Convenience method to log an error
     * 
     * @param message Message to print
     */
    public static void logError(String message) {
        log(IStatus.ERROR, message, null);
    }

    /**
     * Convenience method to log some info
     * 
     * @param message Message to print
     * @param t Exception that is thrown
     */
    public static void logInfo(String message, Throwable t) {
        log(IStatus.INFO, message, t);
    }

    /**
     * Convenience method to log some info
     * 
     * @param message Message to print
     * @param t Exception that is thrown
     */
    public static void logInfo(String message) {
        log(IStatus.INFO, message, null);
    }

    /**
     * Convenience method to log a warning
     * 
     * @param message Message to print
     * @param t Exception that is thrown
     */
    public static void logWarning(String message, Throwable t) {
        log(IStatus.WARNING, message, t);
    }

    /**
     * Convenience method to log a warning
     * 
     * @param message Message to print
     */
    public static void logWarning(String message) {
        log(IStatus.WARNING, message, null);
    }

    /**
     * Helper logger to log events for this bundle plug-in
     * 
     * @param severity can be
     *          IStatus.WARNING
     *          IStatus.INFO
     *          IStatus.ERROR
     *          IStatus.OK
     *          IStatus.CANCEL
     * @param message Message to print
     * @param t Exception that is thrown
     */
    public static void log(int severity, String message, Throwable t) {
        EcorePlugin.INSTANCE.log(
                new Status(severity, "zenta", IStatus.OK, message, t));
    }
    
	public static void logException(Throwable exception) {
		EcorePlugin.INSTANCE.log(exception);
		StringWriter sw = new StringWriter();
		exception.printStackTrace(new PrintWriter(sw));
		String stacktrace = sw.toString();
		EcorePlugin.INSTANCE.log(stacktrace);
   		IZentaFactory.eINSTANCE.getEditorInterface().bailOut();
	}

}