/**
 */
package org.rulez.magwas.zenta.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.metamodel.impl.BuiltinTemplate;
import org.rulez.magwas.zenta.model.IDiagramModel;


public interface Metamodel extends EObject {
	
	EList<Template> getTemplates();

	ObjectClass getBuiltinObjectClass();

	RelationClass getBuiltinRelationClass();
	
	BuiltinTemplate getBuiltinTemplate();

	Template getTemplateFor(IDiagramModel dm);

} 
