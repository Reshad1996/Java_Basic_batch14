package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		
		// Proper way of creating an object
		String str = new String("java"); 
		
		// Simpler and shorter way provided by java creators 
		String name= "java"; // only work for String and wrapper classes
		
		// counts the number of characters in a string include the spaces 
		System.out.println(str.length());
		System.out.println(name.length());
		if (name.length()>15) {
			System.out.println("Name can not be more than 15 characters");
		}
	}

}
