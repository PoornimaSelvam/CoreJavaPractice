package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayConversion {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Object[] objs = al.toArray();
		
		for(Object obj: objs)
			System.out.print(obj + " ");
		
		// Class cast exception - object cannot be converted to an integer
		/*Integer[] objects = (Integer[]) al.toArray();
		for(Integer obj: objects)
			System.out.println(obj);*/
		System.out.println("");
		
		Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
 
        for (Integer x : arr)
            System.out.print(x + " ");
        
        // ArrayList to Array Conversion - without using toArray
        for (int i =0; i < al.size(); i++)
            arr[i] = al.get(i);
 
        for (Integer x : arr)
            System.out.print(x + " ");
	}
}
