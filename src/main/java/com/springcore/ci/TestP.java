package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestP {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\ci\\ciconfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		
		/*
		 * problem of ambiguity in constructor injection is that when we do not define
		 * type in config file by default values will go to first constructor declared.
		 * And if String type constructor is present than values will fall in string
		 * constructor irrespective of placement to avoid this always write type in
		 * config file
		 */
		
		Addition ad = (Addition) context.getBean("add");
		ad.doSum();
	}

}
