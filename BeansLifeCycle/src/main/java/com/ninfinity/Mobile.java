package com.ninfinity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mobile {
	String company;
	int price;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		System.out.println("setting Properties");
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [company=" + company + ", price=" + price + "]";
	}
	public Mobile(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Initalzed");
	}
	
	
	@PreDestroy
	public void stop() {
		System.out.println("Destroyed");
	}
	public Mobile() {
		super();
		System.out.println("Object Constructed");
		// TODO Auto-generated constructor stub
	}
	

}
