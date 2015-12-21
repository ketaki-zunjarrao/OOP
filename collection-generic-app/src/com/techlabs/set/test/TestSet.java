package com.techlabs.set.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// testCase1();
		testCase2();
	}

	private static void testCase1() {
		// Set<Integer> departmentNumbers=new HashSet<Integer>();
		// Set<Integer> departmentNumbers=new LinkedHashSet<Integer>();
		Set<Integer> departmentNumbers = new TreeSet<Integer>();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 5 departments");
		for (int i = 1; i <= 5; i++) {
			departmentNumbers.add(keyboard.nextInt());
		}
		System.out.println(departmentNumbers);
	}

	private static void testCase2() {
		Set<Student> studentId = new HashSet<Student>();

		studentId.add(new Student(101, "Ketaki", "XYZ"));
		studentId.add(new Student(101, "Ketaki", "XYZ"));
		studentId.add(new Student(101, "Ketaki", "XYZ"));
		studentId.add(new Student(101, "Ketaki", "XYZ"));
		studentId.add(new Student(101, "Ketaki", "XYZ"));

		System.out.println(studentId.size());
		System.out.println(studentId);

	}

}
