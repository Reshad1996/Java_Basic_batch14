package com.syntax.class12;

public class StringDemo05 {

	public static void main(String[] args) {
		
		String str = "I love java ptogramming";
		/*
		 * charAt() returns us the character at a specfic index
		 */
		
        for (int i=0 ; i<str.length() ; i++) {
        	// print only the character without spaces
        	if (!(str.charAt(i)== ' ')) {
        		System.out.println(str.charAt(i));
        	}
        	
        }
		
	}

}
