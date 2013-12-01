/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;


/**
 * Version number of model.<p>
 * Use this to determine when loading a different version model if it will bring the whole
 * show down. Example, folders were introduced in version 1.3 of Zenta but won't open on Zenta 1.2.<p>
 * 
 * Note - THIS IS THE VERSION OF THE MODEL, NOT ARCHI. Only need to change it if there are changes
 * that affect backwards compatibility.<p>
 * 
 * History:<br>
 * 
 * 1.0.0 - Zenta versions 0.7 - 1.2.0 the version number was not saved to the XMI file<br>
 * 1.1.0 - Zenta version 1.3.0 introduced sub-folders which are not backwards-compatible
 * 1.1.1 - Zenta version 1.4.0 added sub-folders in the Views folder which are not backwards-compatible
 * 1.2.0 - Zenta version 1.5.0 added the Sketch View which is not backwards-compatible, and text alignment attribute
 * 1.2.1 - Zenta version 1.6.0 added IInterfaceElement and lineColor to IDiagramModelConnection
 * 1.3.0 - Zenta version 1.7.0 added accessType to IAccessRelationship, diagram shortcuts in Sketch Diagrams,
 *         type in IDiagramModelZentaObject, plain connections in Diagrams, Properties, and Documentation to Folders
 * 2.0.0 - Zenta version 2.0.0 added multiple occurrences of objects in a View, Documentation to Groups, Properties to Sketch
 *         View objects, Viewpoints, and refactoring of DiagramModel and ZentaDiagramModel
 * 2.1.0 - The "text" attribute of IDiagramModelConnection is deprecated.
 *		   Lockable support. Borders. DiagramModelImage and IDiagramModelImageProvider
 * 2.2.0 - Zenta 2.0 elements.
 * 2.2.1 - Sketch Model Background attribute
 * 
 * @author Phillip Beauvoir
 */
public interface ModelVersion {
    String VERSION = "2.2.1"; //$NON-NLS-1$
}
