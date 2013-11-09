/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.bolton.archimate.model.IAdapter;
import uk.ac.bolton.archimate.model.IAggregationRelationship;
import uk.ac.bolton.archimate.model.IAndJunction;
import uk.ac.bolton.archimate.model.IArchimateDiagramModel;
import uk.ac.bolton.archimate.model.IArchimateElement;
import uk.ac.bolton.archimate.model.IArchimateModel;
import uk.ac.bolton.archimate.model.IArchimateModelElement;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IAssociationRelationship;
import uk.ac.bolton.archimate.model.IBorderObject;
import uk.ac.bolton.archimate.model.IBounds;
import uk.ac.bolton.archimate.model.IBusinessLayerElement;
import uk.ac.bolton.archimate.model.IBusinessObject;
import uk.ac.bolton.archimate.model.ICloneable;
import uk.ac.bolton.archimate.model.IDiagramModel;
import uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection;
import uk.ac.bolton.archimate.model.IDiagramModelArchimateObject;
import uk.ac.bolton.archimate.model.IDiagramModelBendpoint;
import uk.ac.bolton.archimate.model.IDiagramModelComponent;
import uk.ac.bolton.archimate.model.IDiagramModelConnection;
import uk.ac.bolton.archimate.model.IDiagramModelContainer;
import uk.ac.bolton.archimate.model.IDiagramModelGroup;
import uk.ac.bolton.archimate.model.IDiagramModelImage;
import uk.ac.bolton.archimate.model.IDiagramModelImageProvider;
import uk.ac.bolton.archimate.model.IDiagramModelNote;
import uk.ac.bolton.archimate.model.IDiagramModelObject;
import uk.ac.bolton.archimate.model.IDiagramModelReference;
import uk.ac.bolton.archimate.model.IDocumentable;
import uk.ac.bolton.archimate.model.IFolder;
import uk.ac.bolton.archimate.model.IFolderContainer;
import uk.ac.bolton.archimate.model.IFontAttribute;
import uk.ac.bolton.archimate.model.IIdentifier;
import uk.ac.bolton.archimate.model.IInterfaceElement;
import uk.ac.bolton.archimate.model.IJunction;
import uk.ac.bolton.archimate.model.IJunctionElement;
import uk.ac.bolton.archimate.model.ILockable;
import uk.ac.bolton.archimate.model.INameable;
import uk.ac.bolton.archimate.model.IOrJunction;
import uk.ac.bolton.archimate.model.IProperties;
import uk.ac.bolton.archimate.model.IProperty;
import uk.ac.bolton.archimate.model.IRelationship;
import uk.ac.bolton.archimate.model.ISketchModel;
import uk.ac.bolton.archimate.model.ISketchModelActor;
import uk.ac.bolton.archimate.model.ISketchModelSticky;
import uk.ac.bolton.archimate.model.ISpecialisationRelationship;
import uk.ac.bolton.archimate.model.ITextContent;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.bolton.archimate.model.IArchimatePackage
 * @generated
 */
