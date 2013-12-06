package org.rulez.magwas.zenta.metamodel.handmade;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.model.IZentaElement;

public class BuiltinTemplate extends TemplateImpl {
	
	public BuiltinTemplate(Metamodel metamodel) {
		super();
		metamodel.getTemplates().add(this);
		getObjectClasses().add(new RootObjectClass());
		getRelationClasses().add(new RootRelationClass());
	}

	public void setReference(EObject newReference) {
		throw new MetamodelFactory.BuiltinClassShouldNotHaveReference();
	}

	public ObjectClass getObjectClassReferencingElement(IZentaElement classTemplate) {
		return null;
	}

	@Override
	public String getName() {
		return "Builtins";
	}

}
