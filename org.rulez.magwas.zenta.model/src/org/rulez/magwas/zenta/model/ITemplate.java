/**
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITemplate Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.ITemplate#getObjectClasses <em>Object Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.ITemplate#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.ITemplate#getPath <em>Path</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.ITemplate#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getTemplate()
 * @model
 * @generated
 */
public interface ITemplate
extends IReferencesModelObject 
{
	/**
	 * Returns the value of the '<em><b>Object Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IObjectClass}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IObjectClass#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Classes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getTemplate_ObjectClasses()
	 * @see org.rulez.magwas.zenta.model.IObjectClass#getTemplate
	 * @model opposite="template" containment="true"
	 * @generated
	 */
	EList<IObjectClass> getObjectClasses();

	/**
	 * Returns the value of the '<em><b>Relation Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IRelationClass}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IRelationClass#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Classes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getTemplate_RelationClasses()
	 * @see org.rulez.magwas.zenta.model.IRelationClass#getTemplate
	 * @model opposite="template" containment="true"
	 * @generated
	 */
	EList<IRelationClass> getRelationClasses();

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
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getTemplate_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.ITemplate#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IMetamodel#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' container reference.
	 * @see #setMetamodel(IMetamodel)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getTemplate_Metamodel()
	 * @see org.rulez.magwas.zenta.model.IMetamodel#getTemplates
	 * @model opposite="templates" required="true" transient="false"
	 * @generated
	 */
	IMetamodel getMetamodel();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.ITemplate#getMetamodel <em>Metamodel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' container reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(IMetamodel value);

	void removeClass(IReferencesModelObject oc);
	IObjectClass getObjectClassReferencingElement(IZentaElement reference);

	IRelationClass getRelationClassReferencingElement(IRelationship referenced);
	
	IObjectClass getObjectClassFrom(IZentaElement reference);

	IRelationClass getRelationClassFrom(IRelationship referenced);

	void createClassBy(IZentaElement element);

	IIdentifier create(IFolder folder);

} // ITemplate
