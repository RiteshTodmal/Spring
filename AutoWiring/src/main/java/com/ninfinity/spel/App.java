package com.ninfinity.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class App 
{
    public static void main( String[] args )
    {
        String configpath = "com/ninfinity/spel/config.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configpath);
        
        TestExpression te = context.getBean(TestExpression.class);
        System.out.println(te);
        
        ExpressionParser ep = new SpelExpressionParser();
		Expression ex = ep.parseExpression("11+22");
		System.out.println(ex.getValue());
		
        

        
    }
}
