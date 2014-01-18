package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.requests.CreationFactory;
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IZentaFactory;

public class ZentaDiagramModelFactoryNonClassed implements CreationFactory {

	private EClass eKlass;

	public ZentaDiagramModelFactoryNonClassed(EClass eKlass) {
		 this.eKlass = eKlass;
	}

	@Override
    public Object getNewObject() {
        if(eKlass == null) {
            return null;
        }
        
        Object object = IZentaFactory.eINSTANCE.create(eKlass);
        
        // Group
        if(object instanceof IDiagramModelGroup) {
            ((IDiagramModelGroup)object).setName(Messages.ZentaDiagramModelFactory_0);
        }
        
        return object;
    }

    public Object getObjectType() {
        return eKlass;
    }

}
