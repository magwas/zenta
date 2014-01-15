/**
 */
package org.rulez.magwas.zenta.model;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.handmade.BuiltinTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MetamodelBase Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IMetamodel#getTemplates <em>Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getMetamodel()
 * @model
 * @generated
 */
public interface IMetamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.ITemplate}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.ITemplate#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getMetamodel_Templates()
	 * @see org.rulez.magwas.zenta.model.ITemplate#getMetamodel
	 * @model opposite="metamodel" containment="true"
	 * @generated
	 */
	EList<ITemplate> getTemplates();

    IZentaModel getModel();
    
    IReferencesModelObject getClassById(String classId);
	IObjectClass getBuiltinObjectClass();
	IRelationClass getBuiltinRelationClass();
	
    BuiltinTemplate getBuiltinTemplate();
    ITemplate getTemplateFor(IDiagramModel dm);
    ITemplate getTemplateFor(IDiagramModelComponent element);
    
    IReferencesModelObject getClassOf(IIdentifier rel);
    IReferencesModelObject getClassReferencing(IIdentifier modelElement);
    IObjectClass getObjectClassReferencing(IZentaElement element);
    IRelationClass getRelationClassReferencing(IRelationship relation);
	boolean hasRelationClassReferencing(IRelationship relation);
	boolean hasObjectClassReferencing(IZentaElement elementToAdd);

	List<IObjectClass> getObjectClasses();
	List<IRelationClass> getRelationClasses();
	List<IObjectClass> getConnectorClasses();
	
	Collection<IRelationClass> getRelationships(IZentaElement object);
	List<IRelationClass> getWeaklist();
	boolean isValidRelationship(IZentaElement element1, IZentaElement element2,
			IRelationClass relationshipClass);

} // MetamodelBase
