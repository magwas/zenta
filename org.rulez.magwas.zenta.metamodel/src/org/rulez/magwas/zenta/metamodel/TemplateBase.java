/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getObjectClasses <em>Object Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getPath <em>Path</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase()
 * @model
 * @generated
 */
public interface TemplateBase extends ReferencesModelObjectBase {
	/**
	 * Returns the value of the '<em><b>Object Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.ObjectClassBase}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.ObjectClassBase#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Classes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase_ObjectClasses()
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClassBase#getTemplate
	 * @model opposite="template" containment="true"
	 * @generated
	 */
	EList<ObjectClassBase> getObjectClasses();

	/**
	 * Returns the value of the '<em><b>Relation Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.RelationClassBase}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.RelationClassBase#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Classes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase_RelationClasses()
	 * @see org.rulez.magwas.zenta.metamodel.RelationClassBase#getTemplate
	 * @model opposite="template" containment="true"
	 * @generated
	 */
	EList<RelationClassBase> getRelationClasses();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.MetamodelBase#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' container reference.
	 * @see #setMetamodel(MetamodelBase)
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase_Metamodel()
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBase#getTemplates
	 * @model opposite="templates" required="true" transient="false"
	 * @generated
	 */
	MetamodelBase getMetamodel();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.TemplateBase#getMetamodel <em>Metamodel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' container reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(MetamodelBase value);

	void removeClass(ReferencesModelObjectBase oc);

} // TemplateBase
