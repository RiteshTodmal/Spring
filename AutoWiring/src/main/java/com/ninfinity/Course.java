package com.ninfinity;

public class Course {
	String courseName;
	String durationString;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDurationString() {
		return durationString;
	}
	public void setDurationString(String durationString) {
		this.durationString = durationString;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", durationString=" + durationString + "]";
	}
	public Course(String courseName, String durationString) {
		super();
		this.courseName = courseName;
		this.durationString = durationString;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
