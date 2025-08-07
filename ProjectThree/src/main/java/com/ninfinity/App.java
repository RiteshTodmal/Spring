package com.ninfinity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/ninfinity/config.xml");
//        System.out.println(context);
//        
//        
//        Student s1 = (Student) context.getBean("st1");
//        System.out.println(s1);
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(context);
        
        
        Student s1 = (Student) context.getBean("st1");
        System.out.println(s1); 
    }
}
