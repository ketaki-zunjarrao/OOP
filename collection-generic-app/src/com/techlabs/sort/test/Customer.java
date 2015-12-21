package com.techlabs.sort.test;

public class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	private String address;

	@Override
	public String toString() {
		String string = String.format("\nID :%s \tName: %s \t Address: %s", id,
				name, address);
		return string;
	}

	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public int compareTo(Customer o) {
		return id - o.getId();
	}
}
