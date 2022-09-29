package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask4 {

	public static void main(String[] args) {
		
		//You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver licence to them, 
		//otherwise you will offer them to get a learners permit.
        //___________________________________________________________________________
		Scanner dmv = new Scanner(System.in);
		    System.out.println("What is your age ? ");
		    
		    int age = dmv.nextInt();
		    
		    if (age>18) {
		    	System.out.println("Your age is eligiable for getting driving licence ");
		    }
		
		    else {
		    	
		    	System.out.println("You need to ger a learners permit");
		    }
	}

}
