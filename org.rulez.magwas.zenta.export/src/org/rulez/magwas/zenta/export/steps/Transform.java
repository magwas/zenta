package org.rulez.magwas.zenta.export.steps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.rulez.magwas.zenta.export.steps.Step;
import org.rulez.magwas.zenta.export.steps.StepFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

public class Transform extends Step {
	
	NamedNodeMap atts;
	
	public Transform(StepFactory sf) {
		super(sf);
	}

	@Override
	public boolean doit(Element arg0, File current) {
		factory.log.issueInfo("transforming", current.getAbsolutePath());
        String language=arg0.getAttribute("language");
		String keep=arg0.getAttribute("keep");
		atts = arg0.getAttributes();
		File tfile = getFileFor(arg0,"target",null,factory.targetdir, current);
		if(null == tfile) return false;
		if("false".equals(keep)) {
			factory.dontkeep.add(tfile);
		}
		File sfile = getFileFor(arg0,"script",null,factory.styledir, current);
		if(null == sfile) return false;
		if("".equals(language)||"xslt".equals(language)) {
    		Transformer tf = mkTransformer(sfile);
    		if(null == tf) {
    			return false;
    		}
    		if(!doTransformation(current,tf,tfile)) {
    			return false;
    		}
		} else {
			factory.log.issueError("Invalid language for <transform>", language);
			return false;
		}
		return doSubSteps(arg0, tfile);
	}

    public Transformer mkTransformer(File style) {
    	TransformerFactory tFactory = 
    	                  javax.xml.transform.TransformerFactory.newInstance();

    		try {
				return tFactory.newTransformer
				            (new javax.xml.transform.stream.StreamSource(style));
			} catch (TransformerConfigurationException e) {
    			factory.log.issueError("cannot compile "+ style.getAbsolutePath(),e.getMessageAndLocation());
    			e.printStackTrace();
    			return null;
			}		
    }
    
    private boolean doTransformation(File source, Transformer tf, File output){
    	try {
    		StreamSource ss = new StreamSource(source);
    		FileOutputStream os = new FileOutputStream(output);
    		StreamResult sr = new StreamResult( os );
    		for(int i = 0;i<atts.getLength();i++) {
    			String name = atts.item(i).getNodeName();
    			String value = atts.item(i).getNodeValue();
    			factory.log.issueInfo("param", name + "=" + value);
        		tf.setParameter(name, value);    			
    		}
    		tf.setParameter("targetdir", factory.targetdir.getAbsolutePath());
    		factory.log.issueInfo("targetdir", factory.targetdir.getAbsolutePath());
			tf.transform(ss, sr);
		} catch (FileNotFoundException e) {
			factory.log.issueError("file not found for <transform>", source.getAbsolutePath());
			return false;
		} catch (TransformerException e) {
			factory.log.issueError("xslt problem <transform>", e.getMessageAndLocation());
			return false;
		}
    	return true;
    }
}
