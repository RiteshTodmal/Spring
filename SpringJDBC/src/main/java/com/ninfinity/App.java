package com.ninfinity;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ninfinity.dao.StudentDaoImpl;
import com.ninfinity.entities.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/ninfinity/config.xml");
//        
//        StudentDaoImpl student = context.getBean("studentdao",StudentDaoImpl.class);
        
//        Student s1 = new Student();
//        s1.setId(33);
//        s1.setFirstName("Arjun");
//        s1.setLastName("Patil");
//        s1.setCity("Pune");
//        
//        int result = student.insert(s1);
//        System.out.println("Record Inserted : "+result);
        
        
//        int result = student.delete(33);
//        System.out.println(result+" record deleted");
//        Student s1 = new Student();
//        s1.setId(22);
//        s1.setFirstName("Arjun");
//        s1.setLastName("Patil");
//        s1.setCity("Mumbai");
//        
//        int result = student.update(s1);
//        System.out.println("Record Updated: "+result);
//        
//        Student student2 = student.getOneRecord(22);
//        System.out.println(student2);
    	
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	StudentDaoImpl student = context.getBean("studentdao",StudentDaoImpl.class);
        
        List<Student> sList = student.getAllRecord();
        for(Student s:sList) {
        	System.out.println(s);
        }
        
    }
}
