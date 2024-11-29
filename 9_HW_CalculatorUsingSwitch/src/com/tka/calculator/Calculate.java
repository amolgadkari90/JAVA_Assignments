package com.tka.calculator;
import java.util.Scanner;

public class Calculate {
	
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	Scanner sc = new Scanner(System.in);
	//Calculate obj1 = new Calculate();
	Operation obj2 = new Operation ();
	
	
	public void enterChoice() 
	{
		System.out.println("My first Java Calculator!");
		System.out.println("Choose an operation:(from 1 to 6)");
		System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. modulus (%)");
        System.out.println("6. Power (^)");
        
        int choice = sc.nextInt();
        calculation(choice);
	}
	
	public void scanNumbers() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter double datatype num1 = ");
		num1 = sc.nextDouble();
		System.out.println("Enter double datatype num2 = ");
		num2 = sc.nextDouble();
		
	}
			
	public void calculation(int choice) 
	{
		String str = "";
		switch (choice) 
		{
			case 1:
				str= "+";
				scanNumbers();
				result = obj2.addTwo(num1, num2);
				displayResult(str,result);
				break;
				
			case 2:
				str= "-";
				scanNumbers();
				result = obj2.subTwo(num1, num2);
				displayResult(str,result);
				break;
				
			case 3:
				str= "*";
				scanNumbers();
				result = obj2.mulpTwo(num1, num2);
				displayResult(str,result);
				break;
				
			case 4:
				str= "/";
				scanNumbers();
				result = obj2.divTwo(num1, num2);
				displayResult(str,result);
				break;
				
			case 5:
				str= "%";
				scanNumbers();
				result = obj2.modTwo(num1, num2);
				displayResult(str,result);
				break;
				
			case 6:
				str= "^";
				scanNumbers();
				result = obj2.pwrTwo(num1, num2);
				displayResult(str,result);
				break;
			
			default:
				System.out.println("Error - Invalid choice of operation");
				break;
				
		
		}
		enterChoice();
		
	}
	
	public void displayResult(String str, double result) {
		// TODO Auto-generated method stub
		for(int i =1 ; i <=50 ; i++)
			System.out.print(str);
		System.out.println("");
		System.out.println(num1 +" "+str+" "+num2+" = "+result);
		for(int i =1 ; i <=50 ; i++)
			System.out.print(str);
		System.out.println("");
		
	}
	

}
