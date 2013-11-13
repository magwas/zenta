package org.rulez.magwas.zenta.model.tests;

import static org.junit.Assert.*;

import org.eclipse.core.runtime.Platform;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlatformTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String platform = Platform.getOS();
		System.out.println("platform is "+platform);
		fail("Not yet implemented");
	}

}
