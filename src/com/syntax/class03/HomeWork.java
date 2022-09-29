package com.syntax.class03;

public class HomeWork {

	public static void main(String[] args) {
		
		//                ( Home Work 1 )
		// Create a Java program and name it Double Comparison. 
		// Declare 2 double values and if value of first variable is higher 
		// then the second, print “Double value  is larger than  .” 
		// Otherwise print...
		//_____________________________________________________________________
		
		double num1 = 1000;
		double num2 = 500;
		
		if (num1>num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);
		}
		
		else {
			System.out.println("Double value " + num1 + " is not larger than " + num2);
			
		}
		
		
		
		//                 ( Home Work 2)
		//: Create a Java program and name it Temperature Check. 
		//  Create variable to store temperature. Your program should 
		//  check if temperature is below 32 then it should print 
		// “Water will freeze with temperature ”, 
		// otherwise “Water will NOT freeze with temperature ”.
		//____________________________________________________________
        
		double temprature = 40;
		
		if (temprature<32) {
			System.out.println("Water will freeze with tempreature " +temprature );
		}
		
		else {
			System.out.println(" Water will not freeze with tempreature " + temprature);
		}
				
	    
		
		//                 ( Home Work 3 )
		//Create a Java program and declare int variable that will hold a month. 
		//Based on the value of the variable your program should print the name of the month.
		//______________________________________________________________________________
		
		int mount = 7;
		
		if (mount == 1) {
			System.out.println("january");
		}
		else if (mount == 2) {
			System.out.println("february");
		}
		else if (mount == 3) {
			System.out.println("march");
		}
		else if (mount == 4) {
			System.out.println("april");
		}
		else if (mount == 5) {
			System.out.println("may");
		}
		else if (mount == 6) {
			System.out.println("june");
		}
		else if (mount == 7) {
			System.out.println("july");
		}
		else if (mount == 8) {
			System.out.println("august");
		}
		else if (mount == 9) {
			System.out.println("september");
		}
		else if (mount == 10) {
			System.out.println("october");
		}
		else if (mount == 11) {
			System.out.println("november");
		}
		else if (mount == 12) {
			System.out.println("december");
		}
		else {
			System.out.println("enter a valid mount between 1-12 ");
		}
		
		
		
		//            ( Home Work 4 )
		//Write a program to check whether number is positive or negative.
		//_________________________________________________________________
		
		int number = -444; 
				
		if (number > 0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
		
		
		
		//            ( Home Work 5 )
		//Write a Java Program to check whether number is Even or Odd.
		//_____________________________________________________________
		
		int number1 = 10;
		// if we take a modulus of a number by 2 and answer = 0 its always even
		if (number1%2 == 0){
		   System.out.println("Number is Even");
		}
		else {
			System.out.println("number is Odd");
		}
		
		
		}
	}

 
