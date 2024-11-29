package com.tka.nov29;
import java.util.Scanner;

public class PrintTable {
	
	Scanner sc = new Scanner(System.in);
	int num;
	//Scan number 
	public void scanNumber() 
	{
		System.out.println("Enter the integer number");
		num = sc.nextInt();	
		generateTable();
	}
		
	//Multiplication operation and print
	public void generateTable() 
	{
		display();
		System.out.println("Table of "+num);
		display();

		for (int i = 1; i <=10; i++)
			System.out.println(num+ " * "+ i + "\t = "+ (num*i));
		
		display();

	}
	
	//display better
	public void display()
	{
		for (int i = 1; i <=30; i++)
			System.out.print("*");
		System.out.println("");
	}

}
