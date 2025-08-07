package com.ninfinity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String configPath = "com/ninfinity/config.xml";
        
        ApplicationContext context = new ClassPathXmlApplicationContext(configPath);
        
        System.out.println(context);
        
        System.out.println("---------------------------------");
        
        String filepath = "c://config.xml";
        
        ApplicationContext context1 = new FileSystemXmlApplicationContext(filepath);
        
        System.out.println(context);
        
        
        
    }
}
