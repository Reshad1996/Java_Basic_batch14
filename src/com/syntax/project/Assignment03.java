package com.syntax.project;

public class Assignment03 {

	public static void main(String[] args) {

		// Create a 2D array of integer values. Print the sum of
		// all numbers.
		//_____________________________________________________________

		int[][] numbers = { 
				{ 10, 20, 30, 40, 50 }, 
				{ 60, 70, 80, 90, 100 }, 
				{500,400,300}
				};

		int sum = 0;
		for (int[] number : numbers) {

			for (int num : number) {
				sum += num;
			}
		}
		System.out.println("The sum of all arrays = "+sum);
	}
}
