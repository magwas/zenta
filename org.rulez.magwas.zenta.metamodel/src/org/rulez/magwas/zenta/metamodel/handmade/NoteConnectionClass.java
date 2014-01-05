package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
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

	@Override
	public String getHelpHintContent() {
		return "This connects a note to something";//FIXME externalize
	}

	@Override
	public List<ReferencesModelObject> getAncestry(List<ReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

	@Override
	public List<ReferencesModelObject> getAncestry() {
		ArrayList<ReferencesModelObject> anclist = new ArrayList<ReferencesModelObject>();
		return anclist;
	}

}
