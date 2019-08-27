package com.path;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*
		 * Person p = (Person) context.getBean("JG");
		 * 
		 * System.out.println(p);
		 */
		
		Person q = (Person) context.getBean("DR");
		
		System.out.println(q);
		
		/*
		 * Person r = (Person) context.getBean("AK");
		 * 
		 * System.out.println(r);
		 */
	}

}
