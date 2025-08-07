package com.ninfinity.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.ninfinity.entities.Student;

public class StudentDao {
	
	public HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	public Student getOneStudent(int id) {
		Student student = this.template.get(Student.class, id);
		return student;
	}
	
	public List<Student> getAllStudents(){
		List<Student> sList = this.template.loadAll(Student.class);
		return sList;
	}
	
	
	@Transactional
	public int addStudent(Student s1) {
		Integer result = (Integer)this.template.save(s1);	
		return result.intValue();
	}
	
	
	@Transactional
	public int update(Student s1) {
		this.template.update(s1);
		return 1;
		
	}
	
	@Transactional
	public int delete(Student s1) {
		this.template.delete(s1);
		return 1;
	}

}
