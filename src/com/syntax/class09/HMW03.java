package com.syntax.class09;

public class HMW03 {

	public static void main(String[] args) {
		
		//  Create an array on integers and calculate the sum of all elements in an array.
		
		int[] numbers = {10,20,30,40,50} ;
		
		int sum = 0;
		for (int number:numbers) {
			sum+=number;
			
		}
		System.out.println(sum);
	}
}
