package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Cretifica certi;
	
	/* we will not make getter and setters as it is constructor injection */
	
	public Person(String name, int personId, Cretifica certi) {
		this.name = name;
		this.personId =personId;
		this.certi=certi;
	}
	public Person() {
		
	}
	public String toString() {
		return this.name+" : "+this.personId+" Certificate in : "+this.certi;
	}

}
