/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.actions;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IWorkbenchPart;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.editor.ZentaEditorPlugin;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.handmade.util.DerivedRelationsUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.DerivedRelationsUtils.TooComplicatedException;
import org.rulez.magwas.zenta.model.info.IZentaImages;



/**
 * Create Derived Relation Action
 * 
 * @author Phillip Beauvoir
 */
public class CreateDerivedRelationAction extends SelectionAction {
    
    public static final String ID = "CreateDerivedRelationAction"; //$NON-NLS-1$
    public static final String TEXT = Messages.CreateDerivedRelationAction_0;
	private DerivedRelationsUtils drutil;
	private IFolder folder;

    public CreateDerivedRelationAction(IWorkbenchPart part, IDiagramModel model) {
        super(part);
        this.setFolder((IFolder)model.eContainer());
        setText(TEXT);
        setId(ID);
        setSelectionProvider((ISelectionProvider)part.getAdapter(GraphicalViewer.class));
        setImageDescriptor(IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_DERIVED_16));
    }

    @Override
    protected boolean calculateEnabled() {
        List<?> selection = getSelectedObjects();
        
        if(selection.size() != 2) {
            return false;
        }
        
        for(Object object : selection) {
            if(!(object instanceof EditPart)) {
                return false;
            }
            EditPart part = (EditPart)object;
            if(!(part.getModel() instanceof IDiagramModelZentaObject)) {
                return false;
            }
        }
        
        return true;
    }
    
    @Override
    public void run() {
    	//FIXME: untested
        List<?> selection = getSelectedObjects();
        
        EditPart editPart = (EditPart)selection.get(0);
        IDiagramModelZentaObject diagramModelObject1 = (IDiagramModelZentaObject)editPart.getModel();
        editPart = (EditPart)selection.get(1);
        IDiagramModelZentaObject diagramModelObject2 = (IDiagramModelZentaObject)editPart.getModel();
        
        ChainList chainList1 = new ChainList(diagramModelObject1, diagramModelObject2);
        ChainList chainList2 = new ChainList(diagramModelObject2, diagramModelObject1);
        drutil = new DerivedRelationsUtils(diagramModelObject1.getZentaElement().getZentaModel());

        if(!couldWeFindAnything(chainList1, chainList2))
        	return;
        
        CreateDerivedConnectionDialog dialog = new CreateDerivedConnectionDialog(getWorkbenchPart().getSite().getShell(),
                chainList1, chainList2);
        
        createChoosenChain(dialog);
    }

		private boolean couldWeFindAnything(ChainList chainList1, ChainList chainList2) {
			if(chainList1.hasExistingDirectRelationship() && chainList2.hasExistingDirectRelationship()) {
	            alreadyADirectConnectionDialog();
	            return false;
	        }
	        if(chainList1.isTooComplicated && chainList2.isTooComplicated) {
	            tooManyPossibilitiesDialog();
	            return false;
	        }
	        if(chainList1.getChains() == null && chainList2.getChains() == null) {
	            if(chainList1.isTooComplicated || chainList2.isTooComplicated)
	                notFoundOrTooComplicatedDialog();
	            else
	                notFoundDialog();
	            return false;
	        }
	        return true;
		}
			private void notFoundDialog() {
				MessageDialog.openInformation(getWorkbenchPart().getSite().getShell(),
				        Messages.CreateDerivedRelationAction_1,
				        Messages.CreateDerivedRelationAction_5);
			}
			private void notFoundOrTooComplicatedDialog() {
				MessageDialog.openInformation(getWorkbenchPart().getSite().getShell(),
				        Messages.CreateDerivedRelationAction_1,
				        Messages.CreateDerivedRelationAction_4);
			}
			private void tooManyPossibilitiesDialog() {
				MessageDialog.openInformation(getWorkbenchPart().getSite().getShell(),
				        Messages.CreateDerivedRelationAction_1,
				        Messages.CreateDerivedRelationAction_3);
			}
			private void alreadyADirectConnectionDialog() {
				MessageDialog.openInformation(getWorkbenchPart().getSite().getShell(),
				        Messages.CreateDerivedRelationAction_1,
				        Messages.CreateDerivedRelationAction_2);
			}
		private void createChoosenChain(CreateDerivedConnectionDialog dialog) {
			if(dialog.open() == IDialogConstants.OK_ID) {
	            NonNullList<IBasicRelationship> chain = dialog.getSelectedChain();
	            if(chain != null) {
	                ChainList chainList = dialog.getSelectedChainList();
	                IBasicRelationship relationshipClass = drutil.getWeakestType(chain);
	                IBasicRelationship relation = (IBasicRelationship) relationshipClass.create(getFolder());
	                CommandStack stack = (CommandStack)getWorkbenchPart().getAdapter(CommandStack.class);
	                stack.execute(new CreateDerivedConnectionCommand(chainList.srcDiagramObject, chainList.tgtDiagramObject, relation));
	            }
	        }
		}
    
    // ================================ Helper Classes =====================================
    
    public IFolder getFolder() {
			return Util.verifyNonNull(folder);
	}

		public void setFolder(IFolder folder) {
			this.folder = folder;
		}

	/**
     * Convenience class to group things together
     */
    private class ChainList {
        IDiagramModelZentaObject srcDiagramObject;
        IDiagramModelZentaObject tgtDiagramObject;
        private IZentaElement srcElement;
        private IZentaElement tgtElement;
        NonNullList<NonNullList<IBasicRelationship>> chains;
        boolean isTooComplicated;
        
        ChainList(IDiagramModelZentaObject srcDiagramObject, IDiagramModelZentaObject tgtDiagramObject) {
            this.srcDiagramObject = srcDiagramObject;
            this.tgtDiagramObject = tgtDiagramObject;
            setSrcElement(srcDiagramObject.getZentaElement());
            setTgtElement(tgtDiagramObject.getZentaElement());
            
            if(!hasExistingDirectRelationship()) {
                findChains();
            }
        }
        
        boolean hasExistingDirectRelationship() {
            return drutil.hasDirectStructuralRelationship(getSrcElement(), getTgtElement());
        }
        
        private void findChains() {
            try {
                chains = drutil.getDerivedRelationshipChains(getSrcElement(), getTgtElement());
            }
            catch(TooComplicatedException ex) {
                isTooComplicated = true;
            }
        }
        
        NonNullList<NonNullList<IBasicRelationship>> getChains() {
            if(hasExistingDirectRelationship()) {
                return null;
            }
            
            return chains;
        }

		public IZentaElement getSrcElement() {
			return Util.verifyNonNull(srcElement);
		}

		public void setSrcElement(IZentaElement srcElement) {
			this.srcElement = srcElement;
		}

		public IZentaElement getTgtElement() {
			return Util.verifyNonNull(tgtElement);
		}

		public void setTgtElement(IZentaElement tgtElement) {
			this.tgtElement = tgtElement;
		}
    }
    
    /**
     * Dialog window
     */
    private class CreateDerivedConnectionDialog extends Dialog implements ISelectionChangedListener, IDoubleClickListener {
        // For persisting dialog position and size
        private static final String DIALOG_SETTINGS_SECTION = "CreateDerivedConnectionDialog"; //$NON-NLS-1$

        private ChainList chainList1, chainList2;
        private NonNullList<IBasicRelationship> selectedChain;
        private ChainList selectedChainList;
        
        public CreateDerivedConnectionDialog(Shell parentShell, ChainList chainList1, ChainList chainList2) {
            super(parentShell);
            setShellStyle(getShellStyle() | SWT.RESIZE);
            this.chainList1 = chainList1;
            this.chainList2 = chainList2;
        }
        
        @Override
        protected void configureShell(Shell shell) {
            super.configureShell(shell);
            shell.setText(Messages.CreateDerivedRelationAction_6);
            shell.setImage(IZentaUIImages.ImageFactory.getImage(IZentaImages.ICON_DERIVED_16));
        }
        
        @Override
        protected Control createDialogArea(Composite parent) {
            Composite composite = (Composite)super.createDialogArea(parent);
            composite.setBackground(ColorConstants.white);
            composite.setBackgroundMode(SWT.INHERIT_DEFAULT);

            GridLayout layout = new GridLayout();
            layout.marginWidth = 10;
            composite.setLayout(layout);
            GridData gd = new GridData(GridData.FILL_BOTH);
            gd.widthHint = 700;
            composite.setLayoutData(gd);
            
            if(chainList1.getChains() != null) {
                createTable(composite, chainList1);
            }
            else if(chainList1.isTooComplicated) {
                createTooComplicatedMessage(composite, chainList1);
            }
            
            if(chainList2.getChains() != null) {
                createTable(composite, chainList2);
            }
            else if(chainList2.isTooComplicated) {
                createTooComplicatedMessage(composite, chainList2);
            }
            
            return composite;
        }
        
        private void createTable(Composite parent, ChainList chainList) {
            createLabel(parent, chainList);
            
            Composite c = new Composite(parent, SWT.NULL);
            c.setLayout(new TableColumnLayout());
            GridData gd = new GridData(GridData.FILL_BOTH);
            gd.heightHint = 200;
            c.setLayoutData(gd);

            DerivedConnectionsTableViewer viewer = new DerivedConnectionsTableViewer(c);
            
            viewer.setInput(chainList);
            viewer.addSelectionChangedListener(this);
            viewer.addDoubleClickListener(this);
        }
        
        private void createTooComplicatedMessage(Composite parent, ChainList chainList) {
            CLabel label = createLabel(parent, chainList);
            label.setText(label.getText() + "  " + Messages.CreateDerivedRelationAction_7); //$NON-NLS-1$
            label.setImage(Display.getCurrent().getSystemImage(SWT.ICON_INFORMATION));
        }
        
        private CLabel createLabel(Composite parent, ChainList chainList) {
            CLabel label = new CLabel(parent, SWT.NULL);
            String text = NLS.bind(Messages.CreateDerivedRelationAction_8, chainList.getSrcElement().getName(), chainList.getTgtElement().getName());
            label.setText(text);
            label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            return label;
        }
        
        @Override
        protected void createButtonsForButtonBar(Composite parent) {
            super.createButtonsForButtonBar(parent);
            getButton(IDialogConstants.OK_ID).setEnabled(false);
        }
        
        public NonNullList<IBasicRelationship> getSelectedChain() {
            return selectedChain;
        }
        
        public ChainList getSelectedChainList() {
            return selectedChainList;
        }

        @SuppressWarnings("unchecked")
        @Override
        public void selectionChanged(SelectionChangedEvent event) {
            IStructuredSelection selection = (IStructuredSelection)event.getSelection();
            List<IBasicRelationship> fe = (List<IBasicRelationship>)selection.getFirstElement();
			selectedChain = new NonNullArrayList<IBasicRelationship>(fe);
            selectedChainList = (ChainList)((TableViewer)event.getSource()).getInput();
            getButton(IDialogConstants.OK_ID).setEnabled(!selection.isEmpty());
        }

        @Override
        public void doubleClick(DoubleClickEvent event) {
            okPressed();
        }
        
        @Override
        protected IDialogSettings getDialogBoundsSettings() {
            IDialogSettings settings = ZentaEditorPlugin.INSTANCE.getDialogSettings();
            IDialogSettings section = settings.getSection(DIALOG_SETTINGS_SECTION);
            if(section == null) {
                section = settings.addNewSection(DIALOG_SETTINGS_SECTION);
            } 
            return section;
        }

    }
    
    /**
     * Table Viewer
     */
    private class DerivedConnectionsTableViewer extends TableViewer {
        public DerivedConnectionsTableViewer(Composite parent) {
            super(parent, SWT.FULL_SELECTION | SWT.SINGLE | SWT.BORDER);
            
            Table table = getTable();
            
            table.setHeaderVisible(true);
            table.setLinesVisible(true);
            
            TableColumnLayout layout = (TableColumnLayout)getControl().getParent().getLayout();
            
            TableColumn column = new TableColumn(table, SWT.NONE);
            column.setText(Messages.CreateDerivedRelationAction_9);
            layout.setColumnData(column, new ColumnWeightData(80, true));
            
            column = new TableColumn(table, SWT.NONE);
            column.setText(Messages.CreateDerivedRelationAction_10);
            layout.setColumnData(column, new ColumnWeightData(20, true));
            
            setContentProvider(new DerivedConnectionsContentProvider());
            setLabelProvider(new DerivedConnectionsLabelProvider());
        }
        
        /**
         * Table Content Provider
         */
        private class DerivedConnectionsContentProvider implements IStructuredContentProvider {
            @Override
            public void dispose() {
            }

            @Override
            public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            }

            @Override
            public Object[] getElements(Object input) {
                if(input instanceof ChainList) {
                    return ((ChainList)input).getChains().toArray();
                }
                return null;
            }
        }

        /**
         * Table Lable Provider
         */
        private class DerivedConnectionsLabelProvider extends LabelProvider implements ITableLabelProvider {
            @Override
            public Image getColumnImage(Object element, int columnIndex) {
                return null;
            }

            @Override
            public String getColumnText(Object element, int columnIndex) {
                if(element == null) {
                    return ""; //$NON-NLS-1$
                }

                @SuppressWarnings("unchecked")
                NonNullList<IBasicRelationship> chain = new NonNullArrayList<IBasicRelationship>((List<IBasicRelationship>)element);
                ChainList chainList = (ChainList)getInput();

                switch(columnIndex) {
                    // Chain
                    case 0:
                        String s = chainList.getSrcElement().getName();
                        s += " --> "; //$NON-NLS-1$
                        for(int i = 1; i < chain.size(); i++) {
                            IBasicRelationship relation = chain.get(i);
                            s += getRelationshipText(chain, relation);
                            if(drutil.isBidirectionalRelationship(relation)) {
                                s += " <-> "; //$NON-NLS-1$
                            }
                            else {
                                s += " --> "; //$NON-NLS-1$
                            }
                        }
                        s += chainList.getTgtElement().getName();
                        
                        return s; 

                        // Weakest
                    case 1:
                        return drutil.getWeakestType(chain).getName(); 
                }

                return ""; //$NON-NLS-1$
            }
            
            private String getRelationshipText(NonNullList<IBasicRelationship> chain, IBasicRelationship relation) {
                if(drutil.isBidirectionalRelationship(relation)) {
                    int index = chain.indexOf(relation);
                    if(index > 0) {
                        IBasicRelationship previous = chain.get(index - 1);
                        if(relation.getTarget() == previous.getTarget()) {
                            return relation.getTarget().getName();
                        }
                    }
                    return relation.getSource().getName();
                }
                else {
                    return relation.getSource().getName();
                }
            }
        }
    }
    
    
    /**
     * Command Stack Command
     */
    private class CreateDerivedConnectionCommand extends Command {
        private IBasicRelationship fRelation;
        private IDiagramModelZentaConnection fConnection;
        private IDiagramModelZentaObject fSource;
        private IDiagramModelZentaObject fTarget;
        
        public CreateDerivedConnectionCommand(IDiagramModelZentaObject source, IDiagramModelZentaObject target,
                IBasicRelationship relation) {
            fSource = source;
            fTarget = target;
            fRelation = relation;
            setLabel(Messages.CreateDerivedRelationAction_11);
        }

        @Override
        public void execute() {
            fConnection = IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
            fConnection.setRelationship(fRelation);
            fConnection.connect(fSource, fTarget);
            addToModel();
        }
        
        @Override
        public void redo() {
            fConnection.reconnect();
            addToModel();
        }
        
        private void addToModel() {
            fConnection.addRelationshipToModel(getFolder());
        }
        
        @Override
        public void undo() {
            // Remove the model relationship from its model folder
            fConnection.removeRelationshipFromModel();
            
            // Disconnect last because we needed access to fConnection.getDiagramModel()
            fConnection.disconnect();
        }
        
        @Override
        public void dispose() {
            fConnection = null;
            fSource = null;
            fTarget = null;
            fRelation = null;
        }
    }
    
}
