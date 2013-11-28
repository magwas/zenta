/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.dialog;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.editor.ui.components.ExtendedTitleAreaDialog;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.IZentaElement;



/**
 * New Nested Relation Dialog
 * 
 * @author Phillip Beauvoir
 */
public class NewNestedRelationDialog extends ExtendedTitleAreaDialog {
    
    private static String HELP_ID = "org.rulez.magwas.zenta.help.NewNestedRelationDialog"; //$NON-NLS-1$
    
    private TableViewer fTableViewer;
    
    private IZentaElement fParentElement, fChildElement;
    
    private List<RelationClass> fValidRelations;
    private RelationClass fSelected;

	private IViewpoint vp;

    public NewNestedRelationDialog(IViewpoint vp, Shell parentShell, IZentaElement parentElement, IZentaElement childElement) {
        super(parentShell, "NewNestedRelationDialog"); //$NON-NLS-1$
        setTitleImage(IZentaImages.ImageFactory.getImage(IZentaImages.ECLIPSE_IMAGE_NEW_WIZARD));
        setShellStyle(getShellStyle() | SWT.RESIZE);
        
        fParentElement = parentElement;
        fChildElement = childElement;
        this.vp = vp;
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(Messages.NewNestedRelationDialog_0);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        // Help
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);

        setTitle(Messages.NewNestedRelationDialog_1);
        String message = NLS.bind(Messages.NewNestedRelationDialog_2,
                fParentElement.getName(), fChildElement.getName());
        setMessage(message);
        Composite composite = (Composite)super.createDialogArea(parent);

        Composite client = new Composite(composite, SWT.NULL);
        GridLayout layout = new GridLayout(1, false);
        client.setLayout(layout);
        client.setLayoutData(new GridData(GridData.FILL_BOTH));
        
        Composite tableComp = new Composite(client, SWT.BORDER);
        tableComp.setLayout(new TableColumnLayout());
        tableComp.setLayoutData(new GridData(GridData.FILL_BOTH));
        fTableViewer = new RelationsTableViewer(tableComp, SWT.NONE);
        fTableViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
        fTableViewer.setInput(""); // anything will do //$NON-NLS-1$
        
        fTableViewer.addDoubleClickListener(new IDoubleClickListener() {
            @Override
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        
        fTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                fSelected = (RelationClass)((IStructuredSelection)fTableViewer.getSelection()).getFirstElement();
            }
        });
        
        if(fValidRelations != null && fValidRelations.size() > 0) {
            fTableViewer.setSelection(new StructuredSelection(fValidRelations.get(0)));
        }
        
        return composite;
    }
    
    @Override
    protected Point getDefaultDialogSize() {
        return new Point(500, 350);
    }
    
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        // create OK and Cancel buttons by default
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
                true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                Messages.NewNestedRelationDialog_3, false);
    }
    
    public RelationClass getSelectedType() {
        return fSelected;
    }
        
    class RelationsTableViewer extends TableViewer {
        RelationsTableViewer(Composite parent, int style) {
            super(parent, SWT.FULL_SELECTION | style);
            setColumns();
            setContentProvider(new RelationsTableViewerContentProvider());
            setLabelProvider(new RelationsTableViewerLabelCellProvider());
        }
        
        /**
         * Set up the columns
         */
        private void setColumns() {
            Table table = getTable();
            table.setHeaderVisible(false);
            
            // Use layout from parent container
            TableColumnLayout layout = (TableColumnLayout)getControl().getParent().getLayout();
            TableViewerColumn column = new TableViewerColumn(this, SWT.NONE);
            layout.setColumnData(column.getColumn(), new ColumnWeightData(100, false));
        }

        class RelationsTableViewerContentProvider implements IStructuredContentProvider {
            public void inputChanged(Viewer v, Object oldInput, Object newInput) {
            }
            
            public void dispose() {
            }
            
            
            public Object[] getElements(Object parent) {
            	fValidRelations = vp.getValidRelationships(fParentElement, fChildElement);
                return fValidRelations.toArray();
            }
        }

        class RelationsTableViewerLabelCellProvider extends LabelProvider {
            @Override
            public String getText(Object element) {
                return ZentaLabelProvider.INSTANCE.getDefaultName((EClass)element);
            }
            
            @Override
            public Image getImage(Object element) {
                return ZentaLabelProvider.INSTANCE.getImage(element);
            }
         }
    }
}
