/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.bolton.archimate.model.IAdapter;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.bolton.archimate.model.IArchimatePackage
 * @generated
 */
public class ArchimateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IArchimatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchimateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IArchimatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchimateSwitch<Adapter> modelSwitch =
		new ArchimateSwitch<Adapter>() {
			@Override
			public Adapter caseAdapter(IAdapter object) {
				return createAdapterAdapter();
			}
			@Override
			public Adapter caseIdentifier(IIdentifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseProperty(IProperty object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseProperties(IProperties object) {
				return createPropertiesAdapter();
			}
			@Override
			public Adapter caseNameable(INameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter caseTextContent(ITextContent object) {
				return createTextContentAdapter();
			}
			@Override
			public Adapter caseDocumentable(IDocumentable object) {
				return createDocumentableAdapter();
			}
			@Override
			public Adapter caseCloneable(ICloneable object) {
				return createCloneableAdapter();
			}
			@Override
			public Adapter caseFolderContainer(IFolderContainer object) {
				return createFolderContainerAdapter();
			}
			@Override
			public Adapter caseArchimateModel(IArchimateModel object) {
				return createArchimateModelAdapter();
			}
			@Override
			public Adapter caseArchimateModelElement(IArchimateModelElement object) {
				return createArchimateModelElementAdapter();
			}
			@Override
			public Adapter caseFolder(IFolder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseArchimateElement(IArchimateElement object) {
				return createArchimateElementAdapter();
			}
			@Override
			public Adapter caseJunctionElement(IJunctionElement object) {
				return createJunctionElementAdapter();
			}
			@Override
			public Adapter caseInterfaceElement(IInterfaceElement object) {
				return createInterfaceElementAdapter();
			}
			@Override
			public Adapter caseJunction(IJunction object) {
				return createJunctionAdapter();
			}
			@Override
			public Adapter caseAndJunction(IAndJunction object) {
				return createAndJunctionAdapter();
			}
			@Override
			public Adapter caseOrJunction(IOrJunction object) {
				return createOrJunctionAdapter();
			}
			@Override
			public Adapter caseRelationship(IRelationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseAssociationRelationship(IAssociationRelationship object) {
				return createAssociationRelationshipAdapter();
			}
			@Override
			public Adapter caseSpecialisationRelationship(ISpecialisationRelationship object) {
				return createSpecialisationRelationshipAdapter();
			}
			@Override
			public Adapter caseBusinessLayerElement(IBusinessLayerElement object) {
				return createBusinessLayerElementAdapter();
			}
			@Override
			public Adapter caseDiagramModelComponent(IDiagramModelComponent object) {
				return createDiagramModelComponentAdapter();
			}
			@Override
			public Adapter caseDiagramModelContainer(IDiagramModelContainer object) {
				return createDiagramModelContainerAdapter();
			}
			@Override
			public Adapter caseDiagramModel(IDiagramModel object) {
				return createDiagramModelAdapter();
			}
			@Override
			public Adapter caseDiagramModelReference(IDiagramModelReference object) {
				return createDiagramModelReferenceAdapter();
			}
			@Override
			public Adapter caseDiagramModelObject(IDiagramModelObject object) {
				return createDiagramModelObjectAdapter();
			}
			@Override
			public Adapter caseDiagramModelGroup(IDiagramModelGroup object) {
				return createDiagramModelGroupAdapter();
			}
			@Override
			public Adapter caseDiagramModelNote(IDiagramModelNote object) {
				return createDiagramModelNoteAdapter();
			}
			@Override
			public Adapter caseDiagramModelImage(IDiagramModelImage object) {
				return createDiagramModelImageAdapter();
			}
			@Override
			public Adapter caseDiagramModelConnection(IDiagramModelConnection object) {
				return createDiagramModelConnectionAdapter();
			}
			@Override
			public Adapter caseDiagramModelBendpoint(IDiagramModelBendpoint object) {
				return createDiagramModelBendpointAdapter();
			}
			@Override
			public Adapter caseFontAttribute(IFontAttribute object) {
				return createFontAttributeAdapter();
			}
			@Override
			public Adapter caseBorderObject(IBorderObject object) {
				return createBorderObjectAdapter();
			}
			@Override
			public Adapter caseDiagramModelImageProvider(IDiagramModelImageProvider object) {
				return createDiagramModelImageProviderAdapter();
			}
			@Override
			public Adapter caseBounds(IBounds object) {
				return createBoundsAdapter();
			}
			@Override
			public Adapter caseLockable(ILockable object) {
				return createLockableAdapter();
			}
			@Override
			public Adapter caseArchimateDiagramModel(IArchimateDiagramModel object) {
				return createArchimateDiagramModelAdapter();
			}
			@Override
			public Adapter caseDiagramModelArchimateObject(IDiagramModelArchimateObject object) {
				return createDiagramModelArchimateObjectAdapter();
			}
			@Override
			public Adapter caseDiagramModelArchimateConnection(IDiagramModelArchimateConnection object) {
				return createDiagramModelArchimateConnectionAdapter();
			}
			@Override
			public Adapter caseBusinessObject(IBusinessObject object) {
				return createBusinessObjectAdapter();
			}
			@Override
			public Adapter caseSketchModel(ISketchModel object) {
				return createSketchModelAdapter();
			}
			@Override
			public Adapter caseSketchModelSticky(ISketchModelSticky object) {
				return createSketchModelStickyAdapter();
			}
			@Override
			public Adapter caseSketchModelActor(ISketchModelActor object) {
				return createSketchModelActorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IAdapter
	 * @generated
	 */
	public Adapter createAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IIdentifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IProperty
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IProperties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.INameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.INameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.ITextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.ITextContent
	 * @generated
	 */
	public Adapter createTextContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDocumentable <em>Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDocumentable
	 * @generated
	 */
	public Adapter createDocumentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.ICloneable <em>Cloneable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.ICloneable
	 * @generated
	 */
	public Adapter createCloneableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IFolderContainer <em>Folder Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IFolderContainer
	 * @generated
	 */
	public Adapter createFolderContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IArchimateModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IArchimateModel
	 * @generated
	 */
	public Adapter createArchimateModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IArchimateModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IArchimateModelElement
	 * @generated
	 */
	public Adapter createArchimateModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IFolder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IArchimateElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IArchimateElement
	 * @generated
	 */
	public Adapter createArchimateElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IJunctionElement <em>Junction Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IJunctionElement
	 * @generated
	 */
	public Adapter createJunctionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IInterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IInterfaceElement
	 * @generated
	 */
	public Adapter createInterfaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IJunction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IJunction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IAndJunction <em>And Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IAndJunction
	 * @generated
	 */
	public Adapter createAndJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IOrJunction <em>Or Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IOrJunction
	 * @generated
	 */
	public Adapter createOrJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IRelationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IAssociationRelationship <em>Association Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IAssociationRelationship
	 * @generated
	 */
	public Adapter createAssociationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.ISpecialisationRelationship <em>Specialisation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.ISpecialisationRelationship
	 * @generated
	 */
	public Adapter createSpecialisationRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IBusinessLayerElement <em>Business Layer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IBusinessLayerElement
	 * @generated
	 */
	public Adapter createBusinessLayerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelComponent <em>Diagram Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelComponent
	 * @generated
	 */
	public Adapter createDiagramModelComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelContainer <em>Diagram Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelContainer
	 * @generated
	 */
	public Adapter createDiagramModelContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModel
	 * @generated
	 */
	public Adapter createDiagramModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelReference <em>Diagram Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelReference
	 * @generated
	 */
	public Adapter createDiagramModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelObject <em>Diagram Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelObject
	 * @generated
	 */
	public Adapter createDiagramModelObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelGroup <em>Diagram Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelGroup
	 * @generated
	 */
	public Adapter createDiagramModelGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelNote <em>Diagram Model Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelNote
	 * @generated
	 */
	public Adapter createDiagramModelNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelImage <em>Diagram Model Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelImage
	 * @generated
	 */
	public Adapter createDiagramModelImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection <em>Diagram Model Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection
	 * @generated
	 */
	public Adapter createDiagramModelConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelBendpoint <em>Diagram Model Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelBendpoint
	 * @generated
	 */
	public Adapter createDiagramModelBendpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IFontAttribute <em>Font Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IFontAttribute
	 * @generated
	 */
	public Adapter createFontAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IBorderObject <em>Border Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IBorderObject
	 * @generated
	 */
	public Adapter createBorderObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelImageProvider <em>Diagram Model Image Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelImageProvider
	 * @generated
	 */
	public Adapter createDiagramModelImageProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IBounds
	 * @generated
	 */
	public Adapter createBoundsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.ILockable <em>Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.ILockable
	 * @generated
	 */
	public Adapter createLockableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IArchimateDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IArchimateDiagramModel
	 * @generated
	 */
	public Adapter createArchimateDiagramModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelArchimateObject <em>Diagram Model Archimate Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelArchimateObject
	 * @generated
	 */
	public Adapter createDiagramModelArchimateObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection <em>Diagram Model Archimate Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection
	 * @generated
	 */
	public Adapter createDiagramModelArchimateConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.IBusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.IBusinessObject
	 * @generated
	 */
	public Adapter createBusinessObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.ISketchModel <em>Sketch Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.ISketchModel
	 * @generated
	 */
	public Adapter createSketchModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.ISketchModelSticky <em>Sketch Model Sticky</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.ISketchModelSticky
	 * @generated
	 */
	public Adapter createSketchModelStickyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.bolton.archimate.model.ISketchModelActor <em>Sketch Model Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.bolton.archimate.model.ISketchModelActor
	 * @generated
	 */
	public Adapter createSketchModelActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArchimateAdapterFactory
