package org.rulez.magwas.zenta.tests.propertysections;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.PageSite;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;
import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;
import org.rulez.magwas.zenta.editor.ui.services.ViewManager;
import org.rulez.magwas.zenta.editor.views.tree.TreeModelView;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class LineDecorationSectionExerciser extends LineDecorationSection {

	Map<String,Object> internals = new HashMap<String,Object>();
	private UITestWindow win;
	
	LineDecorationSectionExerciser(ModelAndEditPartTestData data) throws PartInitException {
		super();
		//setEditorForSection(editor,data);
		createControlsForSection( data.editor);
	}
		void setEditorForSection(ModelAndEditPartTestData data) {
			ISelection selection = new SelectionMockup(data.editPart);
			setInput((IWorkbenchPart) data.editor, selection);
		}
	
		void createControlsForSection( ZentaDiagramEditor editor) {
			win = new UITestWindow();
			Composite composite = win.getComposite();
			createTabbedPropertySheetPage(editor, composite);
		}
			void createTabbedPropertySheetPage(ZentaDiagramEditor editor, Composite sectionCompo) {
				TabbedPropertySheetPage tpsPage = (TabbedPropertySheetPage) editor.getAdapter(IPropertySheetPage.class);
				assertNotNull(tpsPage);
				TreeModelView v = (TreeModelView) ViewManager.findViewPart("org.rulez.magwas.zenta.editor.treeModelView");
				assertNotNull(v);
				PageSite ps = new PageSite((IViewSite) v.getSite());
				tpsPage.init(ps);
				createControlsForTpsPage(tpsPage, sectionCompo);
			}
				private void createControlsForTpsPage(
						IPropertySheetPage tpsPage, Composite sectionCompo) {
					Composite pageCompo = win.getNewHiddenComposite();
					tpsPage.createControl(pageCompo);
					createControls(sectionCompo, (TabbedPropertySheetPage) tpsPage);
				}


	public void run() {
		win.showWindow();
	}

	
	public void nullModelObject() {
		modelObject = null;
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
		internals.put("buttonMap", buttonMap);		
	}

	public Button getButton(String buttonName) {
		@SuppressWarnings("unchecked")
		Map<String,Button> buttonmap = (Map<String, Button>) getInternal("buttonMap");
		Button but = ((Button)buttonmap.get(buttonName));
		return but;
	}
	
	public void _setElement(BasicConnectionEditPart editPart) {
		setElement(editPart);
	}
}
