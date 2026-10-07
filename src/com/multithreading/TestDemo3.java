package com.multithreading;

public class TestDemo3 extends Thread{

	public static void main(String[] args) {
		
		Thread t=new TestDemo3();
		//System.out.println(Thread.currentThread());
		// Thread[#3,main,5,main]
		//Thread[ID, Name, Priority, ThreadGroup]
		//Give me the thread that is executing the current piece of code.

		t.start();
		//t.start();//RE: java.lang.IllegalThreadStateException

		
		//we can achieve multithreading using multiple objects for one class also 
		Thread t2=new TestDemo3();
		t2.start();
		
	}

	
	@Override
	public void run()
	{
		Thread.currentThread().setName("StudentThread");
		System.out.println("Thread Name: "+Thread.currentThread().getName());
		for(int i=1;i<6;i++)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
	}
}
