package com.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A comparable object is capable of comparing itself with another object. 
 * It provide single sorting sequence only i.e. you can sort the elements based on single data member only. 
 * For example it may be rollno, name, age or anything else.
 * 
 * To sort an Array, use Arrays.sort()
 * To sort an ArrayList, use Collections.sort()
 * To sort a Java Object (Student) - To sort an Object by its property, need to make the Object implement the Comparable interface and override the compareTo() method.
 * 
 */
public class StudentTest {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<Student>();
		stList.add(new Student("Poornima", 123, 30));
		stList.add(new Student("Kiran", 456, 36));
		stList.add(new Student("Chetna", 789, 6));
		
		//Collections.sort(stList);
		
		stList.stream().sorted().forEach(e -> System.out.println(e.name + " " + e.rollno + " " + e.age));
	}
}
