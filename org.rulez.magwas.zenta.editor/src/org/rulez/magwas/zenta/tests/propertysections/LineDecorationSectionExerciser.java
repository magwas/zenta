package org.rulez.magwas.zenta.tests.propertysections;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;

public class LineDecorationSectionExerciser extends LineDecorationSection {

	Map<String,Object> internals = new HashMap<String,Object>();
	
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
		Composite parent = new Shell();
		TabbedPropertySheetPage tpsPage = createTabbedPropertySheetPage(
				parent, editor);
		createControls(parent, tpsPage);
		}
	
			TabbedPropertySheetPage createTabbedPropertySheetPage(Composite parent, ZentaDiagramEditor editor) {
				TabbedPropertySheetPage tabbedPropertySheetPage = new TabbedPropertySheetPageMockup(editor);
				IPageSite pageSite = (IPageSite) ((IWorkbenchPart) editor).getSite();
				tabbedPropertySheetPage.init(pageSite );
				tabbedPropertySheetPage.createControl(parent);
				return tabbedPropertySheetPage;
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

}
