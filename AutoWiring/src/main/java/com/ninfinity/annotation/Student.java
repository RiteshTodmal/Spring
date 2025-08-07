package com.ninfinity.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	@Autowired
	@Qualifier("crc2")
	Course crc;

	public Course getCrc() {
		return crc;
	}
	

	public void setCrc(Course crc) {
		System.out.println("DI Using SI");
		this.crc = crc;
	}

	@Override
	public String toString() {
		return "Student [crc=" + crc + "]";
	}

	public Student(Course crc) {
		super();
		System.out.println("DI using CI");
		this.crc = crc;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
