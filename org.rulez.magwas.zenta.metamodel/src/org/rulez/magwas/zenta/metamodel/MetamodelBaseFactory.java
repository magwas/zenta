/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EFactory;
import org.rulez.magwas.zenta.metamodel.handmade.MetamodelFactoryImpl;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage
 * @generated
 */
public interface MetamodelBaseFactory extends EFactory {

	/**
	 * Returns a new object of class '<em>MetamodelBase Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MetamodelBase Base</em>'.
	 * @generated
	 */
	MetamodelBase createMetamodelBase();

	/**
	 * Returns a new object of class '<em>ITemplate Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ITemplate Base</em>'.
	 * @generated
	 */
	ITemplate createTemplateBase();

	/**
	 * Returns a new object of class '<em>Object Class Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class Base</em>'.
	 * @generated
	 */
	ObjectClass createObjectClassBase();

	/**
	 * Returns a new object of class '<em>AttributeBase Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AttributeBase Base</em>'.
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
	IRelationClass createRelationClassBase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelBasePackage getMetamodelBasePackage();

	MetamodelBaseFactory eINSTANCE = (MetamodelBaseFactory) MetamodelFactoryImpl.init();

	MetamodelBase createMetamodel();


	ITemplate createTemplate(IZentaDiagramModel reference, MetamodelBase metamodel);

	ObjectClass createObjectClass(IZentaElement element, ITemplate template);

	IRelationClass createRelationClass(IRelationship reference, ITemplate template);

	public class BuiltinClassShouldNotHaveReference extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public class BuiltinClassShouldNotHaveAncestor extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	String getDefiningName(IIdentifier reference);

	MetamodelBase createMetamodel(IZentaModel zentaModel);

	MetamodelBase getMetamodelFor(IZentaModelElement modelElement);

	ObjectClass createNoteClass();

	ObjectClass createGroupClass();

	IRelationClass createNoteConnectionClass();

} //MetamodelBaseFactory
