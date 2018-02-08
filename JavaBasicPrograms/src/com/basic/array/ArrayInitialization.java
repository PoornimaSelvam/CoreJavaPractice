package com.basic.array;

public class ArrayInitialization {
	public static void main(String[] args) {
		//initialize primitive one dimensional array
		int[] arrInt = new int[5];
		
		//initialize object one dimensional array
		String[] strArr; // declaration
		strArr = new String[4]; // initialization
		
		// initialize multidimensional array
		int[][] twoArrInt = new int[4][5];
		
		//multidimensional array initialization with the left most dimension
		int[][] twoIntArr = new int[2][];
		//complete initialization is required before we use array
		twoIntArr[0] = new int[3];
		twoIntArr[1] = new int[2];
		
		//array intialization using shortcut syntax
		int[] arrI = {1,2,3};
		int[][] arrI2 = {{1,2},{1,2,3}};
		
		int[] twoArrInt1[] = new int[4][5];
		int twoArrInt2[][] = new int[5][]; // only left most dimension also can be declared
	}
}
