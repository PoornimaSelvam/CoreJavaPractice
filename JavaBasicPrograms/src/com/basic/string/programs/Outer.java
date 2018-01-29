package com.basic.string.programs;

public class Outer {
	public Outer() {
		System.out.println("outer");
	}
	
	
	class Inner{ 
		Inner() {
			System.out.println("inner");
		}
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner obj = new Outer().new Inner();
	}
}
