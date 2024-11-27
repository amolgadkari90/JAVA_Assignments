package com.ReverseNumber;

public class ReverseNumber {
	
	public int reverseThreeDigNumb(int temp) {
		int num = 0;

		num = 100 * (temp%10);
		temp /= 10;
		num += 10 * (temp%10);
		temp /= 10;
		num += (temp%10);
		return num;	
		
	}

}
