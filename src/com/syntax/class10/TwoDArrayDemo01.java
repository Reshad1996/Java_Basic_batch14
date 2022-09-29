package com.syntax.class10;

public class TwoDArrayDemo01 {

	public static void main(String[] args) {

		String[][] countries = { 
				{ "Usa", "Canada" }, // 1 array with index 0
				{ "Peru", "Brazil", "Columbia", "Ecuador" }, // 2 array with index 1
				{ "Ethopia", "Egypt", "Kenya" }, 
				{ "Germany", "Turkiye", "Maldova", "Ukraine" },
				{ "Kazakhestan", "Afghanistan", "Korea" }, 
				};

		System.out.println(countries.length); // 5 - total number of arrays or rows

		int elOf1arr = countries[0].length;
		System.out.println("# of elements from 1 array = " + elOf1arr);

		int elOf2arr = countries[1].length;
		System.out.println("# of elements from 1 array = " + elOf2arr);

		
		System.out.println("--- getting all values from 2d array using For each loop ----");

		// LOOP way
		for (int r = 0; r < countries.length; r++) { // loops over rows
			for (int c = 0; c < countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--- getting all values from 2d array using Enhaced ----");

		
		// Enhanced way
		for (String[] country:countries) {
			
			for (String c:country) {
				
				System.out.println(c+" ");
			}
			
			System.out.println();
		}
		
	}

}
