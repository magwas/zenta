/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.dialog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.preferences.ConnectionPreferences;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.editor.ui.components.ExtendedTitleAreaDialog;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;



/**
 * New Nested Relations Dialog
 * 
 * @author Phillip Beauvoir
 */
public class NewNestedRelationsDialog extends ExtendedTitleAreaDialog implements Listener {
    
    private String HELP_ID = "org.rulez.magwas.zenta.help.NewNestedRelationsDialog"; //$NON-NLS-1$

    private TableViewer fTableViewer;
    
    private IZentaElement fParentElement;
    private Mapping[] fMappings;

    // Keep track of Ctrl key
    private boolean fModKeyPressed;
    
    private class Mapping {
        private IZentaElement element;
        private List<RelationClass> validRelations;
        private String[] names;
        private int selectedIndex;
        
        Mapping(IViewpoint vp, IZentaElement element) {
            this.element = element;
            validRelations = createValidRelations(vp,fParentElement, element);
            selectedIndex = 1;
        }
        
        IZentaElement getElement() {
            return element;
        }
        
        String getSelectedRelationName() {
            return getValidRelationNames()[selectedIndex];
        }
        
        void setSelectedIndex(int value) {
            selectedIndex = value;
        }
        
        int getSelectedIndex() {
            return selectedIndex;
        }
        
        RelationClass getSelectedType() {
            return validRelations.get(selectedIndex);
        }
        
        void setSelectedType(RelationClass selectedClass) {
            int index = validRelations.indexOf(selectedClass);
            selectedIndex = (index == -1) ? 0 : index;
        }
        
        String[] getValidRelationNames() {
            if(names == null) {
                names = new String[validRelations.size()];
                names[0] = Messages.NewNestedRelationsDialog_0;
                for(int i = 1; i < validRelations.size(); i++) {
                    names[i] = validRelations.get(i).getName();
                }
            }
            return names;
        }
        
        private List<RelationClass> createValidRelations(IViewpoint vp, IZentaElement sourceElement, IZentaElement targetElement) {
            List<RelationClass> list = new ArrayList<RelationClass>();
            // Entry for "none"
            list.add(null);
            for(RelationClass eClass : vp.getRelationClasses()) {
                if(vp.isValidRelationship(sourceElement, targetElement, eClass)) {
                    list.add(eClass); 
                }
            }
            return list;
        }
    }

    public NewNestedRelationsDialog(IViewpoint vp, Shell parentShell, IZentaElement parentElement, List<IZentaElement> childElements) {
        super(parentShell, "NewNestedRelationsDialog"); //$NON-NLS-1$
        setTitleImage(IZentaImages.ImageFactory.getImage(IZentaImages.ECLIPSE_IMAGE_NEW_WIZARD));
        setShellStyle(getShellStyle() | SWT.RESIZE);
        
        fParentElement = parentElement;
        
        fMappings = new Mapping[childElements.size()];
        for(int i = 0; i < fMappings.length; i++) {
            fMappings[i] = new Mapping(vp, childElements.get(i));
        }
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(Messages.NewNestedRelationsDialog_1);
        
        shell.getDisplay().addFilter(SWT.KeyDown, this);
        shell.getDisplay().addFilter(SWT.KeyUp, this);
    }

    @Override
    public void handleEvent(Event event) {
        // Ctrl key pressed/released
        switch(event.type) {
            case SWT.KeyDown:
                if(event.keyCode == SWT.MOD1) {
                    fModKeyPressed = true;
                }
                break;
            case SWT.KeyUp:
                if(event.keyCode == SWT.MOD1) {
                    fModKeyPressed = false;
                }
                break;
        }
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        // Help
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);

        setTitle(Messages.NewNestedRelationsDialog_2);
        String message = NLS.bind(Messages.NewNestedRelationsDialog_3, fParentElement.getName());
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
        
