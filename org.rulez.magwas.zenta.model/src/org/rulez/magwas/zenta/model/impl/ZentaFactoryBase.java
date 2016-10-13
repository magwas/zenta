/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.rulez.magwas.zenta.model.IAndJunction;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelBendpoint;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IJunction;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IOrJunction;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.ISketchModelActor;
import org.rulez.magwas.zenta.model.ISketchModelSticky;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.handmade.ObjectClass;
import org.rulez.magwas.zenta.model.handmade.ZentaFactory;
import org.rulez.magwas.zenta.model.util.LogUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 */
abstract public class ZentaFactoryBase extends EFactoryImpl implements IZentaFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    public static IZentaFactory init() {
		try {
			IZentaFactory theZentaFactory = (IZentaFactory)EPackage.Registry.INSTANCE.getEFactory(IZentaPackage.eNS_URI);
			if (theZentaFactory != null) {
				return theZentaFactory;
			}
		}
		catch (Exception exception) {
			LogUtil.logException(exception);
		}
		return new ZentaFactory();
	}
    
    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ZentaFactoryBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    
	@Override
    
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IZentaPackage.PROPERTY: return (EObject)createProperty();
			case IZentaPackage.FOLDER: return (EObject)createFolder();
			case IZentaPackage.JUNCTION: return (EObject)createJunction();
			case IZentaPackage.AND_JUNCTION: return (EObject)createAndJunction();
			case IZentaPackage.OR_JUNCTION: return (EObject)createOrJunction();
			case IZentaPackage.DIAGRAM_MODEL_REFERENCE: return (EObject)createDiagramModelReference();
			case IZentaPackage.DIAGRAM_MODEL_IMAGE: return (EObject)createDiagramModelImage();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION: return (EObject)createDiagramModelConnection();
			case IZentaPackage.DIAGRAM_MODEL_BENDPOINT: return (EObject)createDiagramModelBendpoint();
			case IZentaPackage.BOUNDS: return (EObject)createBounds();
			case IZentaPackage.ZENTA_DIAGRAM_MODEL: return (EObject)createZentaDiagramModel();
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT: return (EObject)createDiagramModelZentaObject();
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION: return (EObject)createDiagramModelZentaConnection();
			case IZentaPackage.SKETCH_MODEL: return (EObject)createSketchModel();
			case IZentaPackage.SKETCH_MODEL_STICKY: return (EObject)createSketchModelSticky();
			case IZentaPackage.SKETCH_MODEL_ACTOR: return (EObject)createSketchModelActor();
			case IZentaPackage.ZENTA_MODEL: return (EObject)createZentaModel();
			case IZentaPackage.METAMODEL: return (EObject)createMetamodel();
			case IZentaPackage.TEMPLATE: return (EObject)createTemplate();
			case IZentaPackage.BASIC_OBJECT: return (EObject)createBasicObject();
			case IZentaPackage.BASIC_RELATIONSHIP: return (EObject)createBasicRelationship();
			case IZentaPackage.ATTRIBUTE: return (EObject)createAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IProperty createProperty() {
		PropertyBase property = new PropertyBase();
		return property;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IZentaModel createZentaModel() {
		ZentaModelBase zentaModel = new ZentaModelBase();
		return zentaModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IFolder createFolder() {
		FolderBase folder = new FolderBase();
		return folder;
	}
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBasicObject createBasicObject() {
    	ObjectClass objectClass = new ObjectClass();
		return objectClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
     public IZentaDiagramModel createZentaDiagramModel() {
		ZentaDiagramModelBase zentaDiagramModel = new ZentaDiagramModelBase();
		return zentaDiagramModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelReference createDiagramModelReference() {
		DiagramModelReferenceBase diagramModelReference = new DiagramModelReferenceBase();
		return diagramModelReference;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelZentaObject createDiagramModelZentaObject() {
		DiagramModelZentaObjectBase diagramModelZentaObject = new DiagramModelZentaObjectBase();
		return diagramModelZentaObject;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelImage createDiagramModelImage() {
		DiagramModelImageBase diagramModelImage = new DiagramModelImageBase();
		return diagramModelImage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelConnection createDiagramModelConnection() {
		DiagramModelConnectionBase diagramModelConnection = new DiagramModelConnectionBase();
		return diagramModelConnection;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelZentaConnection createDiagramModelZentaConnection() {
		DiagramModelZentaConnectionBase diagramModelZentaConnection = new DiagramModelZentaConnectionBase();
		return diagramModelZentaConnection;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelBendpoint createDiagramModelBendpoint() {
		DiagramModelBendpointBase diagramModelBendpoint = new DiagramModelBendpointBase();
		return diagramModelBendpoint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBounds createBounds() {
		BoundsBase bounds = new BoundsBase();
		return bounds;
	}
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModel createSketchModel() {
		SketchModelBase sketchModel = new SketchModelBase();
		return sketchModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModelSticky createSketchModelSticky() {
		SketchModelStickyBase sketchModelSticky = new SketchModelStickyBase();
		return sketchModelSticky;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModelActor createSketchModelActor() {
		SketchModelActorBase sketchModelActor = new SketchModelActorBase();
		return sketchModelActor;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IMetamodel createMetamodel() {
		throw new RuntimeException("should not be called");
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ITemplate createTemplate() {
		throw new RuntimeException("should not be called");
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IObjectClass createObjectClass() {
		throw new RuntimeException("should not be called");
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IAttribute createAttribute() {
		throw new RuntimeException("should not be called");
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IBasicRelationship createRelationClass() {
		throw new RuntimeException("should not be called");
	}


    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IJunction createJunction() {
		JunctionBase junction = new JunctionBase();
		return junction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IAndJunction createAndJunction() {
		AndJunctionBase andJunction = new AndJunctionBase();
		return andJunction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IOrJunction createOrJunction() {
		OrJunctionBase orJunction = new OrJunctionBase();
		return orJunction;
	}

 
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IZentaPackage getZentaPackage() {
		return (IZentaPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static IZentaPackage getPackage() {
		return IZentaPackage.eINSTANCE;
	}

} //ZentaFactory
