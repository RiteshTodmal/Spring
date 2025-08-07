package com.ninfinity.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		String configclass = "com/ninfinity/scope/config.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configclass);
		
		context.registerShutdownHook();
		
		Car c1 = context.getBean("car1",Car.class);
		System.out.println(c1);
		System.out.println(c1.hashCode());
		System.out.println("--------------------------------------------------");
		
		Car c2 = context.getBean("car1",Car.class);
		System.out.println(c2);
		System.out.println(c2.hashCode());
		System.out.println("--------------------------------------------------");
		
		
		
		Computer c3 = context.getBean(Computer.class);
		System.out.println(c3);
		System.out.println(c3.hashCode());
		System.out.println("---------------------------------------------------");
		
		Computer c4 = context.getBean(Computer.class);
		System.out.println(c4);
		System.out.println(c4.hashCode());
		System.out.println("----------------------------------------------------");
		
		
		
		

	}
}
