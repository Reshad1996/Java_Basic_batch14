package com.syntax.project;

public class Assignment09 {

	public static void main(String[] args) {
		
		//  Maximum and minimum number in the array?
		
		int[] number = {100,200,300,400,500,600,700,800,900,1000};
		
		int maximum = 0;
		int minimum = 0;
		
		for (int num:number) {
			
			if (num>maximum) {
				maximum=num;
				
			} else if (num<=minimum) {
				minimum=num;
					
			}
		}
		System.out.println("Maximum number is "+maximum);
		System.out.println("Minimum number is "+minimum);
	}
}
