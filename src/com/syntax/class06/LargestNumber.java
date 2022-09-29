package com.syntax.class06;

public class LargestNumber {

	public static void main(String[] args) {

		//
		//

		int n1 = 100;
		int n2 = 20;
		int n3 = 30;
		int largest = 0;

		if (n1 > n2 && n1 > n3) {
			largest = n1;
		} else if (n2 > n3 && n2 > n3) {
			largest = n2;
		} else if (n3 > n1 && n3 > n2) {
			largest = n1;

		}

		System.out.println(largest + " is the largest number");

		if (largest % 2 == 0) {
			System.out.println(largest + " is the even number");
		} else {
			System.out.println(largest + " is the odd number");
		}
	}

}
