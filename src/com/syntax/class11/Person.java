package com.syntax.class11;

public class Person {

	String name;
	int age;
	boolean isFunny;
	double weigth;
	double height;
	boolean losingHair;
	
	void study() {
		
		if (name.equals("Reshad")) {
			System.out.println("I study hard");
		}else if (name.equals("Kawsar")) {
			System.out.println("I will keep deleting the messeges and will not let anyone study");
		}else {
			System.out.println("I try to study but things don't make much sense");
		}
	}
	
	public static void main(String[] args) {
		
		Person per = new Person();
		
		per.name = "Reshad";
		per.study();
		
		Person per2 = new Person();
		per2.name = "Haris";
		per2.study();
		
	}
}
