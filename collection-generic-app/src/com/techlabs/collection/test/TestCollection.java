package com.techlabs.collection.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.collection.LineItem;

public class TestCollection {
	public static void main(String[] args) {
		 //testCollection();
		// testGenericCollection();
		//testOrder();

	}

	private static void testOrder() {
		ArrayList<Integer> mylist = new ArrayList<Integer>();

		mylist.add(101);
		mylist.add(76);
		mylist.add(100);
		for (Iterator cursor = mylist.iterator(); cursor.hasNext();) {
			System.out.println(cursor.next());
		}

	}

	private static void testGenericCollection() {
		List<LineItem> mylist = new ArrayList<LineItem>();

		mylist.add(new LineItem(101, "Ketaki", 2, 79.3));
		mylist.add(new LineItem(102, "Rupali", 4, 50.0));
		mylist.add(new LineItem(1013, "Sayli", 2, 100));
		
		// mylist.add(null);

		// mylist.add(100);

		// for (LineItem item : mylist) {
		// System.out.println(item.calculateTotal());
		// }
		for (Iterator i = mylist.iterator(); i.hasNext();) {
			LineItem item = (LineItem) i.next();
			System.out.println(item.calculateTotal());
		}
	}

	private static void testCollection() {
		ArrayList mylist = new ArrayList();

		mylist.add(new LineItem(101, "Ketaki", 2, 79.3));
		mylist.add(new LineItem(102, "Riupali", 4, 50.0));
		mylist.add(new LineItem(1013, "Sayli", 2, 100));
		mylist.add(100);

		for (Object object : mylist) {
			LineItem item = (LineItem) object;
			System.out.println(item.calculateTotal());
		}

	}
}
