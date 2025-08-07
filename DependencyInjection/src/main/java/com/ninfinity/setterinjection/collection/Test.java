package com.ninfinity.setterinjection.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String config = "com/ninfinity/setterinjection/collection/config.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		Person p1 = context.getBean("person1",Person.class);
		
		System.out.println(p1);
		
	}
}
