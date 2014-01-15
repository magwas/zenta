/**
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IMetamodelFactory;
import org.rulez.magwas.zenta.model.IMetamodelPackage;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.handmade.Attribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 */
abstract public class MetamodelFactoryBase extends EFactoryImpl implements IMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static IMetamodelFactory init() {
		throw new RuntimeException("should not be called");
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactoryBase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IMetamodelPackage.METAMODEL: return createMetamodel();
			case IMetamodelPackage.TEMPLATE: return createTemplate();
			case IMetamodelPackage.OBJECT_CLASS: return createObjectClass();
			case IMetamodelPackage.ATTRIBUTE: return createAttribute();
			case IMetamodelPackage.RELATION_CLASS: return createRelationClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IMetamodel createMetamodel() {
		throw new RuntimeException("should not be called");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ITemplate createTemplate() {
		throw new RuntimeException("should not be called");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IObjectClass createObjectClass() {
		throw new RuntimeException("should not be called");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IAttribute createAttribute() {
		AttributeBase attribute = new Attribute();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IRelationClass createRelationClass() {
		throw new RuntimeException("should not be called");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMetamodelPackage getMetamodelPackage() {
		return (IMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IMetamodelPackage getPackage() {
		return IMetamodelPackage.eINSTANCE;
	}

} //MetamodelBaseFactoryImpl
