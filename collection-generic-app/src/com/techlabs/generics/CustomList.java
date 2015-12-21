package com.techlabs.generics;

public class CustomList<T> {
	private Node<T> head, tail;

	public CustomList(Node<T> head) {
		this.head = head;
		this.tail=head;
	}

	public void addLast(Node<T> node) {
		Node<T> tempNode = head;
		/*
		 * while (tempNode.next != null) { tempNode = tempNode.next; }
		 */
		// tempNode.next = new Node<T>(node.data);
		if (head == tail) {

		}

		tail.next = node;
		node.next = null;
		tail = node;
	}

	public void display() {
		Node<T> tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode);
			tempNode = tempNode.next;
		}
	}

	public void addFirst(Node<T> node) {
		Node<T> tempNode = new Node<T>(node.data);
		tempNode.next = head;
		head = tempNode;
	}

	public void delet(T value) {
		Node<T> tempNode = head;
		Node<T> cursor;
		while (tempNode.next.data != value) {
			cursor = tempNode.next;
			tempNode = tempNode.next;
		}
		tempNode.next = tempNode.next.next;
		cursor = null;
	}
	/*
	 * public void add(Node<T> node) { if (head == null) head = node; else {
	 * Node<T> current = head; Node<T> newNext = current.next; while (newNext !=
	 * null) { current = newNext; newNext = current.next(); } current = new
	 * Node<T>(node.data); } }
	 * 
	 * public void display(CustomList<T> list) { Node<T> current = list.head;
	 * while (current.next() == null) { System.out.println(current); }
	 */

}
