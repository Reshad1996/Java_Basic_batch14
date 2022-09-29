package com.syntax.project;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment02 {

	public static void main(String[] args) {
		
		// Using Scanner create an array of countries. When an
		// array is created, retrieve all values from it and while
		// retrieving those values print capital for each country.
		// (use 2 different loops).
        //_______________________________________________________________________
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter how many countires you want to store?");
		int size = scan.nextInt();
		
		// Two Arrays one to store countries another to store the capitals
		String[] countries = new String[size];
		String[] capitals  = new String[size];
		
		// This is just to consume that wxtra enter that we will be getting from linr 18
		scan.nextLine();
		
		for (int i=0 ; i<size ; i++) {
			System.out.println("Please Enter the country name");
			countries[i] = scan.nextLine();
			
			System.out.println("Please Enter the capital name");
			capitals[i] = scan.nextLine();
		}
		
		// Prints the array in a good format
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capitals));
		
		// Another way of printing arrays ( For Loop way )
		// we can not user ( Enhanced loop ) with 2D arrays
		for (int i=0 ; i<size ; i++) {
			System.out.println("The country "+countries[i]+" Has the capital "+capitals[i]);
		}
	}

}
