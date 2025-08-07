package com.ninfinity.setterinjection.primitive;

public class Student {
	int roll;
	String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("Setting roll Number");
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting Name");
		this.name = name;
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public Student() {
		super();
		System.out.println("WOW : Student object is created");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	
}
