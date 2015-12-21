package com.techlabs.generics;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomQueue<T> implements Iterable<T> {
	private LinkedList<T> list;

	public CustomQueue() {
		list = new LinkedList<T>();
	}

	public void endQueue(T item) {
		list.addLast(item);
	}

	public void deletQueue() {
		list.removeFirst();
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
}
