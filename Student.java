package com.dat.variable;

public class Student {
	private int id;
	private String name;

	public Student(int id,String name) {
	this.id= id;
	this.name = name;
}
	
	public static void main(String[] args) {
		Student s1 = new Student(101,"dipti");
		Student s2 = new Student(201,"shyam");
		System.out.println(s1.id);
		System.out.println(s1.name);
	}

}
