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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.MetamodelBase <em>MetamodelBase Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getMetamodelBase()
	 * @generated
	 */
	int METAMODEL_BASE = 0;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BASE__TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>MetamodelBase Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject <em>References Model Object Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getReferencesModelObjectBase()
	 * @generated
	 */
	int REFERENCES_MODEL_OBJECT_BASE = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_MODEL_OBJECT_BASE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_MODEL_OBJECT_BASE__NAME = 1;

	/**
	 * The number of structural features of the '<em>References Model Object Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBase <em>ITemplate Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.TemplateBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getTemplateBase()
	 * @generated
	 */
	int TEMPLATE_BASE = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE__REFERENCE = REFERENCES_MODEL_OBJECT_BASE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE__NAME = REFERENCES_MODEL_OBJECT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Object Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE__OBJECT_CLASSES = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE__RELATION_CLASSES = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE__PATH = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MetamodelBase</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE__METAMODEL = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ITemplate Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase <em>Object Class Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getObjectClassBase()
	 * @generated
	 */
	int OBJECT_CLASS_BASE = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_BASE__REFERENCE = REFERENCES_MODEL_OBJECT_BASE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_BASE__NAME = REFERENCES_MODEL_OBJECT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_BASE__ATTRIBUTES = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_BASE__ANCESTOR = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_BASE__CHILDREN = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>ITemplate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_BASE__TEMPLATE = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Class Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_CLASS_BASE_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBase <em>AttributeBase Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.AttributeBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getAttributeBase()
	 * @generated
	 */
	int ATTRIBUTE_BASE = 4;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BASE__MIN_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BASE__MAX_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BASE__RELATION = 2;

	/**
	 * The feature id for the '<em><b>Connected Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BASE__CONNECTED_OBJECT = 3;

	/**
	 * The number of structural features of the '<em>AttributeBase Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BASE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBase <em>Relation Class Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.RelationClassBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getRelationClassBase()
	 * @generated
	 */
	int RELATION_CLASS_BASE = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_BASE__REFERENCE = REFERENCES_MODEL_OBJECT_BASE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_BASE__NAME = REFERENCES_MODEL_OBJECT_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_BASE__ANCESTOR = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_BASE__CHILDREN = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ITemplate</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_BASE__TEMPLATE = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Class Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CLASS_BASE_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IMetamodel <em>MetamodelBase Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MetamodelBase Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IMetamodel
	 * @generated
	 */
	EClass getMetamodelBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.IMetamodel#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IMetamodel#getTemplates()
	 * @see #getMetamodelBase()
	 * @generated
	 */
	EReference getMetamodelBase_Templates();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.ITemplate <em>ITemplate Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITemplate Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate
	 * @generated
	 */
	EClass getTemplateBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getObjectClasses <em>Object Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Classes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate#getObjectClasses()
	 * @see #getTemplateBase()
	 * @generated
	 */
	EReference getTemplateBase_ObjectClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getRelationClasses <em>Relation Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Classes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate#getRelationClasses()
	 * @see #getTemplateBase()
	 * @generated
	 */
	EReference getTemplateBase_RelationClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate#getPath()
	 * @see #getTemplateBase()
	 * @generated
	 */
	EAttribute getTemplateBase_Path();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getMetamodel <em>MetamodelBase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>MetamodelBase</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate#getMetamodel()
	 * @see #getTemplateBase()
	 * @generated
	 */
	EReference getTemplateBase_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject <em>References Model Object Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Model Object Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject
	 * @generated
	 */
	EClass getReferencesModelObjectBase();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject#getReference()
	 * @see #getReferencesModelObjectBase()
	 * @generated
	 */
	EReference getReferencesModelObjectBase_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject#getName()
	 * @see #getReferencesModelObjectBase()
	 * @generated
	 */
	EAttribute getReferencesModelObjectBase_Name();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IObjectClass <em>Object Class Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass
	 * @generated
	 */
	EClass getObjectClassBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.IObjectClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass#getAttributes()
	 * @see #getObjectClassBase()
	 * @generated
	 */
	EReference getObjectClassBase_Attributes();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IObjectClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass#getAncestor()
	 * @see #getObjectClassBase()
	 * @generated
	 */
	EReference getObjectClassBase_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.metamodel.IObjectClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass#getChildren()
	 * @see #getObjectClassBase()
	 * @generated
	 */
	EReference getObjectClassBase_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.IObjectClass#getTemplate <em>ITemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ITemplate</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IObjectClass#getTemplate()
	 * @see #getObjectClassBase()
	 * @generated
	 */
	EReference getObjectClassBase_Template();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IAttribute <em>AttributeBase Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AttributeBase Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute
	 * @generated
	 */
	EClass getAttributeBase();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.IAttribute#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute#getMinOccurs()
	 * @see #getAttributeBase()
	 * @generated
	 */
	EAttribute getAttributeBase_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.IAttribute#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute#getMaxOccurs()
	 * @see #getAttributeBase()
	 * @generated
	 */
	EAttribute getAttributeBase_MaxOccurs();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IAttribute#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute#getRelation()
	 * @see #getAttributeBase()
	 * @generated
	 */
	EReference getAttributeBase_Relation();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IAttribute#getConnectedObject <em>Connected Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Object</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IAttribute#getConnectedObject()
	 * @see #getAttributeBase()
	 * @generated
	 */
	EReference getAttributeBase_ConnectedObject();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.IRelationClass <em>Relation Class Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Class Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass
	 * @generated
	 */
	EClass getRelationClassBase();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.IRelationClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass#getAncestor()
	 * @see #getRelationClassBase()
	 * @generated
	 */
	EReference getRelationClassBase_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.metamodel.IRelationClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass#getChildren()
	 * @see #getRelationClassBase()
	 * @generated
	 */
	EReference getRelationClassBase_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.IRelationClass#getTemplate <em>ITemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ITemplate</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass#getTemplate()
	 * @see #getRelationClassBase()
	 * @generated
	 */
	EReference getRelationClassBase_Template();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IMetamodelFactory getMetamodelBaseFactory();

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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.MetamodelBase <em>MetamodelBase Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getMetamodelBase()
		 * @generated
		 */
		EClass METAMODEL_BASE = eINSTANCE.getMetamodelBase();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_BASE__TEMPLATES = eINSTANCE.getMetamodelBase_Templates();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBase <em>ITemplate Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.TemplateBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getTemplateBase()
		 * @generated
		 */
		EClass TEMPLATE_BASE = eINSTANCE.getTemplateBase();

		/**
		 * The meta object literal for the '<em><b>Object Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BASE__OBJECT_CLASSES = eINSTANCE.getTemplateBase_ObjectClasses();

		/**
		 * The meta object literal for the '<em><b>Relation Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BASE__RELATION_CLASSES = eINSTANCE.getTemplateBase_RelationClasses();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_BASE__PATH = eINSTANCE.getTemplateBase_Path();

		/**
		 * The meta object literal for the '<em><b>MetamodelBase</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BASE__METAMODEL = eINSTANCE.getTemplateBase_Metamodel();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.IReferencesModelObject <em>References Model Object Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.IReferencesModelObject
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getReferencesModelObjectBase()
		 * @generated
		 */
		EClass REFERENCES_MODEL_OBJECT_BASE = eINSTANCE.getReferencesModelObjectBase();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_MODEL_OBJECT_BASE__REFERENCE = eINSTANCE.getReferencesModelObjectBase_Reference();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCES_MODEL_OBJECT_BASE__NAME = eINSTANCE.getReferencesModelObjectBase_Name();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase <em>Object Class Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.ObjectClassBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getObjectClassBase()
		 * @generated
		 */
		EClass OBJECT_CLASS_BASE = eINSTANCE.getObjectClassBase();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_BASE__ATTRIBUTES = eINSTANCE.getObjectClassBase_Attributes();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_BASE__ANCESTOR = eINSTANCE.getObjectClassBase_Ancestor();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_BASE__CHILDREN = eINSTANCE.getObjectClassBase_Children();

		/**
		 * The meta object literal for the '<em><b>ITemplate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_BASE__TEMPLATE = eINSTANCE.getObjectClassBase_Template();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBase <em>AttributeBase Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.AttributeBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getAttributeBase()
		 * @generated
		 */
		EClass ATTRIBUTE_BASE = eINSTANCE.getAttributeBase();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BASE__MIN_OCCURS = eINSTANCE.getAttributeBase_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_BASE__MAX_OCCURS = eINSTANCE.getAttributeBase_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_BASE__RELATION = eINSTANCE.getAttributeBase_Relation();

		/**
		 * The meta object literal for the '<em><b>Connected Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_BASE__CONNECTED_OBJECT = eINSTANCE.getAttributeBase_ConnectedObject();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBase <em>Relation Class Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.RelationClassBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelPackageBase#getRelationClassBase()
		 * @generated
		 */
		EClass RELATION_CLASS_BASE = eINSTANCE.getRelationClassBase();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS_BASE__ANCESTOR = eINSTANCE.getRelationClassBase_Ancestor();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS_BASE__CHILDREN = eINSTANCE.getRelationClassBase_Children();

		/**
		 * The meta object literal for the '<em><b>ITemplate</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS_BASE__TEMPLATE = eINSTANCE.getRelationClassBase_Template();

	}

} //MetamodelBasePackage
