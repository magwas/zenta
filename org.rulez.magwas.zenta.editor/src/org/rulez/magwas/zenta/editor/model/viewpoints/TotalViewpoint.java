/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.ArrayList;
import java.util.List;

import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;

/**
 * Total Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public class TotalViewpoint extends AbstractViewpoint {
	
	public class ThisIsNotAllowed extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	private Metamodel metamodel;
    
	TotalViewpoint() {
		throw new ThisIsNotAllowed();
	}
	
	TotalViewpoint(IZentaDiagramModel dm) {
		super();
		metamodel = MetamodelFactory.eINSTANCE.createMetamodel(dm.getZentaModel());
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
    public List<referencesModelObject> getAllowedTypes() {
    	ArrayList<referencesModelObject> ret = new ArrayList<referencesModelObject>();
    	for(Template template : metamodel.getTemplates()) {
    		for(ObjectClass oc : template.getObjectClasses())
    			ret.add(oc);
    		for(RelationClass rc : template.getRelationClasses())
    			ret.add(rc);
    	}
        return ret;
    }
}