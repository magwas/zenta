package org.rulez.magwas.zenta.editor.propertysections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.diagram.commands.LineDecorationCommand;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.AssociationConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IDiagramConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.connections.ConnectionDecorationFactory;
import org.rulez.magwas.zenta.editor.utils.StringUtils;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class LineDecorationSection extends AbstractZentaPropertySection {

	private static final String HELP_ID = "org.rulez.magwas.zenta.help.lineDecorationSection";
	
    protected Button defaultButton;
    protected IDiagramModelConnection modelObject;
    private ConnectionDecorationFactory decorFactory= ConnectionDecorationFactory.getInstance();
	protected Map<String,Button> buttonMap = new HashMap<String,Button>();


	private AssociationConnectionEditPart editPart;
 
	@Override
	protected void createControls(Composite parent) {
        createLabel(parent, Messages.LineDecorationSection_Title, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        Composite client = createComposite(parent, 2);
        getWidgetFactory().adapt(client, true, true);
        createDecorButtons(client);
        createDefaultButton(client);
        refreshControls();
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
	}

		private void createDefaultButton(Composite parent) {
			defaultButton = new Button(parent, SWT.PUSH);
	        defaultButton.setText(Messages.LineDecorationSection_DefaultLabel);
	        getWidgetFactory().adapt(defaultButton, true, true); // Need to do it this way for Mac
	        defaultButton.addSelectionListener(createSelectionAdapterForDefaultButton());
		}
			private SelectionAdapter createSelectionAdapterForDefaultButton() {
				return new SelectionAdapter() {
		            @Override
		            public void widgetSelected(SelectionEvent e) {
		                if(isAlive()) {
							getCommandStack().execute(new LineDecorationCommand(modelObject, ""));
							editPart.refreshFigure();
		                }
		            }
		        };
			}
	
		private void createDecorButtons(Composite parent) {
			Composite compo = createComposite(parent,3);
			ConnectionDecorationFactory.getInstance();
	        Set<String> names = decorFactory.getFigureNames();
	        for(String thename:names) 
	        	addButtonForNamedDecor(compo, thename);
		}

			private void addButtonForNamedDecor(Composite parent,
					String thename) {
				Button but = new Button(parent,SWT.TOGGLE);
				buttonMap.put(thename, but);
				setGridLayoutFor(but);
		        getWidgetFactory().adapt(but, true, true);
				but.setImage(decorFactory.getImageForName(thename));
				but.addSelectionListener(createSelectionAdapterForButton(thename));
			}
	
				private SelectionAdapter createSelectionAdapterForButton(final String value) {
					return new SelectionAdapter() {
			            @Override
			            public void widgetSelected(SelectionEvent e) {
			                if(isAlive())
								sendNewDecorString(value);
			            }
			        };
				}
					private void sendNewDecorString(final String value) {
						List<String> decors = getDecorList();
						if(value != null)//FIXME else is Default button, set defaults according to objectClass
							addOrRemoveValueFromDecors(value, decors);
						sendDecors(decors);
					}
						private void sendDecors(List<String> decors) {
							String thename = StringUtils.join(decors," ");
							getCommandStack().execute(new LineDecorationCommand(modelObject, thename));
							editPart.refreshFigure();
						}
						private void addOrRemoveValueFromDecors(String value,
								List<String> decors) {
							if (decors.contains(value))
								decors.remove(value);
							else
								decors.add(value);
						}
	
				private void setGridLayoutFor(Button but) {
					GridData gd;
					gd = new GridData(SWT.NONE, SWT.NONE, true, false);
					gd.minimumWidth = ITabbedLayoutConstants.BUTTON_WIDTH;
			        but.setLayoutData(gd);
				}

	@Override
	protected Adapter getECoreAdapter() {
		return eAdapter;
	}

	@Override
	protected EObject getEObject() {
		return modelObject;
	}

	@Override
	protected void setElement(Object element) {
        makeSureItIsConnectionEditPart(element);
    	editPart = (AssociationConnectionEditPart)element;
		modelObject = (IDiagramModelConnection)editPart.getModel();
        makeSureModelObjectIsntNull();
        refreshControls();
	}
	
		private void makeSureItIsConnectionEditPart(Object element) {
			if(! (element instanceof IDiagramConnectionEditPart))
	        	throw new ShouldHaveBeenAnIDiagramConnectionEditPart();
		}
	
			class ShouldHaveBeenAnIDiagramConnectionEditPart extends RuntimeException {
				private static final long serialVersionUID = 1L;
			};

		private void makeSureModelObjectIsntNull() {
			if(modelObject == null)
	            throw new DiagramConnectionObjectWasNull();
		}
	
			class DiagramConnectionObjectWasNull extends RuntimeException {
				private static final long serialVersionUID = 1L;
			};
			
    private Adapter eAdapter = new AdapterImpl() {
        @Override
        public void notifyChanged(Notification msg) {
            Object feature = msg.getFeature();
            if(isLineDecorationOrLocked(feature))
                refreshControls();
        }
			private boolean isLineDecorationOrLocked(Object feature) {
				return feature == IZentaPackage.Literals.DIAGRAM_MODEL_CONNECTION__LINE_DECORATION ||
	                    feature == IZentaPackage.Literals.LOCKABLE__LOCKED;
			}
    };

	public void refreshControls() {
		if (null == modelObject)
			return;
		List<String> decors = getDecorList();
		for(String name : buttonMap.keySet())
			setButtonStateByDecors(decors, name);
		editPart.refreshFigure();
	}

		private List<String> getDecorList() {
			if(null == modelObject)
				return new ArrayList<String>();
			String decorString = modelObject.getLineDecoration();
			if (null == decorString)
				return new ArrayList<String>();
			return new ArrayList<String>(Arrays.asList(decorString.split(" ")));
		}
		private void setButtonStateByDecors(List<String> decors, String name) {
			boolean decorEnabled = decors.contains(name);
			Button button = buttonMap.get(name);
			button.setSelection(decorEnabled);
		}
}
