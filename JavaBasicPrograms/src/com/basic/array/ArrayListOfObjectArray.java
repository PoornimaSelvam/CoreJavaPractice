package com.basic.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOfObjectArray {
	public static void main(String[] args) {
		
		List<Object[]> list = new ArrayList<Object[]>();
		String[] arr1 = {"a", "b", "c"};
		String[] arr2 = {"1", "2", "3", "4"};
		
		ArrayTest arr3[] = {new ArrayTest("AA"), new ArrayTest("BB")};
		
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		
		for(Object[] objArr : list){
			System.out.println(Arrays.toString(objArr));
			
			for(Object obj : objArr)
			{
				if(obj instanceof String){
					//System.out.println("Instance of String");
				} else if (obj instanceof ArrayTest){
					//System.out.println("Instance of Class");
				}
			}
		}
	}
}

class ArrayTest{
	private String name;
	
	public ArrayTest(String n){
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "ArrayTest [name=" + name + "]";
	}
	
}