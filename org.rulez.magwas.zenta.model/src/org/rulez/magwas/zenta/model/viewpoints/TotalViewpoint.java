/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.viewpoints;



import org.rulez.magwas.zenta.model.IDiagramModel;

/**
 * Total Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public class TotalViewpoint extends AbstractViewpoint {
	
	public class ThisIsNotAllowed extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public TotalViewpoint(IDiagramModel dm) {
		super(dm);
	}

    @Override
    public String getName() {
        return Messages.TotalViewpoint_0;
    }
    
    @Override
    public int getIndex() {
        return TOTAL_VIEWPOINT;
    }


}