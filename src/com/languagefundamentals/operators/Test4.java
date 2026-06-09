package com.languagefundamentals.operators;

public class Test4 {

	public static void main(String[] args) {
		
		int a=10, r=0;
		 r=r+a;
		System.out.println(r);
		
		//Type mismatch: cannot convert from double to int
		// r=r+4.7;
		
		
		//narrowing/explicit tc
		r+=4.7;  
		System.out.println(r);
		
		//r=(int)(r-5.5);
		//OR
		r-=5.5; //14-5.5 = 8.5 now, int(8.5)=8
		System.out.println(r);
		
		r%=2.5;
		System.out.println(r);
		
		 
	}

}
