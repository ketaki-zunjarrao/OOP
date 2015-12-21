package com.techlabs.crud.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestMap {
	// static Map<String, String> states = new HashMap<String, String>();
	static Map<String, String> states = new TreeMap<String, String>();
	static String key, value;
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		create();
		create();
		read();
		update();
		read();
		delete();
	}

	private static void create() {
		// Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the key and Value:");
		key = keyboard.next();
		value = keyboard.next().toUpperCase();
		states.put(key, value);
		System.out.println("Value is inserted");
	}

	private static void update() {
		System.out.println("Enter the key you want to replace");
		String keyToReplace = keyboard.next().toUpperCase();
		System.out.println("Enter the value to be replaced with");
		String newValue = keyboard.next();
		states.put(keyToReplace, newValue);
		System.out.println("Value is updated");

	}

	private static void read() {
		for (Map.Entry<String, String> map : states.entrySet()) {
			System.out.println("The Key is:" + map.getKey() + "\t"
					+ "The value is " + map.getValue());
		}
	}

	private static void delete() {
		System.out.println("Map is deleted");
		states.clear();
	}

}
