package com.ninfinity.standalone;

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
        String configpath = "com/ninfinity/standalone/config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configpath);
        
//        Person p1 = context.getBean("per1",Person.class);
//        System.out.println(p1);
//        
//        Teacher t1 = context.getBean("ter1",Teacher.class);
//        System.out.println(t1);
        
        Student s1 = (Student)context.getBean("student");
        System.out.println(s1);
        
        
    }
}
