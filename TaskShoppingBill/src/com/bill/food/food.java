package com.bill.food;
import com.bill.shoppingBill;


public class food {
	
	shoppingBill obj = new shoppingBill();
	public void clothItemBill(double foodBasePrice) {
		// TODO Auto-generated method stub
		shoppingBill.Str = "Food";
		shoppingBill.foodCount += 1 ;
		shoppingBill.rateGST = 0.08;
		
		double GST =  obj.calGST(foodBasePrice); 	// Calculate GST
		double unitPrice = foodBasePrice += GST;	// Calculate Unit price = Base price + GST
		
		System.out.println(shoppingBill.Str +" "+shoppingBill.foodCount +"\t\t\t\t\tUnit price "+"\t"+unitPrice ); 	// Print Unit price 
		//System.out.println(shoppingBill.Str +"\tTotal count= "+shoppingBill.electCount +"\tTotal price ="+elect_Total);
		
		shoppingBill.food_Total += unitPrice ;		

}
}