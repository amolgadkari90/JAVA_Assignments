package TestAll;

import com.FindEvenOdd.evenOdd;
import com.FindSumOfDigits.sumOfDigits;
import com.FindTotalDigits.findDigits;
import com.ReverseNumber.ReverseNumber;

public class TestAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDigits obj1 = new findDigits();
		int res1 = obj1.findDigit(123);
		System.out.println("Number digits = "+res1);
		
		sumOfDigits obj2 = new sumOfDigits();
		int res2 = obj2.sumOfDigs(123);
		System.out.println("Sum of digits = "+res2);
		
		evenOdd obj3 = new evenOdd();
		String str = obj3.checkEven(123);
		System.out.println("The number is "+str);
		
		ReverseNumber obj4 = new ReverseNumber();
		int res3 = obj4.reverseThreeDigNumb(123);
		System.out.println("The reverse number is "+res3);
		
	
		
	}

}
