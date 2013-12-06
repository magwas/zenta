/**
 */
package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.rulez.magwas.zenta.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelBaseFactoryImpl extends EFactoryImpl implements MetamodelBaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelBaseFactory init() {
		try {
			MetamodelBaseFactory theMetamodelBaseFactory = (MetamodelBaseFactory)EPackage.Registry.INSTANCE.getEFactory("http://magwas.rulez.org/zenta/metamodel"); 
			if (theMetamodelBaseFactory != null) {
				return theMetamodelBaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelBaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelBaseFactoryImpl() {
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
			case MetamodelBasePackage.METAMODEL_BASE: return createMetamodelBase();
			case MetamodelBasePackage.TEMPLATE_BASE: return createTemplateBase();
			case MetamodelBasePackage.OBJECT_CLASS_BASE: return createObjectClassBase();
			case MetamodelBasePackage.ATTRIBUTE_BASE: return createAttributeBase();
			case MetamodelBasePackage.RELATION_CLASS_BASE: return createRelationClassBase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelBase createMetamodelBase() {
		MetamodelBaseImpl metamodelBase = new MetamodelBaseImpl();
		return metamodelBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBase createTemplateBase() {
		TemplateBaseImpl templateBase = new TemplateBaseImpl();
		return templateBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassBase createObjectClassBase() {
		ObjectClassBaseImpl objectClassBase = new ObjectClassBaseImpl();
		return objectClassBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeBase createAttributeBase() {
		AttributeBaseImpl attributeBase = new AttributeBaseImpl();
		return attributeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationClassBase createRelationClassBase() {
		RelationClassBaseImpl relationClassBase = new RelationClassBaseImpl();
		return relationClassBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelBasePackage getMetamodelBasePackage() {
		return (MetamodelBasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelBasePackage getPackage() {
		return MetamodelBasePackage.eINSTANCE;
	}

} //MetamodelBaseFactoryImpl
