package com.syntax.class06;

import java.util.Scanner;

public class HMW1 {

	public static void main(String[] args) {

		// Ask user to enter their country and capture it.
		// Once values are captured print which language user speaks.
        //______________________________________________________________
		Scanner scan = new Scanner(System.in);

		System.out.println("Where are you from ?");
		String country = scan.nextLine();
		String language;

		switch (country) {

		case "Usa":
			language = "English";
			break;
		case "Afghanistan":
			language = "Dari/pashto";
			break;
		case "India":
			language = "Hindi";
			break;
		case "Russia":
			language = "Russian";
			break;
		case "Germany":
			language = "Deutch";
			break;
		case "Spain":
			language = "Spanish";
			break;
		default:
			language = "Unknown";
		}
       
		System.out.println("You are from "+country+" and language you speak is "+language);
	}

}
