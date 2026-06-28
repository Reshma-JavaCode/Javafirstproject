package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWritr {

	public static void main(String[] args) throws FileNotFoundException {

		//File f = new File("E:\\testFiles\\reshu.txt");
		//PrintWriter pw= new PrintWriter(f); //or
		PrintWriter pw= new PrintWriter("E:\\testFiles\\printwriter.txt");
		
		pw.println("Hello PrintWriter");
		pw.println(65);
		pw.println('A');
		pw.println(5.5);
		pw.println(120.77);
		System.out.println("writing into the text file successfully");
		pw.close();
	}

}
