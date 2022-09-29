package com.syntax.class11;

public class Student {

	String name;
	String id;
	int age;
	double weigth;
	char gender;
	
	void study() {
		System.out.println("student is stuyding");
	}
	
	void deleteMesseges() {
		System.out.println("Deleting messeges from discord");
	}
	
	void eat() {
		System.out.println("Eating pizaa");
	}
	// new Student(); creates the object of student class
	public static void main(String[] args) {
		
		Student reshad = new Student();
		reshad.name = "reshad";
		reshad.id   = "123";
		reshad.age  = 26;
		
		System.out.println(reshad.name);
		System.out.println(reshad.age);
		
		reshad.deleteMesseges();
		reshad.eat();
		reshad.study();
		
		System.out.println("-----------------------------------------");
		
		Student student2 = new Student();
		
		student2.name = "Srosh";
		student2.age = 18;
		student2.weigth = 55.2;
		student2.gender = 'F';
		
		System.out.println(student2.name);
		
		student2.eat();
		student2.study(); 
		
		
	}
}
