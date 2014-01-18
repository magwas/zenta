package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
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
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;

public class ZentaDiagramEditorPalette extends AbstractPaletteRoot {
    
    private FormatPainterToolEntry formatPainterEntry;
    
    private IViewpoint fViewpoint;
    
    private PaletteContainer fRelationsGroup;
    
    private PaletteContainer fObjectClassGroup;

	private IFolder folder;

	private PaletteContainer controlsGroup;

	private PaletteContainer extrasGroup;

    public PaletteContainer _getObjectsGroup() {
    	return fObjectClassGroup;
    }
    
    public PaletteContainer _getControlsGroup() {
    	return controlsGroup;
    }
    public PaletteContainer _getExtrasGroup() {
    	return extrasGroup;
    }
    public PaletteContainer _getRelationsGroup() {
    	return fRelationsGroup;
    }
    
    public IViewpoint _getViewPoint() {
    	return fViewpoint;
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
	    IZentaModel model = folder.getZentaModel();
		IMetamodel metamodel = IZentaFactory.eINSTANCE.createMetamodel(model);
		metamodel.eAdapters().add(adapter);
		model.eAdapters().add(adapter);
	}

    protected void processNotification(Notification notification) {
    	Object notifier = notification.getNotifier();
    	//System.out.printf("\n-----------------\nnotifier=%s\nevent=%s\nnewVal=%s\n", notifier, notification.getEventType(), notification.getNewValue());
		if(notification.getEventType() == Notification.ADD) {
    		if(notifier instanceof ITemplate)
    			addClassToPalette((IBasicObject) notification.getNewValue());
    	}
		if(notifier instanceof IBasicObject) {
			if(!((IObjectClass) notifier).isTemplate())
				return;
			if(((IBasicObject) notifier).isRelation())
				changeRelationClassNameInPalette((IBasicRelationship) notifier);
			else 
				changeObjectClassNameInPalette((IBasicObject) notifier);
		}
    	if(notification.getEventType() == Notification.REMOVE) {
    		if(notifier instanceof ITemplate)
    			processClassRemove((IBasicObject) notification.getOldValue());
    	}
	}

	private void processClassRemove(IBasicObject oldValue) {
		PaletteContainer group = null;
		if(oldValue.isRelation())
			group = this.fRelationsGroup;
		else if(oldValue.isObject())
			group = this.fObjectClassGroup;
		if(group != null) {
			CreationToolEntry entry = findClassEntry((IBasicObject) oldValue, group);
			group.remove(entry);
		}
	}

	private void changeRelationClassNameInPalette(IBasicRelationship changedClass) {
		renameEntry(changedClass, fRelationsGroup);
	}

	private void changeObjectClassNameInPalette(IBasicObject changedClass) {
		renameEntry(changedClass, fObjectClassGroup);
	}

	private void renameEntry(IBasicObject changedClass,
			PaletteContainer fObjectClassGroup2) {
		PaletteEntry entry = findClassEntry(changedClass, fObjectClassGroup2);
		if(null == entry)
			entry = addClassToPalette(changedClass);
		entry.setLabel(changedClass.getDefiningName());
	}
	
	private CreationToolEntry findClassEntry(IBasicObject changedClass,
			PaletteContainer group) {
		for(Object entry : group.getChildren())
			if(((CreationToolEntry)entry).getId().equals(changedClass.getId()))
				return (CreationToolEntry)entry;
		return null;
	}


	private PaletteEntry addClassToPalette(IBasicObject newValue) {
		PaletteContainer group = getGroupFor(newValue);
		return addObjectClassToPalette((IBasicObject) newValue, group);
	}
		private PaletteContainer getGroupFor(IBasicObject newValue) {
			PaletteContainer group;
			if(newValue.isRelation())
				group = fRelationsGroup;
			else if(newValue.isObject())
				group = fObjectClassGroup;
			else
				throw new IllegalArgumentException(newValue.toString());
			return group;
		}
		private PaletteEntry addObjectClassToPalette(IBasicObject newOc, PaletteContainer group) {
			PaletteEntry entry = setEntryFor(newOc, group);
			return entry;
		}
			private PaletteEntry setEntryFor(IBasicObject newOc,
					PaletteContainer group) {
				CreationToolEntry entry = findClassEntry(newOc,group);
				if(null != entry)
					return entry;
				entry = createCombinedTemplateCreationEntry(newOc, null);
				group.add(entry);
				return entry;
			}

	public void setViewpoint(IViewpoint viewpoint) {
        if(fViewpoint != viewpoint) {
            fViewpoint = viewpoint;
            remove(fRelationsGroup);
            fRelationsGroup = createRelationsGroup();
            add(1, fRelationsGroup);
            
            remove(fObjectClassGroup);
            createZentaGroup();
            
            createExtrasGroup();

        }
    }
    
