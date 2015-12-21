package com.techlabs.generics;

public class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	/*
	 * public T getData() { return data; }
	 * 
	 * public Node<T> next() { return this; }
	 */

	@Override
	public String toString() {
		return String.format("Element is %s", data);
	}
}
