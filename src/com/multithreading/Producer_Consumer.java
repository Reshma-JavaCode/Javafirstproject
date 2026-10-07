package com.multithreading;


class Resource
{
	int i=0;
	boolean status=false;
	
	synchronized void put(int i) throws InterruptedException
	{
		while(status)
		{
			wait();
		}
		
		this.i=i;
		System.out.println("Put: "+i);
		status=true;
		notify();
	}
	synchronized void get() throws InterruptedException
	{
		while(!status)
		{
			wait();
		}
		
		
		System.out.println("get: "+i);
		status=false;
		notify();
	}
}
class Producer implements Runnable
{
	Resource r=null;
	public Producer(Resource r)
	{
		this.r=r;
		//Thread t=new  Thread(this,"Producer");
		//t.start();
	}
	@Override
	public void run() {
		
		int i=1;
		while(true)
		{
			
			try {
				r.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			    break;
			}
		}
	}
}


class Consumer implements Runnable
{
	Resource r=null;
	public Consumer(Resource r)
	{
		this.r=r;
		//Thread t=new  Thread(this,"Consumer");
		//t.start();
	}
	@Override
	public void run() {
		
		while(true)
		{
			
			try {
				r.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			    break;
			}
		}
	}
}

public class Producer_Consumer {

	public static void main(String[] args) {
		System.out.println("main started");
		Resource r=new Resource();
		Producer p=new Producer(r);
		Consumer c=new Consumer(r);
		
		Thread pt = new Thread(p, "Producer");
		Thread ct = new Thread(c, "Consumer");
		
		pt.start();
		ct.start();
		
		System.out.println("main ended");
		
	}

}
