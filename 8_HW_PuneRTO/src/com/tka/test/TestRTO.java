package com.tka.test;
import com.tka.nov28.*;


public class TestRTO {
	
	public static void main (String[] args) {
		int age = 17;
		AgeVerification obj = new AgeVerification();
		String str1 = obj.ageVerify(age);
		obj.printResult(age, str1);
	}
	

}
