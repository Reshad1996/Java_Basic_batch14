package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//                     ( Task 2 )
		/* Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”,
		 *  anyday from 6-7 → output “It is a weekend”,
		 *   any other day → output “Invalid day”
		 */
        //__________________________________________________________________________
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Is it weekend or weekday");
	    int days = scan.nextInt();
	    
	    int days1 = 7;
	     
	    if (days1 >= 1 && days1 <= 5) {
	    	System.out.println("It's Weekday");
	    	
	    }else if (days1 == 6 || days1 == 7) {
	    	System.out.println("It's weekend");
	    	
	    }else {
	    	System.out.println("Invalid");
	    }
	    
	  
		
		
		
	}

}
