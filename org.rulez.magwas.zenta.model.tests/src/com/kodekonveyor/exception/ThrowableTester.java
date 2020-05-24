package com.kodekonveyor.exception;

import static org.junit.Assert.*;

import org.junit.platform.commons.util.ExceptionUtils;

public class ThrowableTester {// NOPMD

	public static void assertNoException(final Thrower thrower) {
		try {
			thrower.throwException();
		} catch (final Throwable e) {// NOPMD
			fail("exception thrown");
		}
	}

	public static ThrowableTester assertThrows(final Thrower thrower) {
		final ThrowableTester tester = new ThrowableTester();
		return tester._assertThrows(thrower);
	}

	public Throwable thrown;// NOPMD

	private ThrowableTester() {

	}

	private ThrowableTester _assertThrows(final Thrower thrower) {// NOPMD
		try {
			thrower.throwException();
		} catch (final Throwable exception) { // NOPMD AvoidCatchingThrowable
			thrown = exception;
		}
		if (thrown == null)
			fail("no exception thrown");
		return this;
	}

	public ThrowableTester assertException(final Class<? extends Throwable> klass) {
		final String message = String.format("expected %s but got %s", klass, ExceptionUtils.readStackTrace(thrown));
		assertEquals(message, klass, thrown.getClass());
		return this;
	}

	public ThrowableTester assertMessageContains(final String string) {
		assertTrue("message does not contain: " + string + "\n got:" + thrown.getMessage(),
				thrown.getMessage().contains(string));
		return this;
	}

	public ThrowableTester assertMessageIs(final String message) {
		assertEquals(message, thrown.getMessage());
		return this;
	}

	public ThrowableTester assertMessageMatches(final String string) {
		assertNotNull("no message of the exception", thrown.getMessage());
		assertTrue("message does not match. \nexpected: " + string + "\n got:" + thrown.getMessage(),
				thrown.getMessage().matches(string));
		return this;
	}

	public ThrowableTester assertStackClass(final int stackIndex, final String string) {
		final StackTraceElement stackElement = getStackTraceElement(stackIndex);
		assertEquals(string, stackElement.getClassName());
		return this;
	}

	public ThrowableTester assertStackFileName(final int stackIndex, final String string) {
		final StackTraceElement stackElement = getStackTraceElement(stackIndex);
		assertEquals(string, stackElement.getFileName());
		return this;
	}

	public ThrowableTester assertStackLineNumber(final int stackIndex, final int lineNumber) {
		final StackTraceElement stackElement = getStackTraceElement(stackIndex);
		assertEquals(lineNumber, stackElement.getLineNumber());
		return this;
	}

	public ThrowableTester assertStackMethod(final int stackIndex, final String string) {
		final StackTraceElement stackElement = getStackTraceElement(stackIndex);
		assertEquals(string, stackElement.getMethodName());
		return this;
	}

	public ThrowableTester assertUnimplemented(final Thrower thrower) {
		assertThrows(thrower).assertException(UnsupportedOperationException.class);
		return this;
	}

	public Throwable getException() {
		return thrown;
	}

	private StackTraceElement getStackTraceElement(final int stackIndex) {
		return thrown.getStackTrace()[stackIndex];
	}

	public ThrowableTester showStackTrace() {
		thrown.printStackTrace(); // NOPMD AvoidPrintStackTrace
		return this;
	}

}
