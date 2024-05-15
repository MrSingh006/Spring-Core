package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\autowire\\autoconfig.xml");
		/* If we do not wish to add type casting we can declare .class explicitly */
		Employee emp = context.getBean("emp1", Employee.class);
		System.out.println(emp);
	}
}
