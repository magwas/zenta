/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage
 * @generated
 */
public interface MetamodelBaseFactory extends EFactory {

	MetamodelBaseFactory eINSTANCE = org.rulez.magwas.zenta.metamodel.handmade.MetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Metamodel Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Base</em>'.
	 * @generated
	 */
	MetamodelBase createMetamodelBase();

	/**
	 * Returns a new object of class '<em>Template Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Base</em>'.
	 * @generated
	 */
	TemplateBase createTemplateBase();

	/**
	 * Returns a new object of class '<em>Object Class Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class Base</em>'.
	 * @generated
	 */
	ObjectClassBase createObjectClassBase();

	/**
	 * Returns a new object of class '<em>Attribute Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Base</em>'.
	 * @generated
	 */
	AttributeBase createAttributeBase();

	/**
	 * Returns a new object of class '<em>Relation Class Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Class Base</em>'.
	 * @generated
	 */
	RelationClassBase createRelationClassBase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelBasePackage getMetamodelBasePackage();

} //MetamodelBaseFactory
