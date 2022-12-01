package org.genspark.SpringAOPExample1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	CustomerBo customer = (CustomerBo) context.getBean("customerBo");
    	customer.addCustomer();
    	customer.addCustomerReturnValue();
    
    }
}
