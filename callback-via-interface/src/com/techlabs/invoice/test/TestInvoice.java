package com.techlabs.invoice.test;

import com.techlabs.invoice.IDiscountRateStrategy;
import com.techlabs.invoice.Invoice;

public class TestInvoice {
	public static void main(final String[] args) {
		Invoice bookInvoice = new Invoice("Book", 100,
				new IDiscountRateStrategy() {

					@Override
					public double getRate() {
						return 0.40;
					}
				});
		System.out.println("Name:" + bookInvoice.getInvoiceName()
				+ "\nDiscout: " + bookInvoice.calculateDiscount());

		Invoice laptopInvoice = new Invoice("DELL", 50000,
				new WednesdayStrategy());
		System.out.println("Name:" + laptopInvoice.getInvoiceName()
				+ "\nDiscout: " + laptopInvoice.calculateDiscount());

	}
}
