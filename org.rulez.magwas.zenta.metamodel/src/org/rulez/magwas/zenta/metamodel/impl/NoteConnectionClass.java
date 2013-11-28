package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.UnTestedException;

public class NoteConnectionClass extends ReferencesModelObject implements
		RelationClass {

	@Override
	public Template getTemplate() {
		throw new UnTestedException();
	}

	@Override
	public RelationClass getAncestor() {
		throw new UnTestedException();
	}

	@Override
	public void setAncestor(RelationClass value) {
		throw new UnTestedException();
	}

	@Override
	public EList<RelationClass> getChildren() {
		throw new UnTestedException();
	}

	@Override
	public IRelationship create() {
		return (IRelationship) IZentaFactory.eINSTANCE.createDiagramModelConnection();
	}

}
