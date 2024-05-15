package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*init & destroy calling using Annotation*/

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void initialize()
	{
		System.out.println("Annotation init called");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Annotation destroy called");
	}

}
