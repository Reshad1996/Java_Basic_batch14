package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
	 
		/* we need to ask user where he/she is from
		 * based on the country -> define favorite food 
		 */
		//_________________________________________________________________

		Scanner scan = new Scanner(System.in);
		System.out.println("Please tell me where are you from");
		String country = scan.nextLine();
		String favoriteFood;
		
		switch (country) {
		
		case "Usa":
			favoriteFood = "burgers and fries";
			break;
		case "Kazakhstan":
	     	favoriteFood = "beshparmak";
	     	break;
		case "Venezuela":
			favoriteFood = "arepa";
			break;
		case "Yemen":
			favoriteFood = "Mandi";
			break;
		case "Afghanistan":
			favoriteFood = "qabeli palw";
			break;
		default:
			favoriteFood = "Unknown";
			break;
		
		}
		System.out.println("You are from "+ country + "and your "
				           + "favorite food is " + favoriteFood);
		
	}

}
