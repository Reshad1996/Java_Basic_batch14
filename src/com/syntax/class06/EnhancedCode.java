package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the current time (use 24 hours format");
		double hour = scan.nextDouble();
		
		String timeOfTheDay ;
		
		
		if (hour >= 1 && hour <=11) {
			timeOfTheDay = "It's Morning" ;
			
		}else if (hour >= 12 && hour <= 15) {
			timeOfTheDay = "It's Afternoon";
			
		}else if (hour >= 16 && hour <= 20) {
			timeOfTheDay = "It's Evening";
			
		}else if (hour >= 21 && hour <= 24) {
			timeOfTheDay = "It's Night";
		}else {
			System.out.println("Wrong number is entered");
			timeOfTheDay = "Invalid";
		}		
		
		System.out.println(timeOfTheDay);
	

	}

}
