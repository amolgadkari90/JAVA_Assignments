// Java program to demonstrate the 
// real-world example of Interfaces

//import java.io.*;

interface Vehicle 
{
    public static final int noOfPplCarry = 2; 
    static final int wheels = 2;
    final String cName = "Honda";
    int price = 100000;
    
    
    // all are the abstract methods.
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    
    
    default void whatIsInterface()
    {
    	System.out.println("This is default method in the interface");
    }
    
    
}