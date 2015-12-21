package com.techlabs.crud.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;

public class TestArrayList {
	// static ArrayList<Integer> mylist = new ArrayList<Integer>();
	static LinkedList<Integer> mylist = new LinkedList<Integer>();

	public static void main(String[] args) {
		create();
		read();
		update();
		read();
		delete();
	}

	private static void delete() {
		mylist.clear();
		System.out.println("List Deleted");
	}

	private static void update() {
		int number = 10;
		int newNumber = 100;
		int index = mylist.indexOf(number);
		if (!(index == -1))
			mylist.set(index, newNumber);
		System.out.println("List updated");
		
	//	mylist.set(2, 54);
	}

	private static void read() {
		if (mylist.isEmpty()) {
			System.out.println("No elements in set");
		} else {
			System.out.println("Values in the List:");
			for (Iterator<Integer> cursor = mylist.iterator(); cursor.hasNext();) {
				System.out.println(cursor.next());
			}
		}
	}

	private static void create() {

		mylist.add(120);
		mylist.add(45);
		mylist.add(476);
		mylist.add(23);
		mylist.add(10);
		mylist.add(2, 300);
		mylist.addFirst(12);
		System.out.println("List created");
	}

	

}
