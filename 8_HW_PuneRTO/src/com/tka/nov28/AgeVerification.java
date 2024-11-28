package com.tka.nov28;

public class AgeVerification {
	
	public String ageVerify(int age) {
		
		if (age >= 18 && age <= 75) {
			
			return "eligible";
			
		}else {
			return "not eligible";
		}
		
	}
	
	public void printResult(int age, String str) {
		System.out.println("The candidate age is "+age+".");
		System.out.println("The candidate is "+str+" for driving licence.");
	}

}
