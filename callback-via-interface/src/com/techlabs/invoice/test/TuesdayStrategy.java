package com.techlabs.invoice.test;

import com.techlabs.invoice.IDiscountRateStrategy;

public class TuesdayStrategy implements IDiscountRateStrategy {

	@Override
	public double getRate() {
		return 0.4;
	}

}
