package com.syntax.project;

public class Assignment07 {

	public static void main(String[] args) {
		
		// Write a java program to check whether a given
		// number is prime or not?
		//_______________________________________________________________________
		
		int num = 17;                // prime number 
		boolean number = false;      // to check T/F
		
		for (int i=2 ; i<=num/2 ; i++) {  // The for lool is for looping till 17
			
			if (num %i==0) {              // The formulla is for checking non-prime number
				number = true;
				break;                   // To stop looping
			}
		}
		
		                                    
		if (!number) {                   // To Check T/F
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}

	}

}
