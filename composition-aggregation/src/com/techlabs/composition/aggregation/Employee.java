package com.techlabs.composition.aggregation;

public class Employee {
	private AddressInformation address;
	private InsuranceInformation insurance;
	private int id;
	private String name;

	public Employee(int id, String name, AddressInformation address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setInsurance(InsuranceInformation insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		String info = String.format(
				"\nID: %s\t Name: %s \t Address: %s, %s, %s, %s.", id, name,
				address.getStreet(), address.getCity(), address.getState(),
				address.getCountry());

		if (insurance != null)
			info = info.concat(String.format("\nPolicy: %s\t Duration: %s",
					insurance.getPolicyName(), insurance.getPolicyDuration()));

		return info;

	}
}