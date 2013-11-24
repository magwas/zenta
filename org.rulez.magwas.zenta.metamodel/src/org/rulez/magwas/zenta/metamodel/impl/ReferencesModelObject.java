package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.INameable;

public abstract class ReferencesModelObject extends EObjectImpl implements referencesModelObject {

	@Override
	public String getName() {
		INameable ref = (INameable) this.getReference();
		return MetamodelFactory.eINSTANCE.getDefiningName(ref);
	}
	
}
