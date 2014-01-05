package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.AttributeBase;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ObjectClassBase;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.Attribute.Direction;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.UnTestedException;

public class GroupClass extends AbstractObjectClassImpl implements
		ObjectClass {

	@Override
	public Template getTemplate() {
		throw new UnTestedException();
	}

	@Override
	public IIdentifier create(IFolder folder) {
		IDiagramModelNote obj = IZentaFactory.eINSTANCE.createDiagramModelNote();
		postCreate(obj,folder);
		return obj;
	}

	@Override
	public boolean isAllowedRelation(RelationClass klass, Direction source) {
		return false;
	}

	@Override
	public EList<AttributeBase> getAttributes() {
		throw new UnTestedException();
	}

	@Override
	public ObjectClass getAncestor() {
		throw new UnTestedException();
	}

	@Override
	public void setAncestor(ObjectClassBase value) {
		throw new UnTestedException();
	}

	@Override
	public EList<ObjectClassBase> getChildren() {
		throw new UnTestedException();
	}

	@Override
	public Map<Direction, List<RelationClass>> getAllowedRelations() {
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