    private void createZentaGroup() {
        fObjectClassGroup = createObjectClassGroup();
        if(!fObjectClassGroup.getChildren().isEmpty()) {
            add(fObjectClassGroup);
        }
    }
        
    private PaletteContainer createControlsGroup() {
        controlsGroup = new PaletteToolbar(Messages.ZentaDiagramEditorPalette_0);
        
        ToolEntry tool = new PanningSelectionToolEntry();
        tool.setToolClass(PanningSelectionExtendedTool.class);
        controlsGroup.add(tool);

        setDefaultEntry(tool);
        
        PaletteStack stack = createMarqueeSelectionStack();
        controlsGroup.add(stack);
        
        formatPainterEntry = new FormatPainterToolEntry();
        controlsGroup.add(formatPainterEntry);
        
        return controlsGroup;
    }

    private PaletteContainer createExtrasGroup() {
        extrasGroup = new PaletteGroup(Messages.ZentaDiagramEditorPalette_1);
        createNote(extrasGroup);
        createGroupObjectEntry(extrasGroup);
        if(null == fViewpoint) {
        	return extrasGroup;
        }
        createNoteConnection(extrasGroup);
        return extrasGroup;
    }
		private void createNote(PaletteContainer group) {
			PaletteEntry noteEntry = new CombinedTemplateCreationEntry(
	                Messages.ZentaDiagramEditorPalette_2,
	                Messages.ZentaDiagramEditorPalette_3,
	                new ZentaDiagramModelFactoryNonClassed(IZentaPackage.eINSTANCE.getDiagramModelNote(),folder),
	                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_NOTE_16),
	                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_NOTE_16));
	        group.add(noteEntry);
		}
		private void createGroupObjectEntry(PaletteContainer group) {
			PaletteEntry groupEntry = new CombinedTemplateCreationEntry(
	                Messages.ZentaDiagramEditorPalette_4,
	                Messages.ZentaDiagramEditorPalette_5,
	                new ZentaDiagramModelFactoryNonClassed(IZentaPackage.eINSTANCE.getDiagramModelGroup(),folder),
	                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_GROUP_16),
	                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_GROUP_16));
	        group.add(groupEntry);
		}
		private void createNoteConnection(PaletteContainer group) {
			ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(
					IZentaPackage.eINSTANCE.getDiagramModelGroup(),
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
			for(IBasicObject klass : fViewpoint.getObjectClasses()) {
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
			for(IBasicRelationship eClass : fViewpoint.getRelationClasses()) {
	            if(fViewpoint.isAllowedType(eClass)) {
	                ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(eClass, null);
	                group.add(entry);
	            }
	        }
		}
		private void addJunctions(PaletteContainer group) {
			PaletteStack stack = null;
	        
	        for(IBasicObject eClass : fViewpoint.getConnectorClasses()) {
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
    
    private boolean isAllowedType(IBasicObject klass) {
        return fViewpoint == null || fViewpoint != null && fViewpoint.isAllowedType(klass);
    }
    
    public void dispose() {
        formatPainterEntry.dispose();
    }
    
    private CombinedTemplateCreationEntry createCombinedTemplateCreationEntry(IBasicObject klass, String description) {
        CombinedTemplateCreationEntry entry = new CombinedTemplateCreationEntry(
                klass.getDefiningName(),
                description,
                new ZentaDiagramModelFactory(klass,folder),
                ZentaLabelProvider.INSTANCE.getImageDescriptor(klass),
                ZentaLabelProvider.INSTANCE.getImageDescriptor(klass));
        entry.setId(klass.getId());
		return entry;
    }
    
    private ConnectionCreationToolEntry createConnectionCreationToolEntry(
			EClass eClass, String name,
			String description) {
        ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry(
                name,
                description,
                new ZentaDiagramModelFactoryNonClassed(eClass,folder),
                ZentaLabelProvider.INSTANCE.getImageDescriptorNonTemplate(eClass),
                ZentaLabelProvider.INSTANCE.getImageDescriptorNonTemplate(eClass));
        
        entry.setToolProperty(AbstractTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
        entry.setId(eClass.getName());
        return entry;
	}

	private ConnectionCreationToolEntry createConnectionCreationToolEntry(IBasicRelationship eClass, String description) {
        return createConnectionCreationToolEntry(eClass, eClass.getName(), description);
    }
    
    private ConnectionCreationToolEntry createConnectionCreationToolEntry(IBasicRelationship eClass, String name, String description) {
        ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry(
                name,
                description,
                new ZentaDiagramModelFactory(eClass,folder),
                ZentaLabelProvider.INSTANCE.getImageDescriptor(eClass),
                ZentaLabelProvider.INSTANCE.getImageDescriptor(eClass));
        
        entry.setToolProperty(AbstractTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
        entry.setId(eClass.getId());
        return entry;
    }
}
