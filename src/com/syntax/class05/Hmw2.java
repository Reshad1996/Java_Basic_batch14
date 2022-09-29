package com.syntax.class05;

import java.util.Scanner;

public class Hmw2 {

	public static void main(String[] args) {
		
		/*Write a program for user to enter his/hers birth month. 
		 * Based on the month define the season.
		 * Example: if user is born in March, April, May → season =”Spring” 
		 * if user is born in June, July, August → season =”Summer”  etc …
		 */
         //_______________________________________________________________________
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter your birth month");
		 String month = scan.nextLine();
		 
		 if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("The season is spring");
			 
		 } else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			 
			 System.out.println("The season is summer");
		 }
		 
		 
		
	}
	

}
