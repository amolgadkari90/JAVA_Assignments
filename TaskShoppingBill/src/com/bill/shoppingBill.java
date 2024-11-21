package com.bill;
import com.bill.cloth.*;
import com.bill.electrical.*;
import com.bill.food.food;
/*All Global variables are here*/

public class shoppingBill {
	
		
		static public double elect_Total;
		static public double food_Total;
		static public double cloth_Total;
		static public double total_Bill;
		static public double discounted_Bill;
		
		
		/*GST*/
		static public double rateGST;
		
		/*Counter and String*/
		static public String Str;
		static public int electCount;	// {Elect, food, cloth}
		static public int clothCount;
		static public int foodCount;
		static public int totalItemCount;
		static public double discount = 0.2;
		
		public double calGST(double basePrice) 
		{
			
			double priceGST = basePrice * rateGST;
			return priceGST;
		}
			
			
		public void discountedBill (double ele1, double ele2, double f1, double f2, double c1) 
		{
			//shoppingBill obj = new shoppingBill();
					
					
			electrical obj1 = new electrical();
			obj1.electricalItemBill(ele1);
			obj1.electricalItemBill(ele2);
			System.out.println("======================================================================");
			System.out.println(shoppingBill.Str +"\tTotal Elect count= "+shoppingBill.electCount +"\tTotal price"+"\t\t"+elect_Total); 	// Print Unit price 
			System.out.println("");
			total_Bill += elect_Total ;
			shoppingBill.totalItemCount += shoppingBill.electCount;
			
			food obj2 = new food();
			obj2.clothItemBill(f1);
			obj2.clothItemBill(f2);
			System.out.println("======================================================================");
			System.out.println(shoppingBill.Str +"\t\tTotal Food count= "+shoppingBill.foodCount +"\tTotal price"+"\t\t"+food_Total); 	// Print Unit price 
			System.out.println("");
			total_Bill += food_Total ;
			shoppingBill.totalItemCount += shoppingBill.foodCount;
			
			cloth obj3 = new cloth();
			obj3.clothItemBill(c1);
			System.out.println("=======================================================================");
			System.out.println(shoppingBill.Str +"\t\tTotal Cloth count= "+shoppingBill.clothCount +"\tTotal price"+"\t\t"+cloth_Total); 	// Print Unit price 
			System.out.println("");
			total_Bill += cloth_Total ;
			shoppingBill.totalItemCount += shoppingBill.clothCount;
			System.out.println("=======================================================================");
			System.out.println("Total bill"+"\tTotal item count= "+shoppingBill.totalItemCount +"\tTotal price"+"\t\t"+total_Bill); 	// Print Unit price
			System.out.println("");
			double discountedTotal = shoppingBill.discount();
			System.out.println("=======================================================================");
			System.out.println("Total bill after discount"+"\t\tTotal price"+"\t\t"+discountedTotal); 	// Print Unit price
			
			
					
			
				
				
		}


		private static double discount() {
			// TODO Auto-generated method stub
			//shoppingBill C1 = new shoppingBill();
			//System.out.println("=======================================================================");
			System.out.println("Total discount "+"\t\t\t\t\t\t\t"+total_Bill*discount); 	// Print Unit price
			double res = total_Bill - total_Bill*discount;
			
					
			return res;
		}
}
