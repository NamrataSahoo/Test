package com.doit.basic;


public class Student {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void displayInfo()
	{
		System.out.println("student name is" + name);
	}

}
