package com.arrays;

public class StringArray1 {

	public static void main(String[] args) {	
		System.out.println("String array");
		String[] names;
		names=new String[3];
		names[0]="Reshma";
		names[1]="Vijaya";
		names[2]="Bhargavi";
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("\nChar array");
		char[] grades=new char[3];
		grades[0]= 'A';
		grades[1]= 'B';
		grades[2]= 'C';
		for(int i=0;i<grades.length;i++)
		{
			System.out.print(grades[i]+" ");
		}
		
		System.out.println("\nFloat array");
		//Float
		float[] f=new float[2];
		f[0]=1.2f;
		f[1]=33;
		for(int i=0;i<f.length;i++)
		{
			System.out.print(f[i]+" ");
		}
		
		//Double
		System.out.println("\nDouble array");
		double[] d=new double[2];
		d[0]=1.2;
		d[1]=90;
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}
		
		System.out.println("\nbyte array");
		byte[] b=new byte[2];
		//b[0]=128;//CE: Type mismatch: cannot convert from int to byte
		b[0]=(byte) 128;//implicit Type casting-128
		b[1]=127;
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		}
	}


