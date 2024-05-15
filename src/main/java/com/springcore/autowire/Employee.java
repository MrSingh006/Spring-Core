package com.springcore.autowire;

public class Employee {
	
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("By name,type");
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
