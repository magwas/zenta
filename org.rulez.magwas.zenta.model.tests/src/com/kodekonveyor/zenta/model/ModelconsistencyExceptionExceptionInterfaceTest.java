package com.kodekonveyor.zenta.model;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.rulez.magwas.zenta.model.ModelConsistencyException;
import org.rulez.magwas.zenta.model.ZentaObject;

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;

@TestedService("ModelConsistencyException")
@TestedBehaviour("exception interface")
public class ModelconsistencyExceptionExceptionInterfaceTest {

	private ZentaObject element;
	private ModelConsistencyException exception;

	@Test
	@DisplayName("getElement obtains the element")
	void test1() {
		assertEquals(element, exception.getElement());
	}

	@Test
	@DisplayName("the message contains the element description")
	void test2() {
		assertTrue(exception.getMessage().contains(ModelConsistencyExceptiontestData.THE_DESCRIPTION_OF_THE_ELEMENT));
	}

	@Test
	@DisplayName("the message contains the message given")
	void test3() {
		assertTrue(exception.getMessage().contains(ModelConsistencyExceptiontestData.MESSAGE));
	}

	@BeforeEach
	void setUp() {
		element = mock(ZentaObject.class);
		doReturn(ModelConsistencyExceptiontestData.THE_DESCRIPTION_OF_THE_ELEMENT).when(element).toString();
		exception = new ModelConsistencyException(ModelConsistencyExceptiontestData.MESSAGE, element);
	}
}
