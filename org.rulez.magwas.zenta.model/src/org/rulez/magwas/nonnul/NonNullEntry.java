package org.rulez.magwas.nonnul;

import java.util.Map.Entry;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class NonNullEntry<T1, T2> implements Entry<T1,T2> {

	private T1 key;
	private T2 value;
	
	NonNullEntry(T1 key, T2 value) {
		this.key = key;
		this.value = value;
	}
	
	
	@Override
	public @NonNull T1 getKey() {
		return key;
	}

	
	@Override
	public @NonNull T2 getValue() {
		return value;
	}

	
	@Override
	public @NonNull T2 setValue(@Nullable T2 arg0) {
		T2 v = value;
		value = Util.verifyNonNull(arg0);
		return v;
	}

}
