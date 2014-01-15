package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.UnTestedException;

public class NoteConnectionClass extends AbstractObjectClass implements
		IRelationClass {

	@Override
	public ITemplate getTemplate() {
		throw new UnTestedException();
	}

	@Override
	public IRelationClass getAncestor() {
		throw new UnTestedException();
	}

	@Override
	public void setAncestor(IObjectClass value) {
		throw new UnTestedException();
	}

	@Override
	public EList<IObjectClass> getChildren() {
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
	public List<IReferencesModelObject> getAncestry(List<IReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

	@Override
	public List<IReferencesModelObject> getAncestry() {
		ArrayList<IReferencesModelObject> anclist = new ArrayList<IReferencesModelObject>();
		return anclist;
	}

	@Override
	public String getHelpHintTitle() {
		return getName();
	}

	@Override
	public boolean isObject() {
		return false;
	}

	@Override
	public boolean isRelation() {
		return false;
	}

	@Override
	public boolean isTemplate() {
		return false;
	}

}
