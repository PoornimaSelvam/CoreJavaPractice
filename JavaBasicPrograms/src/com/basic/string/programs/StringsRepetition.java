package com.basic.string.programs;

import java.util.Scanner;

public class StringsRepetition {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String output;
		String ip1 = in.nextLine().trim();
		int ip2 = Integer.parseInt(in.nextLine().trim());
		
		output = stringsRepetition(ip1, ip2);
		System.out.println(String.valueOf(output));
	}

	private static String stringsRepetition(String input1, int input2) {
		String newStr = input1;
		
	    for(int i = 1; i<  input2; i++)
	    {
	        newStr = newStr +  " " + input1;
	    }
	    
	    return newStr;
	}
}
