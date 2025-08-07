package com.ninfinity.standalone;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Ritesh")
	String studentNameString;
	
	@Value("1")
	int rollNumber;
	
	@Value("#{myfriends}")
	List<String> friends;
	
	@Value("#{mymarks}")
	Map<String, Integer> marks;

	public String getStudentNameString() {
		return studentNameString;
	}

	public void setStudentNameString(String studentNameString) {
		this.studentNameString = studentNameString;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentNameString=" + studentNameString + ", rollNumber=" + rollNumber + ", friends=" + friends
				+ ", marks=" + marks + "]";
	}
	
	

}
