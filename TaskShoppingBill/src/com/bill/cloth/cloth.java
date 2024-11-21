package com.bill.cloth;
import com.bill.shoppingBill;

public class cloth {
		shoppingBill obj = new shoppingBill();
		public void clothItemBill(double clothBasePrice) {
			// TODO Auto-generated method stub
			shoppingBill.Str = "Cloth";
			shoppingBill.clothCount += 1 ;
			shoppingBill.rateGST = 0.18;
			
			double GST =  obj.calGST(clothBasePrice); 	// Calculate GST
			double unitPrice = clothBasePrice += GST;	// Calculate Unit price = Base price + GST
			
			System.out.println(shoppingBill.Str +" "+shoppingBill.clothCount +"\t\t\t\t\tUnit price "+"\t"+unitPrice ); 	// Print Unit price 
			//System.out.println(shoppingBill.Str +"\tTotal count= "+shoppingBill.electCount +"\tTotal price ="+elect_Total);
			
			shoppingBill.cloth_Total += unitPrice ;		
			
		}
}