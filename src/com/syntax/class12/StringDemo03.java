package com.syntax.class12;

public class StringDemo03 {

	public static void main(String[] args) {
		
		String str = " i love java ";
		System.out.println(str);
		/*
		 * Remove the spaces befor and after the 
		 * String but not once which are present in between
		 */
		System.out.println(str.trim());

		String str2 = "Java is very easy";
		
		// startsWith() --> checks if a String starts with a specfic letter or word
		System.out.println(str2.startsWith("J")); 
		// endsWith() --> checks if a String Ends with a specfic letter or word
		System.out.println(str2.endsWith("y"));
		// contains() --> checks if a String contains a specfic letter or word
		System.out.println(str2.contains("very"));
		// Method chaining helps us call multiple methods on a single line one method after another.
		System.out.println(str2.toLowerCase().contains("very"));
	
	}

}
