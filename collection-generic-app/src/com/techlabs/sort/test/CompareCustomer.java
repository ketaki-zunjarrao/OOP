package com.techlabs.sort.test;

import java.util.Comparator;

public class CompareCustomer implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return (o1.getId() - o2.getId());
		// return (o1.getName().compareTo(o2.getName()));
	}

}
