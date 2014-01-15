/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITemplate Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ITemplate#getObjectClasses <em>Object Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ITemplate#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ITemplate#getPath <em>Path</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.metamodel.ITemplate#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase()
 * @model
 * @generated
 */
public interface ITemplate extends ReferencesModelObjectBase {
	/**
	 * Returns the value of the '<em><b>Object Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.ObjectClass}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.ObjectClass#getTemplate <em>ITemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Classes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase_ObjectClasses()
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClass#getTemplate
	 * @model opposite="template" containment="true"
	 * @generated
	 */
	EList<ObjectClass> getObjectClasses();

	/**
	 * Returns the value of the '<em><b>Relation Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.metamodel.IRelationClass}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.metamodel.IRelationClass#getTemplate <em>ITemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Classes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase_RelationClasses()
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass#getTemplate
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
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage#getTemplateBase_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getPath <em>Path</em>}' attribute.
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
	 * Sets the value of the '{@link org.rulez.magwas.zenta.metamodel.ITemplate#getMetamodel <em>Metamodel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' container reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(MetamodelBase value);

	void removeClass(ReferencesModelObjectBase oc);
	ObjectClass getObjectClassReferencingElement(IZentaElement reference);

	IRelationClass getRelationClassReferencingElement(IRelationship referenced);
	
	ObjectClass getObjectClassFrom(IZentaElement reference);

	IRelationClass getRelationClassFrom(IRelationship referenced);

	void createClassBy(IZentaElement element);

	IIdentifier create(IFolder folder);

} // ITemplate
