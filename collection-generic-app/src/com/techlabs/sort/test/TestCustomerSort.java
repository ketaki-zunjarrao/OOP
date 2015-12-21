package com.techlabs.sort.test;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestCustomerSort {

	public static void main(String[] args) {
		CompareCustomer cCompare = new CompareCustomer();
		TreeSet<Customer> customers = new TreeSet<Customer>(cCompare);
		//LinkedList<Customer> customers = new LinkedList<Customer>();
		customers.add(new Customer(101, "Ketaki", "Murbad"));
		customers.add(new Customer(100, "Rupali", "Mulund"));
		customers.add(new Customer(102, "Jagruti", "Thane"));
		customers.add(new Customer(103, "Damini", "Virar"));
		// Collections.sort(customers, cCompare);
		System.out.println(customers);
	}
}
