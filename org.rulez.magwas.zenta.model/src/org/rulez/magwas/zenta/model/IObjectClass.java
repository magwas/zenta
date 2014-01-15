/**
 */
package org.rulez.magwas.zenta.model;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IAttribute.Direction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class Base</b></em>'.
 * @extends IHelpHintProvider
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IObjectClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IObjectClass#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IObjectClass#getChildren <em>Children</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IObjectClass#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getObjectClass()
 * @model
 */
public interface IObjectClass extends IReferencesModelObject, IHelpHintProvider {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getObjectClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<IAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Ancestor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IObjectClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ancestor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ancestor</em>' reference.
	 * @see #setAncestor(IObjectClass)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getObjectClass_Ancestor()
	 * @see org.rulez.magwas.zenta.model.IObjectClass#getChildren
	 * @model opposite="children" resolveProxies="false" required="true"
	 * @generated
	 */
	IObjectClass getAncestor();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IObjectClass#getAncestor <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ancestor</em>' reference.
	 * @see #getAncestor()
	 * @generated
	 */
	void setAncestor(IObjectClass value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.IObjectClass}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.IObjectClass#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getObjectClass_Children()
	 * @see org.rulez.magwas.zenta.model.IObjectClass#getAncestor
	 * @model opposite="ancestor" resolveProxies="false" derived="true"
	 * @generated
	 */
	EList<IObjectClass> getChildren();

	/**
	 * Returns the value of the '<em><b>Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.ITemplate#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ITemplate</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' container reference.
	 * @see #setTemplate(ITemplate)
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getObjectClass_Template()
	 * @see org.rulez.magwas.zenta.model.ITemplate#getClasses
	 * @model opposite="classes" transient="false"
	 * @generated
	 */
	ITemplate getTemplate();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IObjectClass#getTemplate <em>Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' container reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(ITemplate value);

	
	boolean isAllowedRelation(IRelationClass klass, Direction source);

	Map<Direction, List<IRelationClass>> getAllowedRelations();

	IIdentifier create(IFolder folder);
	
	boolean isObject();
	boolean isRelation();
	boolean isTemplate();

} // ObjectClass
