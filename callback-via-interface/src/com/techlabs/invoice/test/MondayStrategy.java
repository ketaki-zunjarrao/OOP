package com.techlabs.invoice.test;

import com.techlabs.invoice.IDiscountRateStrategy;

public class MondayStrategy implements IDiscountRateStrategy {
	// AtLeast one constructor
	public MondayStrategy() {
		System.out.println("Monday");
	}

	@Override
	public double getRate() {
		return 0.50;
	}

}
