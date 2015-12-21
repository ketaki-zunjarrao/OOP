package com.techlabs.sort.test;

import java.util.TreeSet;

public class TestTree {
	static TreeSet<Student> students = new TreeSet<Student>();

	public static void main(String[] args) {
		students.add(new Student(102, "name2", "job1"));
		students.add(new Student(106, "name3", "job3"));
		students.add(new Student(104, "name1", "job2"));
		students.add(new Student(104, "ketaki", "Abcs"));

		System.out.println(students.size());
	}
}
