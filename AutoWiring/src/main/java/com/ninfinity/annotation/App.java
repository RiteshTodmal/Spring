package com.ninfinity.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String configpath = "com/ninfinity/annotation/config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configpath);
        
        Student s1 = context.getBean("st1",Student.class);
        System.out.println(s1);
    }
}
