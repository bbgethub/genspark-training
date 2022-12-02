package org.genspark.SpringSpELExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context
        = new ClassPathXmlApplicationContext(
            "Spring.xml");
    // Try block to check for exceptions
    try {
        Training training
            = (Training)context.getBean("training");
        System.out.println(training.getTopic());
    }

    // finally block that will execute for sure
    finally {
        // Closing the connections
        // using close() method
        context.close();
    }
    }
}
