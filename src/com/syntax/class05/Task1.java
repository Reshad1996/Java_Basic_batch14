package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		 //                       ( Task 1 )
	    /* 1. Prompt the user to enter person heights in inches.
	     *  Person should be classified as one of the following:
	     *   • short (under 60 inch)
	     *   • medium(between 60 -72 inch)
	     *   • tall (over 72 inch)
	     */
	    //___________________________________________________________________
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your height in inches");
		
	     double height = scan.nextDouble();
	    
	     if (height <= 60) {
	    	 System.out.println("Your height is short");
	    
	     } else if (height > 60 && height > 72) {
	    	 System.out.println("Your height is medium");
	    	 
	     } else if (height > 72) {
	    	 System.out.println("Your height is tall");
	     }
		
		
		
		
		
	}

}
