/**
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.ecore.EFactory;
import org.rulez.magwas.zenta.model.handmade.MetamodelFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.model.IMetamodelPackage
 * @generated
 */
public interface IMetamodelFactory extends EFactory {

	IMetamodelFactory eINSTANCE = (IMetamodelFactory) MetamodelFactory.init();

	IMetamodel createMetamodel();


	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	ITemplate createTemplate();

	/**
	 * Returns a new object of class '<em>Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class</em>'.
	 * @generated
	 */
	IObjectClass createObjectClass();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	IAttribute createAttribute();

	/**
	 * Returns a new object of class '<em>Relation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Class</em>'.
	 * @generated
	 */
	IRelationClass createRelationClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IMetamodelPackage getMetamodelPackage();

	ITemplate createTemplate(IZentaDiagramModel reference, IMetamodel metamodel);

	IObjectClass createObjectClass(IZentaElement element, ITemplate template);

	IRelationClass createRelationClass(IRelationship reference, ITemplate template);

	public class BuiltinClassShouldNotHaveReference extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public class BuiltinClassShouldNotHaveAncestor extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	String getDefiningName(IIdentifier reference);

	IMetamodel createMetamodel(IZentaModel zentaModel);

	IMetamodel getMetamodelFor(IZentaModelElement modelElement);

	IObjectClass createNoteClass();

	IObjectClass createGroupClass();

	IRelationClass createNoteConnectionClass();

} //MetamodelBaseFactory
