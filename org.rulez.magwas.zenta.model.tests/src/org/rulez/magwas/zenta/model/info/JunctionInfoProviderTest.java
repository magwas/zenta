package org.rulez.magwas.zenta.model.info;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class JunctionInfoProviderTest {

	private JunctionInfoProvider fixture;
	
	@Before
	public void setUp() {
		fixture = new JunctionInfoProvider();
	}

	@Test
	public void provider_is_correct() {
		assertEquals(fixture.providerFor(), IZentaPackage.eINSTANCE.getJunction());
	}
	
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(), "Junction");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(), "Junction");
	}

	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(),"img/zenta/junction-16.png");
	}

	@Test
	public void color_is_correct() {
		assertEquals(fixture.getDefaultColorString(),"#ffffff");
	}

}
