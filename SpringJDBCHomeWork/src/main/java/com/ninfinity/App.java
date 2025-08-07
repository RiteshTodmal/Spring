package com.ninfinity;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDaoImpl studentDaoImpl = context.getBean(StudentDaoImpl.class);
        
        Student s1 = new Student();
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
        
        System.out.println("\n \n ----------------------WELCOME TO SPRING JDBC------------------------");
        System.out.println("\n 1.INSERT \n 2.UPDATE \n 3.DELETE \n 4.GET ONE RECORD \n 5.READ ALL RECORD \n ");
        System.out.print("PLEASE ENTER YOUR CHOICE :");
        int x = scanner.nextInt();
        
        int result;
        switch(x) {
        
        case 1:
        	System.out.print("Enter ID: ");
        	s1.setId(scanner.nextInt());
        	System.out.print("Enter FirstName: ");
        	s1.setFirstName(scanner.next());
        	System.out.print("Enter LastName: ");
        	s1.setLastName(scanner.next());
        	System.out.print("Enter City: ");
        	s1.setCity(scanner.next());
        	
        	result = studentDaoImpl.insert(s1);
        	
        	if(result==1) {
        		System.out.println("Your Record Has Inserted Successfully");
        	}else {
        		System.out.println("The Record Not Inserted Error Occurred");
        	}
        	break;
        	
        case 2:
        	System.out.print("Enter ID: ");
        	s1.setId(scanner.nextInt());
        	System.out.print("Enter FirstName: ");
        	s1.setFirstName(scanner.next());
        	System.out.print("Enter LastName: ");
        	s1.setLastName(scanner.next());
        	System.out.print("Enter City: ");
        	s1.setCity(scanner.next());
        	
        	result = studentDaoImpl.update(s1);
        	
        	if(result==1) {
        		System.out.println("Your Record Has Updated Successfully");
        	}else {
        		System.out.println("The Record Not Updated Error Occurred");
        	}
        	break;
        	
        case 3:
        	System.out.print("Enter ID: ");
        	s1.setId(scanner.nextInt());
        	
        	
        	result = studentDaoImpl.delete(s1.getId());
        	
        	if(result==1) {
        		System.out.println("Your Record Has Deleted Successfully");
        	}else {
        		System.out.println("The Record Not Deleted Error Occurred");
        	}
        	break;
        	
        case 4:
        	System.out.print("Enter ID: ");
        	s1.setId(scanner.nextInt());
  
        	
        	Student s2 = studentDaoImpl.getOneRecord(s1.getId());
        	
        	if(s2.equals(null)) {
        		System.out.println("No Object Present With This ID");
        	}else {
        		System.out.println(s2);
        	}
        	break;
        	
        case 5:
        	List<Student> sList = studentDaoImpl.getAllRecors();
        	
        	if(sList.isEmpty()) {
        		System.out.println("No Object Present With This ID");
        	}else {
        		for(Student s: sList ) {
        			System.out.println(s+" ");
        		}
        	}
        	break;
        	
        default:
        	System.out.println("Please Enter The Valid Choice");
        	break;
        
        }
        
        }
        
    }
}
