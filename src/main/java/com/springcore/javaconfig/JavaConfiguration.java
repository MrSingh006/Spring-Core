package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@configuration annotation tells the program that this is java configuration file
 *  which is replacement of xml based configuration file.
 *  We use @componentScan annotation to define the base package name this is replacement 
 *  of <context:componentScan basePackage""> that we used to enter in xml file
 *  Note : We can also comment @ComponentScan as we are not using @component annotation*/

//We do not have to write methods when we are writing @Component


@Configuration
/* @ComponentScan(basePackages = "com.springcore.javaconfig") */
public class JavaConfiguration {
	
	/*
	 * We are removing @Component annotation from our bean class to do so we need to
	 * explicitly create bean object here in config file like shown below and mark it 
	 * as @Bean
	 */
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean
	// we can also write our own name for bean it takes array as argument
	/* @Bean(name = {"con","student","temp"}) we can add multiple names */
	public Student getStudent()
	{
		// creating new student object   Note:Here method name is Bean id 
		// adding Samosa bean dependency
		Student student = new Student(getSamosa());
		return student;
	}
}
