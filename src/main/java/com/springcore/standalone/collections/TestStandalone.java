package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandalone {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com\\springcore\\standalone\\collections\\standaloneconfig.xml");
		Persons per = context.getBean("personList",Persons.class);
		System.out.println(per);
		System.out.println(per.getFriends().getClass().getName());
		System.out.println("________________________________________________");
		System.out.println(per.getFeeStructure());
		System.out.println(per.getFeeStructure().getClass().getName());
		System.out.println("________________________________________________");
		System.out.println(per.getProperties());
		System.out.println(per.getProperties().getClass().getName());
	}

}
