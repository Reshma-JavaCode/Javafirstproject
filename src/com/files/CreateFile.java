package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f=new File("E:\\testFiles\\reshu.txt");
		boolean status= f.createNewFile();
		
		if(status)
			System.out.println("File created succ");
		else
			System.out.println("Not succ");
		
		FileWriter fw=new FileWriter(f);
		fw.write(65);
		fw.write('\n');
		fw.write("Hello world");
		//System.out.println(fw);
		fw.flush();
		fw.close();
		
		
		FileReader fr=new FileReader(f);
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
			//Thread.sleep(700);
		}
		fr.close();
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());
		
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());
		
		File f3= new File("E://");
		String names[]=f3.list();
		int count=0;
		for(String name:names)
		{
			System.out.println(name);
			count++;
		}
		System.out.println("Total files are: "+count);
//		
//		File f2=new File("E:\\testFiles\\reshudir");
//		boolean st= f2.mkdir();
//		if(st)
//			System.out.println("File created succ");
//		else
//			System.out.println("Not succ");
//	
//		
	}

}
