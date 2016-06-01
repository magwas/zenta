/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorPart;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.handmade.util.Util;



/**
 * Diagram Model Factory for creating objects from the Palette in the Zenta Diagram Editor
 * 
 * @author Phillip Beauvoir
 */
public class ZentaDiagramModelFactory implements ICreationFactory {
    
    /**
     * Factory method for creating a new IDiagramModelZentaObject for an IZentaElement
     * @param element
     * @return a new IDiagramModelZentaObject
     */
    public static IDiagramModelZentaObject createDiagramModelZentaObject(IZentaElement element) {
        IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
        dmo.setZentaElement(element);
        dmo.setType(Preferences.getDefaultFigureType(dmo));
        
        // Set user fill color
        if(Preferences.STORE.getBoolean(IPreferenceConstants.SAVE_USER_DEFAULT_FILL_COLOR)) {
            Color fillColor = ColorFactory.getDefaultFillColor(dmo);
            if(fillColor != null) {
                dmo.setFillColor(ColorFactory.convertRGBToString(fillColor.getRGB()));
            }
        }
        
        return dmo;
    }

	public static IDiagramModelZentaConnection createChildDiagramConnection(
			IFolder folder, IBasicObject template, IDiagramModelObject source, IDiagramModelObject target) {
		ConnectionAndFolder connAndFolder = (ConnectionAndFolder)new ZentaDiagramModelFactory(template, folder).
				getNewObject();
		IDiagramModelZentaConnection aConnection = createConnectionFromObject(source, target, connAndFolder);
		return aConnection;
	}

	public static IDiagramModelZentaConnection createConnectionFromObject(IDiagramModelObject source,
			IDiagramModelObject target, ConnectionAndFolder connAndFolder) {
		IFolder aFolder = connAndFolder.getFolder();
		IDiagramModelZentaConnection aConnection = connAndFolder.getConnection();
		IBasicRelationship aRelationship = connAndFolder.getObject();
		aFolder.setChecked(false);
		aConnection.setRelationship((IBasicRelationship) aRelationship);
		aFolder.getElements().add(aRelationship);
		aConnection.connect(source, target);
        aFolder.check();
		return aConnection;
	}

    
    private IBasicObject fTemplate;
	private IFolder folder;
    
    public ZentaDiagramModelFactory(IBasicObject fTemplate2, IFolder folder) {
        fTemplate = fTemplate2;
        this.folder = folder;
    }
    
	public boolean isUsedFor(IEditorPart editor) {
        return editor instanceof IZentaDiagramEditor;
    }
    
	@Override
    public Object getNewObject() {
		System.out.printf("template=%s",fTemplate);
        Util.verifyNonNull(fTemplate);
        Util.verifyNonNull(folder);
        Object object = fTemplate.create();
        
        // Connection created from Relationship ITemplate
        if(object instanceof IBasicRelationship) {
            IDiagramModelZentaConnection connection = IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
            connection.setRelationship((IBasicRelationship)object);
        	ConnectionAndFolder r = new ConnectionAndFolder((IBasicRelationship)object, folder, connection);
            return r;
        }
        
        // Zenta Diagram Object created from Zenta Element ITemplate
        else if(object instanceof IZentaElement) {
            IZentaElement element = (IZentaElement)object;
            element.setName(fTemplate.getName());
            return createDiagramModelZentaObject(element);
        }
        
        // Group
        else if(object instanceof IDiagramModelGroup) {
            ((IDiagramModelGroup)object).setName(Messages.ZentaDiagramModelFactory_0);
        }
        
        return object;
    }

	@Override
    public Object getObjectType() {
        return fTemplate;
    }
}
