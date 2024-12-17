package com.tka.dec16;

public class Test {

	public static void main(String[] args) 
	{
		A obj = new A();
		System.out.println(obj.a); 		// 10
		obj.m1(); 						//111
		System.out.println("**********");

		B obj2 = new B("TKA");
		System.out.println(obj2.a); 	//TKA
		obj2.m1(); 						//222
		System.out.println("**********");
		
		A obj3 = new B("TKA");
		System.out.println(obj3.a); 	// 10
		System.out.println(obj3.b); 	// 100
		obj3.m1(); 						// 222
		System.out.println("**********");
		
		//B obj4 = new A(); 			// Error
		//System.out.println(obj4.a);	// 
		//obj4.m1(); 					// 
		
		A a1 = new A();
		B b1 = new B("TKA");

		a1 = b1;
		
		System.out.println(a1.a);		// 10
		System.out.println("Variable gets resolved during compile time and called static binding");
		System.out.println("**********");
				
		a1.m1(); 						// 222
		System.out.println("Method get override due to Runtime Polymorphism");

		

	}

}
