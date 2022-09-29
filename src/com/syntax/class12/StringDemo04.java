package com.syntax.class12;

public class StringDemo04 {

	public static void main(String[] args) {
		
		String str = "Reshad";
		String str2 = "Reshad";
		String str3 = new String("Reshad");
		
		if (str.equals("Reshad")) {
			System.out.println("I found it");
		}
		/*
		 * equals check if two String are exactly the same with exact same case
		 * equalsIgnoreCase() --> checks if two Strings are exactly the same but 
		 * does not care about the case of latters
		 */
		if (str.equalsIgnoreCase("Reshad")) {
			System.out.println("I found it with equalsIgnoreCase");
		}

	}

}
