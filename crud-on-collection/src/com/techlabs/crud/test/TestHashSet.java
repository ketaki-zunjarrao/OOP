package com.techlabs.crud.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestHashSet {
	// static HashSet<Integer> mylist = new HashSet<Integer>();
	static TreeSet<Integer> mylist = new TreeSet<Integer>();

	public static void main(String[] args) {
		create();
		read();
		update();
		read();
		delete();
		read();
	}

	private static void delete() {
		mylist.clear();
		System.out.println("Set deleted");
	}

	private static void create() {
		// create
		mylist.add(120);
		mylist.add(45);
		mylist.add(476);
		mylist.add(23);
	}

	private static void read() {
		// read
		if (mylist.isEmpty()) {
			System.out.println("No elements in set");
		} else {
			System.out.println("Values in the set:");
			for (Iterator<Integer> cursor = mylist.iterator(); cursor.hasNext();) {
				System.out.println(cursor.next());
			}
		}
	}

	private static void update() {

		// update
		int number = 10;
		if (mylist.contains(number) == false)
			mylist.add(number);
		System.out.println("Updated");

	}
}
