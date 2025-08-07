package com.ninfinity.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		String configPath = "com/ninfinity/constructorinjection/ambiguity/config.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
		
		Addition a1 = context.getBean("add1",Addition.class);
		a1.doSum();
		System.out.println("---------------------------------------------");
		
		Addition a2 = context.getBean("add2",Addition.class);
		a2.doSum();
		System.out.println("---------------------------------------------");
		
		Addition a3 = context.getBean("add3",Addition.class);
		a3.doSum();
		System.out.println("---------------------------------------------");
		
		Addition a4 = context.getBean("add4",Addition.class);
		a4.doSum();
		System.out.println("---------------------------------------------");
		
	}
}
