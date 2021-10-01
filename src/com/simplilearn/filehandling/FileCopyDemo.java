package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) {
		
		coyFile("data-test.text","data-test.txt");

	}
	
	private static void coyFile(String source, String dest) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			//read 
			int ch =0;
			while((ch=in.read()) !=-1) {
				out.write((char)ch);
			}
			System.out.println("File is copied !");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found !");
		} catch (IOException e) {
			System.out.println("Invalid red/ write operation!");
		}
	}

}
