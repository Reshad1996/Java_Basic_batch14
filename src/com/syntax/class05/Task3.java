package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/*Ask user to enter a number and then define 
		 * if number is small, medium or large
		 * Small number is value between 1 and 10
		 * Medium number is value between 11 and 100
		 * Large number is value between 101 and 1000
		 */
		//____________________________________________________________
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = scan.nextInt();
		
		if (number > 1 && number <= 10) {
			System.out.println("The number is small");
			
		}else if (number >= 11 && number <= 100) {
			System.out.println("The number is medium");
			
		}else if  (number >= 100 && number <= 1000) {
			System.out.println("The number is large");
			
		}
		
	}

}
