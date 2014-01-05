package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.RelationClassBase;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootRelationClass extends RelationClassImpl {
	
	protected RootRelationClass() {
		super();
	}
	public void setReference(EObject newReference) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveReference();
	}

	@Override
	public String getName() {
		return "Basic Relation";
	}
	
	@Override
	public String getId() {
		return IZentaElement.basicRelationClassId;
	}

	@Override
	public void setAncestor(RelationClassBase ancestor) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveAncestor();
	}
	
	@Override
	public List<ReferencesModelObject> getAncestry(List<ReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

}
