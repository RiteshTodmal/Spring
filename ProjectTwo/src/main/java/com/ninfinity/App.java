package com.ninfinity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        Student s1 =(Student) context.getBean("std1");
        
        System.out.println(s1);
        
    }
}
