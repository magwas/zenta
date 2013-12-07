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
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBaseFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelBasePackage extends EPackage {
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
	MetamodelBasePackage eINSTANCE = org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.MetamodelBaseImpl <em>Metamodel Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBaseImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getMetamodelBase()
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
	 * The number of structural features of the '<em>Metamodel Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_BASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase <em>References Model Object Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getReferencesModelObjectBase()
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl <em>Template Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getTemplateBase()
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
	 * The feature id for the '<em><b>Metamodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE__METAMODEL = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Template Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BASE_FEATURE_COUNT = REFERENCES_MODEL_OBJECT_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl <em>Object Class Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getObjectClassBase()
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
	 * The feature id for the '<em><b>Template</b></em>' container reference.
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl <em>Attribute Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getAttributeBase()
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
	 * The number of structural features of the '<em>Attribute Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_BASE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl <em>Relation Class Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl
	 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getRelationClassBase()
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
	 * The feature id for the '<em><b>Template</b></em>' container reference.
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
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.MetamodelBase <em>Metamodel Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBase
	 * @generated
	 */
	EClass getMetamodelBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.MetamodelBase#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBase#getTemplates()
	 * @see #getMetamodelBase()
	 * @generated
	 */
	EReference getMetamodelBase_Templates();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.TemplateBase <em>Template Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.TemplateBase
	 * @generated
	 */
	EClass getTemplateBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getObjectClasses <em>Object Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Classes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.TemplateBase#getObjectClasses()
	 * @see #getTemplateBase()
	 * @generated
	 */
	EReference getTemplateBase_ObjectClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getRelationClasses <em>Relation Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Classes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.TemplateBase#getRelationClasses()
	 * @see #getTemplateBase()
	 * @generated
	 */
	EReference getTemplateBase_RelationClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.TemplateBase#getPath()
	 * @see #getTemplateBase()
	 * @generated
	 */
	EAttribute getTemplateBase_Path();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metamodel</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.TemplateBase#getMetamodel()
	 * @see #getTemplateBase()
	 * @generated
	 */
	EReference getTemplateBase_Metamodel();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase <em>References Model Object Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Model Object Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase
	 * @generated
	 */
	EClass getReferencesModelObjectBase();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase#getReference()
	 * @see #getReferencesModelObjectBase()
	 * @generated
	 */
	EReference getReferencesModelObjectBase_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase#getName()
	 * @see #getReferencesModelObjectBase()
	 * @generated
	 */
	EAttribute getReferencesModelObjectBase_Name();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase <em>Object Class Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClassBase
	 * @generated
	 */
	EClass getObjectClassBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAttributes()
	 * @see #getObjectClassBase()
	 * @generated
	 */
	EReference getObjectClassBase_Attributes();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClassBase#getAncestor()
	 * @see #getObjectClassBase()
	 * @generated
	 */
	EReference getObjectClassBase_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClassBase#getChildren()
	 * @see #getObjectClassBase()
	 * @generated
	 */
	EReference getObjectClassBase_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClassBase#getTemplate()
	 * @see #getObjectClassBase()
	 * @generated
	 */
	EReference getObjectClassBase_Template();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.AttributeBase <em>Attribute Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.AttributeBase
	 * @generated
	 */
	EClass getAttributeBase();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.AttributeBase#getMinOccurs()
	 * @see #getAttributeBase()
	 * @generated
	 */
	EAttribute getAttributeBase_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.AttributeBase#getMaxOccurs()
	 * @see #getAttributeBase()
	 * @generated
	 */
	EAttribute getAttributeBase_MaxOccurs();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.AttributeBase#getRelation()
	 * @see #getAttributeBase()
	 * @generated
	 */
	EReference getAttributeBase_Relation();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.AttributeBase#getConnectedObject <em>Connected Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Object</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.AttributeBase#getConnectedObject()
	 * @see #getAttributeBase()
	 * @generated
	 */
	EReference getAttributeBase_ConnectedObject();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.metamodel.RelationClassBase <em>Relation Class Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Class Base</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.RelationClassBase
	 * @generated
	 */
	EClass getRelationClassBase();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.metamodel.RelationClassBase#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.RelationClassBase#getAncestor()
	 * @see #getRelationClassBase()
	 * @generated
	 */
	EReference getRelationClassBase_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.metamodel.RelationClassBase#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.RelationClassBase#getChildren()
	 * @see #getRelationClassBase()
	 * @generated
	 */
	EReference getRelationClassBase_Children();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.metamodel.RelationClassBase#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Template</em>'.
	 * @see org.rulez.magwas.zenta.metamodel.RelationClassBase#getTemplate()
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
	MetamodelBaseFactory getMetamodelBaseFactory();

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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.MetamodelBaseImpl <em>Metamodel Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBaseImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getMetamodelBase()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl <em>Template Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.TemplateBaseImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getTemplateBase()
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
		 * The meta object literal for the '<em><b>Metamodel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BASE__METAMODEL = eINSTANCE.getTemplateBase_Metamodel();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase <em>References Model Object Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getReferencesModelObjectBase()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl <em>Object Class Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.ObjectClassBaseImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getObjectClassBase()
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
		 * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_CLASS_BASE__TEMPLATE = eINSTANCE.getObjectClassBase_Template();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl <em>Attribute Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.AttributeBaseImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getAttributeBase()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl <em>Relation Class Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl
		 * @see org.rulez.magwas.zenta.metamodel.impl.MetamodelBasePackageImpl#getRelationClassBase()
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
		 * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CLASS_BASE__TEMPLATE = eINSTANCE.getRelationClassBase_Template();

	}

} //MetamodelBasePackage