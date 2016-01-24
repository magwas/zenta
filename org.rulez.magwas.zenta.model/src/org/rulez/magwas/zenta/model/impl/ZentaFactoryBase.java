/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
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
import org.rulez.magwas.zenta.model.handmade.RelationClass;
import org.rulez.magwas.zenta.model.handmade.ZentaFactory;


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
			logException(exception);
		}
		return new ZentaFactory();
	}
	public static void logException(Exception exception) {
		EcorePlugin.INSTANCE.log(exception);
		StringWriter sw = new StringWriter();
		exception.printStackTrace(new PrintWriter(sw));
		String stacktrace = sw.toString();
		EcorePlugin.INSTANCE.log(stacktrace);
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
			case IZentaPackage.PROPERTY: return createProperty();
			case IZentaPackage.FOLDER: return createFolder();
			case IZentaPackage.JUNCTION: return createJunction();
			case IZentaPackage.AND_JUNCTION: return createAndJunction();
			case IZentaPackage.OR_JUNCTION: return createOrJunction();
			case IZentaPackage.DIAGRAM_MODEL_REFERENCE: return createDiagramModelReference();
			case IZentaPackage.DIAGRAM_MODEL_GROUP: return createDiagramModelGroup();
			case IZentaPackage.DIAGRAM_MODEL_NOTE: return createDiagramModelNote();
			case IZentaPackage.DIAGRAM_MODEL_IMAGE: return createDiagramModelImage();
			case IZentaPackage.DIAGRAM_MODEL_CONNECTION: return createDiagramModelConnection();
			case IZentaPackage.DIAGRAM_MODEL_BENDPOINT: return createDiagramModelBendpoint();
			case IZentaPackage.BOUNDS: return createBounds();
			case IZentaPackage.ZENTA_DIAGRAM_MODEL: return createZentaDiagramModel();
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT: return createDiagramModelZentaObject();
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION: return createDiagramModelZentaConnection();
			case IZentaPackage.SKETCH_MODEL: return createSketchModel();
			case IZentaPackage.SKETCH_MODEL_STICKY: return createSketchModelSticky();
			case IZentaPackage.SKETCH_MODEL_ACTOR: return createSketchModelActor();
			case IZentaPackage.ZENTA_MODEL: return createZentaModel();
			case IZentaPackage.METAMODEL: return createMetamodel();
			case IZentaPackage.TEMPLATE: return createTemplate();
			case IZentaPackage.BASIC_OBJECT: return createBasicObject();
			case IZentaPackage.BASIC_RELATIONSHIP: return createBasicRelationship();
			case IZentaPackage.ATTRIBUTE: return createAttribute();
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
	 * @generated NOT
	 */
    public IBasicObject createBasicObject() {
    	return new ObjectClass();
	}


    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
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
    public IDiagramModelGroup createDiagramModelGroup() {
		DiagramModelGroupBase diagramModelGroup = new DiagramModelGroupBase();
		return diagramModelGroup;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelNote createDiagramModelNote() {
		DiagramModelNoteBase diagramModelNote = new DiagramModelNoteBase();
		return diagramModelNote;
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

				public IBounds createBounds(int x, int y, int width, int height) {
        BoundsBase bounds = new BoundsBase();
        bounds.setX(x);
        bounds.setY(y);
        bounds.setWidth(width);
        bounds.setHeight(height);
        return bounds;
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
	 * @generated NOT
	 */
    
	public IBasicRelationship createBasicRelationship() {
		BasicRelationshipBase basicRelationship = new RelationClass();
		return basicRelationship;
	}

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
