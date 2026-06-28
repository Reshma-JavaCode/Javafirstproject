package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException, InterruptedException {

		File f = new File("E:\\testFiles\\reshu.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line=br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line= br.readLine();
			Thread.sleep(600);
		}
		
		br.close();
		fr.close();
		
	
	}

}
