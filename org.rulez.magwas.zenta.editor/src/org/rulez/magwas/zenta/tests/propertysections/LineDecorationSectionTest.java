package org.rulez.magwas.zenta.tests.editor.diagram.dialog.propertysections;

import static org.junit.Assert.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.dialog.propertysections.LineDecorationSection;
import org.rulez.magwas.zenta.editor.editparts.connections.IDiagramConnectionEditPart;
import org.rulez.magwas.zenta.editor.figures.connections.ConnectionDecorationFactory;
import org.rulez.magwas.zenta.editor.propertysections.TabbedPropertySheetPageContributorMockup;
import org.rulez.magwas.zenta.tests.editor.diagram.dialog.diagram.dialog.DecorationSelectorTestData;

public class LineDecorationSectionTest {

	private LineDecorationSection section;

	@Test
	public void test() {
		DecorationSelectorTestData data = new DecorationSelectorTestData();
		System.out.println(data.getEditPart());
		assertTrue(data.getEditPart() instanceof IDiagramConnectionEditPart);
		section.setElement(data.getEditPart());
	}

	@Before
	public void setUp() {
		ConnectionDecorationFactory.getInstance();
		section = new LineDecorationSection();
		Shell sh = new Shell();
		Composite parent = new Composite(sh,SWT.NONE);
		ITabbedPropertySheetPageContributor foo = new TabbedPropertySheetPageContributorMockup();
		TabbedPropertySheetPage page = new TabbedPropertySheetPage(foo );
		section.createControls(parent, page);
	}
	
	//goal: fire the endless loop by calling refreshControls

}
