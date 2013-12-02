package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.ecore.EFactory;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;

/**
 * 
 * @generated
 * 
 * only the generated stuff will have comments
 * 
 * some generated methods are deleted on purpose
 * 
 * watch out for FIXMEs and commented methods in classes with warning after generation
 *
 */
public interface MetamodelFactory extends EFactory {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelFactory eINSTANCE = org.rulez.magwas.zenta.metamodel.impl.MetamodelFactoryImpl.init();

	Metamodel createMetamodel();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	Template createTemplate();

	/**
	 * Returns a new object of class '<em>Object Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Class</em>'.
	 * @generated
	 */
	ObjectClass createObjectClass();

	Template createTemplate(IZentaDiagramModel reference, Metamodel metamodel);

	ObjectClass createObjectClass(IZentaElement element, Template template);

	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Relation Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Class</em>'.
	 * @generated
	 */
	RelationClass createRelationClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelPackage getMetamodelPackage();

	RelationClass createRelationClass(IRelationship reference, Template template);

	public class BuiltinClassShouldNotHaveReference extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	public class BuiltinClassShouldNotHaveAncestor extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	String getDefiningName(INameable ref);

	Metamodel createMetamodel(IZentaModel zentaModel);

	Metamodel getMetamodelFor(IZentaModelElement modelElement);

	ObjectClass createNoteClass();

	ObjectClass createGroupClass();

	RelationClass createNoteConnectionClass();

} //MetamodelFactory

