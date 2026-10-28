package com.practice;

 class Engine
{
	void run()
	{
		System.out.println("Engine runs");
	}
}
 class Car
{
	 Engine e;
	public Car(Engine e)
	{
		this.e=e;
	}
	void drive()
	{
		e.run();
		System.out.println("car driving");
	}
}

public class Test15 {

	public static void main(String[] args) {
		System.out.println("main started");
		Engine e=new Engine();
		Car c=new Car(e);
		c.drive();
		System.out.println("main ended");
	}

}
