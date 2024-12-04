package com.tka.dec4;

public class Test {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		LearnMathClass obj = new LearnMathClass(0, "TKA", 'A', Math.PI); // double Math.PI() double
		System.out.println("PI value ="+LearnMathClass.pi);
		//System.out.println("PI value ="+obj.pi);
		 
		obj.d = Math.toRadians(90);				// double Math.toRadians(double) => Degree to Radians 
		System.out.println("Theta = "+obj.d);	//1.57
		
		
		obj.d = Math.sin(obj.d);				// double Math.sin(double) => sin function
		System.out.println("sin(90) ="+obj.d);	//1.0
		
		obj.d = Math.asin(obj.d);				// double Math.asin(double) => Sin inverse 
		System.out.println("asin(1) ="+obj.d);	//1.57
		
		obj.d = Math.toDegrees(obj.d);			// double Math.toRadians(double) = 
		System.out.println("asin(1) ="+obj.d);	// 90
		
		obj.d = Math.IEEEremainder(10.15,3);	// returns remainder in fraction double Math.IEEEremainder(double , double)
		System.out.println("IEEEremainder ="+obj.d); // 1.1500000000000004
		
		obj.d = Math.ceil(10.152313);			//the smallest (closest to negative infinity) double ceil(double)
		System.out.println("ceil(10.152313) ="+obj.d); // 11
		
		System.out.println(Math.ceil(0.60));	//1.0
		System.out.println(Math.ceil(0.40));	//1.0
		System.out.println(Math.ceil(5));		//5.0
		System.out.println(Math.ceil(5.1));		//6.0
		System.out.println(Math.ceil(-5.1)); 	//-5.0
		System.out.println(Math.ceil(-5.9)); 	//-5.0
		
		obj.d = Math.floor(10.152313);			//the largest (closest to positive infinity) double floor(double)
		System.out.println("floor(10.152313) ="+obj.d); // 10
		
		System.out.println(Math.floor(0.60));	//0.0
		System.out.println(Math.floor(0.40));	//0.0
		System.out.println(Math.floor(5));		//5.0
		System.out.println(Math.floor(5.1));	//5.0
		System.out.println(Math.floor(-5.1)); 	//-6.0
		System.out.println(Math.floor(-5.9)); 	//-6.0
		
		
		obj.d = Math.rint(10.152313);			//double rint(double a)
		System.out.println("rint(10.152313) ="+obj.d); // 10
		
		
		System.out.println(Math.rint(0.60));	//1.0
		System.out.println(Math.rint(0.40));	//0.0
		System.out.println(Math.rint(5));		//5.0
		System.out.println(Math.rint(5.1));		//5.0
		System.out.println(Math.rint(-5.1)); 	//-5.0
		System.out.println(Math.rint(-5.9)); 	//-6.0
		
		
		obj.d = Math.pow(2,3);					// double pow(double, double)
		System.out.println("pow(2,3) ="+obj.d); // 10
		
		
		System.out.println("addExact (10, 9) = "+Math.addExact(10, 9));	//int addExact(int x, int y) = 19
		

		System.out.println("abs (-10)="+Math.abs (-10)); // 10  int abs(int a)
		
		
		
		
		
		
		
		
		
		
		 
		 
		
		
		
		
		

	}

}
