package com.bill.electrical;
import com.bill.shoppingBill;

public class electrical {
	shoppingBill obj = new shoppingBill();
	public void electricalItemBill(double electBasePrice) {
		// TODO Auto-generated method stub
		shoppingBill.Str = "Electrical";
		shoppingBill.electCount += 1 ;
		shoppingBill.clothCount = 0;
		
		
		shoppingBill.rateGST = 0.15;
		
		double GST =  obj.calGST(electBasePrice); 	// Calculate GST
		double unitPrice = electBasePrice += GST;	// Calculate Unit price = Base price + GST
		
		System.out.println(shoppingBill.Str +" "+shoppingBill.electCount +"\t\t\t\tUnit price "+"\t"+unitPrice ); 	// Print Unit price 
		//System.out.println(shoppingBill.Str +"\tTotal count= "+shoppingBill.electCount +"\tTotal price ="+elect_Total);
		
		shoppingBill.elect_Total += unitPrice ;		
		
	}

}
