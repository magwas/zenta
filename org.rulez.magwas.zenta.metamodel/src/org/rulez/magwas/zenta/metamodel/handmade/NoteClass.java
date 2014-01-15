package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.AttributeBase;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ITemplate;
import org.rulez.magwas.zenta.metamodel.AttributeBase.Direction;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.UnTestedException;

public class NoteClass extends AbstractObjectClassImpl implements ObjectClass {

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
	public EList<AttributeBase> getAttributes() {
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
