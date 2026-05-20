package com.languagefundamentals.methods;

import java.util.Scanner;

//Math class belongs to java.lang

public class Circle {
 
 	double circleArea(int r)
 	{
	 double area=Math.PI*r*r;
	 return area;
 	}
 
 	double circleVolume(int r) {
 		double vol=(4*3.14*(Math.pow(r, 3))/3);
 		return vol;
 	}
 
 	double circleParameter(int r) {
 		double para=2*3.14*r;
 		return para;
 	}
 	
	public static void main(String[] args) {
	 Circle c=new Circle();
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter radius: ");
	 int r=sc.nextInt();
	 
	 double a=c.circleArea(r);
	 System.out.println("Area of Circle is: "+a);
	 
	 double v=c.circleVolume(r);
	 System.out.println("Volume of circle is: "+v);
	 
	 double p=c.circleParameter(r);
	 System.out.println("Parameter of Circle is: "+p);
	 
	}

}
