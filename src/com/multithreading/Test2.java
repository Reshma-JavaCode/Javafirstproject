package com.multithreading;

//to achieve multiple thread execution need multiple classes
class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 running");
        System.out.println("Thread 1 run method started");
		for(int i=1;i<6;i++)
		{
			System.out.println("Thread-1 "+i);
		}
		System.out.println("Thread 1 run method ended");
    }
}

class MyThread2 extends Thread {
    public void run() {
    	
        System.out.println("Thread 2 running");
        System.out.println("Thread 2 run method started");
		for(int i=1;i<6;i++)
		{
			System.out.println("Thread-2 "+i);
		}
		System.out.println("Thread 2 run method ended");
    }
}
class resource
{
void add()
{
	
}
}
public class Test2 {

	public static void main(String[] args) {

		System.out.println("main method started");
		
		System.out.println(Thread.currentThread());//Thread[#3,main,5,main]
			MyThread1 t1 = new MyThread1();
		    MyThread2 t2 = new MyThread2();

		    t1.start();
		    t2.start();
		    System.out.println("main method ended");
	}

}
