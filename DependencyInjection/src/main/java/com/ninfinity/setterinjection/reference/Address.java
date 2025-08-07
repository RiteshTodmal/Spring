package com.ninfinity.setterinjection.reference;

public class Address {
	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	public Address(String city) {
		super();
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
