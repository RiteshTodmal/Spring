package com.ninfinity.standalone;

import java.util.List;

public class Teacher {
	List<String> frndList;

	public List<String> getFrndList() {
		return frndList;
	}

	public void setFrndList(List<String> frndList) {
		this.frndList = frndList;
	}

	@Override
	public String toString() {
		return "Teacher [frndList=" + frndList + "]";
	}
	
	

}
