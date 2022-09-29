package com.syntax.class10;

public class ClassTask02 {

	public static void main(String[] args) {

		// Create a 2D array(shorter way) in which first array will consist
		// of 4 names and second array will contain grades.
		// Then your program should print name of the students that has A and B grade

		String[][] arr = { 
				{ "Reshad", "Rashid", "Srosh", "Shahir" },
				{ "A", "B", "C", "D" } 
		};

		System.out.println(arr[0][0] + "=" + arr[1][0]);
		System.out.println(arr[0][2] + "=" + arr[1][2]);

		System.out.println("--------- getting all values from 2d array -----------");

		// Enhanced way
		for (String[] singleArray : arr) { // loops over 1d or single array

			for (String el : singleArray) { // loops over each element of the first array

				System.out.print(el + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------------------");

		// Loop way
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
	}

}
