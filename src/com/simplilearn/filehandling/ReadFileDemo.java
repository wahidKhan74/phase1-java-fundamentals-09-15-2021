package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		
		readFile("data-test.text");

	}

	private static void  readFile(String filename) {
	
		try {
			FileInputStream input = new FileInputStream(filename);
			int ch =0;
			while((ch=input.read()) !=-1) {
				System.out.print((char)ch);
			}
			// int i = input.read();
			// System.out.println((char)i);
			
			
		}catch (FileNotFoundException e) {
			System.out.println("File Not Found !");
		} catch (IOException e) {
			System.out.println("File read operation failed !");
		}
		
	}
}
