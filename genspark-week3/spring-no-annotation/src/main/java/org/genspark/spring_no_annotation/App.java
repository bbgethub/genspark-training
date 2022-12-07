package org.genspark.spring_no_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Student student = (Student) context.getBean("student");
		context.close();
		System.out.println(student.toString());
	}
}
