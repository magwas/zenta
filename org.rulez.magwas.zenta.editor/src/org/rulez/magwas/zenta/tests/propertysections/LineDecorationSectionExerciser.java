package org.rulez.magwas.zenta.tests.propertysections;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;

public class LineDecorationSectionExerciser extends LineDecorationSection {

	Map<String,Object> internals = new HashMap<String,Object>();
	private Shell shell;
	private Composite sectionCompo;
	
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
			sectionCompo = new Composite(shell, 1);
			sectionCompo.setLayout(new GridLayout());
			addOKButton();
			createTabbedPropertySheetPage(editor);
		}

			void createTabbedPropertySheetPage(ZentaDiagramEditor editor) {
				Composite pageCompo = new Composite(shell, 1);
				pageCompo.setVisible(false);
				TabbedPropertySheetPage tpsPage = new TabbedPropertySheetPageMockup(editor);
				IPageSite pageSite = (IPageSite) ((IWorkbenchPart) editor).getSite();
				tpsPage.init(pageSite );
				tpsPage.createControl(pageCompo);
				createControls(pageCompo, tpsPage);
			}

			private void addOKButton() {
				Composite buttonCompo = new Composite(shell, 1);
		        Button but = new Button(buttonCompo, SWT.PUSH);
		        but.setText("OK");
		        but.addSelectionListener(createxloserSelectionAdapter());
		        but.pack();
		        buttonCompo.pack();
			}
	
				private SelectionAdapter createxloserSelectionAdapter() {
					return new SelectionAdapter() {
			            @Override
			            public void widgetSelected(SelectionEvent e) {
			                shell.dispose();
			            }
			        };
				}

	public void run() {
		sectionCompo.pack();
		shell.pack();
		shell.open();
		Display display = shell.getDisplay();
		while (!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
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
		super.createControls(sectionCompo);
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
