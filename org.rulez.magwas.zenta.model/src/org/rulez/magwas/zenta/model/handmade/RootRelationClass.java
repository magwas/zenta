package org.rulez.magwas.zenta.model.handmade;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IZentaElement;

public class RootRelationClass extends RelationClass {
	
	protected RootRelationClass() {
	}
	public void setReference(EObject newReference) {
		throw new IZentaFactory.BuiltinClassShouldNotHaveReference();
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
	public void setAncestor(IObjectClass ancestor) {
		throw new IZentaFactory.BuiltinClassShouldNotHaveAncestor();
	}
	
	@Override
	public List<IReferencesModelObject> getAncestry(List<IReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ancestry;
	}

}
