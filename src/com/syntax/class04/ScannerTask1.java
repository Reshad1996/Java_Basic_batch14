package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		
        // Question 1
		// Write a program to store a boolean value of whether user has diploma or not.
		//If user has a diploma, you should say congratulations, 
		//otherwise program should suggest to get a degree. 
		//Then if user has a degree program should check a gpa score. 
		//If gpa score is higher or equals to 3.5 → output should say
		//“You are eligible for scholarship”, otherwise → “You should have studied harder” .
		//_____________________________________________________________________________
	
		Scanner university =  new Scanner(System.in);
		
		     System.out.println("User has diploma or not please enter true or false");
		     
		     boolean department = university.nextBoolean();
		     
		     if(department) {
		    	 System.out.println("Congratulation");
		    	 System.out.println("What is your GPA");
		     double degreeGpa = university.nextDouble();
		     
		     if (degreeGpa>=3.5) {
		    	 System.out.println("You are eligible for sponsership");
		     }
		     else if (degreeGpa<3.5) {
		    	 System.out.println("You should have study hard");
		     }
		     else {
		    	 System.out.println("You should get a degree");
		     }
		     }
		    	 
		
		    	
		     
		     
				
	}
}