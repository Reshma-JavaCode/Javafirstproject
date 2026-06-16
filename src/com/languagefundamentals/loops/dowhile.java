package com.languagefundamentals.loops;

public class dowhile {

	public static void main(String[] args) {
		int a=10;
		
		do {
			System.out.println(a+"Hello");
			a++;
			//if no condition 
			//it leads to infinity loop
		}while(a<15);
	}

}
