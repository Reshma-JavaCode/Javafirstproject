package com.multithreading;

//not multithreading
public class Test1 implements Runnable {

	@Override
	public void run() {
		System.out.println("run method started");
		for(int i=1;i<6;i++)
		{
			System.out.println("run "+i);
		}
		System.out.println("run method ended");
	
	}
	
	
	public static void main(String[] args) {

		System.out.println("Main method started");
				
		Runnable r=new Test1();
		/*Test1 t1=new Test1();
		Thread t=new Thread(t1);
		t.start();*/
		r.run();
		for(int i=1;i<6;i++)
		{
			System.out.println("main "+i);
		}
		
		System.out.println("Main method ended");
	}

	

}
