package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {
	
	public static void main(String[] args) {
		
		createFileUsingFileClass("data.txt");
		
		createFileUsingFileOutputStream("data-test.txt");
	}
	
	// create a file using File class
	private static void createFileUsingFileClass(String filename) {
		
		File file = new File(filename);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File is created !");
			} else {
				System.out.println("File already exist !");
			}
			
			// Write content to file  -> FileWriter -> Character stream
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Today is a good day!");
			fileWriter.append("\nTomorrow is a wonderful day!");
			System.out.println("File Write is completed !");
			fileWriter.close();
			
		} catch (IOException e) {
			System.out.println("File creation failed !");
		}
	}
	
	// create a file using FileOutStream class
	private static void createFileUsingFileOutputStream(String filename) {
		
		try {
			String data = "\nToday is a wonderful day !";
			
			FileOutputStream out = new FileOutputStream(filename,true);  // append : true
			
			// write data with out stream
			out.write(data.getBytes());

			
			System.out.println("File is created and data is Written !");
		} catch (FileNotFoundException e) {
			System.out.println("File creation failed !");
		} catch (IOException e) {
			System.out.println("File write operation failed !");
		}
	}
}