        return composite;
    }
    
    public List<RelationClass> getSelectedTypes() {
        List<RelationClass> list = new ArrayList<RelationClass>();
        
        for(Mapping mapping : fMappings) {
            if(mapping.getSelectedType() != null) {
                list.add(mapping.getSelectedType());
            }
        }
        
        return list;
    }
    
    public List<IZentaElement> getSelectedElements() {
        List<IZentaElement> list = new ArrayList<IZentaElement>();
        
        for(Mapping mapping : fMappings) {
            if(mapping.getSelectedType() != null) {
                list.add(mapping.getElement());
            }
        }
        
        return list;
    }
    
    @Override
    public boolean close() {
        getShell().getDisplay().removeFilter(SWT.KeyDown, this);
        getShell().getDisplay().removeFilter(SWT.KeyUp, this);
        
        return super.close();
    }
    
    @Override
    protected Point getDefaultDialogSize() {
        return new Point(600, 400);
    }
    
    private class RelationsTableViewer extends TableViewer {
        private String[] columnNames = {
            Messages.NewNestedRelationsDialog_4,
            Messages.NewNestedRelationsDialog_5
        };
        
        RelationsTableViewer(Composite parent, int style) {
            super(parent, SWT.FULL_SELECTION | style);
            setColumns(getTable());
            setContentProvider(new RelationsTableViewerContentProvider());
            setLabelProvider(new RelationsTableViewerLabelCellProvider());
        }
        
        /**
         * Set up the columns
         */
        private void setColumns(Table table) {
            table.setHeaderVisible(true);
            
            // Use layout from parent container
            TableColumnLayout layout = (TableColumnLayout)getControl().getParent().getLayout();
            
            TableColumn c1 = new TableColumn(table, SWT.NONE, 0);
            c1.setText(columnNames[0]);
            layout.setColumnData(c1, new ColumnWeightData(60, true));
            
            TableViewerColumn c2 = new TableViewerColumn(this, SWT.NONE);
            c2.getColumn().setText(columnNames[1]);
            layout.setColumnData(c2.getColumn(), new ColumnWeightData(40, true));
            c2.setEditingSupport(new TableColumnEditingSupport(this));
            
            // Column names are properties, needed for editing
            setColumnProperties(columnNames);
        }
        
        class RelationsTableViewerContentProvider implements IStructuredContentProvider {
            public void inputChanged(Viewer v, Object oldInput, Object newInput) {
            }
            
            public void dispose() {
            }
            
            public Object[] getElements(Object parent) {
                return fMappings;
            }
        }

        class RelationsTableViewerLabelCellProvider extends LabelProvider implements ITableLabelProvider {
            public Image getColumnImage(Object element, int columnIndex) {
                if(columnIndex == 0) {
                    return ZentaLabelProvider.INSTANCE.getImage(((Mapping)element).getElement());
                }
                return ZentaLabelProvider.INSTANCE.getImage(((Mapping)element).getSelectedType());
            }

            @Override
            public String getColumnText(Object element, int columnIndex) {
                if(columnIndex == 0) {
                    return ((Mapping)element).getElement().getName();
                }
                return ((Mapping)element).getSelectedRelationName();
            }
        }
        
        class TableColumnEditingSupport extends EditingSupport {
            ComboBoxCellEditor cellEditor;
            
            public TableColumnEditingSupport(ColumnViewer viewer) {
                super(viewer);
                cellEditor = new ComboBoxCellEditor(getTable(), new String[0], SWT.READ_ONLY);
                cellEditor.setActivationStyle(ComboBoxCellEditor.DROP_DOWN_ON_MOUSE_ACTIVATION);
                ((CCombo)cellEditor.getControl()).setVisibleItemCount(11);
            }

            @Override
            protected CellEditor getCellEditor(Object element) {
                cellEditor.setItems(((Mapping)element).getValidRelationNames());
                return cellEditor;
            }

            @Override
            protected boolean canEdit(Object element) {
                return true;
            }

            @Override
            protected Object getValue(Object element) {
                return ((Mapping)element).getSelectedIndex();
            }

            @Override
            protected void setValue(Object element, Object value) {
                ((Mapping)element).setSelectedIndex((Integer)value);
                getViewer().update(element, null);
                
                // Ctrl key pressed, set others to same if possible or (none) if not
                if(fModKeyPressed) {
                    RelationClass selectedClass = ((Mapping)element).getSelectedType();
                    for(Mapping mapping : fMappings) {
                        if(mapping != element) {
                            mapping.setSelectedType(selectedClass);
                            getViewer().update(mapping, null);
                        }
                    }
                }
            }
        }

    }
}
