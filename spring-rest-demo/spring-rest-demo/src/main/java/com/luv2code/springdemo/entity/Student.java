package com.luv2code.springdemo.entity;

public class Student {
	
	private String firstname;
	private String lastName;
	
	public Student(){}

	
	
	public Student(String firstname, String lastName) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
