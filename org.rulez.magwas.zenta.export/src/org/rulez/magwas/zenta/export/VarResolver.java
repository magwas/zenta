package org.rulez.magwas.zenta.export;

import java.util.HashMap;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPathVariableResolver;

public class VarResolver extends HashMap<String, Object> implements XPathVariableResolver  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4495477960195345060L;

	public VarResolver() {
		
	}

	@Override
	public Object resolveVariable(QName qn) {
		String key = qn.toString();
		Object val = this.get(key);
		return val;
	}

}
