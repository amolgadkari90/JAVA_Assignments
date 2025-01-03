package com.tka.jan2;

public class Bank implements Runnable {
	static private int balance = 1000;

	@Override
	public void run() {
		for (int i = 0 ; i <10; i++)
			try {
				Withdraw(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	static synchronized private void Withdraw(int i) throws InterruptedException 
	{
		if (balance >= i)
		{
			System.out.println(Thread.currentThread().getPriority() + Thread.currentThread().getName());
			balance = balance-i;
			System.out.println(balance);
			Thread.sleep(500);
		} else 
		{
			System.out.println("Insufficient balance");
		}
		
		
	}
	
	

}
