package com.tka.dec17;

public class Test {

	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub
		  
		 Calculator c1 = new Calculator(999);
		 System.out.println("Address of c1 ="+c1); c1.addAvg(10, 10);
		 System.out.println("**********");
		 
		 Calculator c2 = new Calculator(999);
		 System.out.println("Address of c2 ="+c2); c2.addAvg(20, 20);
		 System.out.println("**********");
		  
		 c1.addAvg(30, 30); System.out.println("**********");
		 
		 c2.addAvg(40, 40); System.out.println("**********");
		 
		 c1 = c2;
		 System.out.println("Address of c1 ="+c1);
		 System.out.println("Address of c2 ="+c2);
		 c1.addAvg(50, 50); System.out.println("**********");
		 
		 System.out.println("*****First section over *****");
		 System.out.println("");
		 
		 System.out.println("*****Constuctor \"this()\"*****");
		 A obj = new A(); //
		 obj.m1();
		 
		 System.out.println("*****Second section over *****");
		 System.out.println("");
		 System.out.println("*****Call \"this\" is static class *****");
		 A.m2();
		 
		 

	}

}
