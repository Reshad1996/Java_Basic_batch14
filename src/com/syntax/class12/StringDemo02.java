package com.syntax.class12;

public class StringDemo02 {

	public static void main(String[] args) {
		
		String firstName = "Reshad";
		String lastName  = "Gulzada";
		
		System.out.println(firstName+" "+lastName); // Mostly this is used
		System.out.println(firstName.concat(" "+lastName));

		
		String str = "";
		/*
		 * isEmpty() returns true if a String is empty this metod will
		 * return false even if you have a space in a String variable 
		 * however the isBlank() method does not count the spaces
		 */
		System.out.println(str.isEmpty()); // This method use for the empty 
		//System.out.println(str.isBlank()); // It ignores the spaces
	}

}
