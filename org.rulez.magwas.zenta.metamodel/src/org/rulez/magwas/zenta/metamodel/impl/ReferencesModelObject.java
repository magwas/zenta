package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.INameable;

public abstract class ReferencesModelObject extends EObjectImpl implements referencesModelObject {

	protected IIdentifier reference;

	@Override
	public String getName() {
		INameable ref = (INameable)this.getReference();
		return MetamodelFactory.eINSTANCE.getDefiningName(ref);
	}

	@Override
	public String getId() {
		return reference.getId();
	}
	
	@Override
	public IIdentifier getReference() {
		return reference;
	}

	@Override
	public void setReference(IIdentifier newReference) {
		EObject oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TEMPLATE__REFERENCE, oldReference, reference));
	}

	@Override
	public boolean isinstance(IIdentifier modelobj) {
		return getReference().getId().equals(modelobj.getClass());
	}
	
}
