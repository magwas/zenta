package org.rulez.magwas.zenta.metamodel.handmade;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.RelationClassBase;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.UnTestedException;

public class NoteConnectionClass extends AbstractRelationClassImpl implements
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
	public void setAncestor(RelationClassBase value) {
		throw new UnTestedException();
	}

	@Override
	public EList<RelationClassBase> getChildren() {
		throw new UnTestedException();
	}

	@Override
	public IDiagramModelConnection create(IFolder folder) {
		IDiagramModelConnection obj = IZentaFactory.eINSTANCE.createDiagramModelConnection();
		postCreate(obj, folder);
		return obj;
	}

}
