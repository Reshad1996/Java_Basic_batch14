package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask7 {

	public static void main(String[] args) {

		// Write a program to ask user to enter numbers of worked years and annual
		// salary.
		// If user worked for more or equals to 5 years than user is eligible for the
		// bonus,
		// otherwise he is not.
		// Once user is eligible and salary is larger than 50000 than bonus = 5000,
		// otherwise bonus=3000.

		Scanner company = new Scanner(System.in);
		System.out.println("Enter the number of years that you worked ");

		double employer = company.nextDouble();

		if (employer > 5) {
			System.out.println("The employer is eligiable for the bounce ");
		} else {
			System.out.println("The employer is not eligiable for the bounce");
		}

		System.out.println("Enter your annual salary");
		int salary = company.nextInt();

		if (salary > 50000) {
			System.out.println("The bounce is 5000");
		} else {
			System.out.println("The bounce is 3000");
		}
	}

}
