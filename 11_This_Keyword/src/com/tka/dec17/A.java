package com.tka.dec17;

public class A 
{
	int b = 10;
	
	public void m1()
	{
		int b = 500;
		// if local var name and global var name is same then JVM do not add "this" automatically
		System.out.println("b ="+b); // color of b
		System.out.println("this b ="+this.b); // color of b
		System.out.println("Sum (Global + Local)="+(b+ this.b)); // color of b
		
		System.out.println("Sum (Local+Local) ="+(b+b)); // color of b
	}
	
	public static void m2()
	{
		
		//return this.b*2;
		//System.out.println("this b ="+this.b);
		System.out.println("\"this\" can't be used in static method");
	
	}
	
}
