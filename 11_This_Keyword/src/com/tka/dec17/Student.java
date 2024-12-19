package com.tka.dec17;

public class Student 
{
	private int roll;
	private String name;
	private String email;
	
	public Student(int roll) {
		
		this.roll = roll;
	}
	
	public Student(int roll, String name) 
	{
		//this(roll,name,name); // Recursion is not allowed 
		this(roll);
		//this.roll = roll;
		
		this.name = name;
	}

	public Student(int roll, String name, String email) 
	{
		//System.out.println();// Not allowed 
		this(roll,name );
		//this.roll = roll;
		//this.name = name;
		this.email = email;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	

	
	


}
