/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.controller;


/**
 * Image Factory for this application
 * 
 * @author Phillip Beauvoir
 */
public interface IZentaImages {
    
    String IMGPATH = "img/"; //$NON-NLS-1$
    
    String ZENTA_IMGPATH = IMGPATH + "zenta/"; //$NON-NLS-1$
    
    String ICON_APP_16 = IMGPATH + "app-16.png"; //$NON-NLS-1$
    String ICON_APP_32 = IMGPATH + "app-32.png"; //$NON-NLS-1$
    String ICON_APP_48 = IMGPATH + "app-48.png"; //$NON-NLS-1$
    String ICON_APP_64 = IMGPATH + "app-64.png"; //$NON-NLS-1$
    String ICON_APP_128 = IMGPATH + "app-128.png"; //$NON-NLS-1$
    
    String BROWN_PAPER_BACKGROUND = IMGPATH + "br_paper.jpg"; //$NON-NLS-1$
    String CORK_BACKGROUND = IMGPATH + "cork.jpg"; //$NON-NLS-1$
    String DEFAULT_MODEL_THUMB = IMGPATH + "default_model_thumb.png"; //$NON-NLS-1$
    
    // ECLIPSE IMAGES
    String ECLIPSE_IMAGE_PROPERTIES_VIEW_ICON = IMGPATH + "prop_ps.gif"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_OUTLINE_VIEW_ICON = IMGPATH + "outline_co.gif"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_NEW_WIZARD = IMGPATH + "new_wiz.png"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_IMPORT_PREF_WIZARD = IMGPATH + "importpref_wiz.png";  //$NON-NLS-1$
    String ECLIPSE_IMAGE_EXPORT_DIR_WIZARD = IMGPATH + "exportdir_wiz.png"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_FILE = IMGPATH + "file_obj.gif"; //$NON-NLS-1$
    String ECLIPSE_IMAGE_FOLDER = IMGPATH + "fldr_obj.gif"; //$NON-NLS-1$
    
    
    // ZENTA IMAGES
    
    // Connections
    String ICON_ASSOCIATION_CONNECTION_16 = ZENTA_IMGPATH + "association-16.png"; //$NON-NLS-1$
    String ICON_SPECIALISATION_CONNECTION_16 = ZENTA_IMGPATH + "specialisation-16.png"; //$NON-NLS-1$
    
    // Junctions
    String ICON_JUNCTION_16 = ZENTA_IMGPATH + "junction-16.png"; //$NON-NLS-1$
    String ICON_JUNCTION_AND_16 = ZENTA_IMGPATH + "junction-and-16.png"; //$NON-NLS-1$
    String ICON_JUNCTION_OR_16 = ZENTA_IMGPATH + "junction-or-16.png"; //$NON-NLS-1$
    
    // Plain
    String ICON_OBJECT_16 = ZENTA_IMGPATH + "object-16.png"; //$NON-NLS-1$
    String ICON_ACTOR_16 = ZENTA_IMGPATH + "actor-16.png"; //$NON-NLS-1$


    // Business Coloured
    String ICON_BUSINESS_OBJECT_16 = ZENTA_IMGPATH + "business-object-16.png"; //$NON-NLS-1$
    
