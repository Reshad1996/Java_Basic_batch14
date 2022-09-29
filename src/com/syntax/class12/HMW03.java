package com.syntax.class12;

import java.util.Scanner;

public class HMW03 {

	public static void main(String[] args) {
		
		// Write a program that reads two people's first
		// names and if they expecting boy or girl? 
		// Based on the input suggests a name for a baby:
		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? boy
		// Suggested baby name: DANRY

		// Example Output:
		// Mom’s first name? Mary
		// Dad’s first name? Daniel
		// Boy or Girl? girl
		// Suggested baby name: MAIEL
		//____________________________________________________________________________
         Scanner scan = new Scanner(System.in);
         System.out.println("What is your Dad name? ");
         String momName = scan.nextLine();
         System.out.println("What is your Mom name? ");
         String dadName = scan.nextLine();
         System.out.println("What gender you are expecting");
         String gender = scan.nextLine();
         
         if (gender.equals("boy")) {
        	 System.out.println(dadName.substring(0,(dadName.length()/2)).toUpperCase()+
        			 (momName.substring((momName.length()/2),momName.length())).toUpperCase());
        	 
         }else {
        	 System.out.println(momName.substring(0,(momName.length()/2)).toUpperCase()+
        			 (dadName.substring((dadName.length()/2),dadName.length())).toUpperCase());
         }
	}
}
