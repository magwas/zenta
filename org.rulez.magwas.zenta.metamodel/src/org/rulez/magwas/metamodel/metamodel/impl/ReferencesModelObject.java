package org.rulez.magwas.metamodel.metamodel.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.rulez.magwas.metamodel.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.INameable;

public abstract class ReferencesModelObject extends EObjectImpl implements referencesModelObject {

	@Override
	public String getName() {
		EObject ref = this.getReference();
		if(null == ref)
			return getBUILTIN_NAME();
		return ((INameable)ref).getName();
	}
}
