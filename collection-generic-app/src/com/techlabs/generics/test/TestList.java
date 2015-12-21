package com.techlabs.generics.test;

import com.techlabs.generics.CustomList;
import com.techlabs.generics.Node;

public class TestList {
	static CustomList list;

	public static void main(String[] args) {
		addIntegers();
		//addString();
	}

	private static void addString() {
		list = new CustomList<String>(new Node<String>("Ketaki"));
		list.addLast(new Node("Rupali"));
		list.addLast(new Node("jagruti"));
		list.addLast(new Node("Sayali"));
		list.addFirst(new Node("Vidya"));
		list.display();
	}

	private static void addIntegers() {
		list = new CustomList(new Node<Integer>(0));
		list.addLast(new Node(10));
		list.addLast(new Node(20));
		list.addFirst(new Node(30));
		list.addLast(new Node(50));
		list.addFirst(new Node(60));
		// list.addFirst(new Node(50));
		list.display();
		// list.delet(10);
		// list.display();
	}
}
