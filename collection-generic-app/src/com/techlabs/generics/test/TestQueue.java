package com.techlabs.generics.test;

import com.techlabs.collection.LineItem;
import com.techlabs.generics.CustomQueue;

public class TestQueue {
	public static void main(String[] args) {
		CustomQueue<Integer> myTokens = new CustomQueue<Integer>();
		myTokens.endQueue(120);
		myTokens.endQueue(130);
		myTokens.endQueue(140);
		for (Integer token : myTokens) {
			System.out.println(token);
			testLineItem();
		}
	}

	private static void testLineItem() {
		CustomQueue<LineItem> myItems = new CustomQueue<LineItem>();
		myItems.endQueue(new LineItem(101, "Laptop", 4, 7738.2));
		myItems.endQueue(new LineItem(102, "TV", 2, 456.5));

		for (LineItem item : myItems) {
			System.out.println("ID is:" + item.getId());
			System.out.println("Item is: " + item.getName());
			System.out.println("Quantity is " + item.getQuantity());
			System.out.println("Price is " + item.getUnitPrice());
		}
		myItems.deletQueue();
	}
}
