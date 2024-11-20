/**
 * 
 */
package Calculator;

/**
 * 
 */
import Abc.Abc; 
public class TestCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Returns = int data type after multiplication
		 */
		Calculator C1 = new Calculator ();
		int result = C1.addTwo(10, 20);		
		System.out.println("Result ="+result);
		/*
		 * Returns = String data type 
		 */
		Calculator M1 = new Calculator ();
		String Msg = M1.TestMsg(1);
		System.out.println(Msg);
		/*
		 * Returns = int data type after multiply by 2
		 */		
		Calculator M2 = new Calculator ();
		int twice = M2.MultiByTwo(10);
		System.out.println("Multiply by 2 = "+twice);
		/*
		 * Returns = int data type in different way
		 */
		Calculator Z1 = new Calculator();
		int res = Z1.Zzz(twice, Msg);
		System.out.println("Print int = "+res);
		/*
		 * Returns = Class data type 
		 */
		Calculator A1 = new Calculator();
		Abc res1 = A1.xyz();
		System.out.println("Print Roll no = "+res1.Rno);
		System.out.println("Print Roll no = "+res1.EName);
				
	}
	

}
