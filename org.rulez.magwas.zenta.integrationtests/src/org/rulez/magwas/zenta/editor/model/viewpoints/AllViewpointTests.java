/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.rulez.magwas.zenta.model.testutils.TestModel;
import org.rulez.magwas.zenta.model.viewpoints.AbstractViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.TotalViewpoint;

@RunWith(Parameterized.class)
public class AllViewpointTests extends AbstractViewpointTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(AllViewpointTests.class);
    }
    
    @Parameters
    public static Collection<Object[]> eObjects() {
    	TestModel builder = new TestModel();
    	builder.createFullModel();
        return Arrays.asList(new Object[][] {
                { new TotalViewpoint(builder.getTemplateDiagram()), 0 },
                { new TotalViewpoint(builder.getDiagramModel()), 0 },
        });
    }
    
    public AllViewpointTests(AbstractViewpoint vp, int index) {
        this.vp = vp;
        this.index = index;
    }
    
}
