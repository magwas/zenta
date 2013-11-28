/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;


import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;

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
		for(Template template : metamodel.getTemplates()) {
			for(ObjectClass oc : template.getObjectClasses())
				allowedtypes.add(oc);
			for(RelationClass rc : template.getRelationClasses())
				allowedtypes.add(rc);
		}
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