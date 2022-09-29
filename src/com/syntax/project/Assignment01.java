package com.syntax.project;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		
		// Using Scanner create an array of integer values. After
		// the array is created, calculate the sum of all stored
		// elements in that array.
		//________________________________________________________________________

          Scanner scan = new Scanner(System.in);
          
          System.out.println("Enter the requird size of an array");
          int size = scan.nextInt();  // ask the user for a number
          
          
		int[] num = new int[size];    // it creates an array of the above sie
		
	
		for (int i=0 ; i<num.length ; i++) {
			System.out.println("Enter the element of array one by one ");
			num[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(num));
		
		int sum = 0;
		for (int arr:num) {
			sum+=arr;
		}
		System.out.println("Sum of all elements = "+sum);
	}

}
