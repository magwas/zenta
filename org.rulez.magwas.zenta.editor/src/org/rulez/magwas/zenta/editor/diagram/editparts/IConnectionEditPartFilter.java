/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts;

import org.eclipse.gef.EditPart;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;




/**
 * Filter to show/hide EditPart Connections
 * 
 * @author Phillip Beauvoir
 */
public interface IConnectionEditPartFilter extends IEditPartFilter {
    
    /**
     * Filter connection of associated editPart
     * @param editPart The Attached EditPart for the connection
     * @param connection
     * @return True if connection is to be visible
     */
    boolean isConnectionVisible(EditPart editPart, IDiagramModelConnection connection);
}
