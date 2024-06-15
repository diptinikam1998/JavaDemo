package com.dat.variable;

public class Test {
	static int b =10;
	
	public static void main(String[] args) {
	//static variable access by the class name	
		System.out.println(Test.b);
	
	//direct access is also possible 
	System.out.println(b);
	
	//create object to access static variable
	Test test = new Test();
	System.out.println(Test.b);
	}

}
