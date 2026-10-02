package com.multithreading;

public class TestDemo5 extends Thread{

	public static void main(String[] args) {

		System.out.println("Main method started");		
		Thread t=new TestDemo5();
		t.start();
		System.out.println("Main method ended");
		
	}

	@Override
	public void run()
	{
		System.out.println("run method started");
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("run method ended");
		
	}
}
