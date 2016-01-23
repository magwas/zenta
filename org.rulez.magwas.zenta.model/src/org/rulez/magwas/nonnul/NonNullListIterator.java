package org.rulez.magwas.nonnul;

import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.rulez.magwas.zenta.model.UnTestedException;

public class NonNullListIterator<T> implements ListIterator<T>{

	private NonNullList<T> l;
	int index;

	NonNullListIterator(NonNullList<T>l) {
		this.l = l;
		this.index = 0;
	}
	
	@Override
	public void add( T e) {
		throw new UnTestedException();
	}


	@Override
	public boolean hasPrevious() {
		throw new UnTestedException();
	}

	@Override
	public boolean hasNext() {
		return index < l.size();
	}
	
	@Override
	public T next() {
		if (index >= l.size())
			throw new NoSuchElementException();
		T r = l.get(index);
		index += 1;
		return r;
	}

	@Override
	public int nextIndex() {
		throw new UnTestedException();
	}

	@Override
	public T previous() {
		throw new UnTestedException();
	}

	@Override
	public int previousIndex() {
		throw new UnTestedException();
	}

	@Override
	public void remove() {
		throw new UnTestedException();
	}

	@Override
	public void set( T e) {
		throw new UnTestedException();
	}

}
