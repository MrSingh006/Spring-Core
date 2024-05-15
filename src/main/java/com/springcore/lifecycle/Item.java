package com.springcore.lifecycle;

public class Item {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Item(double price) {
		super();
		this.price = price;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Init method called");
	}
	public void destroy()
	{
		System.out.println("Destroy method called");
	}
}
