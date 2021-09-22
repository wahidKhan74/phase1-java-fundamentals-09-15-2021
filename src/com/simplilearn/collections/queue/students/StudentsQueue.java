package com.simplilearn.collections.queue.students;

import java.util.ArrayDeque;
import java.util.Queue;

public class StudentsQueue {

	public static void main(String[] args) {
		
		Student student1 = new Student(1001, "Rebeka", 6, "xyz college");
		Student student2 = new Student(1002, "John", 1, "xyz college");
		Student student3 = new Student(1003, "Marry", 4, "xyz college");
		Student student4 = new Student(1004, "Ava", 2, "xyz college");
		Student student5 = new Student(1005, "James", 3, "xyz college");
		
		Queue<Student> studentQueue = new ArrayDeque<Student>();
		
		studentQueue.add(student1);
		studentQueue.add(student2);
		studentQueue.add(student3);
		studentQueue.add(student4);
		studentQueue.add(student5);
		
		//print queue
		System.out.println(studentQueue);
		
		for(Student s: studentQueue) {
			System.out.println("-------------");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getCollege());
			System.out.println(s.getRank());
		}
	}
}
