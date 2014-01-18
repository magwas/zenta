package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.requests.CreationFactory;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;

public class ZentaDiagramModelFactoryNonClassed implements CreationFactory {

	private EClass eKlass;
	private IFolder folder;

	public ZentaDiagramModelFactoryNonClassed(EClass eKlass,
			IFolder folder) {
		 this.eKlass = eKlass;
		 this.folder = folder;
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
