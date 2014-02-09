package org.rulez.magwas.zenta.editor.diagram;

import java.util.HashSet;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.rulez.magwas.zenta.editor.diagram.editparts.business.BasicObjectEditPart;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionCreationTool;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionModelFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;

public class MagicConnectionCreationToolExerciser extends
		MagicConnectionCreationTool {

	private String menuitemName;
	public boolean failed;
	private HashSet<String> savedMenu;

	MagicConnectionCreationToolExerciser(BasicObjectEditPart source, BasicObjectEditPart target, String menuitem, ModelAndEditPartTestData data) {
		prepareTool(source, data);
		menuitemName = menuitem;
		doSetSource(source);
		lockTargetEditPart(target);
		handleCreateConnection();
	}
	public MagicConnectionCreationToolExerciser(BasicObjectEditPart source, String menuitem,
			ModelAndEditPartTestData data) {
		prepareTool(source, data);
		menuitemName = menuitem;
		doSetSource(source);
		CreateConnectionRequest targetRequest = (CreateConnectionRequest) getTargetRequest();
		targetRequest.setTargetEditPart(null);
		Point location = getCurrentInput().getMouseLocation();
		location.setLocation(location.x+500, location.y);
		handleCreateConnection();
	}

	private void doSetSource(BasicObjectEditPart source) {
		lockTargetEditPart(source);
		
		updateTargetRequest();
		updateTargetUnderMouse();
		setConnectionSource(getTargetEditPart());
		Command command = getCommand();
		CreateConnectionRequest targetRequest = (CreateConnectionRequest) getTargetRequest();
		targetRequest
				.setSourceEditPart(getTargetEditPart());
		if (command != null) {
			setState(STATE_CONNECTION_STARTED);
			setCurrentCommand(command);
			setViewer(getCurrentViewer());
		}
	}

	private void prepareTool(BasicObjectEditPart source,
			ModelAndEditPartTestData data) {
		data.focusOnDiagram(source.getModel().getDiagramModel().getId());
		IFolder folder = ModelAndEditPartTestData.getFolderByKid(data.getTemplateDiagramModel());
		MagicConnectionModelFactory factory = new MagicConnectionModelFactory(folder);
		setEditDomain(source.getViewer().getEditDomain());

		setViewer(source.getViewer());
		setFactory(factory);
	}

	@Override
	protected void runMenu(Menu menu) {
		saveMenu(menu);
	}
		private void saveMenu(Menu menu) {
			failed = true;
			savedMenu = new HashSet<String>();
			saveMenuItem(menu,"");
		}
			private void saveMenuItem(Menu menu, String start) {
				System.out.printf("menuitemcount = %s\n", menu.getItemCount());
				for(int i = 0 ; i < menu.getItemCount(); i++) {
					MenuItem item = menu.getItem(i);
					String name = start+item.getText();
					System.out.printf("name = %s menuitemname = %s\n",name, menuitemName);
					if(name.equals(menuitemName))
						executeMenuItem(menu, item);
					savedMenu.add(name);
					Menu submenu = item.getMenu();
					if(null != submenu)
						saveMenuItem(submenu,name+"/");
				}
			}
				private void executeMenuItem(Menu menu, MenuItem item) {
					addToFactory(item.getData());
					addToFactory(menu.getData());
					failed = false;
				}

					private void addToFactory(Object data) {
						if(data instanceof IRelationClass)
							getFactory().setRelationshipType((IBasicRelationship) data);
						else if(data instanceof IObjectClass)
							getFactory().setElementType((IBasicObject) data);
					}
	public Object getMenu() {
		return savedMenu;
	}
		
}
