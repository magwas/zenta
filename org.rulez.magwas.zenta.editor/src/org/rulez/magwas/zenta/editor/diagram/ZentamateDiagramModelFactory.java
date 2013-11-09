/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IEditorPart;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.ZentamateLabelProvider;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamateFactory;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Diagram Model Factory for creating objects from the Palette in the Zentamate Diagram Editor
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateDiagramModelFactory implements ICreationFactory {
    
    /**
     * Factory method for creating a new IDiagramModelZentamateObject for an IZentamateElement
     * @param element
     * @return a new IDiagramModelZentamateObject
     */
    public static IDiagramModelZentamateObject createDiagramModelZentamateObject(IZentamateElement element) {
        IDiagramModelZentamateObject dmo = IZentamateFactory.eINSTANCE.createDiagramModelZentamateObject();
        dmo.setZentamateElement(element);
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

    
    private EClass fTemplate;
    
    /**
     * Constructor for creating a new Ecore type model
     * @param eClass
     */
    public ZentamateDiagramModelFactory(EClass template) {
        fTemplate = template;
    }
    
    public boolean isUsedFor(IEditorPart editor) {
        return editor instanceof IZentamateDiagramEditor;
    }
    
    public Object getNewObject() {
        if(fTemplate == null) {
            return null;
        }
        
        Object object = IZentamateFactory.eINSTANCE.create(fTemplate);
        
        // Connection created from Relationship Template
        if(object instanceof IRelationship) {
            IDiagramModelZentamateConnection connection = IZentamateFactory.eINSTANCE.createDiagramModelZentamateConnection();
            connection.setRelationship((IRelationship)object);
            return connection;
        }
        
        // Zentamate Diagram Object created from Zentamate Element Template
        else if(object instanceof IZentamateElement) {
            IZentamateElement element = (IZentamateElement)object;
            element.setName(ZentamateLabelProvider.INSTANCE.getDefaultName(fTemplate));
            return createDiagramModelZentamateObject(element);
        }
        
        // Group
        else if(object instanceof IDiagramModelGroup) {
            ((IDiagramModelGroup)object).setName(Messages.ZentamateDiagramModelFactory_0);
        }
        
        return object;
    }

    public Object getObjectType() {
        return fTemplate;
    }
}
