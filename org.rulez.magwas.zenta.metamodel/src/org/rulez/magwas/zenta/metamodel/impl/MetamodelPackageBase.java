/**
 */
package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.rulez.magwas.zenta.metamodel.IAttribute;
import org.rulez.magwas.zenta.metamodel.IMetamodel;
import org.rulez.magwas.zenta.metamodel.IMetamodelFactory;
import org.rulez.magwas.zenta.metamodel.IMetamodelPackage;
import org.rulez.magwas.zenta.metamodel.IObjectClass;
import org.rulez.magwas.zenta.metamodel.IReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ITemplate;
import org.rulez.magwas.zenta.model.IZentaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelPackageBase extends EPackageImpl implements IMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesModelObjectBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectClassBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationClassBaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.rulez.magwas.zenta.metamodel.IMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodelPackageBase() {
		super(eNS_URI, IMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IMetamodelPackage init() {
		if (isInited) return (IMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(IMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		MetamodelPackageBase theMetamodelBasePackage = (MetamodelPackageBase)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetamodelPackageBase ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetamodelPackageBase());

		isInited = true;

		// Initialize simple dependencies
		IZentaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetamodelBasePackage.createPackageContents();

		// Initialize created meta-data
		theMetamodelBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetamodelBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IMetamodelPackage.eNS_URI, theMetamodelBasePackage);
		return theMetamodelBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelBase() {
		return metamodelBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelBase_Templates() {
		return (EReference)metamodelBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateBase() {
		return templateBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBase_ObjectClasses() {
		return (EReference)templateBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBase_RelationClasses() {
		return (EReference)templateBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateBase_Path() {
		return (EAttribute)templateBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBase_Metamodel() {
		return (EReference)templateBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencesModelObjectBase() {
		return referencesModelObjectBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesModelObjectBase_Reference() {
		return (EReference)referencesModelObjectBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencesModelObjectBase_Name() {
		return (EAttribute)referencesModelObjectBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectClassBase() {
		return objectClassBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassBase_Attributes() {
		return (EReference)objectClassBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassBase_Ancestor() {
		return (EReference)objectClassBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassBase_Children() {
		return (EReference)objectClassBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassBase_Template() {
		return (EReference)objectClassBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeBase() {
		return attributeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeBase_MinOccurs() {
		return (EAttribute)attributeBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeBase_MaxOccurs() {
		return (EAttribute)attributeBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeBase_Relation() {
		return (EReference)attributeBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeBase_ConnectedObject() {
		return (EReference)attributeBaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationClassBase() {
		return relationClassBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClassBase_Ancestor() {
		return (EReference)relationClassBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClassBase_Children() {
		return (EReference)relationClassBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationClassBase_Template() {
		return (EReference)relationClassBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMetamodelFactory getMetamodelBaseFactory() {
		return (IMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metamodelBaseEClass = createEClass(METAMODEL_BASE);
		createEReference(metamodelBaseEClass, METAMODEL_BASE__TEMPLATES);

		templateBaseEClass = createEClass(TEMPLATE_BASE);
		createEReference(templateBaseEClass, TEMPLATE_BASE__OBJECT_CLASSES);
		createEReference(templateBaseEClass, TEMPLATE_BASE__RELATION_CLASSES);
		createEAttribute(templateBaseEClass, TEMPLATE_BASE__PATH);
		createEReference(templateBaseEClass, TEMPLATE_BASE__METAMODEL);

		referencesModelObjectBaseEClass = createEClass(REFERENCES_MODEL_OBJECT_BASE);
		createEReference(referencesModelObjectBaseEClass, REFERENCES_MODEL_OBJECT_BASE__REFERENCE);
		createEAttribute(referencesModelObjectBaseEClass, REFERENCES_MODEL_OBJECT_BASE__NAME);

		objectClassBaseEClass = createEClass(OBJECT_CLASS_BASE);
		createEReference(objectClassBaseEClass, OBJECT_CLASS_BASE__ATTRIBUTES);
		createEReference(objectClassBaseEClass, OBJECT_CLASS_BASE__ANCESTOR);
		createEReference(objectClassBaseEClass, OBJECT_CLASS_BASE__CHILDREN);
		createEReference(objectClassBaseEClass, OBJECT_CLASS_BASE__TEMPLATE);

		attributeBaseEClass = createEClass(ATTRIBUTE_BASE);
		createEAttribute(attributeBaseEClass, ATTRIBUTE_BASE__MIN_OCCURS);
		createEAttribute(attributeBaseEClass, ATTRIBUTE_BASE__MAX_OCCURS);
		createEReference(attributeBaseEClass, ATTRIBUTE_BASE__RELATION);
		createEReference(attributeBaseEClass, ATTRIBUTE_BASE__CONNECTED_OBJECT);

		relationClassBaseEClass = createEClass(RELATION_CLASS_BASE);
		createEReference(relationClassBaseEClass, RELATION_CLASS_BASE__ANCESTOR);
		createEReference(relationClassBaseEClass, RELATION_CLASS_BASE__CHILDREN);
		createEReference(relationClassBaseEClass, RELATION_CLASS_BASE__TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IZentaPackage theZentaPackage = (IZentaPackage)EPackage.Registry.INSTANCE.getEPackage(IZentaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		templateBaseEClass.getESuperTypes().add(this.getReferencesModelObjectBase());
		objectClassBaseEClass.getESuperTypes().add(this.getReferencesModelObjectBase());
		relationClassBaseEClass.getESuperTypes().add(this.getReferencesModelObjectBase());

		// Initialize classes and features; add operations and parameters
		initEClass(metamodelBaseEClass, IMetamodel.class, "MetamodelBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetamodelBase_Templates(), this.getTemplateBase(), this.getTemplateBase_Metamodel(), "templates", null, 0, -1, IMetamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateBaseEClass, ITemplate.class, "ITemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateBase_ObjectClasses(), this.getObjectClassBase(), this.getObjectClassBase_Template(), "objectClasses", null, 0, -1, ITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateBase_RelationClasses(), this.getRelationClassBase(), this.getRelationClassBase_Template(), "relationClasses", null, 0, -1, ITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateBase_Path(), ecorePackage.getEString(), "path", null, 1, 1, ITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateBase_Metamodel(), this.getMetamodelBase(), this.getMetamodelBase_Templates(), "metamodel", null, 1, 1, ITemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencesModelObjectBaseEClass, IReferencesModelObject.class, "ReferencesModelObjectBase", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencesModelObjectBase_Reference(), theZentaPackage.getIdentifier(), null, "reference", null, 1, 1, IReferencesModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferencesModelObjectBase_Name(), ecorePackage.getEString(), "name", null, 1, 1, IReferencesModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(objectClassBaseEClass, IObjectClass.class, "ObjectClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectClassBase_Attributes(), this.getAttributeBase(), null, "attributes", null, 0, -1, IObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectClassBase_Ancestor(), this.getObjectClassBase(), this.getObjectClassBase_Children(), "ancestor", null, 1, 1, IObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectClassBase_Children(), this.getObjectClassBase(), this.getObjectClassBase_Ancestor(), "children", null, 0, -1, IObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectClassBase_Template(), this.getTemplateBase(), this.getTemplateBase_ObjectClasses(), "template", null, 0, 1, IObjectClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeBaseEClass, IAttribute.class, "AttributeBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeBase_MinOccurs(), ecorePackage.getEInt(), "minOccurs", "0", 1, 1, IAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeBase_MaxOccurs(), ecorePackage.getEInt(), "maxOccurs", "1", 1, 1, IAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeBase_Relation(), this.getRelationClassBase(), null, "relation", null, 1, 1, IAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeBase_ConnectedObject(), this.getObjectClassBase(), null, "connectedObject", null, 1, 1, IAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationClassBaseEClass, IRelationClass.class, "IRelationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationClassBase_Ancestor(), this.getRelationClassBase(), this.getRelationClassBase_Children(), "ancestor", null, 1, 1, IRelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClassBase_Children(), this.getRelationClassBase(), this.getRelationClassBase_Ancestor(), "children", null, 0, -1, IRelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelationClassBase_Template(), this.getTemplateBase(), this.getTemplateBase_RelationClasses(), "template", null, 0, 1, IRelationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MetamodelBasePackageImpl
