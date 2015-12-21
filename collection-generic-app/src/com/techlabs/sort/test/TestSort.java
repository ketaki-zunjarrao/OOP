package com.techlabs.sort.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

import com.techlabs.set.test.Student;

public class TestSort {

	 ArrayList<Student> students = new ArrayList<Student>();
	// LinkedList<Student> students = new LinkedList<Student>();

	public static void main(String[] args) {
		new TestSort().testSort();
	}

	private void testSort() {
		students.add(new Student(101, "Ketaki", "Devloper"));
		students.add(new Student(105, "Mohini", "Analyst"));
		students.add(new Student(100, "Mayuri", "Tester"));
		students.add(new Student(102, "Sayali", "Manager"));

		 Collections.sort(students, new IdCompare());

		System.out.println(students);
	}

	class NameCompare implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	class JobCompare implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getJob().compareTo(o2.getJob());
		}
	}

	class IdCompare implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			if (o1.getId() < o2.getId())
				return -1;
			else
				return 1;
			// return o1.getId() - o2.getId();
		}
	}
}
