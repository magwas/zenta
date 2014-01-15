/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.tools.ConnectionCreationTool;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ArmEvent;
import org.eclipse.swt.events.ArmListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramModelFactory;
import org.rulez.magwas.zenta.editor.diagram.editparts.AbstractBaseEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.IZentaEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.GroupEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.IContainerFigure;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.editor.ui.services.ComponentSelectionManager;
import org.rulez.magwas.zenta.metamodel.IObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;



/**
 * Magic Connection Creation Tool
 * 
 * @author Phillip Beauvoir
 */
public class MagicConnectionCreationTool extends ConnectionCreationTool {
	
	private static Cursor cursor = new Cursor(
			null,
			IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.CURSOR_IMG_MAGIC_CONNECTOR).getImageData(),
			0,
			0);

	
	/**
	 * Flags to update Factory elements when hovering on menu items
	 */
	private boolean fArmOnElements, fArmOnConnections;
	
	private IViewpoint viewPoint;

	/**
	 * This flag stops some thread conditions (on Mac) that can re-set the current command when the context menu is showing
	 */
	private boolean fCanSetCurrentCommand = true;


	private Menu menu;


	private boolean skipModalMenu = false;


	private ArrayList<String> menuitems;
	
	public MagicConnectionCreationTool() {
	   setDefaultCursor(cursor);
	   setDisabledCursor(cursor);
	}
	
	@Override
	public boolean handleCreateConnection() {
		// Clear the connection factory first
		getFactory().clear();
		
		// Do this first, here (we have to!)
		fCanSetCurrentCommand = true;
		Command endCommand = getCommand();
		setCurrentCommand(endCommand);
		
		// Get this now!
		CreateConnectionRequest request = (CreateConnectionRequest)getTargetRequest();
		
		EditPart sourceEditPart = request.getSourceEditPart();
		EditPart targetEditPart = request.getTargetEditPart();
		
		if(sourceEditPart == null || sourceEditPart == targetEditPart) {
			eraseSourceFeedback();
			return false;
		}
		IDiagramModelZentaObject sourceDiagramModelObject = (IDiagramModelZentaObject)sourceEditPart.getModel();

		viewPoint = ViewpointsManager.INSTANCE.getViewpoint(sourceDiagramModelObject);

		// If targetEditPart is null then user clicked on the canvas or in a non-Zenta Editpart
		if(targetEditPart == null) {
			return createElementAndConnection(sourceDiagramModelObject, request.getLocation());
		}
		
		// User clicked on Zenta target edit part
		if(targetEditPart.getModel() instanceof IDiagramModelZentaObject) {
			IDiagramModelZentaObject mo = (IDiagramModelZentaObject) targetEditPart.getModel();
			viewPoint = ViewpointsManager.INSTANCE.getViewpoint(mo);
			return createConnection(request, sourceDiagramModelObject, mo);
		}
		
		eraseSourceFeedback();
		return false;
	}
	
	@Override
	protected void setTargetEditPart(EditPart editpart) {
		// Set this to null if it's not an Zenta target editpart so we can handle it as if we clicked on the canvas
		// This also disables unwanted connection target feedback
		if(!(editpart instanceof IZentaEditPart)) {
			editpart = null;
		}
		super.setTargetEditPart(editpart);
	}
	
	@Override
	protected void setCurrentCommand(Command c) {
		// Guard against Mac threading issue
		if(fCanSetCurrentCommand) {
			super.setCurrentCommand(c);
		}
	}
	
	/**
	 * Create just a new connection between source and target elements
	 */
	private boolean createConnection(CreateConnectionRequest request, IDiagramModelZentaObject sourceDiagramModelObject,
			IDiagramModelZentaObject targetDiagramModelObject) {
		
		fArmOnConnections = false;
		
		// Set this threading safety guard
		fCanSetCurrentCommand = false;
		
		menu = new Menu(getCurrentViewer().getControl());
		addConnectionActions(menu, sourceDiagramModelObject.getZentaElement(), targetDiagramModelObject.getZentaElement());
		menu.setVisible(true);
		
		runMenu(menu);		
		if(!menu.isDisposed()) {
			menu.dispose();
		}

		// Reset guard
		fCanSetCurrentCommand = true;

		eraseSourceFeedback();

		// No selection
		if(getFactory().getObjectType() == null) {
			getFactory().clear();
			return false;
		}
		
		executeCurrentCommand();
		
		// Clear the factory type
		getFactory().clear();
		return true;
	}
	
	/**
	 * Create an Element and a connection in one go when user clicks on the canvas or in a non-Zenta Editpart
	 */
	private boolean createElementAndConnection(IDiagramModelZentaObject sourceDiagramModelObject, Point location) {
		// Grab this now as it will disappear after menu is shown
		EditPartViewer viewer = getCurrentViewer();
		
		// Default parent
		IDiagramModelContainer parent = sourceDiagramModelObject.getDiagramModel();
		
		// What did we click on?
		GraphicalEditPart targetEditPart = (GraphicalEditPart)viewer.findObjectAt(getCurrentInput().getMouseLocation());
		
		// If we clicked on a Group EditPart use that as parent
		if(targetEditPart instanceof GroupEditPart) {
			parent = (IDiagramModelContainer)targetEditPart.getModel();
		}
		// Or did we click on something else? Then use the parent of that
		else if(targetEditPart instanceof AbstractBaseEditPart) {
			targetEditPart = (GraphicalEditPart)targetEditPart.getParent();
			parent = (IDiagramModelContainer)targetEditPart.getModel();
		}
		
		boolean elementsFirst = Preferences.isMagicConnectorPolarity();
		boolean modKeyPressed = getCurrentInput().isModKeyDown(SWT.MOD1);
		elementsFirst ^= modKeyPressed;
		
		Menu menu = new Menu(getCurrentViewer().getControl());
		if(elementsFirst) {
			fArmOnElements = true;
			fArmOnConnections = false;
			addElementActions(menu, sourceDiagramModelObject);
		}
		else {
			fArmOnConnections = true;
			fArmOnElements = false;
			addConnectionActions(menu, sourceDiagramModelObject);
		}
		menu.setVisible(true);
		
		runMenu(menu);
		
		if(!menu.isDisposed()) {
			menu.dispose();
		}
		
		eraseSourceFeedback();

		// No selection
		if(getFactory().getElementType() == null || getFactory().getRelationshipType() == null) {
			getFactory().clear();
			return false;
		}
		
		// Create Compound Command first
		CompoundCommand cmd = new CreateElementCompoundCommand((FigureCanvas)viewer.getControl(), location.x, location.y);
		
		// If the EditPart's Figure is a Container, adjust the location to relative co-ords
		if(targetEditPart.getFigure() instanceof IContainerFigure) {
			((IContainerFigure)targetEditPart.getFigure()).translateMousePointToRelative(location);
		}
		// Or compensate for scrolled parent figure
		else {
			IFigure contentPane = targetEditPart.getContentPane();
			contentPane.translateToRelative(location);
		}
		
		CreateNewDiagramObjectCommand cmd1 = new CreateNewDiagramObjectCommand(parent,
				getFactory().getElementType(), location);
		Command cmd2 = new CreateNewConnectionCommand(sourceDiagramModelObject, cmd1.getNewObject(),
				getFactory().getRelationshipType());
		cmd.add(cmd1);
		cmd.add(cmd2);
		
		executeCommand(cmd);
		
		// Clear the factory
		getFactory().clear();
		
		return true;
	}
		private void runMenu(Menu menu) {
			if (skipModalMenu == true) {
				activateFirstMenuItem(menu);
				return;
			}
			Display display = menu.getDisplay();
			while(!menu.isDisposed() && menu.isVisible()) {
				if(!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}
			private void activateFirstMenuItem(Menu menu) {
				menuitems =new ArrayList<String>();
				dumpMenuItems(menu,"");
				MenuItem menuitem = menu.getItem(0);
				menuitem.setSelection(true);
				Event event = new Event();
				event.button=1;
				menu.notifyListeners(SWT.SELECTED, event);
			}

			private void dumpMenuItems(Menu menu, String start) {
				for(int i = 0 ; i < menu.getItemCount(); i++) {
					MenuItem item = menu.getItem(i);
					String name = start+item.getText();
					menuitems.add(name);
					Menu submenu = item.getMenu();
					if(null != submenu)
						dumpMenuItems(submenu,name+"/");
				}
			}

	public void _setSkipModalMenu() {
		skipModalMenu = true;
	}

	private void addConnectionActions(Menu menu, IDiagramModelZentaObject sourceDiagramModelObject) {
		IZentaDiagramModel zdm = (IZentaDiagramModel) sourceDiagramModelObject.getDiagramModel();
		IViewpoint viewpoint = ViewpointsManager.INSTANCE.getViewpoint(zdm);
		for(IRelationClass relationshipType : viewpoint.getSourceRelationClassesFor(sourceDiagramModelObject)) {
			if(viewpoint.isValidRelationshipStart(sourceDiagramModelObject.getZentaElement(), relationshipType)) {
				MenuItem item = addConnectionAction(menu, relationshipType);
				Menu subMenu = new Menu(item);
				item.setMenu(subMenu);
				
				addConnectionActions(subMenu, sourceDiagramModelObject, viewpoint.getObjectClasses(), relationshipType);
				addConnectionActions(subMenu, sourceDiagramModelObject, viewpoint.getConnectorClasses(), relationshipType);
				
				// Remove the very last separator if there is one
				int itemCount = subMenu.getItemCount() - 1;
				if(itemCount > 0 && (subMenu.getItem(itemCount).getStyle() & SWT.SEPARATOR) != 0) {
					subMenu.getItem(itemCount).dispose();
				}
				
				if(subMenu.getItemCount() == 0) {
					item.dispose(); // Nothing there
				}
			}
		}
	}
	
	private void addConnectionActions(Menu menu, IDiagramModelZentaObject sourceDiagramModelObject, Collection<IObjectClass> objectclassses, IRelationClass relationshipType) {
		boolean added = false;
		IZentaElement sourceElement = sourceDiagramModelObject.getZentaElement();
		for(IObjectClass type : objectclassses) {
			// Check if allowed by Viewpoint
			if(!isAllowedTargetTypeInViewpoint(sourceDiagramModelObject, type)) {
				continue;
			}

			if(viewPoint.isValidRelationship(sourceElement, type, relationshipType)) {
				added = true;
				addElementAction(menu, type);
			}
		}
		
		if(added) {
			new MenuItem(menu, SWT.SEPARATOR);
		}
	}

	/**
	 * Add Element to Connection Actions
	 */
	private void addElementActions(Menu menu, IDiagramModelZentaObject sourceDiagramModelObject) {
		IObjectClass oc = (IObjectClass) viewPoint.getObjectClassOf(sourceDiagramModelObject);
		Collection<IObjectClass> allowedTargets = viewPoint.getAllowedTargets(oc);
		addElementActions(menu, oc, allowedTargets);
	}
	
	private void addElementActions(Menu menu, IObjectClass oc, Collection<IObjectClass> targetList) {
		for(IObjectClass targetObjectType : targetList) {
			MenuItem item = addElementAction(menu, targetObjectType);
			Menu subMenu = new Menu(item);
			item.setMenu(subMenu);
			List<IRelationClass> validRelationships = viewPoint.getValidRelationships(oc, targetObjectType);
			for(IRelationClass typeRel : validRelationships)
				addConnectionAction(subMenu, typeRel);
			if(subMenu.getItemCount() == 0) {
				item.dispose(); // Nothing there
			}
		}
	}

	private MenuItem addElementAction(Menu menu, final IObjectClass type) {
		final MenuItem item = new MenuItem(menu, SWT.CASCADE);
		item.setText(type.getName());
		item.setImage(ZentaLabelProvider.INSTANCE.getImage(type));
		
		// Add hover listener to notify Hints View and also set element if elements first
		item.addArmListener(new ArmListener() {
			@Override
			public void widgetArmed(ArmEvent e) {
				if(fArmOnElements) {
					getFactory().setElementType(type);
				}
				ComponentSelectionManager.INSTANCE.fireSelectionEvent(item, type);
			}
		});
		
		item.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFactory().setElementType(type);
			}
		});
		
		return item;
	}

	private void addConnectionActions(Menu menu, IZentaElement sourceElement, IZentaElement targetElement) {
		for(IRelationClass type : viewPoint.getValidRelationships(sourceElement, targetElement)) {
			addConnectionAction(menu, type);
		}
	}
	
	private MenuItem addConnectionAction(Menu menu, final IRelationClass relationshipType) {
		final MenuItem item = new MenuItem(menu, SWT.CASCADE);
		item.setText(relationshipType.getName());
		item.setImage(ZentaLabelProvider.INSTANCE.getImage(relationshipType));
		// Add hover listener to notify Hints View
		item.addArmListener(new ArmListener() {
			@Override
			public void widgetArmed(ArmEvent e) {
				if(fArmOnConnections) {
					getFactory().setRelationshipType(relationshipType);
				}
				ComponentSelectionManager.INSTANCE.fireSelectionEvent(item, relationshipType);
			}
		});
		
		item.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getFactory().setRelationshipType(relationshipType);
			}
		});
		
		return item;
	}
	
	/**
	 * @return True if type is an allowed target type for a given Viewpoint
	 */
	private boolean isAllowedTargetTypeInViewpoint(IDiagramModelZentaObject diagramObject, IObjectClass type) {
		if(!Preferences.STORE.getBoolean(IPreferenceConstants.VIEWPOINTS_HIDE_MAGIC_CONNECTOR_ELEMENTS)) {
			return true;
		}
		
		return viewPoint == null ? true : viewPoint.isAllowedType(type);
	}
	
	@Override
	protected MagicConnectionModelFactory getFactory() {
		return (MagicConnectionModelFactory)super.getFactory();
	}
	
	/**
	 * We need to explicitly set this since the source feedback is not always erased
	 * (when pressing the Escape key after the popup menu is displayed)
	 * @see org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy#eraseSourceFeedback(Request)
	 */
	@Override
	protected void eraseSourceFeedback() {
		getSourceRequest().setType(RequestConstants.REQ_CONNECTION_END);
		super.eraseSourceFeedback();
	}
	
	
	// ======================================================================================================
	// COMMANDS
	// ======================================================================================================
	
	/**
	 * Create Element Command
	 */
	private static class CreateElementCompoundCommand extends CompoundCommand {
		PoofAnimater animater;
		
		CreateElementCompoundCommand(FigureCanvas canvas, int x, int y) {
			super(Messages.MagicConnectionCreationTool_6);
			animater = new PoofAnimater(canvas, x, y);
		}
		
		@Override
		public void undo() {
			super.undo();
			if(Preferences.doAnimateMagicConnector()) {
				animater.animate(false);
			}
		}
		
		@Override
		public void redo() {
			if(Preferences.doAnimateMagicConnector()) {
				animater.animate(true);
			}
			super.redo();
		}
	}
	
	/**
	 * Create New DiagramObject Command
	 */
	private static class CreateNewDiagramObjectCommand extends Command {
		private IDiagramModelContainer fParent;
		private IDiagramModelZentaObject fChild;
		private IObjectClass fTemplate;

		CreateNewDiagramObjectCommand(IDiagramModelContainer parent, IObjectClass elementType, Point location) {
			fParent = parent;
			fTemplate = elementType;

			// Create this now
			fChild = (IDiagramModelZentaObject)new ZentaDiagramModelFactory(
					fTemplate,
					(IFolder) parent
				.getDiagramModel().eContainer()).getNewObject();
			fChild.setBounds(location.x, location.y, -1, -1);
		}
		
		IDiagramModelZentaObject getNewObject() {
			return fChild;
		}
		
		@Override
		public void execute() {
			redo();
		}

		@Override
		public void undo() {
			fParent.getChildren().remove(fChild);
			fChild.removeZentaElementFromModel();
		}

		@Override
		public void redo() {
			fParent.getChildren().add(fChild);
			fChild.addZentaElementToModel(null);
		}
		
		@Override
		public void dispose() {
			fParent = null;
			fChild = null;
			fTemplate = null;
		}
	}
	
	/**
	 * Create New Connection Command
	 */
	private static class CreateNewConnectionCommand extends Command {
		private IDiagramModelZentaConnection fConnection;
		private IDiagramModelZentaObject fSource;
		private IDiagramModelZentaObject fTarget;
		private IRelationClass fTemplate;
		
		CreateNewConnectionCommand(IDiagramModelZentaObject source, IDiagramModelZentaObject target, IRelationClass relationClass) {
			fSource = source;
			fTarget = target;
			fTemplate = relationClass;
		}


		@Override
		public void execute() {
			IFolder folder = (IFolder) fSource.getDiagramModel().eContainer();
			fConnection = (IDiagramModelZentaConnection)new ZentaDiagramModelFactory(fTemplate, folder).getNewObject();
			fConnection.connect(fSource, fTarget);
			fConnection.addRelationshipToModel(null);
		}
		
		@Override
		public void redo() {
			fConnection.reconnect();
			fConnection.addRelationshipToModel(null);
		}
		
		@Override
		public void undo() {
			fConnection.disconnect();
			fConnection.removeRelationshipFromModel();
		}

		@Override
		public void dispose() {
			fConnection = null;
			fSource = null;
			fTarget = null;
			fTemplate = null;
		}
	}

	public void _setRequest(CreateConnectionRequest req) {
		this.setTargetRequest(req);		
	}
	public ArrayList<String> _getMenuItems(){
		return menuitems;
	}
}
