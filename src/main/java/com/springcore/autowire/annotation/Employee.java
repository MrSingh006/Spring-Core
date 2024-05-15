package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address1")   // by @ qualifier annotation we can define multiple beans
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setter auto By name,type");
		this.address = address;
	}
	
	public Employee() {
		super();
	}

	
	public Employee(Address address) {
		super();
		this.address=address;
		System.out.println("By constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}
