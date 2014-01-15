package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.IMetamodelFactory;
import org.rulez.magwas.zenta.metamodel.IReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootRelationClass extends RelationClass {
	
	protected RootRelationClass() {
		super();
	}
	public void setReference(EObject newReference) {
		throw new IMetamodelFactory.BuiltinClassShouldNotHaveReference();
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
	public void setAncestor(IRelationClass ancestor) {
		throw new IMetamodelFactory.BuiltinClassShouldNotHaveAncestor();
	}
	
	@Override
	public List<IReferencesModelObject> getAncestry(List<IReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

}
