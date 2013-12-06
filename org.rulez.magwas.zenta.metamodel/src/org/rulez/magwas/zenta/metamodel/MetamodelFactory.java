package org.rulez.magwas.zenta.metamodel;

import org.rulez.magwas.zenta.metamodel.handmade.MetamodelFactoryImpl;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;

public interface MetamodelFactory extends MetamodelBaseFactory {

	MetamodelFactory eINSTANCE = MetamodelFactoryImpl.init();

	Metamodel createMetamodel();


	Template createTemplate(IZentaDiagramModel reference, Metamodel metamodel);

	ObjectClass createObjectClass(IZentaElement element, Template template);

	RelationClass createRelationClass(IRelationship reference, Template template);

	public class BuiltinClassShouldNotHaveReference extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public class BuiltinClassShouldNotHaveAncestor extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	String getDefiningName(IIdentifier reference);

	Metamodel createMetamodel(IZentaModel zentaModel);

	Metamodel getMetamodelFor(IZentaModelElement modelElement);

	ObjectClass createNoteClass();

	ObjectClass createGroupClass();

	RelationClass createNoteConnectionClass();

}
