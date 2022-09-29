package com.syntax.class06;

import java.util.Scanner;

public class HMW3Calculater {

	public static void main(String[] args) {

		// Using scanner class create calculator.
		// Allow user to enter 2 numbers and operator(+,-,*,/).
		// Based on operator provide the result to user.
		// Please complete this assignment in 2 ways: using if statement and switch
		// case.
		// _______________________________________________________________________________

		// IF statement class
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the 1st number");
		double num1 = scan.nextDouble();

		System.out.println("Enter the 2nd number");
		double num2 = scan.nextDouble();

		System.out.println("Enter the operator +,-,*,/,%");
		char operator = scan.next().charAt(0);

		double result = 0;

		if ((operator == '+') || (operator == '-') || (operator == '*') || (operator == '/') || (operator == '%')) {
		}
		System.out.println("The result is " + result);

		// SWITCH Statement class

		switch (operator) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		}
		System.out.println("The result is " + result);
	}

}
