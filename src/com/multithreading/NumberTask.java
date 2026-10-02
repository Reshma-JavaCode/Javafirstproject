package com.multithreading;

public class NumberTask implements Runnable{

	public static void main(String[] args) {

		System.out.println("main method started!!!");
		Thread.currentThread().setName("NumberTask");
		System.out.println(Thread.currentThread());//Thread[#3,NumberTask,5,main]
		
		
		NumberTask n=new NumberTask();
		Thread t=new Thread(n);
		t.start();
		System.out.println("main method ended!!!");
		
	}

	@Override
	public void run() {
		System.out.println("run method started");
		System.out.println(Thread.currentThread());//Thread[#26,Thread-0,5,main]
		
		for(int i=1;i<=20;i++)
		{ 
			if(i%2==0)
			System.out.println(i);
		}
		System.out.println("run method ended");
	}

}
