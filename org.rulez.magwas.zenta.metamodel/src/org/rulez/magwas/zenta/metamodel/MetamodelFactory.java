package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EFactory;
import org.rulez.magwas.zenta.metamodel.impl.BuiltinTemplate;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.impl.AssociationRelationship;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;

/**
 * 
 * @generated
 * 
 * only the generated stuff will have comments
 * 
 * some generated methods are deleted on purpose
 * 
 * watch out for FIXMEs and commented methods in classes with warning after generation
 *
 */
public interface MetamodelFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelFactory eINSTANCE = org.rulez.magwas.zenta.metamodel.impl.MetamodelFactoryImpl.init();

	Metamodel createMetamodel();

	Template createTemplate(ZentaDiagramModel reference, Metamodel metamodel);

	ObjectClass createObjectClass(IZentaElement element, Template template);

	Attribute createAttribute();

	RelationClass createRelationClass(AssociationRelationship reference, Template template);

	ObjectClass getBuiltinObjectClass();

	RelationClass getBuiltinRelationClass();

	public class BuiltinClassShouldNotHaveReference extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public class BuiltinClassShouldNotHaveAncestor extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	BuiltinTemplate getBuiltinTemplate();

} //MetamodelFactory

