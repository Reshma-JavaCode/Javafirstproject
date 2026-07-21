package com.methodoverloading;

public class Demo1 {
	
	//Square 
	double findArea(double side)
	{
		return side*side;
	}

	//Rectangle
	double findArea(double l,double b)
	{
		return l*b;
	}
	
	//Circle
	float findArea(float r)
	{
		return (float)(2*(Math.PI)*r*r);
	}
	
	//Triangle
	Double findArea(double b,float h)
	{
		return 0.5*b*h;
	}
	
	public static void main(String[] args) {

		System.out.println("Main method started...");
		Demo1 d=new Demo1();
		
		//findArea(10);->10 is int
		//but int args not ther
		//so,it checks order:-
		// *** byte-short-int-long-float-double
		//10 goes to float argument i.e circle method
		
		String res1= String.format("%.2f", d.findArea(10.2));
		System.out.println("Area of Square: "+res1);
		
		System.out.println("Area of Rectangle: "+d.findArea(10.3,25.2));
		
		//String res2= String.format("%.2f", d.findArea(10));
		//System.out.println("Area of Circle: "+res2);
		System.out.println(String.format("Area of Circle= %.2f",d.findArea(10)));
		
		String res3= String.format("%.2f", d.findArea(10, 30));
		System.out.println("Area of Triangle: "+res3);
			
		System.out.println("Main method ended..");
		
	}

}
