package com.basic.string.programs;

import java.util.Scanner;

public class StringCounting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int output = 0;
		//String input1 = in.nextLine().trim();
		//String input2 = in.nextLine().trim();
		output = stringCounting("hello ll ll", "ll");
		System.out.println(String.valueOf(output));
	}

	private static int stringCounting(String input1, String input2) {
		int count = 0;
		int i = 0;
		
		while(i>=0){
			i = input1.indexOf(input2, i);
			if(i>=0) {
				count ++;
				i++;
			}
			else 
				return count;
		}
		
		return count;
	}

}
