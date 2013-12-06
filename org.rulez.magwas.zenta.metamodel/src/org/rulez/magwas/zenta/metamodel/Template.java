package org.rulez.magwas.zenta.metamodel;

import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;

public interface Template extends TemplateBase {
	ObjectClass getObjectClassReferencingElement(IZentaElement reference);

	RelationClass getRelationClassReferencingElement(IRelationship referenced);
	
	ObjectClass getObjectClassFrom(IZentaElement reference);

	RelationClass getRelationClassFrom(IRelationship referenced);

	void createClassBy(IZentaElement element);

	IIdentifier create(IFolder folder);

} 