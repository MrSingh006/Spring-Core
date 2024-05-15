package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		/* Student student = context.getBean("firstStudent",Student.class); */
		
		Student student = context.getBean("getStudent",Student.class);
		
			System.out.println(student);
			student.study();
	}

}
