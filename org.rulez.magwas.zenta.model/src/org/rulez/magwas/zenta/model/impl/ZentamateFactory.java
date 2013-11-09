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
import org.rulez.magwas.zenta.model.IAggregationRelationship;
import org.rulez.magwas.zenta.model.IAndJunction;
import org.rulez.magwas.zenta.model.IZentamateDiagramModel;
import org.rulez.magwas.zenta.model.IZentamateFactory;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IAssociationRelationship;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IBusinessObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
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
import org.rulez.magwas.zenta.model.ISpecialisationRelationship;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZentamateFactory extends EFactoryImpl implements IZentamateFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static IZentamateFactory init() {
		try {
			IZentamateFactory theZentamateFactory = (IZentamateFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bolton.ac.uk/archimate"); //$NON-NLS-1$ 
			if (theZentamateFactory != null) {
				return theZentamateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZentamateFactory();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ZentamateFactory() {
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
			case IZentamatePackage.PROPERTY: return createProperty();
			case IZentamatePackage.ARCHIMATE_MODEL: return createZentamateModel();
			case IZentamatePackage.FOLDER: return createFolder();
			case IZentamatePackage.JUNCTION: return createJunction();
			case IZentamatePackage.AND_JUNCTION: return createAndJunction();
			case IZentamatePackage.OR_JUNCTION: return createOrJunction();
			case IZentamatePackage.ASSOCIATION_RELATIONSHIP: return createAssociationRelationship();
			case IZentamatePackage.SPECIALISATION_RELATIONSHIP: return createSpecialisationRelationship();
			case IZentamatePackage.DIAGRAM_MODEL_REFERENCE: return createDiagramModelReference();
			case IZentamatePackage.DIAGRAM_MODEL_GROUP: return createDiagramModelGroup();
			case IZentamatePackage.DIAGRAM_MODEL_NOTE: return createDiagramModelNote();
			case IZentamatePackage.DIAGRAM_MODEL_IMAGE: return createDiagramModelImage();
			case IZentamatePackage.DIAGRAM_MODEL_CONNECTION: return createDiagramModelConnection();
			case IZentamatePackage.DIAGRAM_MODEL_BENDPOINT: return createDiagramModelBendpoint();
			case IZentamatePackage.BOUNDS: return createBounds();
			case IZentamatePackage.ARCHIMATE_DIAGRAM_MODEL: return createZentamateDiagramModel();
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT: return createDiagramModelZentamateObject();
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION: return createDiagramModelZentamateConnection();
			case IZentamatePackage.BUSINESS_OBJECT: return createBusinessObject();
			case IZentamatePackage.SKETCH_MODEL: return createSketchModel();
			case IZentamatePackage.SKETCH_MODEL_STICKY: return createSketchModelSticky();
			case IZentamatePackage.SKETCH_MODEL_ACTOR: return createSketchModelActor();
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
			case IZentamatePackage.FOLDER_TYPE:
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
			case IZentamatePackage.FOLDER_TYPE:
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
    public IZentamateModel createZentamateModel() {
		ZentamateModel archimateModel = new ZentamateModel();
		return archimateModel;
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
    public IZentamateDiagramModel createZentamateDiagramModel() {
		ZentamateDiagramModel archimateDiagramModel = new ZentamateDiagramModel();
		return archimateDiagramModel;
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
    public IDiagramModelZentamateObject createDiagramModelZentamateObject() {
		DiagramModelZentamateObject diagramModelZentamateObject = new DiagramModelZentamateObject();
		return diagramModelZentamateObject;
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
    public IDiagramModelZentamateConnection createDiagramModelZentamateConnection() {
		DiagramModelZentamateConnection diagramModelZentamateConnection = new DiagramModelZentamateConnection();
		return diagramModelZentamateConnection;
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
    public ISpecialisationRelationship createSpecialisationRelationship() {
		SpecialisationRelationship specialisationRelationship = new SpecialisationRelationship();
		return specialisationRelationship;
	}


    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IZentamatePackage getZentamatePackage() {
		return (IZentamatePackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static IZentamatePackage getPackage() {
		return IZentamatePackage.eINSTANCE;
	}

} //ZentamateFactory
