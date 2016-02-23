package org.rulez.magwas.zenta.model.info;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class BasicConnectionInfoProviderTest {

	private BasicConnectionInfoProvider fixture;
	
	@Before
	public void setUp() {
		fixture = new BasicConnectionInfoProvider();
	}

	@Test
	public void provider_is_correct() {
		assertEquals(fixture.providerFor(), IZentaPackage.eINSTANCE.getBasicRelationship());
	}
	
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(), "Basic relation");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(), "Basic");
	}

	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(),"img/zenta/association-16.png");
	}

	@Test
	public void color_is_correct() {
		assertEquals(fixture.getDefaultColorString(),"#ffffff");
	}

}
