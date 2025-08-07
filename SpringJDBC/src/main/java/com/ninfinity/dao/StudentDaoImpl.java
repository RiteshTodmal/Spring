package com.ninfinity.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ninfinity.entities.Student;


public class StudentDaoImpl implements StudentDao{
	
	
	JdbcTemplate template;

	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDaoImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Student s1) {
		String query="insert into student values(?,?,?,?)";
		int result = this.template.update(query, s1.getId(),s1.getFirstName(),s1.getLastName(),s1.getCity());
		return result;
	}

	public int delete(int id) {
		String query = "delete from student where id=?";
		int result = this.template.update(query,id);
		return result;
	}

	public int update(Student s1) {
		String query="update student set firstName=?,lastName=?,city=? where id=?";
		int result = this.template.update(query, s1.getFirstName(),s1.getLastName(),s1.getCity(),s1.getId());
		return result;
	}

	public Student getOneRecord(int id) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student s1 = this.template.queryForObject(query, rowMapper, id);
		return s1;
	}

	public List<Student> getAllRecord() {
		String query="select * from student ";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> sList = this.template.query(query, rowMapper);
		return sList;
	}
	
	

}
