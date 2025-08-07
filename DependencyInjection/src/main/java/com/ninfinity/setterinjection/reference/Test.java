package com.ninfinity.setterinjection.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		String config = "com/ninfinity/setterinjection/reference/config.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		Teacher t1 = context.getBean("teacher1",Teacher.class);
		System.out.println(t1);
		
		Teacher t2 = context.getBean("teacher2",Teacher.class);
		System.out.println(t2);
	
		Teacher t3 = context.getBean("teacher3",Teacher.class);
		System.out.println(t3);
	
	}
}
