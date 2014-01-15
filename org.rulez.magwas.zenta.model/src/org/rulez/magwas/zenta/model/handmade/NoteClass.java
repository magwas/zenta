package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.IAttribute.Direction;

public class NoteClass extends AbstractObjectClass implements IObjectClass {

	@Override
	public ITemplate getTemplate() {
		throw new UnTestedException();
	}

	@Override
	public IDiagramModelNote create(IFolder folder) {
		IDiagramModelNote obj = IZentaFactory.eINSTANCE.createDiagramModelNote();
		postCreate(obj, folder);
		return obj;
	}

	@Override
	public EList<IAttribute> getAttributes() {
		throw new UnTestedException();
	}

	@Override
	public IObjectClass getAncestor() {
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
	public boolean isAllowedRelation(IRelationClass klass, Direction source) {
		return false;
	}

	@Override
	public Map<Direction, List<IRelationClass>> getAllowedRelations() {
		return null;
	}
	@Override
	public String getHelpHintTitle() {
		return getName();
	}

	@Override
	public String getHelpHintContent() {
		return "You can add notes to diagrams with this.";//FIXME externalize
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
