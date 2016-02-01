package org.rulez.magwas.nonnul;

import java.util.ArrayList;
import java.util.Collection;

import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class NonNullArrayList<T> extends ArrayList<T> implements NonNullList<T> {

	private static final long serialVersionUID = 1L;

	public NonNullArrayList( Collection<T> c) {
		super(c);
		checkCollection(c);
	}

	public NonNullArrayList() {
		super();
	}

	@Override
	public boolean add( T e) {
		Util.verifyNonNull(e);
		return super.add(e);
	}

	@Override
	public void add(int index,  T element) {
		Util.verifyNonNull(element);
		super.add(index, element);
	}

	@Override
	public boolean addAll( Collection<? extends T> c) {
		checkCollection(c);
		return super.addAll(c);
	}

	public void checkCollection( Collection<? extends Object> c) {
		Collection<? extends Object> cc = Util.verifyNonNull(c);
		for (Object i : cc) {
			Util.verifyNonNull(i);
		}
	}

	@Override
	public boolean addAll(int index,  Collection<? extends T> c) {
		checkCollection(c);
		return super.addAll(index, c);
	}

	@Override
	public  NonNullListIterator<T> iterator() {
		return new NonNullListIterator<T>(this);
	}

	@Override
	public NonNullListIterator<T> listIterator() {
		return new NonNullListIterator<T>(this);
	}

	@Override
	public NonNullListIterator<T> listIterator(int index) {
		throw new UnTestedException();
	}

	
	@Override
	public T remove(int index) {
		return super.remove(index);
	}

	
	@Override
	public  T set(int index,  T element) {
		Util.verifyNonNull(element);
		return super.set(index, element);
	}

	
	@Override
	public  NonNullArrayList<T> subList(int fromIndex, int toIndex) {
		return (NonNullArrayList<T>) super.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		Object[] r = new Object[size()];
		NonNullArrayList<T> nonNullArrayList = this;
		for (int i = 0; i < nonNullArrayList.size(); i++) {
			T e = nonNullArrayList.get(i);
			r[i] = e;
		}
		return r;
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray( T[] a) {
		throw new UnTestedException();
	}
	
	public T get(int i) {
		T r = super.get(i);
		return Util.verifyNonNull(r);
	}

}
