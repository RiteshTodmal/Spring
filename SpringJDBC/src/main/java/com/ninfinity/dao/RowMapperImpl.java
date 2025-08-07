package com.ninfinity.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ninfinity.entities.Student;



public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s1 = new Student();
		s1.setId(rs.getInt(1));
		s1.setFirstName(rs.getString(2));
		s1.setLastName(rs.getString(3));
		s1.setCity(rs.getString(4));
		return s1;
	}
	

}
