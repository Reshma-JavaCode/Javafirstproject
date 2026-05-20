package com.languagefundamentals.methods;

import java.util.Scanner;

//square=s*s; rect=lb; circle=PI*r*r; triangle=0.5bh

public class AreasOfAll {

	static double squareArea(double s)
	{
		return s*s;
	}
	
	static double rectArea(double l,double b)
	{
		return l*b;
	}
	
	static double circleArea(double r)
	{
		return Math.PI*r*r;
	}
	
	static double triangleArea(double b,double h)
	{
		return 0.5*b*h;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter s value:");
		double s=sc.nextDouble();
		double as=squareArea(s);
		System.out.println("area of square: "+as);
		
		System.out.println("Enter l value:");
		double l=sc.nextDouble();
		System.out.println("Enter b value:");
		double b=sc.nextDouble();
		double ar=rectArea(l,b);
		System.out.println("area of rectangle: "+ar);
		
		System.out.println("Enter r value:");
		double r=sc.nextDouble();
		double ac=circleArea(r);
		//up to 2 decimal
		String f=String.format("%.2f",ac);
		System.out.println("area of circle: "+f);
		
		System.out.println("Enter b value:");
		double b1=sc.nextDouble();
		System.out.println("Enter h value:");
		double h=sc.nextDouble();
		double at=triangleArea(b1,h);
		System.out.println("area of triangle: "+at);		
	}

}
