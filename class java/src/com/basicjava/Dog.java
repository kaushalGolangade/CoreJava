package com.basicjava;

public class Dog {
	int p = 25;
	
	public static void main(String[] args) {
		
	 Dog manjar = new Dog();
	 
	 manjar.p =60;
	 
		int b = 5;                                        //local variable
		
		Dog var = new Dog();
		
		var.baring();
	}
	String name = "labardog";
	int age = 10;                       // global variable

	public void baring() {
		System.out.println(" age of "+ age+" "+ name + " is eating");
		
	}

}
