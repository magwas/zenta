package org.rulez.magwas.zenta.model;

import java.util.HashMap;
import java.util.Iterator;

import javax.xml.namespace.NamespaceContext;

public class NSResolver extends HashMap<String, String> implements
		NamespaceContext {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8543833550103497053L;

	public NSResolver() {
	}

	@Override
	public String getNamespaceURI(String arg0) {
		return this.get(arg0);
	}

	@Override
	public String getPrefix(String arg0) {
		throw new RuntimeException("unimplemented getPrefix called!");
	}

	@Override
	public Iterator<String> getPrefixes(String arg0) {
		return this.keySet().iterator();
	}

}
