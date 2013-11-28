package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.UnTestedException;

public class GroupClass extends ReferencesModelObject implements
		ObjectClass {

	@Override
	public Template getTemplate() {
		throw new UnTestedException();
	}

	@Override
	public IIdentifier create() {
		return IZentaFactory.eINSTANCE.createDiagramModelNote();
	}

	@Override
	public EList<Attribute> getAttributes() {
		throw new UnTestedException();
	}

	@Override
	public ObjectClass getAncestor() {
		throw new UnTestedException();
	}

	@Override
	public void setAncestor(ObjectClass value) {
		throw new UnTestedException();
	}

	@Override
	public EList<ObjectClass> getChildren() {
		throw new UnTestedException();
	}
}