    // Other
    String ICON_ALIGN_TEXT_LEFT = IMGPATH + "alignleft.gif"; //$NON-NLS-1$
    String ICON_ALIGN_TEXT_CENTER = IMGPATH + "aligncenter.gif"; //$NON-NLS-1$
    String ICON_ALIGN_TEXT_RIGHT = IMGPATH + "alignright.gif"; //$NON-NLS-1$
    String ICON_ASPECT_RATIO = IMGPATH + "aspect-ratio.png"; //$NON-NLS-1$
    String ICON_CANCEL_SEARCH_16 = IMGPATH + "cancelsearch-16.png"; //$NON-NLS-1$
    String ICON_COG = IMGPATH + "cog.png"; //$NON-NLS-1$
    String ICON_DIAGRAM_16 = IMGPATH + "diagram-16.png"; //$NON-NLS-1$
    String ICON_DEFAULT_SIZE = IMGPATH + "default-size.png"; //$NON-NLS-1$
    String ICON_DERIVED_16 = IMGPATH + "derived-16.png"; //$NON-NLS-1$
    String ICON_DERIVED_SM_16 = IMGPATH + "derived-sm-16.png"; //$NON-NLS-1$
    String ICON_FILTER_16 = IMGPATH + "filter.gif"; //$NON-NLS-1$
    String ICON_FORMAT_PAINTER_16 = IMGPATH + "formatpainter-16.png"; //$NON-NLS-1$
    String ICON_FORMAT_PAINTER_GREY_16 = IMGPATH + "formatpainter-grey-16.png"; //$NON-NLS-1$
    String ICON_GROUP_16 = IMGPATH + "group-16.png"; //$NON-NLS-1$
    String ICON_LINKED_16 = IMGPATH + "linked.gif"; //$NON-NLS-1$
    String ICON_LANDSCAPE_16 = IMGPATH + "landscape-16.png"; //$NON-NLS-1$
    String ICON_LOCK_16 = IMGPATH + "lock-16.png"; //$NON-NLS-1$
    String ICON_MAGIC_CONNECTION_16 = IMGPATH + "magic_connection.gif"; //$NON-NLS-1$
    String ICON_MINUS = IMGPATH + "minus.png"; //$NON-NLS-1$
    String ICON_MODELS_16 = IMGPATH + "models.gif"; //$NON-NLS-1$
    String ICON_MUTIPLE = IMGPATH + "mutiple.png"; //$NON-NLS-1$
    String ICON_NAVIGATOR_16 = IMGPATH + "navigator-16.png"; //$NON-NLS-1$
    String ICON_NAVIGATOR_DOWNWARD_16 = IMGPATH + "nav-downward.gif"; //$NON-NLS-1$
    String ICON_NAVIGATOR_UPWARD_16 = IMGPATH + "nav-upward.gif"; //$NON-NLS-1$
    String ICON_NEW_FILE_16 = IMGPATH + "newfile.gif"; //$NON-NLS-1$
    String ICON_NEW_OVERLAY_16 = IMGPATH + "new_overlay.gif"; //$NON-NLS-1$
    String ICON_NOTE_16 = IMGPATH + "note-16.gif"; //$NON-NLS-1$
    String ICON_OPEN_16 = IMGPATH + "open.gif"; //$NON-NLS-1$
    String ICON_PIN_16 = IMGPATH + "pin.gif"; //$NON-NLS-1$
    String ICON_PLUS = IMGPATH + "plus.png"; //$NON-NLS-1$
    String ICON_PROPERTIES_16 = IMGPATH + "properties.gif"; //$NON-NLS-1$
    String ICON_SEARCH_16 = IMGPATH + "search-16.png"; //$NON-NLS-1$
    String ICON_SKETCH_16 = IMGPATH + "sketch-16.png"; //$NON-NLS-1$
    String ICON_SMALL_X = IMGPATH + "smallx.png"; //$NON-NLS-1$
    String ICON_SORT_16 = IMGPATH + "alphab_sort_co.gif"; //$NON-NLS-1$
    String ICON_STICKY_16 = IMGPATH + "sticky-16.png"; //$NON-NLS-1$
    String ICON_TRASH_16 = IMGPATH + "trash.gif"; //$NON-NLS-1$
    String ICON_UNLOCK_16 = IMGPATH + "unlock-16.png"; //$NON-NLS-1$
    String ICON_VIEWPOINTS_16 = IMGPATH + "viewpoints-16.png"; //$NON-NLS-1$
    
    String ICON_CONNECTION_PLAIN_16 = IMGPATH + "connection-plain-16.png"; //$NON-NLS-1$
    String ICON_CONNECTION_ARROW_16 = IMGPATH + "connection-arrow-16.png"; //$NON-NLS-1$
    String ICON_CONNECTION_DASHED_ARROW_16 = IMGPATH + "connection-dashed-arrow-16.png"; //$NON-NLS-1$
    String ICON_CONNECTION_DOTTED_ARROW_16 = IMGPATH + "connection-dotted-arrow-16.png"; //$NON-NLS-1$
    
    String LINE_SOLID = IMGPATH + "line-solid.png"; //$NON-NLS-1$
    String LINE_DASHED = IMGPATH + "line-dashed.png"; //$NON-NLS-1$
    String LINE_DOTTED = IMGPATH + "line-dotted.png"; //$NON-NLS-1$
    
    String ARROW_SOURCE_FILL = IMGPATH + "arrow-source-fill.png"; //$NON-NLS-1$
    String ARROW_TARGET_FILL = IMGPATH + "arrow-target-fill.png"; //$NON-NLS-1$
    String ARROW_SOURCE_HOLLOW = IMGPATH + "arrow-source-hollow.png"; //$NON-NLS-1$
    String ARROW_TARGET_HOLLOW = IMGPATH + "arrow-target-hollow.png"; //$NON-NLS-1$
    String ARROW_SOURCE_LINE = IMGPATH + "arrow-source-line.png"; //$NON-NLS-1$
    String ARROW_TARGET_LINE = IMGPATH + "arrow-target-line.png"; //$NON-NLS-1$

    String CURSOR_IMG_FORMAT_PAINTER = IMGPATH + "formatpainter-cursor.gif"; //$NON-NLS-1$
    String CURSOR_IMG_FORMAT_PAINTER_GREY = IMGPATH + "formatpainter-grey-cursor.gif"; //$NON-NLS-1$
    
    String CURSOR_IMG_MAGIC_CONNECTOR = IMGPATH + "magic-connector-cursor.gif"; //$NON-NLS-1$
    
    // Figures
    String FIGURES_IMGPATH = IMGPATH + "figures/"; //$NON-NLS-1$
    

}
