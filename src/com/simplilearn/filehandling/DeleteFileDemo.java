package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DeleteFileDemo {

	public static void main(String[] args) {
		
		deleteFile("data-test.text");
	}
	
	private static void deleteFile(String filename) {
		String path = "/home/wahidkhan74gmai/DELL_BATCH3_WORKSPACE/phase1-java-fundamentals-09-15-2021/";
		// delete file
		try {
			Files.delete(Paths.get(path+filename));
			System.out.println("File is deleted !");
		} catch (IOException e) {
			System.out.println("File not found !");
		}
	}

}
