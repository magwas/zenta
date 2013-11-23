/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EFactory;
import org.rulez.magwas.zenta.metamodel.impl.BuiltinTemplate;
import org.rulez.magwas.zenta.model.impl.AssociationRelationship;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.metamodel.MetamodelPackage
 * @generated
 */
public interface MetamodelFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelFactory eINSTANCE = org.rulez.magwas.zenta.metamodel.impl.MetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel</em>'.
	 * @generated
	 */
	Metamodel createMetamodel();

	Template createTemplate(ZentaDiagramModel reference);

	ObjectClass createObjectClass(BusinessObject element);

	Attribute createAttribute();

	RelationClass createRelationClass(AssociationRelationship reference);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelPackage getMetamodelPackage();

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

