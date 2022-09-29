package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask6 {

	public static void main(String[] args) {

		// Create a Java program that will ask if user has a credit card or not.
		// If you user does not have a credit card then offer them.
		// If they do have one ask what is balance on the card?
		// If balance of the card is larger than 1000, tell them to pay off immediately,
		// otherwise you can tell them that they can spend more.
		// ________________________________________________________________________________

		Scanner bank = new Scanner(System.in);
		System.out.println("Do you have a credit card ?");

		boolean creditCard = bank.nextBoolean();

		if (creditCard = true)

		{
			System.out.println("What is the balance ? ");
		}

		double balance = bank.nextDouble();

		if (balance > 1000) {
			System.out.println("You have to pay off immediatly your debts");
		}

		else {
			System.out.println("You can spend more");
		}

	}
}
