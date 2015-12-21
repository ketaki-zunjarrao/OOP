package com.techlabs.generics.test;

import com.techlabs.collection.LineItem;
import com.techlabs.generics.CustomStack;

;

public class TestStack {
	static CustomStack<Integer> myTokens = new CustomStack<Integer>();

	public static void main(String[] args) {

		createStack();
		displayStack();
		myTokens.pop();
		displayStack();
		// testLineItem();
	}

	private static void displayStack() {
		for (Integer token : myTokens)
			System.out.println(token);
	}

	private static void createStack() {
		myTokens.push(100);
		myTokens.push(130);
		myTokens.push(140);

	}


	/*private static void testLineItem() {
		CustomStack<LineItem> myItems = new CustomStack<LineItem>();
		myItems.push(new LineItem(101, "Laptop", 4, 7738.2));
		myItems.push(new LineItem(102, "TV", 2, 456.5));

		for (LineItem item : myItems) {
			System.out.println("ID is:" + item.getId());
			System.out.println("Item is: " + item.getName());
			System.out.println("Quantity is " + item.getQuantity());
			System.out.println("Price is " + item.getUnitPrice());
		}*/
	}

