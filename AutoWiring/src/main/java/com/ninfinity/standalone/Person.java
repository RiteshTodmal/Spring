package com.ninfinity.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;


public class Person {
	List<String> friends;
	Map<String, Integer> marks;
	Properties dbc;
	
	
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
	public Properties getDbc() {
		return dbc;
	}
	public void setDbc(Properties dbc) {
		this.dbc = dbc;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", marks=" + marks + ", dbc=" + dbc + "]";
	}
	
	
	
	
	
	
	
	

}
