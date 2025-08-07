package com.ninfinity.dao;

import java.util.List;

import com.ninfinity.entities.Student;

public interface StudentDao {
	
	public int insert(Student s1);
	public int delete(int id);
	public int update(Student s1);
	public Student getOneRecord(int id);
	public List<Student> getAllRecors();


}
