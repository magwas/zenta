package org.rulez.magwas.zenta.model.manager;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class ModelImageTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void modelImage_adapts_to_given_class() throws IncompatibleClassException {
		TestModelImage f = new TestModelImage("foo");
		assertEquals("foo", f.adapt(String.class));
	}

	@Test
	public void modelImage_adapt_throws_Exception_if_type_is_incompatible() throws IncompatibleClassException {
		TestModelImage f = new TestModelImage("foo");
		exception.expect(IncompatibleClassException.class);
		f.adapt(ModelImageTest.class);
	}

}
