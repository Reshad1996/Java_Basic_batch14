package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your birth month");
		String month = scan.nextLine();

		String season;

		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "The season is spring";

		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {

			season = "The season is summer";
		} else {
			season = "Invalid ";
		}

		System.out.println(season);
	}

}
