package com.tka.dec17;

public class Calculator {
	
	@SuppressWarnings("unused")
	private int price; 
	Calculator(int p)
	{
		price = p; // this is added by JVM
	}
	public int addTwo(int a, int b)
	{
		return a+b;
	}
	
	public int addAvg(int a, int b)
	{
		System.out.println("Address of this "+this);
		//addTwo(a, b);
		int sum = addTwo(a, b);
		return (sum/2);
	}

}
