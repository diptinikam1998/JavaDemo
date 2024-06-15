package com.dat.variable;

public class Customer {
	private int id;
	private String name;
//constructor 
	public Customer(int id,String name) {
		this.id=id;
		this.name=name;
	}
//Setter method	
	public void setId(int id) {
		this.id= id;
	}	
	public void setName(String name) {
		this.name = name;
	}

//getter method
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Customer customer1 = new Customer(101,"Shyam");
		Customer customer2 = new Customer(102,"Swamini");
		customer1.setId(1001);
		customer1.setName("Dipti");
		
		System.out.println(customer1.getName());
		System.out.println(customer1.id);
		System.out.println(customer1.name);
		System.out.println(customer2.name);

	}

}
