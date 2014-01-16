/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
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

	TotalViewpoint(IDiagramModel dm) {
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

	@Override
	public Collection<IBasicObject> getAllowedTargets(IBasicObject oc) {
		List<IBasicObject> ret = new ArrayList<IBasicObject>();
		Map<Direction, List<IBasicRelationship>> rels = oc.getAllowedRelations();
		for(IBasicRelationship rel : rels.get(Direction.SOURCE))
			for(IBasicObject target: rel.getAllowedRelations().get(Direction.TARGET))
				if(!ret.contains(target))
					ret.add(target);
		return ret;
	}
}