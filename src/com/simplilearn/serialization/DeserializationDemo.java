package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) {
		
		try {
			// read file
			FileInputStream file = new FileInputStream("file-db.txt");
			
			// create a input stream object
			ObjectInputStream input = new ObjectInputStream(file);
			
			// method to de serialized the object
			Employee employee = (Employee) input.readObject();
			
			System.out.println("De-serialization is completed !");
			System.out.println("Emp Id : "+employee.id);
			System.out.println("Emp Name : "+employee.name);
			System.out.println("Emp Dept : "+employee.dept);
			System.out.println("Emp Salary : "+employee.salary);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
