package com.syntax.project;

public class Assignment05 {

	public static void main(String[] args) {
		
		// Create a 2D array of integers. Develop a program
		// which will calculate the sum of even and odd numbers
		// for that array.
		//_________________________________________________________
		
		int[][] num = {
				{1,2,3,4,5},
				{6,7,8,9,10}
		};
		
		int sumEven = 0;
		int sumOdd  = 0;
		for (int[] number :num) {
			
			for (int numbers:number) {
				
				if (numbers %2==0) {
					sumEven+=numbers;
                    
				}else {
					sumOdd+=numbers;
				}
			}
		}
		System.out.println("The sum of all even number = "+sumEven);
		System.out.print("The sum of all odd number = "+sumOdd);
	}

}
