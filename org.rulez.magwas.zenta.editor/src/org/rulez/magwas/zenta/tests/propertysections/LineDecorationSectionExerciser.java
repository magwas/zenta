package org.rulez.magwas.zenta.tests.propertysections;

import java.util.HashMap;
import java.util.Map;

import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;

public class LineDecorationSectionExerciser extends LineDecorationSection {

	Map<String,Object> internals = new HashMap<String,Object>();
	
	LineDecorationSectionExerciser() {
		super();
		internals.put("DefaultButton", defaultButton);
	}
	
	public Object getInternal(String string) {
		if(!internals.containsKey(string)) {
			throw new IllegalArgumentException("no such internal");
		}
		return internals.get(string);
	}

}
