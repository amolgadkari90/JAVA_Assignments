/**
 * 
 */
package com.testBill;

import com.bill.shoppingBill;

/**
 * 
 */
public class testBill {
	
	public static void main(String[] args) {
		
		shoppingBill obj = new shoppingBill();
		double ele1 = 200;
		double ele2 = 300;
		double f1	= 400;
		double f2	= 500;
		double c1	= 600;
		obj.discountedBill(ele1, ele2, f1, f2, c1);
	}

}
