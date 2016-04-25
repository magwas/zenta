package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.rulez.magwas.zenta.model.IAndJunction;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IJunction;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IOrJunction;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.handmade.Attribute;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.impl.BasicRelationshipBase;
import org.rulez.magwas.zenta.model.impl.BoundsBase;
import org.rulez.magwas.zenta.model.impl.ZentaFactoryBase;
import org.rulez.magwas.zenta.model.impl.ZentaModelBase;
import org.rulez.magwas.zenta.model.manager.IEditorModelInterface;
import org.rulez.magwas.zenta.model.util.LogUtil;

public class ZentaFactory extends ZentaFactoryBase implements IZentaFactory {

	private static HashMap<IZentaModel,IMetamodel> registry = new HashMap<IZentaModel,IMetamodel>();
	
    private List<String> fUsedIDs = new ArrayList<String>();

    @Override
    public void registerID(String id) {
        if(!fUsedIDs.contains(id)) {
            fUsedIDs.add(id); 
        }
    }
    
    @Override
    public String getNewID() {
        String id;
        do {
            id = UUID.randomUUID().toString();
        }
        while(fUsedIDs.contains(id));
        
        registerID(id); 
        
        return id;
    }

	public static IZentaFactory init() {
		try {
			Registry packageRegistry = EPackage.Registry.INSTANCE;
			IZentaFactory theMetamodelFactory = (IZentaFactory)packageRegistry.getEFactory("http://magwas.rulez.org/zenta/metamodel"); 
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		}
		catch (Exception exception) {
			LogUtil.logException(exception);
		}
		return new ZentaFactory();
	}

	private IEditorModelInterface editorInterface;

	public ZentaFactory() {
		super();
	}

	@Override
	public IMetamodel getMetamodelFor(IZentaModel zentaModel) {
		IMetamodel mm = findMetamodelFor(zentaModel);
		if(null == mm)
			mm = new Metamodel(zentaModel);
		registry.put(zentaModel, mm);
		return mm;
	}
	
	@Override
	public IMetamodel getMetamodelFor(IZentaModelElement modelElement) {
		IZentaModel model = modelElement.getZentaModel();
		IZentaModel m = Util.verifyNonNull(model);
		return getMetamodelFor(m);
	}

	@Override
	
	public IMetamodel findMetamodelFor(IZentaModel model2) {
		return registry.get(model2);
	}

	@Override
	public ITemplate createTemplate(IZentaDiagramModel reference, IMetamodel metamodel) {
		Template template = new Template(reference, metamodel);
		return template;
	}


	@Override
	public IAttribute createAttribute() {
		Attribute attribute = new Attribute();
		return attribute;
	}
	
	@Override
	public IAttribute createAttribute(IBasicRelationship relationClass, IBasicObject obj2, Direction dir) {
		Attribute attribute = new Attribute(relationClass, obj2,dir);
		return attribute;
	}



	@Override
	public IFolder createFolder() {
		Folder folder = new Folder();
		folder.initId();
		return folder;
	}

	@Override
	public String getDefiningName(IIdentifier ref) {
		IProperty prop = getObjectClassProperty((IProperties) ref);
		if(null != prop)
			return Util.verifyNonNull(prop.getValue());
		return Util.verifyNonNull(ref.getName());
	}
		private  IProperty getObjectClassProperty(IProperties ref) {
			for(IProperty prop: ref.getProperties())
				if("className".equals(prop.getKey()))
						return prop;
			return null;
		}

	@Override
	public IMetamodel createMetamodel() {
		throw new AssertionError();
	}

	@Override
	public void setEditorInterface(IEditorModelInterface iface) {
		this.editorInterface = iface;
	}

	@Override
	public IEditorModelInterface getEditorInterface() {
		return this.editorInterface;
	}

	@Override
    public IZentaModel createZentaModel() {
		ZentaModelBase zentaModel = new ZentaModel();
		return zentaModel;
	}

	@Override
    public IBasicObject createBasicObject() {
    	ObjectClass objectClass = new ObjectClass();
    	objectClass.initId();
		return objectClass;
	}

	@Override
	public IBasicRelationship createBasicRelationship() {
		BasicRelationshipBase basicRelationship = new RelationClass();
		basicRelationship.initId();
		return basicRelationship;
	}

	@Override
	public IZentaDiagramModel createZentaDiagramModel() {
		ZentaDiagramModel zentaDiagramModel = new ZentaDiagramModel();
		zentaDiagramModel.initId();
		return zentaDiagramModel;
	}

	@Override
	public IBounds createBounds(int x, int y, int width, int height) {
        BoundsBase bounds = new BoundsBase();
        bounds.setX(x);
        bounds.setY(y);
        bounds.setWidth(width);
        bounds.setHeight(height);
        return bounds;
    }
    @Override
    public ISketchModel createSketchModel() {
		SketchModel sketchModel = new SketchModel();
		sketchModel.initId();
		return sketchModel;    	
    }

    @Override
    public IJunction createJunction() {
    	return new Junction();
    }

    @Override
    public IAndJunction createAndJunction() {
    	AndJunction andJunction = new AndJunction();
    	andJunction.initId();
		return andJunction;
    }

    @Override
    public IOrJunction createOrJunction() {
    	OrJunction orJunction = new OrJunction();
    	orJunction.initId();
		return orJunction;
    }
    
    @Override
    public IDiagramModelReference createDiagramModelReference() {
    	DiagramModelReference diagramModelReference = new DiagramModelReference();
    	diagramModelReference.initId();
		return diagramModelReference;
    }

    @Override
    public IDiagramModelZentaObject createDiagramModelZentaObject() {
    	IDiagramModelZentaObject diagramModelZentaObject = new DiagramModelZentaObject();
    	diagramModelZentaObject.initId();
		return diagramModelZentaObject;
    }

    @Override
    public IDiagramModelZentaConnection createDiagramModelZentaConnection() {
    	IDiagramModelZentaConnection diagramModelZentaConnection = new DiagramModelZentaConnection();
    	diagramModelZentaConnection.initId();
		return diagramModelZentaConnection;
    }
}
