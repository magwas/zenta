package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;

public class MetamodelFactoryImpl extends EFactoryImpl implements MetamodelFactory {

	public static MetamodelFactory init() {
		try {
			MetamodelFactory theMetamodelFactory = (MetamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://magwas.rulez.org/zenta/metamodel"); 
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	public MetamodelFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetamodelPackage.METAMODEL: return createMetamodel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClass createObjectClass() {
		ObjectClassImpl objectClass = new ObjectClassImpl();
		return objectClass;
	}

	public Template createTemplate(ZentaDiagramModel reference, Metamodel metamodel) {
		TemplateImpl template = new TemplateImpl(reference, metamodel);
		return template;
	}

	public ObjectClass createObjectClass(IZentaElement reference, Template template) {
		ObjectClass candidate = template.getObjectClassReferencingElement(reference);
		if(null != candidate)
			return candidate;
		ObjectClassImpl objectClass = new ObjectClassImpl(reference, template);
		template.getObjectClasses().add(objectClass);
		return objectClass;
	}

	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationClass createRelationClass() {
		RelationClassImpl relationClass = new RelationClassImpl();
		return relationClass;
	}

	public RelationClass createRelationClass(IRelationship referenced, Template template) {
		RelationClass candidate = template.getRelationClassReferencingElement(referenced);
		if(null !=candidate)
			return candidate;
		RelationClassImpl relationClass = new RelationClassImpl(referenced, template);
		template.getRelationClasses().add(relationClass);
		return relationClass;
	}

	public MetamodelPackage getMetamodelPackage() {
		return (MetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelPackage getPackage() {
		return MetamodelPackage.eINSTANCE;
	}

}
