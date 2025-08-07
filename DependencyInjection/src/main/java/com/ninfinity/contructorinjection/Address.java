package com.ninfinity.contructorinjection;

public class Address {
	String city;
	
	Address(String city){
		this.city = city;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
}
