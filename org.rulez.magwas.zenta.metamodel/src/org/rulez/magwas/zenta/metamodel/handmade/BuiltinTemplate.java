package org.rulez.magwas.zenta.metamodel.handmade;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.IMetamodel;
import org.rulez.magwas.zenta.metamodel.IMetamodelFactory;
import org.rulez.magwas.zenta.metamodel.IObjectClass;
import org.rulez.magwas.zenta.model.IZentaElement;

public class BuiltinTemplate extends Template {
	
	public BuiltinTemplate(IMetamodel metamodel) {
		super();
		metamodel.getTemplates().add(this);
		getObjectClasses().add(new RootObjectClass());
		getRelationClasses().add(new RootRelationClass());
	}

	public void setReference(EObject newReference) {
		throw new IMetamodelFactory.BuiltinClassShouldNotHaveReference();
	}

	public IObjectClass getObjectClassReferencingElement(IZentaElement classTemplate) {
		return null;
	}

	@Override
	public String getName() {
		return "Builtins";
	}

}
