package com.ninfinity.setterinjection.reference;

public class Teacher {
	String teacherName;
	Address add;
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", add=" + add + "]";
	}
	public Teacher(String teacherName, Address add) {
		super();
		this.teacherName = teacherName;
		this.add = add;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
