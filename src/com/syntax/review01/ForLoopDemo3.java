package com.syntax.review01;

public class ForLoopDemo3 {

	public static void main(String[] args) {

		// Print odd numbers from 1 to 9 except 5

		for (int i = 1; i <= 9; i += 2) {

			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println("*************************");

		// another way

		for (int i = 1; i <= 9; i += 2) {

			if (i != 5) {
				System.out.print(i + " ");
			}

		}
	}

}
