package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List phones;
	private Set addresses;
	private Map courses;
	private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getPhones() {
		return phones;
	}
	public void setPhones(List phones) {
		this.phones = phones;
	}
	public Set getAddresses() {
		return addresses;
	}
	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}
	public Map getCourses() {
		return courses;
	}
	public void setCourses(Map courses) {
		this.courses = courses;
	}
	
	public Employee(String name, List phones, Set addresses, Map courses, Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}
	public Employee() {
		super();
	}
	
	
}
