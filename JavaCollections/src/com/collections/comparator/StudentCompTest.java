package com.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Comparator interface is used to order the objects of user-defined classes.
 * Comparator - provides multiple sorting sequence. We create multiple separate classes (that implement Comparator) to compare by different members.
 * Collections class has a second sort() method and it takes Comparator. The sort() method invokes the compare() to sort objects
 * 
 * 1. Comparable is meant for objects with natural ordering which means the object itself must know how it is to be ordered. 
 * For example Roll Numbers of students. Whereas, Comparator interface sorting is done through a separate class.
 * 
 * 2. Logically, Comparable interface compares “this” reference with the object specified and Comparator in Java compares two different class objects provided.
 * 
 * 3. If any class implements Comparable interface in Java then collection of that object either List or Array can be sorted automatically 
 * by using Collections.sort() or Arrays.sort() method and objects will be sorted based on there natural order defined by CompareTo method.
 * 
 * To summarize, if sorting of objects needs to be based on natural order then use Comparable whereas 
 * if sorting needs to be done on attributes of different objects, then use Comparator in Java.
 *
 */

public class StudentCompTest {
	public static void main(String[] args) {
		List<StudentComp> stList = new ArrayList<StudentComp>();
		stList.add(new StudentComp("Poornima", 123, 30));
		stList.add(new StudentComp("Kiran", 456, 36));
		stList.add(new StudentComp("Nithu", 789, 6));
		
		System.out.println("Sorting by name");
		
		//Collections.sort(stList, new NameComparator());
		/*Iterator itr = stList.iterator();
		while (itr.hasNext()) {
			StudentComp st = (StudentComp) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}*/
		
		stList.stream().sorted(new NameComparator()).forEach(e -> System.out.println(e.name + " " + e.rollno + " " + e.age));
		
		System.out.println("\nSorting by age");
		
		//Collections.sort(stList, new AgeComparator());
		/*Iterator itr2 = stList.iterator();
		while (itr2.hasNext()) {
			StudentComp st2 = (StudentComp) itr2.next();
			System.out.println(st2.rollno + " " + st2.name + " " + st2.age);
		}*/
		
		stList.stream().sorted(new AgeComparator()).forEach(e -> System.out.println(e.name + " " + e.rollno + " " + e.age));
	}
}
