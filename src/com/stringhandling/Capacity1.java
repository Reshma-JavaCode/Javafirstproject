package com.stringhandling;

public class Capacity1 {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer();

		System.out.println("Main method started...");
		System.out.println(s1.capacity());// 16

		System.out.println("String capacity:");
		StringBuffer s2 = new StringBuffer("java");
		// 16 + length of string= 16 + 4= 20
		// 16 + string.length()
		System.out.println(s2.capacity());// 20

		System.out.println("S3 string capacity:");
		StringBuffer s3 = new StringBuffer();
		s3.append("Vcube");// 5
		System.out.println(s3.capacity());// 16

		System.out.println("New String s4:");
		StringBuffer s4 = new StringBuffer();
		s4.append("ReshmaReshmaReshma");// 18
		// newCapacity = oldCapacity * 2 + 2
		// newCapacity= 16*2+2=24 //here, old capacity=initial capacity
		System.out.println(s4.capacity());// 16*2+2 = 34

		System.out.println("Existing String s4 appending with 24chars:");
		s4.append("ReshmaReshmaReshmaReshma");// 24
		// existing length= 18
		// new length= 18+24= 42 > oldcapacity(34)
		//so,caluculate new capacity:-
		// newCpacity= 34*2+2 =68+2=70
		//now, 42<=70
		System.out.println(s4.capacity());// 70

		// s5: completely new string var
		// so, initial capacity =16char
		// newCapacity = oldCapacity * 2 + 2
		// newCap= 16*2+2=34
		System.out.println("New String s5:");
		StringBuffer s5 = new StringBuffer();//capacity=16
		s5.append("ReshmaReshmaReshmaReshma");// 24
		//24>16 so,new capacity= 16*2+2=34
		//24<=34
		System.out.println(s5.capacity());// 34
		
		
		StringBuffer s6=new StringBuffer("Reshma");//16+6=22 capacity
		System.out.println("S6 1st capacity: "+s6.capacity());//22
		
		
		s6.append("Reshma");//6
		System.out.println("Length: "+s6.length());
		//s6 length=6+6=12
		//12<=22(capacity)
		System.out.println(s6.capacity());//22
		
		s6.append("ReshmaReshmaReshmaReshmaReshmaReshma");//36
		//36+12=48
		System.out.println(s6.length());
		System.out.println(s6.capacity());//48>22
		//22*2+2=46 but,46 is still smaller than the required 48.
		//so,final capacity =48 string length
		
		System.out.println("Main method ended...");
	}

}
