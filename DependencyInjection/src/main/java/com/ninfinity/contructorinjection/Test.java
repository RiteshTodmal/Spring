package com.ninfinity.contructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String configPath = "com/ninfinity/contructorinjection/config.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		
//		Student s1 = context.getBean("std1",Student.class);
//		System.out.println(s1);
//		System.out.println("------------------------------------------");
//		
//		Student s2 = context.getBean("std2",Student.class);
//		System.out.println(s2);
//		System.out.println("------------------------------------------");
//		
//		Student s3 = context.getBean("std3",Student.class);
//		System.out.println(s3);
//		System.out.println("------------------------------------------");
		
		
		Employee e1 = context.getBean("emp1",Employee.class);
		System.out.println(e1);
	}
}
