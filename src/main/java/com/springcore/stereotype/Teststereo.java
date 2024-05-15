package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teststereo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com\\springcore\\stereotype\\stereoconfig.xml");

		/*
		 * here we are getting reference "student" which is camel case notation of class
		 * Student. It is created automatically.
		 */

		/* Student stu = context.getBean("student",Student.class); */

		Student stu = context.getBean("abc",Student.class); // bean reference changed
		System.out.println(stu);
		
		System.out.println(stu.getAddress());
		System.out.println(stu.getAddress().getClass().getName());
		
		System.out.println("*********** Testing Scope of class ***********");
		
		/* on writing prototype we are getting different hashCodes means 2 different objects*/
		
		Student stu1 = context.getBean("abc",Student.class);
		System.out.println(stu1.hashCode());
		System.out.println(stu.hashCode());
		
		Teacher t1 = context.getBean("teacher",Teacher.class);
		Teacher t2 = context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
	}
}
