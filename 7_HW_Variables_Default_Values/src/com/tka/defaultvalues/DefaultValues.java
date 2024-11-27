package com.tka.defaultvalues;

public class DefaultValues {
	
	int i; 
	float f;
	double d;
	char c;
	short s;
	long l;
	byte b;
	boolean bo;
	String str;
	
	public void m1() {
		byte b1 = -128 ; // -129 is not working
		System.out.println("b1 (min) ="+b1);
		
		b1 = 127; // 128 not working 
		System.out.println("b1 (max) ="+b1);
	}
	
	public void printDefaultValues() {
		System.out.println("int i D.V ="+i);
		System.out.println("float f D.V ="+f);
		System.out.println("double d D.V ="+d);
		System.out.println("char c D.V ="+c);
		System.out.println("short  s D.V ="+s);
		System.out.println("long l D.V ="+l);
		System.out.println("byte b D.V ="+b);
		System.out.println("boolean bo D.V ="+bo);
		System.out.println("String str D.V ="+str);
		
		
	}
	

}
