package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor called : int, int");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
	public Addition(double a, double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Constructor called : double, double");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
	
	public Addition(String a, String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor called : string, string");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
	}
	
	public void doSum()
	{
		System.out.println("Sum is : "+(this.a+this.b));
	}
}
