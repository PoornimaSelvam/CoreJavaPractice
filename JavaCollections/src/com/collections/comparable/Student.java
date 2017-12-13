package com.collections.comparable;

public class Student implements Comparable<Student> {
	
	String name;
	int rollno;
	int age;

	public Student(String name, int rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}

	@Override
	public int compareTo(Student st) {
		// ascending order
		return this.age - st.age;
		
		// descending order
		//return st.age - this.age;
	}

}
