package org.genspark.spring_annotation.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier ("pkg2Address")
public class Address {
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
	private String city ="pkg2city";
	private String state="pkg2state";
	private String country="pkg2country";
	private String zipcode="pkg2zip";
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
