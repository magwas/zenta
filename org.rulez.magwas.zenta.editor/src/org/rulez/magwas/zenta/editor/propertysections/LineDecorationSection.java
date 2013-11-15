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
import org.rulez.magwas.zenta.model.IDiagramModelConnection;

public class LineDecorationSection extends AbstractZentaPropertySection {

    //private DecorationSelector decorSelector;
    protected Button defaultButton;
    private IDiagramModelConnection modelObject;
 
	@Override
	protected void createControls(Composite parent) {
        createLabel(parent, Messages.LineDecorationSection_0, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        
        Composite client = createComposite(parent, 2);
        GridData gd = new GridData(SWT.NONE, SWT.NONE, false, false);
        gd.widthHint = ITabbedLayoutConstants.BUTTON_WIDTH;

        /*
        fColorSelector = new ColorSelector(client);
        fColorSelector.getButton().setLayoutData(gd);
        getWidgetFactory().adapt(fColorSelector.getButton(), true, true);
        fColorSelector.addListener(colorListener);

		*/
        defaultButton = new Button(client, SWT.PUSH);
        defaultButton.setText(Messages.LineDecorationSection_1);
        gd = new GridData(SWT.NONE, SWT.NONE, true, false);
        gd.minimumWidth = ITabbedLayoutConstants.BUTTON_WIDTH;
        defaultButton.setLayoutData(gd);
        getWidgetFactory().adapt(defaultButton, true, true); // Need to do it this way for Mac
        defaultButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(isAlive()) {
                    getCommandStack().execute(new LineDecorationCommand(modelObject, null));
                }
            }
        });
  
	}

	@Override
	protected Adapter getECoreAdapter() {
		return null;
	}

	@Override
	protected EObject getEObject() {
		return null;
	}

	@Override
	protected void setElement(Object element) {
	}

}
