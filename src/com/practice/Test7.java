package com.practice;

//Passing Command line argumenets in eclipse:
//1) Run->Run as Configuration->Select project->
//Click argumenet tab-> give args with spaces ->APPLY->Run

public class Test7 {

	public static void main(String[] args) {

		System.out.println("Total args: "+args.length);
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println("args[" + i + "] = "+args[i]);
		}
		
		//Output:
//		Total args: 3
//		args[0] = Reshma
//		args[1] = 27
//		args[2] = Java

	}

}
