package org.rulez.magwas.zenta.metamodel;

import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;

public interface ReferencesModelObject extends ReferencesModelObjectBase {

	IIdentifier create(IFolder folder);

	void postCreate(IIdentifier createdObj, IFolder folder);
	
	Metamodel getMetamodel();

	boolean isInstance(IIdentifier relation);
	
	String getId();
}
