package org.rulez.magwas.zenta.model.manager;

import static org.junit.Assert.*;

import org.junit.Test;
public class ModelImageTest {

	@Test
	public void modelImage_adapts_to_given_class() throws IncompatibleClassException {
		TestModelImage f = new TestModelImage("foo");
		assertEquals("foo", f.adapt(String.class));
	}

	@Test(expected=IncompatibleClassException.class)
	public void modelImage_adapt_throws_Exception_if_type_is_incompatible() throws IncompatibleClassException {
		TestModelImage f = new TestModelImage("foo");
		f.adapt(ModelImageTest.class);
	}

}
