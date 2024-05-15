package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Persons {
	private List<String> friends;
	private Map<String,Integer> feeStructure;
	private Properties properties;
	
	/* NOTE : Properties itself is a class unlike list, map which are interfaces */

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Persons [friends=" + friends + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}

	
	
}
