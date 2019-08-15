package org.rulez.magwas.zenta.editor.ui;

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.controller.InfoProvider;
import org.rulez.magwas.zenta.integrationtests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class ZentaLabelProviderTest {

	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() {
		testdata = new ModelAndEditPartTestData();
		klass = IZentaPackage.eINSTANCE.getSketchModelSticky();
		ojjectum = IZentaFactory.eINSTANCE.createSketchModelSticky();
		extensionObject = IZentaPackage.eINSTANCE.getAttribute_MinOccurs();
		fixture = ZentaLabelProvider.INSTANCE;
	}

	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
	}
	private InfoProvider fixture;
	private EClass klass;
	private EObject ojjectum;
	private EObject extensionObject;
		
	@Test
	public void default_name_is_correct() {
		assertEquals(fixture.getDefaultName(klass), "Sticky");
	}

	@Test
	public void default_short_name_is_correct() {
		assertEquals(fixture.getDefaultShortName(klass), "Sticky");
	}
	@Test
	public void image_info_is_correct() {
		assertEquals(fixture.getImageInfo(klass),"img/sticky-16.png");
	}

	@Test
	public void default_name_is_correct_for_instance() {
		assertEquals(fixture.getDefaultName( ojjectum), "Sticky");
	}

	@Test
	public void default_short_name_is_correct_for_instance() {
		assertEquals(fixture.getDefaultShortName(ojjectum), "Sticky");
	}
	@Test
	public void image_info_is_correct_for_instance() {
		assertEquals(fixture.getImageInfo(ojjectum),"img/sticky-16.png");
	}

	@Test
	public void default_name_is_correct_for_extension() {
		assertEquals(fixture.getDefaultName( extensionObject), "Árvíztűrő Tükörfúrógép");
	}

	@Test
	public void default_short_name_is_correct_for_extension() {
		assertEquals(fixture.getDefaultShortName(extensionObject), "Árvíztűrő Tükörfúrógép");
	}
	@Test
	public void image_info_is_correct_for_extension() {
		assertEquals("img/example-image-which-actually-does-not-exists.png", fixture.getImageInfo(extensionObject));
	}

	@Test
	public void We_get_a_relationship_sentence_even_when_there_is_no_ObjectClass() {
		String id = "77d87cf5";
		IBasicRelationship rel = testdata.getRelationByID(id);
		String sentence = ZentaLabelProvider.INSTANCE.getRelationshipSentence(rel);
		assertNotNull(sentence);
	}

}
