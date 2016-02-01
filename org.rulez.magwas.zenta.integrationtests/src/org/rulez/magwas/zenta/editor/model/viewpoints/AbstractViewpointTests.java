/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.viewpoints.AbstractViewpoint;


public abstract class AbstractViewpointTests {
    
    protected AbstractViewpoint vp;
    protected int index;
    
	@Test
    public void testIsElementVisible() {
        List<EObject> types = vp.getAllowedTypes();
        if(!types.isEmpty()) {
            for(EObject t : types) {
                // All allowed types
				EObject element = createElementFromEClass(t);
				if(element instanceof IZentaElement) {
	                assertTrue(vp.isElementVisible((IZentaElement) element));
	                // All allowed types as diagram objects
	                IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
	                dmo.setZentaElement((IZentaElement) element);
	                System.out.printf("t = %s\n dmo=%s\n", t, dmo);
	                assertTrue(vp.isElementVisible(dmo));
				}
            }
        }
        // null means show all types
        else {
            for(IBasicObject eClass : vp.getObjectClasses()) {
                IZentaElement eObject = eClass.create(eClass.getZentaModel());
                assertTrue(vp.isElementVisible(eObject));
            }
            for(IBasicRelationship eClass : vp.getRelationClasses()) {
                assertTrue(vp.isElementVisible(eClass));
            }
        }
        
        // Other types
        IDiagramModelObject eObject = IZentaFactory.eINSTANCE.createDiagramModelNote();
        assertTrue(vp.isElementVisible(eObject));
        
        eObject = IZentaFactory.eINSTANCE.createDiagramModelGroup();
        assertTrue(vp.isElementVisible(eObject));
        
        eObject = IZentaFactory.eINSTANCE.createDiagramModelNote();
        assertTrue(vp.isElementVisible(eObject));
    }

	private EObject createElementFromEClass(EObject t) {
		EObject element;
		if(t instanceof EClass) {
			element = IZentaFactory.eINSTANCE.create((EClass) t);
		} else if (t instanceof IBasicObject) {
			IBasicObject oc = (IBasicObject) t;
			element = oc.create(oc.getZentaModel());
		} else {
			throw new IllegalArgumentException();
		}
		return element;
	}

    @Test
    public void testIsElementVisible_Nested() {
        List<EObject> types = vp.getAllowedTypes();
        if(!types.isEmpty()) {
            // Test is visible in Group
            IDiagramModelGroup group = IZentaFactory.eINSTANCE.createDiagramModelGroup();

            for(EObject eClass : types) {
                IZentaElement element = (IZentaElement) createElementFromEClass(eClass);
                IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
                dmo.setZentaElement(element);
                group.getChildren().add(dmo);
                
                assertTrue(vp.isElementVisible(dmo));
            }

            // Test child that is normally visible is hidden when inside of parent that is hidden
            for(EObject eClass : types) {
                // Create a child that should be visible
                IZentaElement element = (IZentaElement) createElementFromEClass(eClass);
                IDiagramModelZentaObject dmoChild = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
                dmoChild.setZentaElement(element);
                assertTrue(vp.isElementVisible(dmoChild));
                
                // Put the child in a parent that will be invisible (not an allowed type)
                IDiagramModelZentaObject dmoParent = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
                element = createElementThatsNotAllowedType();
                dmoParent.setZentaElement(element);
                dmoParent.getChildren().add(dmoChild);
                
                assertFalse(vp.isElementVisible(dmoChild));
            }
        }
    }
    
    @Test
    public void testIsAllowedType() {
        List<EObject> types = vp.getAllowedTypes();
        if(!types.isEmpty()) {
            for(EObject eClass : types) {
                assertTrue(vp.isAllowedType(eClass));
            }
        }
        // null means allow all types
        else {
            for(IBasicObject eClass : vp.getObjectClasses()) {
                assertTrue(vp.isAllowedType(eClass));
            }
            for(IBasicRelationship eClass : vp.getRelationClasses()) {
                assertTrue(vp.isAllowedType(eClass));
            }
        }
        
        // Other types
        EClass eClass = IZentaPackage.eINSTANCE.getDiagramModelNote();
        assertFalse(vp.isAllowedType(eClass));
        
        eClass = IZentaPackage.eINSTANCE.getDiagramModelGroup();
        assertFalse(vp.isAllowedType(eClass));
        
        eClass = IZentaPackage.eINSTANCE.getDiagramModelNote();
        assertFalse(vp.isAllowedType(eClass));
    }
    
    @Test
    public void testGetName() {
        assertNotNull(vp.getName());
    }
    
    @Test
    public void testGetIndex() {
        assertEquals(index, vp.getIndex());
    }
    
    private IZentaElement createElementThatsNotAllowedType() {
        for(IBasicObject eClass : vp.getObjectClasses()) {
            if(!vp.isAllowedType(eClass)) {
                return eClass.create(eClass.getZentaModel());
            }
        }
        
        return null;
    }
    
}
