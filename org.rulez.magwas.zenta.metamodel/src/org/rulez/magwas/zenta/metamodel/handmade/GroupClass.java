package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.IAttribute;
import org.rulez.magwas.zenta.metamodel.IObjectClass;
import org.rulez.magwas.zenta.metamodel.IReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ITemplate;
import org.rulez.magwas.zenta.metamodel.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.UnTestedException;

public class GroupClass extends AbstractObjectClass implements
		IObjectClass {

	@Override
	public ITemplate getTemplate() {
		throw new UnTestedException();
	}

	@Override
	public IIdentifier create(IFolder folder) {
		IDiagramModelNote obj = IZentaFactory.eINSTANCE.createDiagramModelNote();
		postCreate(obj,folder);
		return obj;
	}

	@Override
	public boolean isAllowedRelation(IRelationClass klass, Direction source) {
		return false;
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
	public Map<Direction, List<IRelationClass>> getAllowedRelations() {
		return null;
	}
	
	@Override
	public String getHelpHintTitle() {
		return getName();
	}

	@Override
	public String getHelpHintContent() {
		return "You can group objects with this.";//FIXME externalize
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

}
