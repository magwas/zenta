/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import org.rulez.magwas.zenta.model.IDiagramModel;



/**
 * Layered Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public class LayeredViewpoint extends AbstractViewpoint {
    
    public LayeredViewpoint(IDiagramModel dm) {
		super(dm);
	}

	@Override
    public String getName() {
        return Messages.LayeredViewpoint_0;
    }

    @Override
    public int getIndex() {
        return LAYERED_VIEWPOINT;
    }
}