package com.ninfinity.contructorinjection;

import java.util.List;

public class Employee {
	String empName;
	List<String> friends;
	Address add;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(String empName,List<String> friends,Address add){
		this.empName = empName;
		this.friends = friends;
		this.add  = add;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", friends=" + friends + ", add=" + add + "]";
	}
	
	
}
