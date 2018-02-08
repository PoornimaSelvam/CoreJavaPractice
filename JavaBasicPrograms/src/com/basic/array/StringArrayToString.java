package com.basic.array;

import java.util.Arrays;

public class StringArrayToString {
	public static void main(String[] args) {
		String[] strArr = {"1", "2", "3"};
		
		String str = Arrays.toString(strArr);
		System.out.println("Java string array to string: " + str);
		
		str = convertStringArrayToString(strArr, ",");
		System.out.println("Converted string array to string: " + str);
	}

	private static String convertStringArrayToString(String[] strArr, String delimiter) {
		StringBuilder sb = new StringBuilder();
		for(String str : strArr){
			sb.append(str).append(delimiter);
		}
		return sb.substring(0, sb.length()-1); //substring method eliminates the last comma
	}
}
