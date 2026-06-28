package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		// File creation
		File f = new File("E:\\testFiles\\reshu.txt");

		boolean status = f.createNewFile();

		// checking
		if (status)
			System.out.println("File created successfully");
		else
			System.out.println("File already exists or Not created successfully");

		// FileWriter to write data into the file
		FileWriter fw = new FileWriter(f);
		fw.write(65);
		fw.write('\n');
		fw.write("Hello world");
		// System.out.println(fw);
		System.out.println("\nwriting data into the file succesffuly done");
		
		fw.flush();
		fw.close();

		
		// Read data from the file
		System.out.println("\nReading data from the file are:");
		FileReader fr = new FileReader(f);
		int i = fr.read();//Reads a single character.
		
		//Returns:
		//The character read, 
		//or -1 if the end of the stream has been reached
		//fr.read=-1 ---> "End of File (EOF)"

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
			// Thread.sleep(700);
		}

		fr.close();

		// To chceck total space,usable and 
		//free space in given folder or file
		System.out.println("\nTo get space Info:");
		System.out.println("Free space: "+f.getFreeSpace());
		System.out.println("Total space: "+f.getTotalSpace());
		System.out.println("Usable space: "+f.getUsableSpace());

		// To know the actual whole path of the file
		System.out.println("\nTo get the current path");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());

		// to count the all types of files in a
		// given folder or file along with there names
		System.out.println("\nFolder and files are: ");
		System.out.println("________________________________");
		File f3 = new File("E://");
		String names[] = f3.list();
		int count = 0;
		for (String name : names) {
			System.out.println(name);
			count++;
		}
		System.out.println("______________________________");
		System.out.println("Total files are: " + count);

		// to create directory/folder
		System.out.println("\nCreating Directory");
		File f2 = new File("E:\\testFiles\\reshudir");
		boolean st = f2.mkdir();
		if (st)
			System.out.println("Directory created successfully");
		else
			System.out.println("Directory already exists or Not created successfully");

//		
	}

}
