package org.rulez.magwas.nonnul;
import java.util.Collection;
import java.util.List;

import org.eclipse.jdt.annotation.Nullable;

public interface NonNullList<T> extends List<T> {

	@Override
	public boolean add(@Nullable T e);

	@Override
	public void add(int index, @Nullable T element);

	@Override
	public boolean addAll(@Nullable Collection<? extends T> c);

	public void checkCollection(Collection<? extends Object> c);

	@Override
	public boolean addAll(int index, @Nullable Collection<? extends T> c);

	@Override
	public NonNullListIterator<T> iterator();

	@Override
	public NonNullListIterator<T> listIterator();

	@Override
	public NonNullListIterator<T> listIterator(int index);

	@Override
	public T remove(int index);

	@Override
	public T set(int index, @Nullable T element);

	@Override
	public T get(int index);

	@Override
	public NonNullArrayList<T> subList(int fromIndex, int toIndex);

	@Override
	public Object[] toArray();

}
