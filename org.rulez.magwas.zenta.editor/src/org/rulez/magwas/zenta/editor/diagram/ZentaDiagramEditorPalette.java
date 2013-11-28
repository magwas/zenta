/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
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
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;



/**
 * PaletteRoot for Zenta Diagram
 * 
 * @author Phillip Beauvoir
 */
public class ZentaDiagramEditorPalette extends AbstractPaletteRoot {
    
    private FormatPainterToolEntry formatPainterEntry;
    
    private IViewpoint fViewpoint;
    
    private PaletteContainer fRelationsGroup;
    
    private PaletteContainer fObjectClassGroup;

    public PaletteContainer _getObjectsGroup() {
    	return fObjectClassGroup;
    }
    
    public PaletteContainer _getRelationsGroup() {
    	return fRelationsGroup;
    }
    
    public ZentaDiagramEditorPalette() {
        add(createControlsGroup());
        add(new PaletteSeparator("")); //$NON-NLS-1$
        
        fRelationsGroup = createRelationsGroup();
        add(fRelationsGroup);
        add(new PaletteSeparator("")); //$NON-NLS-1$

        add(createExtrasGroup());
        add(new PaletteSeparator("")); //$NON-NLS-1$
        
        createZentaGroup();
        
    }

    /**
     * Update the Palette depending on the Viewpoint
     * @param viewpoint
     */
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
    
    /**
     * Create the Zenta groups
     */
    private void createZentaGroup() {
        fObjectClassGroup = createObjectClassGroup();
        
        if(!fObjectClassGroup.getChildren().isEmpty()) {
            add(fObjectClassGroup);
        }
    }
        
    
    /**
     * Create a Group of Controls
     */
    private PaletteContainer createControlsGroup() {
        PaletteContainer group = new PaletteToolbar(Messages.ZentaDiagramEditorPalette_0);
        
        // The selection tool
        ToolEntry tool = new PanningSelectionToolEntry();
        tool.setToolClass(PanningSelectionExtendedTool.class);
        group.add(tool);

        // Use selection tool as default entry
        setDefaultEntry(tool);
        
        PaletteStack stack = createMarqueeSelectionStack();
        group.add(stack);
        
        // Format Painter
        formatPainterEntry = new FormatPainterToolEntry();
        group.add(formatPainterEntry);
        
        return group;
    }

    /**
     * Create a Group of Controls
     */
    private PaletteContainer createExtrasGroup() {
        PaletteContainer group = new PaletteGroup(Messages.ZentaDiagramEditorPalette_1);
        
        // Note
        PaletteEntry noteEntry = new CombinedTemplateCreationEntry(
                Messages.ZentaDiagramEditorPalette_2,
                Messages.ZentaDiagramEditorPalette_3,
                new ZentaDiagramModelFactory(MetamodelFactory.eINSTANCE.createNoteClass()),
                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_NOTE_16),
                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_NOTE_16));
        group.add(noteEntry);
        
        // Group
        PaletteEntry groupEntry = new CombinedTemplateCreationEntry(
                Messages.ZentaDiagramEditorPalette_4,
                Messages.ZentaDiagramEditorPalette_5,
                new ZentaDiagramModelFactory(MetamodelFactory.eINSTANCE.createGroupClass()),
                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_GROUP_16),
                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_GROUP_16));
        group.add(groupEntry);
        
        if(null == fViewpoint) {
        	return group;
        }
        // Note Connection
        ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(
                MetamodelFactory.eINSTANCE.createNoteConnectionClass(),
                Messages.ZentaDiagramEditorPalette_6,
                Messages.ZentaDiagramEditorPalette_7);
        group.add(entry);
        
        return group;
    }

    /**
     * Business Palette
     */
    private PaletteContainer createObjectClassGroup() {
        PaletteContainer group = new PaletteGroup(Messages.ZentaDiagramEditorPalette_8);
        if(null == fViewpoint)
        	return group;
        for(ObjectClass klass : fViewpoint.getObjectClasses()) {
            if(isAllowedType(klass)) {
                PaletteEntry entry = createCombinedTemplateCreationEntry(klass, null);
                group.add(entry);
            }
        }
        
        return group;
    }


    /**
     * Relations Palette
     */
    private PaletteContainer createRelationsGroup() {
        PaletteContainer group = new PaletteGroup(Messages.ZentaDiagramEditorPalette_13);
        
        ConnectionCreationToolEntry magicConnectionEntry = new ConnectionCreationToolEntry(
                Messages.ZentaDiagramEditorPalette_14,
                Messages.ZentaDiagramEditorPalette_15,
                new MagicConnectionModelFactory(),
                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_MAGIC_CONNECTION_16),
                IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_MAGIC_CONNECTION_16));
        
        magicConnectionEntry.setToolClass(MagicConnectionCreationTool.class);
        magicConnectionEntry.setToolProperty(AbstractTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
        group.add(magicConnectionEntry);
    	if(null == fViewpoint)
    		return group;
        
        for(RelationClass eClass : fViewpoint.getRelationClasses()) {
            if(fViewpoint.isAllowedType(eClass)) {
                ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(eClass, null);
                group.add(entry);
            }
        }
        
        // Junctions
        PaletteStack stack = null;
        
        for(ObjectClass eClass : fViewpoint.getConnectorClasses()) {
            if(isAllowedType(eClass)) {
                if(stack == null) {
                    stack = new PaletteStack(Messages.ZentaDiagramEditorPalette_16, Messages.ZentaDiagramEditorPalette_16, null);
                    group.add(stack);
                }
                PaletteEntry entry = createCombinedTemplateCreationEntry(eClass, null);
                stack.add(entry);
            }
        }
        
        return group;
    }
    
    private boolean isAllowedType(ObjectClass klass) {
        return fViewpoint == null || fViewpoint != null && fViewpoint.isAllowedType(klass);
    }
    
    public void dispose() {
        formatPainterEntry.dispose();
    }
    
    // --------------------------------------------------------------------------------------------
    // Convenience methods
    // --------------------------------------------------------------------------------------------
    
    private CombinedTemplateCreationEntry createCombinedTemplateCreationEntry(ObjectClass klass, String description) {
        return new CombinedTemplateCreationEntry(
                klass.getName(),
                description,
                new ZentaDiagramModelFactory(klass),
                ZentaLabelProvider.INSTANCE.getImageDescriptor(klass),
                ZentaLabelProvider.INSTANCE.getImageDescriptor(klass));
    }
    
    private ConnectionCreationToolEntry createConnectionCreationToolEntry(RelationClass eClass, String description) {
        return createConnectionCreationToolEntry(eClass, eClass.getName(), description);
    }
    
    private ConnectionCreationToolEntry createConnectionCreationToolEntry(RelationClass eClass, String name, String description) {
        ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry(
                name,
                description,
                new ZentaDiagramModelFactory(eClass),
                fViewpoint.getImageDescriptor(eClass),
                fViewpoint.getImageDescriptor(eClass));
        
        // Ensure Tool gets deselected
        entry.setToolProperty(AbstractTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
        
        return entry;
    }
}
