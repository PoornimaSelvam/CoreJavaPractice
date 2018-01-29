package com.basic.string.programs;
class A {
	protected A(){
		System.out.println("hi");
	}
	protected void testmethod(){
		System.out.println("hello A");
	}
}

public class B extends A{
	
	@Override
	protected void testmethod(){
		System.out.println("hello overriden from B");
	}
	
	public void testmethod1(){
		System.out.println("hello B");
	}
	
	public static void main(String[] args) {
		A b = new B();
		b.testmethod();
		((B) b).testmethod1(); // type cast for method in B to access from the A specifier
	}
	
	
}
