package com.ninfinity.contructorinjection;

public class Student {
	int rollNumber;
	String studentName;
	
	Student(int rollNumber,String studentName){
		System.out.println("Inside parameterized Constructor");
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + "]";
	}
	
	
}
