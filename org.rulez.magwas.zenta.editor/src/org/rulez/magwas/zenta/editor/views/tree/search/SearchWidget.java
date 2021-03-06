/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.search;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.nonnul.NonNullListIterator;
import org.rulez.magwas.zenta.editor.actions.AbstractDropDownAction;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.editor.ui.components.CellEditorGlobalActionHandler;
import org.rulez.magwas.zenta.editor.utils.PlatformUtils;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;
import org.rulez.magwas.zenta.controller.IZentaImages;



/**
 * Search Widget
 * 
 * @author Phillip Beauvoir
 */
public class SearchWidget extends Composite {

    private Text fSearchText;
    
    private SearchFilter fSearchFilter;
    
    private IAction fActionFilterName;
    private IAction fActionFilterDoc;
    
    private MenuManager fPropertiesMenu;
    
    private List<IAction> fObjectActions = new ArrayList<IAction>();
    
    // Hook into the global edit Action Handlers and null them when the text control has the focus
    private Listener textControlListener = new Listener() {
        private CellEditorGlobalActionHandler globalActionHandler;
        
        @Override
        public void handleEvent(Event event) {
            switch(event.type) {
                case SWT.Activate:
                    globalActionHandler = new CellEditorGlobalActionHandler();
                    globalActionHandler.clearGlobalActions();
                    break;

                case SWT.Deactivate:
                    if(globalActionHandler != null) {
                        globalActionHandler.restoreGlobalActions();
                    }
                    break;

                default:
                    break;
            }
        }
    };
    
    public SearchWidget(Composite parent, SearchFilter filter) {
        super(parent, SWT.NULL);
        
        fSearchFilter = filter;
        
        GridLayout layout = new GridLayout(2, false);
        setLayout(layout);
        setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        
        setupToolBar();
        setupSearchTextWidget();
        
        fSearchFilter.saveState();
    }
    
    @Override
    public boolean setFocus() {
        return fSearchText.setFocus();
    }

