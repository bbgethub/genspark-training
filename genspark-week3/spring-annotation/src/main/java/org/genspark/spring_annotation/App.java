package org.genspark.spring_annotation;

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
        Phone phone = context.getBean(Phone.class);
        System.out.println(" Phone " +  phone);
        Employee employee=(Employee)context.getBean(Employee.class);
        Employee employee2=(Employee)context.getBean(Employee.class, "pkg2Address");
        System.out.println(" employee " +  employee);
        System.out.println(" employee2 " +  employee2);
    }
}
