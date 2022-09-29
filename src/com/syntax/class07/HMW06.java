package com.syntax.class07;

import java.util.Scanner;

public class HMW06 {

	public static void main(String[] args) {
		
		// Declare a variable to store a price for a coffee. 
		// Ask the user to pay for a coffee.
		// Keep asking to pay for coffee until the user enters the EXACT amount . 
		// If the user gives more than coffee price --> ask them to give less,
		// if the user gives less money then ask to give more. 
		// Once user give EXACT amount print “Please enjoy your coffee

		double coffeePrice = 5.0;
		double money;
		
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Please pay the amount for coffee");
		money = scan.nextDouble();
		
		if (money > coffeePrice) {
		   System.out.println("Please give less");
		
	   }else if (money < coffeePrice) {
		   System.out.println("Please give more");
	   }
    	}	while (money != coffeePrice) ;
		   System.out.println("Please enjoy your coffee");  
	}

}
