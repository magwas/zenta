package org.rulez.magwas.zenta.model.handmade;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;

public class BuiltinTemplate extends Template {
	
	public BuiltinTemplate(IMetamodel metamodel) {
		super();
		metamodel.getTemplates().add(this);
		getClasses().add(new RootObjectClass());
		getClasses().add(new RootRelationClass());
	}

	public void setReference(EObject newReference) {
		throw new IZentaFactory.BuiltinClassShouldNotHaveReference();
	}

	public IObjectClass getObjectClassReferencingElement(IZentaElement classTemplate) {
		return null;
	}

	@Override
	public String getName() {
		return "Builtins";
	}

}
