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
 * @see org.rulez.magwas.zenta.metamodel.IMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface IMetamodelPackage extends EPackage {
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
	IMetamodelPackage eINSTANCE = org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase.init();

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.MetamodelBase <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 0;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject <em>References Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getReferencesModelObject()
	 * @generated
	 */
	int REFERENCES_MODEL_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_MODEL_OBJECT__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_MODEL_OBJECT__NAME = 1;

	/**
	 * The number of structural features of the '<em>References Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_MODEL_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBase <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.TemplateBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__REFERENCE = REFERENCES_MODEL_OBJECT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = REFERENCES_MODEL_OBJECT__NAME;

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
	 * The feature id for the '<em><b>Metamodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__METAMODEL = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase <em>Object Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getObjectClass()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__NAME = REFERENCES_MODEL_OBJECT__NAME;

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
	 * The feature id for the '<em><b>Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS__TEMPLATE = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBase <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.AttributeBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getAttribute()
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBase <em>Relation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.RelationClassBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getRelationClass()
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__NAME = REFERENCES_MODEL_OBJECT__NAME;

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
	 * The feature id for the '<em><b>Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS__TEMPLATE = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IMetamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.IMetamodel#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IMetamodel#getTemplates()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Templates();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.ITemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getObjectClasses <em>Object Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Classes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate#getObjectClasses()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_ObjectClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getRelationClasses <em>Relation Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Classes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate#getRelationClasses()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_RelationClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate#getPath()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Path();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metamodel</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate#getMetamodel()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject <em>References Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Model Object</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject
	 * @generated
	 */
	EClass getReferencesModelObject();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject#getReference()
	 * @see #getReferencesModelObject()
	 * @generated
	 */
	EReference getReferencesModelObject_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject#getName()
	 * @see #getReferencesModelObject()
	 * @generated
	 */
	EAttribute getReferencesModelObject_Name();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IObjectClass <em>Object Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass
	 * @generated
	 */
	EClass getObjectClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.IObjectClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass#getAttributes()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Attributes();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IObjectClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass#getAncestor()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.metamodel.IObjectClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass#getChildren()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.IObjectClass#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass#getTemplate()
	 * @see #getObjectClass()
	 * @generated
	 */
	EReference getObjectClass_Template();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.IAttribute#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute#getMinOccurs()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.IAttribute#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute#getMaxOccurs()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MaxOccurs();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IAttribute#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute#getRelation()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Relation();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IAttribute#getConnectedObject <em>Connected Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Object</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute#getConnectedObject()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ConnectedObject();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IRelationClass <em>Relation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Class</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass
	 * @generated
	 */
	EClass getRelationClass();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IRelationClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass#getAncestor()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.metamodel.IRelationClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass#getChildren()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.IRelationClass#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass#getTemplate()
	 * @see #getRelationClass()
	 * @generated
	 */
	EReference getRelationClass_Template();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IMetamodelFactory getMetamodelFactory();

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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.MetamodelBase <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getMetamodel()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBase <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.TemplateBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getTemplate()
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
		 * The meta object literal for the '<em><b>Metamodel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__METAMODEL = eINSTANCE.getTemplate_Metamodel();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject <em>References Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getReferencesModelObject()
		 * @generated
		 */
		EClass REFERENCES_MODEL_OBJECT = eINSTANCE.getReferencesModelObject();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_MODEL_OBJECT__REFERENCE = eINSTANCE.getReferencesModelObject_Reference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCES_MODEL_OBJECT__NAME = eINSTANCE.getReferencesModelObject_Name();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase <em>Object Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getObjectClass()
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
		 * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS__TEMPLATE = eINSTANCE.getObjectClass_Template();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBase <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.AttributeBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getAttribute()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBase <em>Relation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.RelationClassBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getRelationClass()
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

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS__TEMPLATE = eINSTANCE.getRelationClass_Template();

	}

} //MetamodelBasePackage
