package com.ninfinity.setterinjection.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	String personName;
	List<String> friends;
	Set<String> certificate;
	Map<String, String> courses;
	Properties credentials;
	
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<String> getCertificate() {
		return certificate;
	}
	public void setCertificate(Set<String> certificate) {
		this.certificate = certificate;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getCredentials() {
		return credentials;
	}
	public void setCredentials(Properties credentials) {
		this.credentials = credentials;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", friends=" + friends + ", certificate=" + certificate
				+ ", courses=" + courses + ", credentials=" + credentials + "]";
	}
	public Person(String personName, List<String> friends, Set<String> certificate, Map<String, String> courses,
			Properties credentials) {
		super();
		this.personName = personName;
		this.friends = friends;
		this.certificate = certificate;
		this.courses = courses;
		this.credentials = credentials;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
