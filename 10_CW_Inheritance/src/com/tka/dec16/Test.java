package com.tka.dec16;

public class Test {

	public static void main(String[] args) 
	{
		System.out.println("Simple Inheritance");
		System.out.println("**********");
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
		
		System.out.println("");
		
		System.out.println("Multiple level Inheritance C -> B -> A");
		C objc = new C();
		System.out.print("objc calling own method => ");
		objc.identityOfC();
		System.out.print("objc calling its parent class => ");
		objc.identityOfB();
		System.out.print("objc calling super class => ");
		objc.identityOfA();
		System.out.println("**********");
		
		System.out.println("Hierarchical inheritance i Inheritance B -> A and B2 -> A");
		B objb = new B();
		System.out.print("objb calling own method [B method] => ");
		objb.identityOfB();
		System.out.print("objb calling its parent class A => ");
		objb.identityOfA();
		System.out.println(" ");
		B2 objb2 = new B2();
		System.out.print("objb2 calling own method [B2 method] => ");
		objb2.identityOfB2();
		System.out.print("objb2 calling its parent class A => ");
		objb2.identityOfB2();		
		System.out.println("**********");

	}

}
