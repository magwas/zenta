package org.rulez.magwas.zenta.tests.propertysections;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;
import org.rulez.magwas.zenta.tests.UITestUtils;

public class LineDecorationSectionExerciser extends LineDecorationSection {

	Map<String,Object> internals = new HashMap<String,Object>();
	private Shell shell;
	
	LineDecorationSectionExerciser(ZentaDiagramEditor editor,ModelAndEditPartTestData data) throws PartInitException {
		super();
		setEditorForSection(editor,data);
		createControlsForSection( editor);
	}
		void setEditorForSection(ZentaDiagramEditor editor, ModelAndEditPartTestData data) {
			ISelection selection = new SelectionMockup(data.getEditPart());
			setInput((IWorkbenchPart) editor, selection);
		}
	
		void createControlsForSection( ZentaDiagramEditor editor) {
			shell = new Shell();
			UITestUtils.addTestControls(shell);
			shell.setLayout(new GridLayout());
			createTabbedPropertySheetPage(editor);
		}
			void createTabbedPropertySheetPage(ZentaDiagramEditor editor) {
				TabbedPropertySheetPage tpsPage = new TabbedPropertySheetPageMockup(editor);
				IPageSite pageSite = (IPageSite) ((IWorkbenchPart) editor).getSite();
				tpsPage.init(pageSite );
				createControlsForTpsPage(tpsPage);
			}
				private void createControlsForTpsPage(
						TabbedPropertySheetPage tpsPage) {
					Composite sectionCompo = new Composite(shell, 1);
					Composite pageCompo = new Composite(shell, 1);
					tpsPage.createControl(pageCompo);
					createControls(sectionCompo, tpsPage);
				}


	public void run() {
		shell.pack();
		shell.open();
		UITestUtils.waitUserIfNeeded(shell);
	}

	
	public Object getInternal(String string) {
		if(!internals.containsKey(string)) {
			throw new IllegalArgumentException("no such internal");
		}
		return internals.get(string);
	}

	@Override
	public EObject getEObject() {
		return super.getEObject();
	}

	@Override
	protected void createControls(Composite parent) {
		super.createControls(parent);
		internals.put("DefaultButton", defaultButton);		
	}

	@Override
	protected Button addButtonForNamedDecor(Composite buttonsetComposite,
			final String thename) {
		Button but = super.addButtonForNamedDecor(buttonsetComposite,thename);
		internals.put("but_"+thename, but);
		return but;
	}
}
