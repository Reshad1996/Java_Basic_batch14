package com.syntax.class11;

public class Dog {

	// State , Attribute, Properties , fileds --> called object state
	 
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	// These are the behaviour of a dog 
	// behaviour , methods , function --> In java we call it method
	void bark() {
		System.out.println("Barking........");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	public static void main(String[] args) {
		
		// creating object from class
		// new Dog();--> it creates an object of class Dog
		Dog dog1 = new Dog();
		// calling a bahaviour on an object
		dog1.bark();
		dog1.sleep();
	}
}
