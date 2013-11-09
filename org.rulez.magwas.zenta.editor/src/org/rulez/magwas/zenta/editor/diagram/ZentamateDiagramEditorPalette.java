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
import org.rulez.magwas.zenta.editor.ui.ZentamateLabelProvider;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.util.ZentamateModelUtils;



/**
 * PaletteRoot for Zentamate Diagram
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateDiagramEditorPalette extends AbstractPaletteRoot {
    
    private FormatPainterToolEntry formatPainterEntry;
    
    private IViewpoint fViewpoint;
    
    private PaletteContainer fRelationsGroup;
    
    private PaletteContainer fBusinessGroup;

    public ZentamateDiagramEditorPalette() {
        add(createControlsGroup());
        add(new PaletteSeparator("")); //$NON-NLS-1$
        
        fRelationsGroup = createRelationsGroup();
        add(fRelationsGroup);
        add(new PaletteSeparator("")); //$NON-NLS-1$

        add(createExtrasGroup());
        add(new PaletteSeparator("")); //$NON-NLS-1$
        
        createZentamateGroup();
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
            
            remove(fBusinessGroup);
            createZentamateGroup();
        }
    }
    
    /**
     * Create the Zentamate groups
     */
    private void createZentamateGroup() {
        fBusinessGroup = createBusinessLayerGroup();
        
        if(!fBusinessGroup.getChildren().isEmpty()) {
            add(fBusinessGroup);
        }
    }
        
    
    /**
     * Create a Group of Controls
     */
    private PaletteContainer createControlsGroup() {
        PaletteContainer group = new PaletteToolbar(Messages.ZentamateDiagramEditorPalette_0);
        
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
        PaletteContainer group = new PaletteGroup(Messages.ZentamateDiagramEditorPalette_1);
        
        // Note
        PaletteEntry noteEntry = new CombinedTemplateCreationEntry(
                Messages.ZentamateDiagramEditorPalette_2,
                Messages.ZentamateDiagramEditorPalette_3,
                new ZentamateDiagramModelFactory(IZentamatePackage.eINSTANCE.getDiagramModelNote()),
                IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_NOTE_16),
                IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_NOTE_16));
        group.add(noteEntry);
        
        // Group
        PaletteEntry groupEntry = new CombinedTemplateCreationEntry(
                Messages.ZentamateDiagramEditorPalette_4,
                Messages.ZentamateDiagramEditorPalette_5,
                new ZentamateDiagramModelFactory(IZentamatePackage.eINSTANCE.getDiagramModelGroup()),
                IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_GROUP_16),
                IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_GROUP_16));
        group.add(groupEntry);
        
        // Note Connection
        ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(
                IZentamatePackage.eINSTANCE.getDiagramModelConnection(),
                Messages.ZentamateDiagramEditorPalette_6,
                Messages.ZentamateDiagramEditorPalette_7);
        group.add(entry);
        
        return group;
    }

    /**
     * Business Palette
     */
    private PaletteContainer createBusinessLayerGroup() {
        PaletteContainer group = new PaletteGroup(Messages.ZentamateDiagramEditorPalette_8);
        
        for(EClass eClass : ZentamateModelUtils.getBusinessClasses()) {
            if(isAllowedType(eClass)) {
                PaletteEntry entry = createCombinedTemplateCreationEntry(eClass, null);
                group.add(entry);
            }
        }
        
        return group;
    }


    /**
     * Relations Palette
     */
    private PaletteContainer createRelationsGroup() {
        PaletteContainer group = new PaletteGroup(Messages.ZentamateDiagramEditorPalette_13);
        
        ConnectionCreationToolEntry magicConnectionEntry = new ConnectionCreationToolEntry(
                Messages.ZentamateDiagramEditorPalette_14,
                Messages.ZentamateDiagramEditorPalette_15,
                new MagicConnectionModelFactory(),
                IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_MAGIC_CONNECTION_16),
                IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_MAGIC_CONNECTION_16));
        
        magicConnectionEntry.setToolClass(MagicConnectionCreationTool.class);
        magicConnectionEntry.setToolProperty(AbstractTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
        group.add(magicConnectionEntry);
        
        for(EClass eClass : ZentamateModelUtils.getRelationsClasses()) {
            if(isAllowedType(eClass)) {
                ConnectionCreationToolEntry entry = createConnectionCreationToolEntry(eClass, null);
                group.add(entry);
            }
        }
        
        // Junctions
        PaletteStack stack = null;
        
        for(EClass eClass : ZentamateModelUtils.getConnectorClasses()) {
            if(isAllowedType(eClass)) {
                if(stack == null) {
                    stack = new PaletteStack(Messages.ZentamateDiagramEditorPalette_16, Messages.ZentamateDiagramEditorPalette_16, null);
                    group.add(stack);
                }
                PaletteEntry entry = createCombinedTemplateCreationEntry(eClass, null);
                stack.add(entry);
            }
        }
        
        return group;
    }
    
    private boolean isAllowedType(EClass eClass) {
        return fViewpoint == null || fViewpoint != null && fViewpoint.isAllowedType(eClass);
    }
    
    public void dispose() {
        formatPainterEntry.dispose();
    }
    
    // --------------------------------------------------------------------------------------------
    // Convenience methods
    // --------------------------------------------------------------------------------------------
    
    private CombinedTemplateCreationEntry createCombinedTemplateCreationEntry(EClass eClass, String description) {
        return new CombinedTemplateCreationEntry(
                ZentamateLabelProvider.INSTANCE.getDefaultShortName(eClass),
                description,
                new ZentamateDiagramModelFactory(eClass),
                ZentamateLabelProvider.INSTANCE.getImageDescriptor(eClass),
                ZentamateLabelProvider.INSTANCE.getImageDescriptor(eClass));
    }
    
    private ConnectionCreationToolEntry createConnectionCreationToolEntry(EClass eClass, String description) {
        return createConnectionCreationToolEntry(eClass, ZentamateLabelProvider.INSTANCE.getDefaultName(eClass), description);
    }
    
    private ConnectionCreationToolEntry createConnectionCreationToolEntry(EClass eClass, String name, String description) {
        ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry(
                name,
                description,
                new ZentamateDiagramModelFactory(eClass),
                ZentamateLabelProvider.INSTANCE.getImageDescriptor(eClass),
                ZentamateLabelProvider.INSTANCE.getImageDescriptor(eClass));
        
        // Ensure Tool gets deselected
        entry.setToolProperty(AbstractTool.PROPERTY_UNLOAD_WHEN_FINISHED, true);
        
        return entry;
    }
}
