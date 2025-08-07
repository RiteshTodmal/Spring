package com.ninfinity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.ninfinity.dao.StudentDaoImpl;

@Configuration
public class JavaConfig {
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springdb");
		ds.setUsername("root");
		ds.setPassword("Pass@123");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
	@Bean
	public StudentDaoImpl geStudentDaoImpl() {
		 StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		 studentDaoImpl.setTemplate(getJdbcTemplate());
		 return studentDaoImpl;
	}

}
