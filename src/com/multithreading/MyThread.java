package com.multithreading;

public class MyThread extends Thread{

	@Override
	public void run()
	{
		System.out.println("run method started");
		for(int i=1;i<6;i++)
		{
			System.out.println("run "+i);
		}
		System.out.println("run method ended");
	}
	
	public static void main(String[] args) {

		System.out.println("Main method started");
		
		Thread t=new MyThread();
		t.start();
		 for(int i=1;i<6;i++)
		{
			System.out.println("main "+i);
		}
		
		System.out.println("Main method ended");
		
	}

}
