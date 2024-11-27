package com.FindSumOfDigits;

public class sumOfDigits {

	public int sumOfDigs(int temp) {
		// TODO Auto-generated method stub
		//int i ;
		int sum = 0;
		while (temp != 0) {
			sum += (temp % 10); 
			//System.out.println("Sum = "+sum);
			temp = temp/10;
			
		} 		
		return sum;
	}

}
