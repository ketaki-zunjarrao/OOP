package com.techlabs.collection;

public class LineItem {
	private int id, quantity;
	private String name;
	private double unitPrice;

	public LineItem(int id, String name, int quantity, double unitPrice) {

		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double calculateTotal() {
		return quantity * unitPrice;

	}

}
