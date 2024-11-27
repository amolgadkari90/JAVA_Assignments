package com.tka.nov26;

public class IncrementDecrementOptr {
	
	public void incDecOptr() {
		int b = 22;
		System.out.println("Initial value of b ="+b); // initial value
		
		System.out.println("Value of b after b++ [post inc] ="+(b++)); // post increment = 22
		
		System.out.println("Value of b after ++b [pre inc] ="+(++b)); // pre increment = 24
		
		System.out.println("Value of b after b-- [post dec] ="+(b--)); // post decrement = 24
		
		System.out.println("Value of b after --b [pre dec] ="+(--b)); // pre decrement = 22
		
		
	}
	

}
