/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.propertysections;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.diagram.IZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.IDiagramModelEditor;
import org.rulez.magwas.zenta.editor.diagram.editparts.IZentaEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IZentaConnectionEditPart;
import org.rulez.magwas.zenta.editor.model.DiagramModelUtils;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.info.IZentaImages;



/**
 * Property Section for "Used in Views"
 * 
 * @author Phillip Beauvoir
 */
public class UsedInViewsSection extends AbstractZentaPropertySection {
    
    private static final String HELP_ID = "org.rulez.magwas.zenta.help.usedInViewsSection"; //$NON-NLS-1$
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter implements IFilter {
        @Override
        public boolean select(Object object) {
            return object instanceof IZentaElement || object instanceof IZentaEditPart 
                    || object instanceof IZentaConnectionEditPart;
        }
    }

    private IZentaElement fZentaElement;
    
    private TableViewer fTableViewer;
    private UpdatingTableColumnLayout fTableLayout;
    
    @Override
    protected void createControls(Composite parent) {
        createTableControl(parent);
    }
    
    private void createTableControl(Composite parent) {
        createLabel(parent, Messages.UsedInViewsSection_0, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.NONE);
        
        // Table
        Composite tableComp = createTableComposite(parent, SWT.NONE);
        fTableLayout = (UpdatingTableColumnLayout)tableComp.getLayout();
        fTableViewer = new TableViewer(tableComp, SWT.BORDER | SWT.FULL_SELECTION);
        
        // Column
        TableViewerColumn column = new TableViewerColumn(fTableViewer, SWT.NONE, 0);
        fTableLayout.setColumnData(column.getColumn(), new ColumnWeightData(100, false));
        
        // On Mac shows alternate table row colours
        fTableViewer.getTable().setLinesVisible(true);
        
        // Help ID
        PlatformUI.getWorkbench().getHelpSystem().setHelp(fTableViewer.getTable(), HELP_ID);

        fTableViewer.setContentProvider(new IStructuredContentProvider() {
            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            }
            
            public void dispose() {
            }
            
            public Object[] getElements(Object inputElement) {
                IZentaElement ie = Util.verifyNonNull((IZentaElement)inputElement);
				return DiagramModelUtils.findReferencedDiagramsForElement(ie).toArray();
            }
        });
        
        fTableViewer.setLabelProvider(new LabelProvider() {
            @Override
            public String getText(Object element) {
                return ((IDiagramModel)element).getName();
            }
            
            @Override
            public Image getImage(Object element) {
                return IZentaUIImages.ImageFactory.getImage(IZentaImages.ICON_DIAGRAM_16);
            }
        });
        
        fTableViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                if(!isAlive()) {
                    return;
                }
                Object o = ((IStructuredSelection)event.getSelection()).getFirstElement();
                if(o instanceof IDiagramModel) {
                    IDiagramModel diagramModel = (IDiagramModel)o;
                    IDiagramModelEditor editor = (IDiagramModelEditor) EditorManager.openDiagramEditor(diagramModel);
                    if(editor instanceof IZentaDiagramEditor) {
                        ((IZentaDiagramEditor)editor).selectElements(new IZentaElement[] { fZentaElement });
                    }
                }
            }
        });
        
        fTableViewer.setSorter(new ViewerSorter());
    }
    
    @Override
    protected void setElement(Object element) {
        if(element instanceof IZentaElement) {
            fZentaElement = (IZentaElement)element;
        }
        else if(element instanceof IAdaptable) {
            fZentaElement = (IZentaElement)((IAdaptable)element).getAdapter(IZentaElement.class);
        }
        else {
            System.err.println("UsedInViewsSection wants to display for " + element); //$NON-NLS-1$
        }
        
        refreshControls();
    }
    
    protected void refreshControls() {
        fTableViewer.setInput(fZentaElement);
        fTableLayout.doRelayout();
    }
    
    @Override
    protected Adapter getECoreAdapter() {
        return null;
    }

    @Override
    protected EObject getEObject() {
        return fZentaElement;
    }
    
    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }
}
