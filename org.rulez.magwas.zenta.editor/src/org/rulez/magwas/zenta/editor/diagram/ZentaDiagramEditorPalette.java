package org.rulez.magwas.zenta.editor.diagram;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.PaletteToolbar;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.tools.AbstractTool;
import org.rulez.magwas.zenta.editor.diagram.tools.FormatPainterToolEntry;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionCreationTool;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionModelFactory;
import org.rulez.magwas.zenta.editor.diagram.tools.PanningSelectionExtendedTool;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;

public class ZentaDiagramEditorPalette extends AbstractPaletteRoot {
    
    private FormatPainterToolEntry formatPainterEntry;
    
    private IViewpoint fViewpoint;
    
    private PaletteContainer fRelationsGroup;
    
    private PaletteContainer fObjectClassGroup;

	private IFolder folder;

    public PaletteContainer _getObjectsGroup() {
    	return fObjectClassGroup;
    }
    
    public PaletteContainer _getRelationsGroup() {
    	return fRelationsGroup;
    }
    
    public ZentaDiagramEditorPalette(IZentaDiagramModel diagram) {
    	folder = (IFolder) diagram.eContainer();
        add(createControlsGroup());
        add(new PaletteSeparator("")); //$NON-NLS-1$
        
        fRelationsGroup = createRelationsGroup();
        add(fRelationsGroup);
        add(new PaletteSeparator("")); //$NON-NLS-1$

        add(createExtrasGroup());
        add(new PaletteSeparator("")); //$NON-NLS-1$
        
        createZentaGroup();
        setAdapter();
        
    }
	private void setAdapter() {
		final ZentaDiagramEditorPalette self = this;
		EContentAdapter adapter = new EContentAdapter() {
	        public void notifyChanged(Notification notification) {
	          super.notifyChanged(notification);
	          self.processNotification(notification);
	        }
	    };
	    IZentaFactory.eINSTANCE.createMetamodel(folder.getZentaModel()).eAdapters().add(adapter);
	}

    protected void processNotification(Notification notification) {
    	Object notifier = notification.getNotifier();
		if(notification.getEventType() == Notification.ADD) {
    		if(notifier instanceof ITemplate)
    			addClassToPalette(notification.getNewValue());
    	}
    	if(notification.getEventType() == Notification.SET) {
    		if(notifier instanceof IObjectClass)
    			changeObjectClassNameInPalette((IObjectClass) notifier);
    		if(notifier instanceof IRelationClass)
    			changeRelationClassNameInPalette((IRelationClass) notifier);
    	}
    	if(notification.getEventType() == Notification.REMOVE) {
    		if(notifier instanceof ITemplate)
    			processClassRemove(notification.getOldValue());
    	}
	}

	private void processClassRemove(Object oldValue) {
		PaletteContainer group = null;
		if(oldValue instanceof IObjectClass)
			group = this.fObjectClassGroup;
		else if(oldValue instanceof IRelationClass)
			group = this.fRelationsGroup;
		if(group != null) {
			@SuppressWarnings("unchecked")
			List<CreationToolEntry> children = group.getChildren();
			CreationToolEntry entry = findClassEntry((IReferencesModelObject) oldValue, children);
			group.remove(entry);
		}
		
	}

	private void changeRelationClassNameInPalette(IRelationClass changedClass) {
		@SuppressWarnings("unchecked")
		List<CreationToolEntry> children = this.fRelationsGroup.getChildren();
		renameEntry(changedClass, children);
	}

	private void changeObjectClassNameInPalette(IObjectClass changedClass) {
		@SuppressWarnings("unchecked")
		List<CreationToolEntry> children = fObjectClassGroup.getChildren();
		renameEntry(changedClass, children);
	}

	private void renameEntry(IReferencesModelObject changedClass,
			List<CreationToolEntry> children) {
		CreationToolEntry entry = findClassEntry(changedClass, children);
		entry.setLabel(changedClass.getName());
	}
	
	private CreationToolEntry findClassEntry(IReferencesModelObject changedClass,
			List<CreationToolEntry> children) {
		for(CreationToolEntry entry : children)
			if(entry.getId().equals(changedClass.getId()))
				return entry;
		return null;
	}


	private void addClassToPalette(Object newValue) {
		if(newValue instanceof IObjectClass)
			addObjectClassToPalette((IObjectClass) newValue);
		else if(newValue instanceof IRelationClass)
			addRelationClassToPalette((IRelationClass) newValue);
	}
		private void addObjectClassToPalette(IObjectClass newOc) {
			PaletteEntry entry = createCombinedTemplateCreationEntry(newOc, null);
			fObjectClassGroup.add(entry);
		}
		private void addRelationClassToPalette(IRelationClass newRc) {
			ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(newRc, null);
			fRelationsGroup.add(entry);
		}

	public void setViewpoint(IViewpoint viewpoint) {
        if(fViewpoint != viewpoint) {
            fViewpoint = viewpoint;
            remove(fRelationsGroup);
            fRelationsGroup = createRelationsGroup();
            add(1, fRelationsGroup);
            
            remove(fObjectClassGroup);
            createZentaGroup();
        }
    }
    
    private void createZentaGroup() {
        fObjectClassGroup = createObjectClassGroup();
        if(!fObjectClassGroup.getChildren().isEmpty()) {
            add(fObjectClassGroup);
        }
    }
        
