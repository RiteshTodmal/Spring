package com.ninfinity.setterinjection.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String configPath = "com/ninfinity/setterinjection/primitive/config.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		
		Student s1 = context.getBean("std1",Student.class);
		System.out.println(s1);
		
		Student s2 = context.getBean("std2",Student.class);
		System.out.println(s2);
		
		Student s3 = context.getBean("std3",Student.class);
		System.out.println(s3);
	}
}
