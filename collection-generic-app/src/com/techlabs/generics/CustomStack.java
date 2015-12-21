package com.techlabs.generics;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomStack<T> implements Iterable<T> {
	LinkedList<T> list;

	public CustomStack() {
		list = new LinkedList<T>();
	}

	public void push(T item) {
		list.addFirst(item);
	}

	public void pop() {
		list.removeFirst();
		System.out.println("Element is poped");
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