    private PaletteContainer createControlsGroup() {
        PaletteContainer group = new PaletteToolbar(Messages.ZentaDiagramEditorPalette_0);
        
        ToolEntry tool = new PanningSelectionToolEntry();
        tool.setToolClass(PanningSelectionExtendedTool.class);
        group.add(tool);

        setDefaultEntry(tool);
        
        PaletteStack stack = createMarqueeSelectionStack();
        group.add(stack);
        
        formatPainterEntry = new FormatPainterToolEntry();
        group.add(formatPainterEntry);
        
        return group;
    }

    private PaletteContainer createExtrasGroup() {
        PaletteContainer group = new PaletteGroup(Messages.ZentaDiagramEditorPalette_1);
        createNote(group);
        createGroupObjectEntry(group);
        if(null == fViewpoint) {
        	return group;
        }
        createNoteConnection(group);
        return group;
    }
		private void createNote(PaletteContainer group) {
			PaletteEntry noteEntry = new CombinedTemplateCreationEntry(
	                Messages.ZentaDiagramEditorPalette_2,
	                Messages.ZentaDiagramEditorPalette_3,
	                new ZentaDiagramModelFactory(IZentaFactory.eINSTANCE.createNoteClass(),folder),
	                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_NOTE_16),
	                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_NOTE_16));
	        group.add(noteEntry);
		}
		private void createGroupObjectEntry(PaletteContainer group) {
			PaletteEntry groupEntry = new CombinedTemplateCreationEntry(
	                Messages.ZentaDiagramEditorPalette_4,
	                Messages.ZentaDiagramEditorPalette_5,
	                new ZentaDiagramModelFactory(IZentaFactory.eINSTANCE.createGroupClass(),folder),
	                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_GROUP_16),
	                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_GROUP_16));
	        group.add(groupEntry);
		}
		private void createNoteConnection(PaletteContainer group) {
			ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(
	                IZentaFactory.eINSTANCE.createNoteConnectionClass(),
	                Messages.ZentaDiagramEditorPalette_6,
	                Messages.ZentaDiagramEditorPalette_7);
	        group.add(entry);
		}

    private PaletteContainer createObjectClassGroup() {
        PaletteContainer group = new PaletteGroup(Messages.ZentaDiagramEditorPalette_8);
        if(null == fViewpoint)
        	return group;
        addObjectClasses(group);
        
        return group;
    }
		private void addObjectClasses(PaletteContainer group) {
			for(IObjectClass klass : fViewpoint.getObjectClasses()) {
	            if(isAllowedType(klass)) {
	                PaletteEntry entry = createCombinedTemplateCreationEntry(klass, null);
	                group.add(entry);
	            }
	        }
		}

    private PaletteContainer createRelationsGroup() {
        PaletteContainer group = new PaletteGroup(Messages.ZentaDiagramEditorPalette_13);
        addMagicConnector(group);
    	if(null == fViewpoint)
    		return group;
        addRelationClasses(group);
        addJunctions(group);
        return group;
    }
		private void addMagicConnector(PaletteContainer group) {
			ConnectionCreationToolEntry magicConnectionEntry = new ConnectionCreationToolEntry(
		            Messages.ZentaDiagramEditorPalette_14,
		            Messages.ZentaDiagramEditorPalette_15,
		            new MagicConnectionModelFactory(folder),
		            IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_MAGIC_CONNECTION_16),
		            IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_MAGIC_CONNECTION_16));
		    
		    magicConnectionEntry.setToolClass(MagicConnectionCreationTool.class);
		    magicConnectionEntry.setToolProperty(AbstractTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
		    group.add(magicConnectionEntry);
		}
		private void addRelationClasses(PaletteContainer group) {
			for(IRelationClass eClass : fViewpoint.getRelationClasses()) {
	            if(fViewpoint.isAllowedType(eClass)) {
	                ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(eClass, null);
	                group.add(entry);
	            }
	        }
		}
		private void addJunctions(PaletteContainer group) {
			PaletteStack stack = null;
	        
	        for(IObjectClass eClass : fViewpoint.getConnectorClasses()) {
	            if(isAllowedType(eClass)) {
	                if(stack == null) {
	                    stack = new PaletteStack(Messages.ZentaDiagramEditorPalette_16, Messages.ZentaDiagramEditorPalette_16, null);
	                    group.add(stack);
	                }
	                PaletteEntry entry = createCombinedTemplateCreationEntry(eClass, null);
	                stack.add(entry);
	            }
	        }
		}
    
    private boolean isAllowedType(IObjectClass klass) {
        return fViewpoint == null || fViewpoint != null && fViewpoint.isAllowedType(klass);
    }
    
    public void dispose() {
        formatPainterEntry.dispose();
    }
    
    private CombinedTemplateCreationEntry createCombinedTemplateCreationEntry(IObjectClass klass, String description) {
        CombinedTemplateCreationEntry entry = new CombinedTemplateCreationEntry(
                klass.getName(),
                description,
                new ZentaDiagramModelFactory(klass,folder),
                ZentaLabelProvider.INSTANCE.getImageDescriptor(klass),
                ZentaLabelProvider.INSTANCE.getImageDescriptor(klass));
        entry.setId(klass.getId());
		return entry;
    }
    
    private ConnectionCreationToolEntry createConnectionCreationToolEntry(IRelationClass eClass, String description) {
        return createConnectionCreationToolEntry(eClass, eClass.getName(), description);
    }
    
    private ConnectionCreationToolEntry createConnectionCreationToolEntry(IRelationClass eClass, String name, String description) {
        ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry(
                name,
                description,
                new ZentaDiagramModelFactory(eClass,folder),
                fViewpoint.getImageDescriptor(eClass),
                fViewpoint.getImageDescriptor(eClass));
        
        entry.setToolProperty(AbstractTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
        entry.setId(eClass.getId());
        return entry;
    }
}
