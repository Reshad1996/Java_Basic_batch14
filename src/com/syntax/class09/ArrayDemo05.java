package com.syntax.class09;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number of dresses you want to buy");
		int size = scan.nextInt();
		
	    double[] prices = new double[size];
	    
        for (int i=0 ; i<size ; i++) {
        	System.out.println("Please Enter the price of dress no "+(i+1));
        	prices[i] = scan.nextDouble();
        }
        System.out.println(Arrays.toString(prices));
        
        // limitation of enhance for loop
        // we can only go in one direction
        // we can't skip the elements
        // we can't use enhanced for loop to update the elements in an array
        // we can only use it access the elements
        
        double sum = 0;
        for (double price:prices) {
        	sum+=price;
        }
        System.out.println("Total for all the dresses = "+sum);
	}

}
