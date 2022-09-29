package com.syntax.project;

public class Assignment04 {

	public static void main(String[] args) {
		
		//Create a 2D array or integer type where you will store
		//odd and even numbers. Develop a program which will
		//identify/print the even numbers only.
        //_____________________________________________________________

		int[][] num = {
				{1,2,3,4,5},
				{6,7,8,9,10}
		};
		
		for (int[] number :num) {
			
			for (int numbers:number) {
				
				if (numbers %2==0) {
                    System.out.print(numbers+" ");
				}
			}
		}
				
			
			
		
		
	}

}
