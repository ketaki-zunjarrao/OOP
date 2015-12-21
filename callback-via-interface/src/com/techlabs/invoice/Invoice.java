package com.techlabs.invoice;

// Invoice class
public class Invoice {
	private String invoiceName;
	private double billAmount;
	// Parameter ''{0}'' is not assigned and could be declared final
	private IDiscountRateStrategy rate = null;

	public Invoice(String invoiceName, double billAmount,
			IDiscountRateStrategy rate) {
		this.invoiceName = invoiceName;
		this.billAmount = billAmount;
		this.rate = rate;
	}

	// public method to calculate discount
	public double calculateDiscount() {
		return billAmount * rate.getRate();
	}

	// public method
	public String getInvoiceName() {
		return invoiceName;
	}

	// public method
	public double getBillAmount() {
		return billAmount;
	}
}
