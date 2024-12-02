package com.tka.test;
import com.tka.calculator.*;

public class TestCalulator {
	public static void main (String[] agrs) {
		
		Calculate obj = new Calculate();
		char ch = 'y'; 
		obj.enterChoice();
		
		
		do {
			
			System.out.println("Do you want to continute? (if yes press Y or y)");
			ch = obj.sc.next().charAt(0);
			System.out.println("CH = "+ch);

			if (ch == 'Y' || ch == 'y') {
				obj.enterChoice();
			} else if (ch == 'N' || ch == 'n'){
				break;
		} else {

			
			System.out.println("Error - Press Y/y to continue  or N/n to stop)");
			continue;
			
		}

			
		}while (true);

			
		
		
		
		
	}

}
