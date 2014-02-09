package org.rulez.magwas.nonnul;

import java.util.Map;

import org.eclipse.jdt.annotation.Nullable;

public interface NonNullMap<T1, T2> extends Map<T1, T2> {

	@Override
	public T2 get(@Nullable Object key);

	public NonNullList<NonNullEntry<T1, T2>> getEntrySet();

	@Override
	public T2 put(@Nullable T1 key, @Nullable T2 value);

	@Override
	public T2 remove(@Nullable Object key);

	@Override
	public NonNullList<T2> values();
}
