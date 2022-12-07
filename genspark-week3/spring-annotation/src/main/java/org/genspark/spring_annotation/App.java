package org.genspark.spring_annotation;

import java.util.List;

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
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       Employee employee=context.getBean("employeeBean",Employee.class);
       System.out.println(employee);
       
   
    }
}
