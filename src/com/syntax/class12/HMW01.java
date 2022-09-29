package com.syntax.class12;

public class HMW01 {

	public static void main(String[] args) {
		
		// Create a String and if the String is not empty perform the following: 
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.
        //_____________________________________________________________________________
		
		String name = "Reshad";
		
		if (!name.isEmpty()) {
			if (name.length()>3 || name.length() %2!=0) {
				System.out.println(name.charAt(name.length()/2));
				
			}
		}
		System.out.println("_____________________________________________________");
	     
		// Another way
	     String str = "hello";
	     
	     int length = str.length();
	     
	     if (!str.isEmpty() && length % 2!=0 && length>=3) {
	    	 
	    	 int middleIndex = length/2;
	    	 System.out.println(str.charAt(middleIndex));
	     }
		

	}

}
