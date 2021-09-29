package com.simplilearn.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		// create employee object
		Employee employee = new Employee(10001, "Eva Smith", "Engineering", 3454554.45);
		
		// serialization : convert object to bytestream
		
		try {
			// create file output stream.
			FileOutputStream file = new FileOutputStream("file-db.txt");
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			// method to serialize object
			out.writeObject(employee);
			System.out.println("Serialization is completed !");
			
			out.close();
			file.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
