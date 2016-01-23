package org.rulez.magwas.nonnul;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.rulez.magwas.nonnul.NonNullMap;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class NonNullHashMap<T1, T2> extends HashMap<T1,T2> implements NonNullMap<T1, T2> {

	private static final long serialVersionUID = 1L;

	@Override
	public Set<Entry<T1, T2>> entrySet() {
		throw new UnTestedException();
	}

	public NonNullList<NonNullEntry<T1, T2>> getEntrySet() {
		Set<java.util.Map.Entry<T1, T2>> s = super.entrySet();
		NonNullList<NonNullEntry<T1, T2>> r = new NonNullArrayList<NonNullEntry<T1, T2>>();
		for (java.util.Map.Entry<T1, T2> e : s ) {
			T1 key = Util.verifyNonNull(e.getKey());
			T2 value = Util.verifyNonNull(e.getValue());
			NonNullEntry<T1, T2> entry = new NonNullEntry<T1, T2>(key,value);
			r.add(entry);
		}
		return r;
	}

	@Override
	public T2 get( Object key) {
		T2 r = super.get(key);
		return Util.verifyNonNull(r);
	}

	@Override
	public Set<T1> keySet() {
		throw new UnTestedException();
	}

	@Override
	
	public T2 put( T1 key,  T2 value) {
		T1 k = Util.verifyNonNull(key);
		T2 v = Util.verifyNonNull(value);
		T2 r = super.put(k, v);
		return r;
	}

	@Override
	public void putAll( Map<? extends T1, ? extends T2> mo) {
		Map<? extends T1, ? extends T2> m = Util.verifyNonNull(mo);
		for(T1 k : m.keySet()) {
			Util.verifyNonNull(k);
			Util.verifyNonNull(m.get(k));
		}
		super.putAll(m);
	}

	
	@Override
	public  T2 remove( Object key) {
		return super.remove(key);
	}


	
	@Override
	public  NonNullList<T2> values() {
		return (NonNullList<T2>) super.values();
	}

}
