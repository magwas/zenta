/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.JUnit4TestAdapter;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.rulez.magwas.zenta.integrationtests.AsyncTestRunner;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaPackage;


@SuppressWarnings("nls")
@RunWith(Parameterized.class)
public class AllZentaTypeFigureTests extends AbstractTextFlowFigureTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(AllZentaTypeFigureTests.class);
    }
    
    @Parameters
    public static Collection<EClass[]> eObjects() {
        return Arrays.asList(new EClass[][] {
                { IZentaPackage.eINSTANCE.getBasicObject() },
        });
    }
    
    private EClass eClass;
    
    public AllZentaTypeFigureTests(EClass eClass) {
        this.eClass = eClass;
    }

    @Override
    protected AbstractDiagramModelObjectFigure createFigure() {
        IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
        return getViewedFigure(dmo);
    }

    protected AbstractDiagramModelObjectFigure createShapedFigure(String shape) {
        IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
        dmo.setElementShape(shape);
        return getViewedFigure(dmo);
    }

	private AbstractDiagramModelObjectFigure getViewedFigure(IDiagramModelZentaObject dmo) {
		dmo.setBounds(IZentaFactory.eINSTANCE.createBounds());
        IBasicObject ze = (IBasicObject)IZentaFactory.eINSTANCE.create(eClass);
        ze.setAncestor(model.getMetamodel().getBuiltinObjectClass());
        model.getElements().add(ze);
		dmo.setZentaElement(ze);
        dmo.setName("Hello World!");
        dm.getChildren().add(dmo);
        
        return (AbstractDiagramModelObjectFigure)getFigureFromViewer(dmo);
	}
    
    @Override
    @Test
    public void text_control_can_be_clicked() {
        AsyncTestRunner runner = new AsyncTestRunner() {
            @Override
            public void run() {
                super.run();
                Rectangle bounds = abstractFigure.getTextControl().getBounds().getCopy();
                abstractFigure.getTextControl().translateToAbsolute(bounds);
                assertTrue(abstractFigure.didClickTextControl(new Point(bounds.x + 3, bounds.y + 3)));
            }
        };
        
        runner.start();
    }
    
}
