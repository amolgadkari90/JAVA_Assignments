/**
 * 
 */
package Test;
import com.jbk.B; // If we use fully qualified name then no need to import that class


/**
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.jbk.A var1 = new com.jbk.A();// Use fully qualified name 
		com.tka.A var2 = new com.tka.A();// Use fully qualified name
		B var3 = new B();
		int r1 = var1.m1();
		int r2 = var2.m2();
		System.out.println(r1);
		System.out.println(r2);
	}
		


}