public class ArchimateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IArchimatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchimateSwitch() {
		if (modelPackage == null) {
			modelPackage = IArchimatePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IArchimatePackage.ADAPTER: {
				IAdapter adapter = (IAdapter)theEObject;
				T result = caseAdapter(adapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.IDENTIFIER: {
				IIdentifier identifier = (IIdentifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.PROPERTY: {
				IProperty property = (IProperty)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.PROPERTIES: {
				IProperties properties = (IProperties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.NAMEABLE: {
				INameable nameable = (INameable)theEObject;
				T result = caseNameable(nameable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.TEXT_CONTENT: {
				ITextContent textContent = (ITextContent)theEObject;
				T result = caseTextContent(textContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DOCUMENTABLE: {
				IDocumentable documentable = (IDocumentable)theEObject;
				T result = caseDocumentable(documentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.CLONEABLE: {
				ICloneable cloneable = (ICloneable)theEObject;
				T result = caseCloneable(cloneable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.FOLDER_CONTAINER: {
				IFolderContainer folderContainer = (IFolderContainer)theEObject;
				T result = caseFolderContainer(folderContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.ARCHIMATE_MODEL: {
				IArchimateModel archimateModel = (IArchimateModel)theEObject;
				T result = caseArchimateModel(archimateModel);
				if (result == null) result = caseFolderContainer(archimateModel);
				if (result == null) result = caseNameable(archimateModel);
				if (result == null) result = caseIdentifier(archimateModel);
				if (result == null) result = caseArchimateModelElement(archimateModel);
				if (result == null) result = caseProperties(archimateModel);
				if (result == null) result = caseAdapter(archimateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.ARCHIMATE_MODEL_ELEMENT: {
				IArchimateModelElement archimateModelElement = (IArchimateModelElement)theEObject;
				T result = caseArchimateModelElement(archimateModelElement);
				if (result == null) result = caseAdapter(archimateModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.FOLDER: {
				IFolder folder = (IFolder)theEObject;
				T result = caseFolder(folder);
				if (result == null) result = caseArchimateModelElement(folder);
				if (result == null) result = caseFolderContainer(folder);
				if (result == null) result = caseNameable(folder);
				if (result == null) result = caseIdentifier(folder);
				if (result == null) result = caseDocumentable(folder);
				if (result == null) result = caseProperties(folder);
				if (result == null) result = caseAdapter(folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.ARCHIMATE_ELEMENT: {
				IArchimateElement archimateElement = (IArchimateElement)theEObject;
				T result = caseArchimateElement(archimateElement);
				if (result == null) result = caseArchimateModelElement(archimateElement);
				if (result == null) result = caseIdentifier(archimateElement);
				if (result == null) result = caseCloneable(archimateElement);
				if (result == null) result = caseNameable(archimateElement);
				if (result == null) result = caseDocumentable(archimateElement);
				if (result == null) result = caseProperties(archimateElement);
				if (result == null) result = caseAdapter(archimateElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.JUNCTION_ELEMENT: {
				IJunctionElement junctionElement = (IJunctionElement)theEObject;
				T result = caseJunctionElement(junctionElement);
				if (result == null) result = caseArchimateElement(junctionElement);
				if (result == null) result = caseArchimateModelElement(junctionElement);
				if (result == null) result = caseIdentifier(junctionElement);
				if (result == null) result = caseCloneable(junctionElement);
				if (result == null) result = caseNameable(junctionElement);
				if (result == null) result = caseDocumentable(junctionElement);
				if (result == null) result = caseProperties(junctionElement);
				if (result == null) result = caseAdapter(junctionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.INTERFACE_ELEMENT: {
				IInterfaceElement interfaceElement = (IInterfaceElement)theEObject;
				T result = caseInterfaceElement(interfaceElement);
				if (result == null) result = caseArchimateElement(interfaceElement);
				if (result == null) result = caseArchimateModelElement(interfaceElement);
				if (result == null) result = caseIdentifier(interfaceElement);
				if (result == null) result = caseCloneable(interfaceElement);
				if (result == null) result = caseNameable(interfaceElement);
				if (result == null) result = caseDocumentable(interfaceElement);
				if (result == null) result = caseProperties(interfaceElement);
				if (result == null) result = caseAdapter(interfaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.JUNCTION: {
				IJunction junction = (IJunction)theEObject;
				T result = caseJunction(junction);
				if (result == null) result = caseJunctionElement(junction);
				if (result == null) result = caseArchimateElement(junction);
				if (result == null) result = caseArchimateModelElement(junction);
				if (result == null) result = caseIdentifier(junction);
				if (result == null) result = caseCloneable(junction);
				if (result == null) result = caseNameable(junction);
				if (result == null) result = caseDocumentable(junction);
				if (result == null) result = caseProperties(junction);
				if (result == null) result = caseAdapter(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.AND_JUNCTION: {
				IAndJunction andJunction = (IAndJunction)theEObject;
				T result = caseAndJunction(andJunction);
				if (result == null) result = caseJunctionElement(andJunction);
				if (result == null) result = caseArchimateElement(andJunction);
				if (result == null) result = caseArchimateModelElement(andJunction);
				if (result == null) result = caseIdentifier(andJunction);
				if (result == null) result = caseCloneable(andJunction);
				if (result == null) result = caseNameable(andJunction);
				if (result == null) result = caseDocumentable(andJunction);
				if (result == null) result = caseProperties(andJunction);
				if (result == null) result = caseAdapter(andJunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.OR_JUNCTION: {
				IOrJunction orJunction = (IOrJunction)theEObject;
				T result = caseOrJunction(orJunction);
				if (result == null) result = caseJunctionElement(orJunction);
				if (result == null) result = caseArchimateElement(orJunction);
				if (result == null) result = caseArchimateModelElement(orJunction);
				if (result == null) result = caseIdentifier(orJunction);
				if (result == null) result = caseCloneable(orJunction);
				if (result == null) result = caseNameable(orJunction);
				if (result == null) result = caseDocumentable(orJunction);
				if (result == null) result = caseProperties(orJunction);
				if (result == null) result = caseAdapter(orJunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.RELATIONSHIP: {
				IRelationship relationship = (IRelationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseArchimateElement(relationship);
				if (result == null) result = caseArchimateModelElement(relationship);
				if (result == null) result = caseIdentifier(relationship);
				if (result == null) result = caseCloneable(relationship);
				if (result == null) result = caseNameable(relationship);
				if (result == null) result = caseDocumentable(relationship);
				if (result == null) result = caseProperties(relationship);
				if (result == null) result = caseAdapter(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.ASSOCIATION_RELATIONSHIP: {
				IAssociationRelationship associationRelationship = (IAssociationRelationship)theEObject;
				T result = caseAssociationRelationship(associationRelationship);
				if (result == null) result = caseRelationship(associationRelationship);
				if (result == null) result = caseArchimateElement(associationRelationship);
				if (result == null) result = caseArchimateModelElement(associationRelationship);
				if (result == null) result = caseIdentifier(associationRelationship);
				if (result == null) result = caseCloneable(associationRelationship);
				if (result == null) result = caseNameable(associationRelationship);
				if (result == null) result = caseDocumentable(associationRelationship);
				if (result == null) result = caseProperties(associationRelationship);
				if (result == null) result = caseAdapter(associationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.SPECIALISATION_RELATIONSHIP: {
				ISpecialisationRelationship specialisationRelationship = (ISpecialisationRelationship)theEObject;
				T result = caseSpecialisationRelationship(specialisationRelationship);
				if (result == null) result = caseRelationship(specialisationRelationship);
				if (result == null) result = caseArchimateElement(specialisationRelationship);
				if (result == null) result = caseArchimateModelElement(specialisationRelationship);
				if (result == null) result = caseIdentifier(specialisationRelationship);
				if (result == null) result = caseCloneable(specialisationRelationship);
				if (result == null) result = caseNameable(specialisationRelationship);
				if (result == null) result = caseDocumentable(specialisationRelationship);
				if (result == null) result = caseProperties(specialisationRelationship);
				if (result == null) result = caseAdapter(specialisationRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.BUSINESS_LAYER_ELEMENT: {
				IBusinessLayerElement businessLayerElement = (IBusinessLayerElement)theEObject;
				T result = caseBusinessLayerElement(businessLayerElement);
				if (result == null) result = caseArchimateElement(businessLayerElement);
				if (result == null) result = caseArchimateModelElement(businessLayerElement);
				if (result == null) result = caseIdentifier(businessLayerElement);
				if (result == null) result = caseCloneable(businessLayerElement);
				if (result == null) result = caseNameable(businessLayerElement);
				if (result == null) result = caseDocumentable(businessLayerElement);
				if (result == null) result = caseProperties(businessLayerElement);
				if (result == null) result = caseAdapter(businessLayerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_COMPONENT: {
				IDiagramModelComponent diagramModelComponent = (IDiagramModelComponent)theEObject;
				T result = caseDiagramModelComponent(diagramModelComponent);
				if (result == null) result = caseIdentifier(diagramModelComponent);
				if (result == null) result = caseCloneable(diagramModelComponent);
				if (result == null) result = caseAdapter(diagramModelComponent);
				if (result == null) result = caseNameable(diagramModelComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_CONTAINER: {
				IDiagramModelContainer diagramModelContainer = (IDiagramModelContainer)theEObject;
				T result = caseDiagramModelContainer(diagramModelContainer);
				if (result == null) result = caseDiagramModelComponent(diagramModelContainer);
				if (result == null) result = caseIdentifier(diagramModelContainer);
				if (result == null) result = caseCloneable(diagramModelContainer);
				if (result == null) result = caseAdapter(diagramModelContainer);
				if (result == null) result = caseNameable(diagramModelContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL: {
				IDiagramModel diagramModel = (IDiagramModel)theEObject;
				T result = caseDiagramModel(diagramModel);
				if (result == null) result = caseArchimateModelElement(diagramModel);
				if (result == null) result = caseDiagramModelContainer(diagramModel);
				if (result == null) result = caseDocumentable(diagramModel);
				if (result == null) result = caseProperties(diagramModel);
				if (result == null) result = caseDiagramModelComponent(diagramModel);
				if (result == null) result = caseAdapter(diagramModel);
				if (result == null) result = caseIdentifier(diagramModel);
				if (result == null) result = caseCloneable(diagramModel);
				if (result == null) result = caseNameable(diagramModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_REFERENCE: {
				IDiagramModelReference diagramModelReference = (IDiagramModelReference)theEObject;
				T result = caseDiagramModelReference(diagramModelReference);
				if (result == null) result = caseDiagramModelObject(diagramModelReference);
				if (result == null) result = caseDiagramModelComponent(diagramModelReference);
				if (result == null) result = caseFontAttribute(diagramModelReference);
				if (result == null) result = caseIdentifier(diagramModelReference);
				if (result == null) result = caseCloneable(diagramModelReference);
				if (result == null) result = caseAdapter(diagramModelReference);
				if (result == null) result = caseNameable(diagramModelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_OBJECT: {
				IDiagramModelObject diagramModelObject = (IDiagramModelObject)theEObject;
				T result = caseDiagramModelObject(diagramModelObject);
				if (result == null) result = caseDiagramModelComponent(diagramModelObject);
				if (result == null) result = caseFontAttribute(diagramModelObject);
				if (result == null) result = caseIdentifier(diagramModelObject);
				if (result == null) result = caseCloneable(diagramModelObject);
				if (result == null) result = caseAdapter(diagramModelObject);
				if (result == null) result = caseNameable(diagramModelObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_GROUP: {
				IDiagramModelGroup diagramModelGroup = (IDiagramModelGroup)theEObject;
				T result = caseDiagramModelGroup(diagramModelGroup);
				if (result == null) result = caseDiagramModelObject(diagramModelGroup);
				if (result == null) result = caseDiagramModelContainer(diagramModelGroup);
				if (result == null) result = caseDocumentable(diagramModelGroup);
				if (result == null) result = caseProperties(diagramModelGroup);
				if (result == null) result = caseDiagramModelComponent(diagramModelGroup);
				if (result == null) result = caseFontAttribute(diagramModelGroup);
				if (result == null) result = caseIdentifier(diagramModelGroup);
				if (result == null) result = caseCloneable(diagramModelGroup);
				if (result == null) result = caseAdapter(diagramModelGroup);
				if (result == null) result = caseNameable(diagramModelGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_NOTE: {
				IDiagramModelNote diagramModelNote = (IDiagramModelNote)theEObject;
				T result = caseDiagramModelNote(diagramModelNote);
				if (result == null) result = caseDiagramModelObject(diagramModelNote);
				if (result == null) result = caseTextContent(diagramModelNote);
				if (result == null) result = caseDiagramModelComponent(diagramModelNote);
				if (result == null) result = caseFontAttribute(diagramModelNote);
				if (result == null) result = caseIdentifier(diagramModelNote);
				if (result == null) result = caseCloneable(diagramModelNote);
				if (result == null) result = caseAdapter(diagramModelNote);
				if (result == null) result = caseNameable(diagramModelNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_IMAGE: {
				IDiagramModelImage diagramModelImage = (IDiagramModelImage)theEObject;
				T result = caseDiagramModelImage(diagramModelImage);
				if (result == null) result = caseDiagramModelObject(diagramModelImage);
				if (result == null) result = caseBorderObject(diagramModelImage);
				if (result == null) result = caseDiagramModelImageProvider(diagramModelImage);
				if (result == null) result = caseDiagramModelComponent(diagramModelImage);
				if (result == null) result = caseFontAttribute(diagramModelImage);
				if (result == null) result = caseIdentifier(diagramModelImage);
				if (result == null) result = caseCloneable(diagramModelImage);
				if (result == null) result = caseAdapter(diagramModelImage);
				if (result == null) result = caseNameable(diagramModelImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_CONNECTION: {
				IDiagramModelConnection diagramModelConnection = (IDiagramModelConnection)theEObject;
				T result = caseDiagramModelConnection(diagramModelConnection);
				if (result == null) result = caseDiagramModelComponent(diagramModelConnection);
				if (result == null) result = caseFontAttribute(diagramModelConnection);
				if (result == null) result = caseProperties(diagramModelConnection);
				if (result == null) result = caseDocumentable(diagramModelConnection);
				if (result == null) result = caseIdentifier(diagramModelConnection);
				if (result == null) result = caseCloneable(diagramModelConnection);
				if (result == null) result = caseAdapter(diagramModelConnection);
				if (result == null) result = caseNameable(diagramModelConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_BENDPOINT: {
				IDiagramModelBendpoint diagramModelBendpoint = (IDiagramModelBendpoint)theEObject;
				T result = caseDiagramModelBendpoint(diagramModelBendpoint);
				if (result == null) result = caseCloneable(diagramModelBendpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.FONT_ATTRIBUTE: {
				IFontAttribute fontAttribute = (IFontAttribute)theEObject;
				T result = caseFontAttribute(fontAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.BORDER_OBJECT: {
				IBorderObject borderObject = (IBorderObject)theEObject;
				T result = caseBorderObject(borderObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_IMAGE_PROVIDER: {
				IDiagramModelImageProvider diagramModelImageProvider = (IDiagramModelImageProvider)theEObject;
				T result = caseDiagramModelImageProvider(diagramModelImageProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.BOUNDS: {
				IBounds bounds = (IBounds)theEObject;
				T result = caseBounds(bounds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.LOCKABLE: {
				ILockable lockable = (ILockable)theEObject;
				T result = caseLockable(lockable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.ARCHIMATE_DIAGRAM_MODEL: {
				IArchimateDiagramModel archimateDiagramModel = (IArchimateDiagramModel)theEObject;
				T result = caseArchimateDiagramModel(archimateDiagramModel);
				if (result == null) result = caseDiagramModel(archimateDiagramModel);
				if (result == null) result = caseArchimateModelElement(archimateDiagramModel);
				if (result == null) result = caseDiagramModelContainer(archimateDiagramModel);
				if (result == null) result = caseDocumentable(archimateDiagramModel);
				if (result == null) result = caseProperties(archimateDiagramModel);
				if (result == null) result = caseDiagramModelComponent(archimateDiagramModel);
				if (result == null) result = caseAdapter(archimateDiagramModel);
				if (result == null) result = caseIdentifier(archimateDiagramModel);
				if (result == null) result = caseCloneable(archimateDiagramModel);
				if (result == null) result = caseNameable(archimateDiagramModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT: {
				IDiagramModelArchimateObject diagramModelArchimateObject = (IDiagramModelArchimateObject)theEObject;
				T result = caseDiagramModelArchimateObject(diagramModelArchimateObject);
				if (result == null) result = caseDiagramModelObject(diagramModelArchimateObject);
				if (result == null) result = caseDiagramModelContainer(diagramModelArchimateObject);
				if (result == null) result = caseDiagramModelComponent(diagramModelArchimateObject);
				if (result == null) result = caseFontAttribute(diagramModelArchimateObject);
				if (result == null) result = caseIdentifier(diagramModelArchimateObject);
				if (result == null) result = caseCloneable(diagramModelArchimateObject);
				if (result == null) result = caseAdapter(diagramModelArchimateObject);
				if (result == null) result = caseNameable(diagramModelArchimateObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION: {
				IDiagramModelArchimateConnection diagramModelArchimateConnection = (IDiagramModelArchimateConnection)theEObject;
				T result = caseDiagramModelArchimateConnection(diagramModelArchimateConnection);
				if (result == null) result = caseDiagramModelConnection(diagramModelArchimateConnection);
				if (result == null) result = caseDiagramModelComponent(diagramModelArchimateConnection);
				if (result == null) result = caseFontAttribute(diagramModelArchimateConnection);
				if (result == null) result = caseProperties(diagramModelArchimateConnection);
				if (result == null) result = caseDocumentable(diagramModelArchimateConnection);
				if (result == null) result = caseIdentifier(diagramModelArchimateConnection);
				if (result == null) result = caseCloneable(diagramModelArchimateConnection);
				if (result == null) result = caseAdapter(diagramModelArchimateConnection);
				if (result == null) result = caseNameable(diagramModelArchimateConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.BUSINESS_OBJECT: {
				IBusinessObject businessObject = (IBusinessObject)theEObject;
				T result = caseBusinessObject(businessObject);
				if (result == null) result = caseBusinessLayerElement(businessObject);
				if (result == null) result = caseArchimateElement(businessObject);
				if (result == null) result = caseArchimateModelElement(businessObject);
				if (result == null) result = caseIdentifier(businessObject);
				if (result == null) result = caseCloneable(businessObject);
				if (result == null) result = caseNameable(businessObject);
				if (result == null) result = caseDocumentable(businessObject);
				if (result == null) result = caseProperties(businessObject);
				if (result == null) result = caseAdapter(businessObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.SKETCH_MODEL: {
				ISketchModel sketchModel = (ISketchModel)theEObject;
				T result = caseSketchModel(sketchModel);
				if (result == null) result = caseDiagramModel(sketchModel);
				if (result == null) result = caseArchimateModelElement(sketchModel);
				if (result == null) result = caseDiagramModelContainer(sketchModel);
				if (result == null) result = caseDocumentable(sketchModel);
				if (result == null) result = caseProperties(sketchModel);
				if (result == null) result = caseDiagramModelComponent(sketchModel);
				if (result == null) result = caseAdapter(sketchModel);
				if (result == null) result = caseIdentifier(sketchModel);
				if (result == null) result = caseCloneable(sketchModel);
				if (result == null) result = caseNameable(sketchModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.SKETCH_MODEL_STICKY: {
				ISketchModelSticky sketchModelSticky = (ISketchModelSticky)theEObject;
				T result = caseSketchModelSticky(sketchModelSticky);
				if (result == null) result = caseDiagramModelObject(sketchModelSticky);
				if (result == null) result = caseDiagramModelContainer(sketchModelSticky);
				if (result == null) result = caseTextContent(sketchModelSticky);
				if (result == null) result = caseProperties(sketchModelSticky);
				if (result == null) result = caseDiagramModelComponent(sketchModelSticky);
				if (result == null) result = caseFontAttribute(sketchModelSticky);
				if (result == null) result = caseIdentifier(sketchModelSticky);
				if (result == null) result = caseCloneable(sketchModelSticky);
				if (result == null) result = caseAdapter(sketchModelSticky);
				if (result == null) result = caseNameable(sketchModelSticky);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IArchimatePackage.SKETCH_MODEL_ACTOR: {
				ISketchModelActor sketchModelActor = (ISketchModelActor)theEObject;
				T result = caseSketchModelActor(sketchModelActor);
				if (result == null) result = caseDiagramModelObject(sketchModelActor);
				if (result == null) result = caseDocumentable(sketchModelActor);
				if (result == null) result = caseProperties(sketchModelActor);
				if (result == null) result = caseDiagramModelComponent(sketchModelActor);
				if (result == null) result = caseFontAttribute(sketchModelActor);
				if (result == null) result = caseIdentifier(sketchModelActor);
				if (result == null) result = caseCloneable(sketchModelActor);
				if (result == null) result = caseAdapter(sketchModelActor);
				if (result == null) result = caseNameable(sketchModelActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdapter(IAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(IIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(IProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperties(IProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(INameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextContent(ITextContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentable(IDocumentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloneable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloneable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloneable(ICloneable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderContainer(IFolderContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateModel(IArchimateModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateModelElement(IArchimateModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolder(IFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateElement(IArchimateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunctionElement(IJunctionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceElement(IInterfaceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunction(IJunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndJunction(IAndJunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrJunction(IOrJunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(IRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationRelationship(IAssociationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialisation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialisation Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialisationRelationship(ISpecialisationRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Layer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Layer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessLayerElement(IBusinessLayerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelComponent(IDiagramModelComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelContainer(IDiagramModelContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModel(IDiagramModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelReference(IDiagramModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelObject(IDiagramModelObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelGroup(IDiagramModelGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelNote(IDiagramModelNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelImage(IDiagramModelImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelConnection(IDiagramModelConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Bendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Bendpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelBendpoint(IDiagramModelBendpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontAttribute(IFontAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderObject(IBorderObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Image Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Image Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelImageProvider(IDiagramModelImageProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBounds(IBounds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lockable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lockable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLockable(ILockable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchimateDiagramModel(IArchimateDiagramModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Archimate Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Archimate Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelArchimateObject(IDiagramModelArchimateObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Archimate Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Archimate Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelArchimateConnection(IDiagramModelArchimateConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessObject(IBusinessObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketchModel(ISketchModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch Model Sticky</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch Model Sticky</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketchModelSticky(ISketchModelSticky object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch Model Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch Model Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketchModelActor(ISketchModelActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArchimateSwitch
