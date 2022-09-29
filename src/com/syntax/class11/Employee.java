package com.syntax.class11;

public class Employee {

	String name;
	String id;
	String dep;
	double salary;
	String shift;
	
	void work() {
		System.out.println(name+" is working on shift "+shift);
	}
	
	void takeleaves() {
		System.out.println(name+" is going on leaves");
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.name = "Reshad";
		emp.id   = "123";
		emp.dep  = "IT";
		emp.salary = 150000;
		emp.shift = "Evening";
		emp.work();
	
		Employee emp2 = new Employee();
		emp2.name = "Srosh";
		emp2.dep  = "Sales";
		emp2.id   = "456";
		emp2.salary = 95000;
		emp2.shift = "Morning";
		emp2.work();
	}
}
