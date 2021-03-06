package org.rulez.magwas.zenta.controller.info;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class LineConnectionInfoProviderTest {

	private LineConnectionInfoProvider fixture;
	
	@Before
	public void setUp() {
		fixture = new LineConnectionInfoProvider();
	}

	@Test
	public void provider_is_correct() {
		assertEquals(fixture.providerFor(), IZentaPackage.eINSTANCE.getDiagramModelConnection());
	}
	
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(), "Connection");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(), "Connection");
	}

	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(),"img/connection-plain-16.png");
	}

	@Test
	public void color_is_correct() {
		assertEquals(fixture.getDefaultColorString(),"#ffffff");
	}

}
