package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

/*@Component("firstStudent")   Here I am commenting @component annotation to use @Bean annotation*/
public class Student {
	
	// by creating samosa class we are injecting dependency.
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public void study()
	{
		samosa.display();
		System.out.println("Student is reading book");
	}
}
