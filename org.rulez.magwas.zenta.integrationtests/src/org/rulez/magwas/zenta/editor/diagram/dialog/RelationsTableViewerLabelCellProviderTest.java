package org.rulez.magwas.zenta.editor.diagram.dialog;

import static org.junit.Assert.*;

import org.junit.Test;
import org.rulez.magwas.zenta.integrationtests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.model.IBasicRelationship;

public class RelationsTableViewerLabelCellProviderTest {

       @Test
       public void the_provider_gets_the_name_of_a_relatonclass_right() {
               RelationsTableViewerLabelCellProvider provider = new RelationsTableViewerLabelCellProvider();
               ModelAndEditPartTestData testdata = new ModelAndEditPartTestData();
               IBasicRelationship relation = testdata.createNewRelationClass("newClass");
               assertEquals(provider.getText(relation),"newClass");
       }
}
