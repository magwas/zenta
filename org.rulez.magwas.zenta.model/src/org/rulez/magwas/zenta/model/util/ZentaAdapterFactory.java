/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
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
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IDiagramModelImageProvider;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.model.IZentaPackage
 * @generated
 */
public class ZentaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IZentaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZentaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IZentaPackage.eINSTANCE;
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
	protected ZentaSwitch<Adapter> modelSwitch =
		new ZentaSwitch<Adapter>() {
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
			public Adapter caseZentaModelElement(IZentaModelElement object) {
				return createZentaModelElementAdapter();
			}
			@Override
			public Adapter caseFolder(IFolder object) {
				return createFolderAdapter();
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
			public Adapter caseDiagramModelComponent(IDiagramModelComponent object) {
				return createDiagramModelComponentAdapter();
			}
			@Override
			public Adapter caseDiagramModelContainer(IDiagramModelContainer object) {
				return createDiagramModelContainerAdapter();
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
			public Adapter caseZentaDiagramModel(IZentaDiagramModel object) {
				return createZentaDiagramModelAdapter();
			}
			@Override
			public Adapter caseDiagramModelZentaObject(IDiagramModelZentaObject object) {
				return createDiagramModelZentaObjectAdapter();
			}
			@Override
			public Adapter caseDiagramModelZentaConnection(IDiagramModelZentaConnection object) {
				return createDiagramModelZentaConnectionAdapter();
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
			public Adapter caseDiagramModel(IDiagramModel object) {
				return createDiagramModelAdapter();
			}
			@Override
			public Adapter caseZentaModel(IZentaModel object) {
				return createZentaModelAdapter();
			}
			@Override
			public Adapter caseMetamodel(IMetamodel object) {
				return createMetamodelAdapter();
			}
			@Override
			public Adapter caseTemplate(ITemplate object) {
				return createTemplateAdapter();
			}
			@Override
			public Adapter caseZentaElement(IZentaElement object) {
				return createZentaElementAdapter();
			}
			@Override
			public Adapter caseBasicObject(IBasicObject object) {
				return createBasicObjectAdapter();
			}
			@Override
			public Adapter caseBasicRelationship(IBasicRelationship object) {
				return createBasicRelationshipAdapter();
			}
			@Override
			public Adapter caseAttribute(IAttribute object) {
				return createAttributeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IAdapter
	 * @generated
	 */
	public Adapter createAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IIdentifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IProperty
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IProperties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.INameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.INameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.ITextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.ITextContent
	 * @generated
	 */
	public Adapter createTextContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDocumentable <em>Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDocumentable
	 * @generated
	 */
	public Adapter createDocumentableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.ICloneable <em>Cloneable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.ICloneable
	 * @generated
	 */
	public Adapter createCloneableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IFolderContainer <em>Folder Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IFolderContainer
	 * @generated
	 */
	public Adapter createFolderContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IZentaModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IZentaModel
	 * @generated
	 */
	public Adapter createZentaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IZentaModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IZentaModelElement
	 * @generated
	 */
	public Adapter createZentaModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IFolder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IZentaElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IZentaElement
	 * @generated
	 */
	public Adapter createZentaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IJunctionElement <em>Junction Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IJunctionElement
	 * @generated
	 */
	public Adapter createJunctionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IInterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IInterfaceElement
	 * @generated
	 */
	public Adapter createInterfaceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IJunction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IJunction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IAndJunction <em>And Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IAndJunction
	 * @generated
	 */
	public Adapter createAndJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IOrJunction <em>Or Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IOrJunction
	 * @generated
	 */
	public Adapter createOrJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IBasicRelationship <em>Basic Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IBasicRelationship
	 * @generated
	 */
	public Adapter createBasicRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelComponent <em>Diagram Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelComponent
	 * @generated
	 */
	public Adapter createDiagramModelComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelContainer <em>Diagram Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelContainer
	 * @generated
	 */
	public Adapter createDiagramModelContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModel
	 * @generated
	 */
	public Adapter createDiagramModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelReference <em>Diagram Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelReference
	 * @generated
	 */
	public Adapter createDiagramModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelObject <em>Diagram Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelObject
	 * @generated
	 */
	public Adapter createDiagramModelObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelGroup <em>Diagram Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelGroup
	 * @generated
	 */
	public Adapter createDiagramModelGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelNote <em>Diagram Model Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelNote
	 * @generated
	 */
	public Adapter createDiagramModelNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelImage <em>Diagram Model Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelImage
	 * @generated
	 */
	public Adapter createDiagramModelImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelConnection <em>Diagram Model Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelConnection
	 * @generated
	 */
	public Adapter createDiagramModelConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelBendpoint <em>Diagram Model Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelBendpoint
	 * @generated
	 */
	public Adapter createDiagramModelBendpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IFontAttribute <em>Font Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IFontAttribute
	 * @generated
	 */
	public Adapter createFontAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IBorderObject <em>Border Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IBorderObject
	 * @generated
	 */
	public Adapter createBorderObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelImageProvider <em>Diagram Model Image Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelImageProvider
	 * @generated
	 */
	public Adapter createDiagramModelImageProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IBounds
	 * @generated
	 */
	public Adapter createBoundsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.ILockable <em>Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.ILockable
	 * @generated
	 */
	public Adapter createLockableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IZentaDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IZentaDiagramModel
	 * @generated
	 */
	public Adapter createZentaDiagramModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject <em>Diagram Model Zenta Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaObject
	 * @generated
	 */
	public Adapter createDiagramModelZentaObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaConnection <em>Diagram Model Zenta Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaConnection
	 * @generated
	 */
	public Adapter createDiagramModelZentaConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IBasicObject <em>Basic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IBasicObject
	 * @generated
	 */
	public Adapter createBasicObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.ISketchModel <em>Sketch Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.ISketchModel
	 * @generated
	 */
	public Adapter createSketchModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.ISketchModelSticky <em>Sketch Model Sticky</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.ISketchModelSticky
	 * @generated
	 */
	public Adapter createSketchModelStickyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.ISketchModelActor <em>Sketch Model Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.ISketchModelActor
	 * @generated
	 */
	public Adapter createSketchModelActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IMetamodel
	 * @generated
	 */
	public Adapter createMetamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.ITemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.ITemplate
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.model.IAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.model.IAttribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
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

} //ZentaAdapterFactory
