package com.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

public static void main(String[] args) throws IOException {

	File f=new File("E:\\testFiles\\reshu.txt");
	
	FileWriter fw = new FileWriter(f,true);
	
	BufferedWriter bw = new BufferedWriter(fw);
			
		bw.write(65);
		bw.newLine();
		bw.write("Hello world");
		bw.newLine();
		bw.write("Welcome");
		bw.newLine();
		bw.write("Java");
	System.out.println("Written succesfully");
	
	bw.flush();
	bw.close();
	fw.close();

}}
