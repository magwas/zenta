/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IAndJunction;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IBorderObject;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.ICloneable;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelBendpoint;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IDiagramModelImageProvider;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IFolderContainer;
import org.rulez.magwas.zenta.model.IFontAttribute;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IInterfaceElement;
import org.rulez.magwas.zenta.model.IJunction;
import org.rulez.magwas.zenta.model.IJunctionElement;
import org.rulez.magwas.zenta.model.ILockable;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IOrJunction;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.ISketchModelActor;
import org.rulez.magwas.zenta.model.ISketchModelSticky;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.ITextContent;


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
 * @see org.rulez.magwas.zenta.model.IZentaPackage
 * @generated
 */
public class ZentaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IZentaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZentaSwitch() {
		if (modelPackage == null) {
			modelPackage = IZentaPackage.eINSTANCE;
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
			case IZentaPackage.ADAPTER: {
				IAdapter adapter = (IAdapter)theEObject;
				T result = caseAdapter(adapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.IDENTIFIER: {
				IIdentifier identifier = (IIdentifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseNameable(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.PROPERTY: {
				IProperty property = (IProperty)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.PROPERTIES: {
				IProperties properties = (IProperties)theEObject;
				T result = caseProperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.NAMEABLE: {
				INameable nameable = (INameable)theEObject;
				T result = caseNameable(nameable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.TEXT_CONTENT: {
				ITextContent textContent = (ITextContent)theEObject;
				T result = caseTextContent(textContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.DOCUMENTABLE: {
				IDocumentable documentable = (IDocumentable)theEObject;
				T result = caseDocumentable(documentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.CLONEABLE: {
				ICloneable cloneable = (ICloneable)theEObject;
				T result = caseCloneable(cloneable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.FOLDER_CONTAINER: {
				IFolderContainer folderContainer = (IFolderContainer)theEObject;
				T result = caseFolderContainer(folderContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.ZENTA_MODEL_ELEMENT: {
				IZentaModelElement zentaModelElement = (IZentaModelElement)theEObject;
				T result = caseZentaModelElement(zentaModelElement);
				if (result == null) result = caseAdapter(zentaModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.FOLDER: {
				IFolder folder = (IFolder)theEObject;
				T result = caseFolder(folder);
				if (result == null) result = caseZentaModelElement(folder);
				if (result == null) result = caseFolderContainer(folder);
				if (result == null) result = caseIdentifier(folder);
				if (result == null) result = caseDocumentable(folder);
				if (result == null) result = caseProperties(folder);
				if (result == null) result = caseAdapter(folder);
				if (result == null) result = caseNameable(folder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.ZENTA_ELEMENT: {
				IZentaElement zentaElement = (IZentaElement)theEObject;
				T result = caseZentaElement(zentaElement);
				if (result == null) result = caseZentaModelElement(zentaElement);
				if (result == null) result = caseIdentifier(zentaElement);
				if (result == null) result = caseCloneable(zentaElement);
				if (result == null) result = caseDocumentable(zentaElement);
				if (result == null) result = caseProperties(zentaElement);
				if (result == null) result = caseAdapter(zentaElement);
				if (result == null) result = caseNameable(zentaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.JUNCTION_ELEMENT: {
				IJunctionElement junctionElement = (IJunctionElement)theEObject;
				T result = caseJunctionElement(junctionElement);
				if (result == null) result = caseZentaElement(junctionElement);
				if (result == null) result = caseZentaModelElement(junctionElement);
				if (result == null) result = caseIdentifier(junctionElement);
				if (result == null) result = caseCloneable(junctionElement);
				if (result == null) result = caseDocumentable(junctionElement);
				if (result == null) result = caseProperties(junctionElement);
				if (result == null) result = caseAdapter(junctionElement);
				if (result == null) result = caseNameable(junctionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.INTERFACE_ELEMENT: {
				IInterfaceElement interfaceElement = (IInterfaceElement)theEObject;
				T result = caseInterfaceElement(interfaceElement);
				if (result == null) result = caseZentaElement(interfaceElement);
				if (result == null) result = caseZentaModelElement(interfaceElement);
				if (result == null) result = caseIdentifier(interfaceElement);
				if (result == null) result = caseCloneable(interfaceElement);
				if (result == null) result = caseDocumentable(interfaceElement);
				if (result == null) result = caseProperties(interfaceElement);
				if (result == null) result = caseAdapter(interfaceElement);
				if (result == null) result = caseNameable(interfaceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.JUNCTION: {
				IJunction junction = (IJunction)theEObject;
				T result = caseJunction(junction);
				if (result == null) result = caseJunctionElement(junction);
				if (result == null) result = caseZentaElement(junction);
				if (result == null) result = caseZentaModelElement(junction);
				if (result == null) result = caseIdentifier(junction);
				if (result == null) result = caseCloneable(junction);
				if (result == null) result = caseDocumentable(junction);
				if (result == null) result = caseProperties(junction);
				if (result == null) result = caseAdapter(junction);
				if (result == null) result = caseNameable(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.AND_JUNCTION: {
				IAndJunction andJunction = (IAndJunction)theEObject;
				T result = caseAndJunction(andJunction);
				if (result == null) result = caseJunctionElement(andJunction);
				if (result == null) result = caseZentaElement(andJunction);
				if (result == null) result = caseZentaModelElement(andJunction);
				if (result == null) result = caseIdentifier(andJunction);
				if (result == null) result = caseCloneable(andJunction);
				if (result == null) result = caseDocumentable(andJunction);
				if (result == null) result = caseProperties(andJunction);
				if (result == null) result = caseAdapter(andJunction);
				if (result == null) result = caseNameable(andJunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.OR_JUNCTION: {
				IOrJunction orJunction = (IOrJunction)theEObject;
				T result = caseOrJunction(orJunction);
				if (result == null) result = caseJunctionElement(orJunction);
				if (result == null) result = caseZentaElement(orJunction);
				if (result == null) result = caseZentaModelElement(orJunction);
				if (result == null) result = caseIdentifier(orJunction);
				if (result == null) result = caseCloneable(orJunction);
				if (result == null) result = caseDocumentable(orJunction);
				if (result == null) result = caseProperties(orJunction);
				if (result == null) result = caseAdapter(orJunction);
				if (result == null) result = caseNameable(orJunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT: {
				IDiagramModelComponent diagramModelComponent = (IDiagramModelComponent)theEObject;
				T result = caseDiagramModelComponent(diagramModelComponent);
				if (result == null) result = caseIdentifier(diagramModelComponent);
				if (result == null) result = caseCloneable(diagramModelComponent);
				if (result == null) result = caseAdapter(diagramModelComponent);
				if (result == null) result = caseNameable(diagramModelComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.DIAGRAM_MODEL_CONTAINER: {
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
			case IZentaPackage.DIAGRAM_MODEL_REFERENCE: {
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
			case IZentaPackage.DIAGRAM_MODEL_OBJECT: {
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
			case IZentaPackage.DIAGRAM_MODEL_GROUP: {
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
			case IZentaPackage.DIAGRAM_MODEL_NOTE: {
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
			case IZentaPackage.DIAGRAM_MODEL_IMAGE: {
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
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION: {
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
			case IZentaPackage.DIAGRAM_MODEL_BENDPOINT: {
				IDiagramModelBendpoint diagramModelBendpoint = (IDiagramModelBendpoint)theEObject;
				T result = caseDiagramModelBendpoint(diagramModelBendpoint);
				if (result == null) result = caseCloneable(diagramModelBendpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.FONT_ATTRIBUTE: {
				IFontAttribute fontAttribute = (IFontAttribute)theEObject;
				T result = caseFontAttribute(fontAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.BORDER_OBJECT: {
				IBorderObject borderObject = (IBorderObject)theEObject;
				T result = caseBorderObject(borderObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.DIAGRAM_MODEL_IMAGE_PROVIDER: {
				IDiagramModelImageProvider diagramModelImageProvider = (IDiagramModelImageProvider)theEObject;
				T result = caseDiagramModelImageProvider(diagramModelImageProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.BOUNDS: {
				IBounds bounds = (IBounds)theEObject;
				T result = caseBounds(bounds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.LOCKABLE: {
				ILockable lockable = (ILockable)theEObject;
				T result = caseLockable(lockable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.ZENTA_DIAGRAM_MODEL: {
				IZentaDiagramModel zentaDiagramModel = (IZentaDiagramModel)theEObject;
				T result = caseZentaDiagramModel(zentaDiagramModel);
				if (result == null) result = caseDiagramModel(zentaDiagramModel);
				if (result == null) result = caseZentaModelElement(zentaDiagramModel);
				if (result == null) result = caseDiagramModelContainer(zentaDiagramModel);
				if (result == null) result = caseDocumentable(zentaDiagramModel);
				if (result == null) result = caseProperties(zentaDiagramModel);
				if (result == null) result = caseDiagramModelComponent(zentaDiagramModel);
				if (result == null) result = caseAdapter(zentaDiagramModel);
				if (result == null) result = caseIdentifier(zentaDiagramModel);
				if (result == null) result = caseCloneable(zentaDiagramModel);
				if (result == null) result = caseNameable(zentaDiagramModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT: {
				IDiagramModelZentaObject diagramModelZentaObject = (IDiagramModelZentaObject)theEObject;
				T result = caseDiagramModelZentaObject(diagramModelZentaObject);
				if (result == null) result = caseDiagramModelObject(diagramModelZentaObject);
				if (result == null) result = caseDiagramModelContainer(diagramModelZentaObject);
				if (result == null) result = caseDiagramModelComponent(diagramModelZentaObject);
				if (result == null) result = caseFontAttribute(diagramModelZentaObject);
				if (result == null) result = caseIdentifier(diagramModelZentaObject);
				if (result == null) result = caseCloneable(diagramModelZentaObject);
				if (result == null) result = caseAdapter(diagramModelZentaObject);
				if (result == null) result = caseNameable(diagramModelZentaObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION: {
				IDiagramModelZentaConnection diagramModelZentaConnection = (IDiagramModelZentaConnection)theEObject;
				T result = caseDiagramModelZentaConnection(diagramModelZentaConnection);
				if (result == null) result = caseDiagramModelConnection(diagramModelZentaConnection);
				if (result == null) result = caseDiagramModelComponent(diagramModelZentaConnection);
				if (result == null) result = caseFontAttribute(diagramModelZentaConnection);
				if (result == null) result = caseProperties(diagramModelZentaConnection);
				if (result == null) result = caseDocumentable(diagramModelZentaConnection);
				if (result == null) result = caseIdentifier(diagramModelZentaConnection);
				if (result == null) result = caseCloneable(diagramModelZentaConnection);
				if (result == null) result = caseAdapter(diagramModelZentaConnection);
				if (result == null) result = caseNameable(diagramModelZentaConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.SKETCH_MODEL: {
				ISketchModel sketchModel = (ISketchModel)theEObject;
				T result = caseSketchModel(sketchModel);
				if (result == null) result = caseDiagramModel(sketchModel);
				if (result == null) result = caseZentaModelElement(sketchModel);
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
			case IZentaPackage.SKETCH_MODEL_STICKY: {
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
			case IZentaPackage.SKETCH_MODEL_ACTOR: {
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
			case IZentaPackage.DIAGRAM_MODEL: {
				IDiagramModel diagramModel = (IDiagramModel)theEObject;
				T result = caseDiagramModel(diagramModel);
				if (result == null) result = caseZentaModelElement(diagramModel);
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
			case IZentaPackage.ZENTA_MODEL: {
				IZentaModel zentaModel = (IZentaModel)theEObject;
				T result = caseZentaModel(zentaModel);
				if (result == null) result = caseFolderContainer(zentaModel);
				if (result == null) result = caseIdentifier(zentaModel);
				if (result == null) result = caseZentaModelElement(zentaModel);
				if (result == null) result = caseProperties(zentaModel);
				if (result == null) result = caseDocumentable(zentaModel);
				if (result == null) result = caseNameable(zentaModel);
				if (result == null) result = caseAdapter(zentaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.METAMODEL: {
				IMetamodel metamodel = (IMetamodel)theEObject;
				T result = caseMetamodel(metamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.TEMPLATE: {
				ITemplate template = (ITemplate)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.BASIC_OBJECT: {
				IBasicObject basicObject = (IBasicObject)theEObject;
				T result = caseBasicObject(basicObject);
				if (result == null) result = caseZentaElement(basicObject);
				if (result == null) result = caseZentaModelElement(basicObject);
				if (result == null) result = caseIdentifier(basicObject);
				if (result == null) result = caseCloneable(basicObject);
				if (result == null) result = caseDocumentable(basicObject);
				if (result == null) result = caseProperties(basicObject);
				if (result == null) result = caseAdapter(basicObject);
				if (result == null) result = caseNameable(basicObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.BASIC_RELATIONSHIP: {
				IBasicRelationship basicRelationship = (IBasicRelationship)theEObject;
				T result = caseBasicRelationship(basicRelationship);
				if (result == null) result = caseBasicObject(basicRelationship);
				if (result == null) result = caseZentaElement(basicRelationship);
				if (result == null) result = caseZentaModelElement(basicRelationship);
				if (result == null) result = caseIdentifier(basicRelationship);
				if (result == null) result = caseCloneable(basicRelationship);
				if (result == null) result = caseDocumentable(basicRelationship);
				if (result == null) result = caseProperties(basicRelationship);
				if (result == null) result = caseAdapter(basicRelationship);
				if (result == null) result = caseNameable(basicRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IZentaPackage.ATTRIBUTE: {
				IAttribute attribute = (IAttribute)theEObject;
				T result = caseAttribute(attribute);
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
	public T caseZentaModel(IZentaModel object) {
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
	public T caseZentaModelElement(IZentaModelElement object) {
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
	public T caseZentaElement(IZentaElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Basic Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicRelationship(IBasicRelationship object) {
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
	public T caseZentaDiagramModel(IZentaDiagramModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Zenta Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Zenta Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelZentaObject(IDiagramModelZentaObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Model Zenta Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Model Zenta Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramModelZentaConnection(IDiagramModelZentaConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicObject(IBasicObject object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodel(IMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(ITemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(IAttribute object) {
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

} //ZentaSwitch
