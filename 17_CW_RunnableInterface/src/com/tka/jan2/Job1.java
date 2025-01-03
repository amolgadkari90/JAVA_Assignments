package com.tka.jan2;

public class Job1 implements Runnable{
	
	@Override 
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Amol");
			System.out.println("Downloading file Amol.pdf");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
//	@Override 
//	public void run()
//	{
//		for (int i = 0; i< 10; i++)
//		{
//			//System.out.println();
//			System.out.println(Thread.currentThread().getName()+"Thread");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
	

}