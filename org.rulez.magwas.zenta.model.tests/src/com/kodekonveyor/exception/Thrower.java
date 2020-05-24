package com.kodekonveyor.exception;

import com.kodekonveyor.annotations.InterfaceClass;

@FunctionalInterface
@InterfaceClass
public interface Thrower {

	void throwException() throws Throwable;
}
