package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.INameable;

public abstract class ReferencesModelObject extends EObjectImpl implements referencesModelObject {

	@Override
	public String getName() {
		EObject ref = this.getReference();
		return ((INameable)ref).getName();
	}
}
