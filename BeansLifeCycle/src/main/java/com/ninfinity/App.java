package com.ninfinity;

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

		String configclass = "com/ninfinity/config.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configclass);
		
		context.registerShutdownHook();
		
//		Car c1 = context.getBean("car1",Car.class);
//		System.out.println(c1);
		
		
//		Computer c1 = context.getBean("comp1",Computer.class);
//		System.out.println(c1);
		
		Mobile m1 = context.getBean("mob1",Mobile.class);
		System.out.println(m1);
		
		

	}
}
