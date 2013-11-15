package org.rulez.magwas.zenta.tests.editor.diagram.dialog.diagram.dialog;

import static org.junit.Assert.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.dialog.DecorationSelector;
import org.rulez.magwas.zenta.editor.figures.connections.ConnectionDecorationFactory;

public class DecorationSelectorTest {

	DecorationSelector selector;

	private DecorationSelectorTestData data = new DecorationSelectorTestData();

	@Before
	public void setUp() {
		ConnectionDecorationFactory.getInstance();
		Shell sh = new Shell();
		Composite parent = new Composite(sh,SWT.NONE);
		selector = new DecorationSelector(parent);
	}
		
	@Test
	public void testSetElement() {
		prepareSelectorWithElements(data);
	}
	
	@Test	
	public void testSetResult() {
		prepareSelectorWithElements(data);
		selector.setResult("oldvalue","newValue");
		assertEquals("newValue",data.getModelConnectionObject().getLineDecoration());
	}
	
	@Test	
	public void testToggleDecorator() {
		prepareSelectorWithElements(data);
		selector.toggleDecorator("aggregationDecor");
		assertEquals("aggregationDecor",data.getModelConnectionObject().getLineDecoration());
		selector.toggleDecorator("aggregationDecor");
		assertEquals("",data.getModelConnectionObject().getLineDecoration());
	}

	@Test	
	public void testToggleMoreDecorators() {
		prepareSelectorWithElements(data);
		selector.toggleDecorator("aggregationDecor");
		assertEquals("aggregationDecor",data.getModelConnectionObject().getLineDecoration());
		selector.toggleDecorator("flowDecor");
		assertEquals("aggregationDecor flowDecor",data.getModelConnectionObject().getLineDecoration());
		selector.toggleDecorator("aggregationDecor");
		assertEquals("flowDecor",data.getModelConnectionObject().getLineDecoration());
	}

	@Test	
	public void testSetDecorationValue() {
		prepareSelectorWithElements(data);
		selector.setDecorationValue("aggregationDecor flowDecor");
		assertEquals("aggregationDecor flowDecor",data.getModelConnectionObject().getLineDecoration());
	}

	// ------------- utils --------

	void prepareSelectorWithElements(DecorationSelectorTestData data) {
		selector.setElement(  data.getModelConnectionObject(), data.getEditPart());
	}



}
