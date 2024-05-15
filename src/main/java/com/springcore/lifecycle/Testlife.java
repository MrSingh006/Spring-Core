package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testlife {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("com\\springcore\\lifecycle\\lifecycleConfig.xml");
		/*
		 * registerShutdownHook: this method is used to call destroy. It lies inside
		 * AbstractApplicationContext instead of normal ApplicationContext
		 */
		
		context.registerShutdownHook();
		
		Item it = (Item) context.getBean("item");
		System.out.println(it);
		
		
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);
		
		Example eg = (Example) context.getBean("example");
		System.out.println(eg);
	}

}
