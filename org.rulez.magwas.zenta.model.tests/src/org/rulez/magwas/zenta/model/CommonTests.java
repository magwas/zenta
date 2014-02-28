/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


/**
 * Tests common to many classes
 * 
 * @author Phillip Beauvoir
 */
@SuppressWarnings("nls")
public class CommonTests {
    
    public static void testGetName(INameable nameable) {
        assertEquals("", nameable.getName());
        nameable.setName("name");
        assertEquals("name", nameable.getName());
    }

    public static void testGetDocumentation(IDocumentable documentable) {
        assertEquals("", documentable.getDocumentation());
        documentable.setDocumentation("doc");
        assertEquals("doc", documentable.getDocumentation());
    }

	public static void testProperties(IProperties properties) {
        EClass prop = IZentaPackage.eINSTANCE.getProperty();
		testList(properties.getProperties(), prop);
        
        String key = "some_key", value = "some_value";
        
        IProperty property = IZentaFactory.eINSTANCE.createProperty();
        property.setKey(key);
        property.setValue(value);
        properties.getProperties().add(property);

        // Check entry is correct
        EList<IProperty> entries = properties.getProperties();
        assertEquals(1, entries.size());
        IProperty testProperty = entries.get(0);
        assertEquals(property, testProperty);
        assertEquals(testProperty.getKey(), key);
        assertEquals(testProperty.getValue(), value);
    }
  
    @SuppressWarnings("unchecked")
    public static <T extends EObject> void testList(EList<T> list, EClass type) {
        assertTrue(list.isEmpty());
        list.add((T)IZentaFactory.eINSTANCE.create(type));
        assertEquals(1, list.size());
        list.add((T)IZentaFactory.eINSTANCE.create(type));
        assertEquals(2, list.size());
        list.clear();
        assertTrue(list.isEmpty());
    }
    
    public static void testGetAdapter(IAdapter adapter) {
        assertNull(adapter.getAdapter(String.class));
        String test = "test";
        adapter.setAdapter(String.class, test);
        assertSame(test, adapter.getAdapter(String.class));
    }
}
