package com.syntax.class08;

import java.util.Scanner;

public class ClassTask02Shopping {

	public static void main(String[] args) {

		// Write a program to ask a user to enter item they want to buy and the price of
		// that item.
		// Every time user enters money, accumulate the amount and
		// tell the user how much is left to pay off.
		// If user give more money program should return a change.
		// Whenever user done with payments program should say "Thank you for shopping!"
		// __________________________________________________________________________________

		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item = scan.nextLine();

		System.out.println("What is the price of the item?");
		double price = scan.nextDouble();

		double money;
		double total = 0;
		double change;

		do {
			System.out.println("How much money do you have ?");
			money = scan.nextDouble();

			total += money; // accumulate the money
			double need;

			if (total < price) {
				need = price - total;
				System.out.println("You need to pay more $ " + need);

			} else if (total > price) {
				change = total - price;
				System.out.println("Here is your change " + change);
				break;
			}

		} while (total != price);
		System.out.println("Thank you for shopping ");
	}

}
