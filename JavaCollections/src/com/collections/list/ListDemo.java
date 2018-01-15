package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 1); // adds 1 at 0 index
		l1.add(1, 2); // adds 2 at 1 index
		
		System.out.println(l1);// [1, 2]
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		// will add list l2 from 1 index
		l1.addAll(1, l2);
		System.out.println(l1);
		
		l1.remove(1); //remove element from index 1
		System.out.println(l1); // [1, 2, 3, 2]
		
		System.out.println(l1.get(3));
		
		l1.set(0, 5); // replace 0th element with 5
		System.out.println(l1);  // [5, 2, 3, 2]
		
        List<String> l3 = new ArrayList<String>(5);
        l3.add("Geeks");
        l3.add("for");
        l3.add("Geeks");
 
        // search
        // Using indexOf() - returns first occurrence of given element or -1 if element is not present in list.
        // Using lastIndexOf() - returns the last occurrence of given element or -1 if element is not present in list.
        System.out.println("first index of Geeks:" +
                                  l3.indexOf("Geeks"));
        System.out.println("last index of Geeks:" +
                               l3.lastIndexOf("Geeks"));
        System.out.println("Index of element not present : " +
                                l3.indexOf("Hello"));
        
        List<String> range = new ArrayList<String>();
        // return List between 0th(including)
        // and 2nd element(excluding)
        range = l3.subList(0, 2);
        System.out.println(range);  
	}
}
