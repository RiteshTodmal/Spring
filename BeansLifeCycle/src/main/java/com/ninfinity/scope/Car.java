package com.ninfinity.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Car {
	String company;
	int price;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		System.out.println("Setting The name");
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("Setting Price");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", price=" + price + "]";
	}
	public Car(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	public Car() {
		super();
		System.out.println("Object Created");
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("WOW: INside The Init");
	}

	
	public void destroy() {
		System.out.println("So sad : Inside The Destroy");
	}
	
}
