package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\reference\\refconfig.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getObjB().getY());
		System.out.println(temp);		
	}
}
