package com.FindTotalDigits;

public class findDigits {
	
	public int findDigit(int num) {
		// TODO Auto-generated method stub
		int temp = 0;
		
		do {
			num = num /10;
			temp++;
			
		} while (num != 0);
		
		return temp;	
	}
	

}