    protected void setupSearchTextWidget() {
        if(PlatformUtils.isWindows()) {
            SearchTextWidget widget = new SearchTextWidget(this);
            widget.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            fSearchText = widget.getTextControl();
        }
        else {
            fSearchText = new Text(this, SWT.SEARCH | SWT.ICON_CANCEL | SWT.ICON_SEARCH);
            fSearchText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        }
        
        fSearchText.addModifyListener(new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                fSearchFilter.setSearchText(fSearchText.getText());
            }
        });

        // Hook into the global edit Action Handlers and null them when the text control has the focus
        fSearchText.addListener(SWT.Activate, textControlListener);
        fSearchText.addListener(SWT.Deactivate, textControlListener);
    }

    protected void setupToolBar() {
        fActionFilterName = new Action(Messages.SearchWidget_0, IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
            	fSearchFilter.setFilterOnName(isChecked());
            };
        };
        fActionFilterName.setToolTipText(Messages.SearchWidget_1);
        fActionFilterName.setChecked(true);
        fSearchFilter.setFilterOnName(true);
        
        fActionFilterDoc = new Action(Messages.SearchWidget_2, IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
            	fSearchFilter.setFilterOnDocumentation(isChecked());
            }
        };
        fActionFilterDoc.setToolTipText(Messages.SearchWidget_3);

        final ToolBarManager toolBarmanager = new ToolBarManager(SWT.FLAT);
        toolBarmanager.createControl(this);

        AbstractDropDownAction dropDownAction = new AbstractDropDownAction(Messages.SearchWidget_4) {
            @Override
            public void run() {
            	showMenu(toolBarmanager);
            }
            
            @Override
            public ImageDescriptor getImageDescriptor() {
                return IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_FILTER_16);
            }
        };
        toolBarmanager.add(dropDownAction);

        // Name & Documentation
        dropDownAction.add(fActionFilterName);
        dropDownAction.add(fActionFilterDoc);
        
        // Properties
        fPropertiesMenu = new MenuManager(Messages.SearchWidget_5);
        dropDownAction.add(fPropertiesMenu);
        populatePropertiesMenu(fPropertiesMenu);
        
        dropDownAction.add(new Separator());
        
        MenuManager businessMenu = new MenuManager(Messages.SearchWidget_6);
        dropDownAction.add(businessMenu);
        NonNullList<IZentaModel> models = IEditorModelManager.INSTANCE.getModels();
        IMetamodel mm;
		for (NonNullListIterator<IZentaModel> iterator = models.iterator(); iterator
				.hasNext();) {
			IZentaModel model = iterator.next();
			mm = IZentaFactory.eINSTANCE.findMetamodelFor(model);
        	if(null != mm)
	            for(IBasicObject eClass : mm.getObjectClasses()) {
	                businessMenu.add(createObjectAction(eClass));
	            }
		}

        MenuManager relationsMenu = new MenuManager(Messages.SearchWidget_11);
        dropDownAction.add(relationsMenu);
		for (int i = 0; i < models.size(); i++) {
			IZentaModel model = models.get(i);
			mm = IZentaFactory.eINSTANCE.getMetamodelFor(model);
	        for(IBasicRelationship eClass : mm.getRelationClasses()) {
	            relationsMenu.add(createObjectAction(eClass));
	        }
		}
        
        dropDownAction.add(new Separator());
        
        IAction action = new Action(Messages.SearchWidget_12, IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
            	fSearchFilter.setShowAllFolders(isChecked());
            }
        };
        dropDownAction.add(action);
        
        dropDownAction.add(new Separator());
        
        action = new Action(Messages.SearchWidget_13) {
            @Override
            public void run() {
            	reset();
            }
        };
        dropDownAction.add(action);
        
        toolBarmanager.update(true);
    }
    
    private void reset() {
        // Clear Documentation
        fActionFilterDoc.setChecked(false);

        // Clear Objects
        for(IAction action : fObjectActions) {
            action.setChecked(false);
        }

        // Clear & Reset Properties sub-menus
        fPropertiesMenu.removeAll();
        populatePropertiesMenu(fPropertiesMenu);

        fSearchFilter.resetFilters();

        // Default to search on Name
        fActionFilterName.setChecked(true);
        fSearchFilter.setFilterOnName(true);
    }

	private IAction createObjectAction(final IBasicObject eClass) {
        IAction action = new Action(eClass.getName(), IAction.AS_CHECK_BOX) {
            @Override
            public void run() {
                if(isChecked()) {
                    fSearchFilter.addObjectFilter(eClass);
                }
                else {
                    fSearchFilter.removeObjectFilter(eClass);
                }
            }
            
            @Override
            public ImageDescriptor getImageDescriptor() {
            	throw new UnTestedException();
                //return ZentaLabelProvider.INSTANCE.getImageDescriptor(eClass);
            }
        };
        
        fObjectActions.add(action);
        
        return action;
    }

	private void populatePropertiesMenu(MenuManager propertiesMenu) {
	    // Models that are loaded are the ones in the Models Tree
	    List<String> list = new ArrayList<String>();

	    for(IZentaModel model : IEditorModelManager.INSTANCE.getModels()) {
	        getAllUniquePropertyKeysForModel(model, list);
	    }

	    for(final String key : list) {
	        IAction action = new Action(key, IAction.AS_CHECK_BOX) {
	            @Override
	            public void run() {
	                if(isChecked()) {
	                    fSearchFilter.addPropertiesFilter(key);
	                }
	                else {
	                    fSearchFilter.removePropertiesFilter(key);
	                }
	            }
	        };

	        propertiesMenu.add(action);
	    }

	    propertiesMenu.update(true);
	}

    private void getAllUniquePropertyKeysForModel(IZentaModel model, List<String> list) {
        for(Iterator<EObject> iter = model.eAllContents(); iter.hasNext();) {
            EObject element = iter.next();
            if(element instanceof IProperty) {
            	String key = ((IProperty)element).getKey();
            	if(StringUtils.isSetAfterTrim(key) && !list.contains(key)) {
            		list.add(key);
            	}
            }
        }
    }
}
