package com.syntax.review01;

public class NestedLoopDemo2 {

	public static void main(String[] args) {

		/*
		 * print this pattern
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 */
		
		for (int j=1 ; j<=5 ; j++) {

			for (int i=1 ; i<=5 ; i++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
