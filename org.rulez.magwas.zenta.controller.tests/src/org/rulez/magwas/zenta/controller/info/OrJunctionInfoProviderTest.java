package org.rulez.magwas.zenta.controller.info;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class OrJunctionInfoProviderTest {

	private OrJunctionInfoProvider fixture;
	
	@Before
	public void setUp() {
		fixture = new OrJunctionInfoProvider();
	}

	@Test
	public void provider_is_correct() {
		assertEquals(fixture.providerFor(), IZentaPackage.eINSTANCE.getOrJunction());
	}
	
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(), "Or Junction");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(), "Or Junction");
	}
	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(),"img/zenta/junction-or-16.png");
	}

	@Test
	public void color_is_correct() {
		assertEquals(fixture.getDefaultColorString(),"#000000");
	}

}
