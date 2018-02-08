package com.basic.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfArrayList {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("1");
		l1.add("2");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("3");
		l2.add("4");
		l2.add("5");
		
		//array of list type - right hand side the array can't hold the generic because array's cant use generics.
		List<String>[] arrayofList = new List[2];
		arrayofList[0] = l1;
		arrayofList[1] = l2;
		
		for(int i=0 ; i < arrayofList.length ; i ++)
		{
			System.out.println(arrayofList[i]);
		}
	}
}
