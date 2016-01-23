package org.rulez.magwas.nonnul;

import java.util.Map;

public interface NonNullMap<T1, T2> extends Map<T1, T2> {

	@Override
	public T2 get( Object key);

	public NonNullList<NonNullEntry<T1, T2>> getEntrySet();

	@Override
	public  T2 put( T1 key,  T2 value);

	@Override
	public T2 remove( Object key);

	@Override
	public NonNullList<T2> values();
}
