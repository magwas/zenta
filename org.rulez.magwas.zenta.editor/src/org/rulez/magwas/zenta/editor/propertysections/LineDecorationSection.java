package org.rulez.magwas.zenta.editor.propertysections;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.rulez.magwas.zenta.editor.diagram.commands.LineDecorationCommand;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IDiagramConnectionEditPart;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;

public class LineDecorationSection extends AbstractZentaPropertySection {

    protected Button defaultButton;
    private IDiagramModelConnection modelObject;
 
	@Override
	protected void createControls(Composite parent) {
        createLabel(parent, Messages.LineDecorationSection_Title, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        Composite client = createComposite(parent, 2);
        createDefaultButton(client);
	}

		private void createDefaultButton(Composite parent) {
			defaultButton = new Button(parent, SWT.TOGGLE);
	        defaultButton.setText(Messages.LineDecorationSection_DefaultLabel);
			setGridLatoutFor(defaultButton);
	        getWidgetFactory().adapt(defaultButton, true, true); // Need to do it this way for Mac
	        defaultButton.addSelectionListener(createSelectionAdapterForDefaultButton());
		}

			private SelectionAdapter createSelectionAdapterForDefaultButton() {
				return new SelectionAdapter() {
		            @Override
		            public void widgetSelected(SelectionEvent e) {
		                if(isAlive())
		                    getCommandStack().execute(new LineDecorationCommand(modelObject, null));
		            }
		        };
			}

		private void setGridLatoutFor(Button but) {
			GridData gd;
			gd = new GridData(SWT.NONE, SWT.NONE, true, false);
			gd.minimumWidth = ITabbedLayoutConstants.BUTTON_WIDTH;
	        but.setLayoutData(gd);
		}

	@Override
	protected Adapter getECoreAdapter() {
		return null;
	}

	@Override
	protected EObject getEObject() {
		return modelObject;
	}

	@Override
	protected void setElement(Object element) {
        makeSureItIsConnectionEditPart(element);
    	IDiagramConnectionEditPart editpart = (IDiagramConnectionEditPart)element;
		modelObject = (IDiagramModelConnection)editpart.getModel();
        makeSureModelObjectIsntNull();
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

}
