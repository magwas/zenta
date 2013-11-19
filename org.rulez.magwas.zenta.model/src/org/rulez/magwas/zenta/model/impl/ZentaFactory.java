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
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rulez.magwas.zenta.model.FolderType;
import org.rulez.magwas.zenta.model.IAndJunction;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IAssociationRelationship;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IBusinessObject;
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
import org.rulez.magwas.zenta.model.IOrJunction;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.ISketchModelActor;
import org.rulez.magwas.zenta.model.ISketchModelSticky;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZentaFactory extends EFactoryImpl implements IZentaFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static IZentaFactory init() {
		try {
			IZentaFactory theZentaFactory = (IZentaFactory)EPackage.Registry.INSTANCE.getEFactory("http://magwas.rulez.org/zenta"); //$NON-NLS-1$ 
			if (theZentaFactory != null) {
				return theZentaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZentaFactory();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ZentaFactory() {
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
			case IZentaPackage.ZENTA_MODEL: return createZentaModel();
			case IZentaPackage.FOLDER: return createFolder();
			case IZentaPackage.JUNCTION: return createJunction();
			case IZentaPackage.AND_JUNCTION: return createAndJunction();
			case IZentaPackage.OR_JUNCTION: return createOrJunction();
			case IZentaPackage.ASSOCIATION_RELATIONSHIP: return createAssociationRelationship();
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
			case IZentaPackage.BUSINESS_OBJECT: return createBusinessObject();
			case IZentaPackage.SKETCH_MODEL: return createSketchModel();
			case IZentaPackage.SKETCH_MODEL_STICKY: return createSketchModelSticky();
			case IZentaPackage.SKETCH_MODEL_ACTOR: return createSketchModelActor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			case IZentaPackage.FOLDER_TYPE:
				return createFolderTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			case IZentaPackage.FOLDER_TYPE:
				return convertFolderTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IProperty createProperty() {
		Property property = new Property();
		return property;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IZentaModel createZentaModel() {
		ZentaModel zentaModel = new ZentaModel();
		return zentaModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IFolder createFolder() {
		Folder folder = new Folder();
		return folder;
	}
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessObject createBusinessObject() {
		BusinessObject businessObject = new BusinessObject();
		return businessObject;
	}


    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IZentaDiagramModel createZentaDiagramModel() {
		ZentaDiagramModel zentaDiagramModel = new ZentaDiagramModel();
		return zentaDiagramModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelReference createDiagramModelReference() {
		DiagramModelReference diagramModelReference = new DiagramModelReference();
		return diagramModelReference;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelZentaObject createDiagramModelZentaObject() {
		DiagramModelZentaObject diagramModelZentaObject = new DiagramModelZentaObject();
		return diagramModelZentaObject;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelGroup createDiagramModelGroup() {
		DiagramModelGroup diagramModelGroup = new DiagramModelGroup();
		return diagramModelGroup;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelNote createDiagramModelNote() {
		DiagramModelNote diagramModelNote = new DiagramModelNote();
		return diagramModelNote;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelImage createDiagramModelImage() {
		DiagramModelImage diagramModelImage = new DiagramModelImage();
		return diagramModelImage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelConnection createDiagramModelConnection() {
		DiagramModelConnection diagramModelConnection = new DiagramModelConnection();
		return diagramModelConnection;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelZentaConnection createDiagramModelZentaConnection() {
		DiagramModelZentaConnection diagramModelZentaConnection = new DiagramModelZentaConnection();
		return diagramModelZentaConnection;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelBendpoint createDiagramModelBendpoint() {
		DiagramModelBendpoint diagramModelBendpoint = new DiagramModelBendpoint();
		return diagramModelBendpoint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBounds createBounds() {
		Bounds bounds = new Bounds();
		return bounds;
	}
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModel createSketchModel() {
		SketchModel sketchModel = new SketchModel();
		return sketchModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModelSticky createSketchModelSticky() {
		SketchModelSticky sketchModelSticky = new SketchModelSticky();
		return sketchModelSticky;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModelActor createSketchModelActor() {
		SketchModelActor sketchModelActor = new SketchModelActor();
		return sketchModelActor;
	}

    public IBounds createBounds(int x, int y, int width, int height) {
        Bounds bounds = new Bounds();
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
    public FolderType createFolderTypeFromString(EDataType eDataType, String initialValue) {
		FolderType result = FolderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertFolderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IJunction createJunction() {
		Junction junction = new Junction();
		return junction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IAndJunction createAndJunction() {
		AndJunction andJunction = new AndJunction();
		return andJunction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IOrJunction createOrJunction() {
		OrJunction orJunction = new OrJunction();
		return orJunction;
	}

 
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IAssociationRelationship createAssociationRelationship() {
		AssociationRelationship associationRelationship = new AssociationRelationship();
		return associationRelationship;
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
