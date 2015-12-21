package com.techlabs.composition.aggregation;

public class AddressInformation {
	private String city;
	private String street;
	private String state;
	private String country;

	public AddressInformation(String street, String city, String state,
			String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

}
