package com.tka.jan2;

public class TestBank {
	public static void main(String[] args) 
	{
		//System.out.println("Opening balance ="+ Bank.balance);
		System.out.println("I am main thread");
		Bank b1 = new Bank();
		Thread t1 = new Thread(b1);
		t1.setName("Amazon");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		Bank b2 = new Bank();
		Thread t2 = new Thread(b2);
		t2.setName("Myntra");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		
		
		
	}

}
