package org.rulez.magwas.zenta.export.steps;

import java.io.File;
import java.io.IOException;

import org.rulez.magwas.zenta.export.steps.Step;
import org.rulez.magwas.zenta.export.steps.StepFactory;
import org.rulez.magwas.zenta.model.IArchimateModel;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.rulez.magwas.zenta.editor.model.IEditorModelManager;

/**
 * This step loads an archimate model, so the steps under it pertain the newly loaded one
 */
public class Load extends Step {
	
	/**
	 * Instantiates a new instance.
	 *
	 * @param sf the step factory
	 */
	Load(StepFactory sf) {
		super(sf);
	}

	
	/* (non-Javadoc)
	 * loads a (presumably massaged) archi file, and do the substeps on it 
	 * @see org.rulez.magwas.zenta.export.steps.Step#doit(org.w3c.dom.Element, java.io.File)
	 */
	@Override
	public boolean doit(Element arg0, File current) {
		factory.log.issueInfo("loading model from", current.getAbsolutePath());
    	IEditorModelManager.INSTANCE.openModel(current);
        for(IArchimateModel model : IEditorModelManager.INSTANCE.getModels()) {
            if(current.equals(model.getFile())) {
        		StepFactory sf = new StepFactory(factory.log,model,factory.styledir, factory.targetdir);
           		try {
           			//the following is essentially doSubSteps, but with the new factory
           	   		NodeList l = arg0.getChildNodes();
           	   		for(int i=0; i<l.getLength();i++) {
           	   			Node n = l.item(i);
           	   			if(n.getNodeType() == Node.ELEMENT_NODE) {
               	   			if(!sf.get(n.getNodeName()).doit((Element) n,current)) {
               	   				return false;
               	   			}
           	    		}
           	    	}
           	   		sf.cleanUp();
    				IEditorModelManager.INSTANCE.closeModel(model);
    				} catch (IOException e) {
    					factory.log.issueError("closing model", e.getMessage());
    					e.printStackTrace();
    					return false;
    				}
                break;
            }
        }
		return true;
	}

}
