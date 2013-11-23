package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.RelationClass;

public class RootRelationClass extends RelationClassImpl {
	
	protected RootRelationClass() {
		super();
	}
	private static RootRelationClass INSTANCE = null;
	
	public void setReference(EObject newReference) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveReference();
	}

	@Override
	public String getName() {
		return "Basic Relation";
	}
	
	public static RelationClass getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new RootRelationClass();
		}
		return INSTANCE;
	}
	
	@Override
	public void setAncestor(RelationClass ancestor) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveAncestor();
	}
}
