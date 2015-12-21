package com.techlabs.composition.aggregation.test;

import com.techlabs.composition.aggregation.AddressInformation;
import com.techlabs.composition.aggregation.Employee;
import com.techlabs.composition.aggregation.InsuranceInformation;

public class TestEmployee {
	public static void main(String[] args) {
		Employee ketaki = new Employee(101, "Ketaki", new AddressInformation(
				"Malshej Road", "Kalyan", "Maharashtra", "India"));
		System.out.println(ketaki);
		ketaki.setInsurance(new InsuranceInformation("Health Insurance", 3));
		System.out.println(ketaki);

	}
}
