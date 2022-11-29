package org.genspark.spring_no_annotation;

public class Address {
	private String city;
	private String state;
	private String country;
	private String zipcode;

	public Address(String city, String state, String country, String zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}

}
