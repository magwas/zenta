/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://magwas.rulez.org/zenta/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zentameta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.referencesModelObject <em>references Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.referencesModelObject
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getreferencesModelObject()
	 * @generated
	 */
	int REFERENCES_MODEL_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_MODEL_OBJECT__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>references Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_MODEL_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.TemplateImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__REFERENCE = REFERENCES_MODEL_OBJECT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Object Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__OBJECT_CLASSES = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__RELATION_CLASSES = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PATH = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassImpl <em>Object Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.ObjectClassImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getObjectClass()
	 * @generated
	 */
	int OBJECT_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__REFERENCE = REFERENCES_MODEL_OBJECT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__ATTRIBUTES = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__ANCESTOR = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__CHILDREN = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.AttributeImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MIN_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MAX_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RELATION = 2;

	/**
	 * The feature id for the '<em><b>Connected Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONNECTED_OBJECT = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassImpl <em>Relation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.RelationClassImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getRelationClass()
	 * @generated
	 */
	int RELATION_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__REFERENCE = REFERENCES_MODEL_OBJECT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__ANCESTOR = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__CHILDREN = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.referencesModelObject <em>references Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>references Model Object</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.referencesModelObject
	 * @generated
	 */
	EClass getreferencesModelObject();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.referencesModelObject#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.referencesModelObject#getReference()
	 * @see #getreferencesModelObject()
	 * @generated
	 */
	EReference getreferencesModelObject_Reference();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.Metamodel#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Metamodel#getTemplates()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Templates();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.Template#getObjectClasses <em>Object Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Classes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Template#getObjectClasses()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_ObjectClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.Template#getRelationClasses <em>Relation Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Classes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Template#getRelationClasses()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_RelationClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.Template#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Template#getPath()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Path();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.ObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClass
	 * @generated
	 */
	EClass getObjectClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClass#getAttributes()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Attributes();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClass#getAncestor()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClass#getChildren()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Children();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.Attribute#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Attribute#getMinOccurs()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.Attribute#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Attribute#getMaxOccurs()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MaxOccurs();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.Attribute#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Attribute#getRelation()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Relation();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.Attribute#getConnectedObject <em>Connected Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Object</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.Attribute#getConnectedObject()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ConnectedObject();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.RelationClass <em>Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Class</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.RelationClass
	 * @generated
	 */
	EClass getRelationClass();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.RelationClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.RelationClass#getAncestor()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.metamodel.RelationClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.RelationClass#getChildren()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_Children();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.referencesModelObject <em>references Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.referencesModelObject
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getreferencesModelObject()
		 * @generated
		 */
		EClass REFERENCES_MODEL_OBJECT = eINSTANCE.getreferencesModelObject();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_MODEL_OBJECT__REFERENCE = eINSTANCE.getreferencesModelObject_Reference();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__TEMPLATES = eINSTANCE.getMetamodel_Templates();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.TemplateImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Object Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__OBJECT_CLASSES = eINSTANCE.getTemplate_ObjectClasses();

		/**
		 * The meta object literal for the '<em><b>Relation Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__RELATION_CLASSES = eINSTANCE.getTemplate_RelationClasses();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__PATH = eINSTANCE.getTemplate_Path();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassImpl <em>Object Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.ObjectClassImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getObjectClass()
		 * @generated
		 */
		EClass OBJECT_CLASS = eINSTANCE.getObjectClass();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS__ATTRIBUTES = eINSTANCE.getObjectClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS__ANCESTOR = eINSTANCE.getObjectClass_Ancestor();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS__CHILDREN = eINSTANCE.getObjectClass_Children();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.AttributeImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MIN_OCCURS = eINSTANCE.getAttribute_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MAX_OCCURS = eINSTANCE.getAttribute_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__RELATION = eINSTANCE.getAttribute_Relation();

		/**
		 * The meta object literal for the '<em><b>Connected Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONNECTED_OBJECT = eINSTANCE.getAttribute_ConnectedObject();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassImpl <em>Relation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.RelationClassImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageImpl#getRelationClass()
		 * @generated
		 */
		EClass RELATION_CLASS = eINSTANCE.getRelationClass();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__ANCESTOR = eINSTANCE.getRelationClass_Ancestor();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__CHILDREN = eINSTANCE.getRelationClass_Children();

	}

} //MetamodelPackage
